package com.model2.mvc.service.user.test;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.Purchase;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.purchase.PurchaseService;



/*
 *	FileName :  UserServiceTest.java
 * ㅇ JUnit4 (Test Framework) 과 Spring Framework 통합 Test( Unit Test)
 * ㅇ Spring 은 JUnit 4를 위한 지원 클래스를 통해 스프링 기반 통합 테스트 코드를 작성 할 수 있다.
 * ㅇ @RunWith : Meta-data 를 통한 wiring(생성,DI) 할 객체 구현체 지정
 * ㅇ @ContextConfiguration : Meta-data location 지정
 * ㅇ @Test : 테스트 실행 소스 지정
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
										"classpath:config/context-aspect.xml",
										"classpath:config/context-mybatis.xml",
										"classpath:config/context-transaction.xml" })
public class PurchaseServiceTest {

	//==>@RunWith,@ContextConfiguration 이용 Wiring, Test 할 instance DI
	@Autowired
	@Qualifier("purchaseServiceImpl")
	private PurchaseService purchaseService;

	//@Test
	public void testAddPurchase() throws Exception {
		
		Purchase purchase = new Purchase();
		
		purchase.setBuyer(new User());
		purchase.getBuyer().setUserId("user09");
		purchase.setPurchaseProd(new Product());
		purchase.getPurchaseProd().setProdNo(10007);
		purchase.setDivyAddr("관악구");
		purchase.setDivyDate(new Date(22,10,12));
		purchase.setDivyRequest("하나더사묭");
		purchase.setOrderDate(null);
		purchase.setPaymentOption("2"); 
		purchase.setReceiverName("허예딩");
		purchase.setReceiverPhone("010-1111-1234");
		purchase.setTranCode("1");
		purchase.setTranNo(3);
		
	
		
		purchaseService.addPurchase(purchase);
		
		purchase = purchaseService.getPurchase(3); 
		System.out.println(purchase+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//==> API 확인
		Assert.assertEquals("하나더사묭", purchase.getDivyRequest());
		Assert.assertEquals("2", purchase.getPaymentOption().trim());
		Assert.assertEquals("허예딩", purchase.getReceiverName());
	}
	
	
	
	//@Test
	public void testGetPurchase() throws Exception {
		
		Purchase purchase = new Purchase();
		purchase = purchaseService.getPurchase(2);

		//==> console 확인
		System.out.println(purchase);
		
		//==> API 확인
		Assert.assertEquals("천천히 주삼", purchase.getDivyRequest());
		Assert.assertEquals("1", purchase.getPaymentOption().trim());
		Assert.assertEquals("이감자", purchase.getReceiverName());
		Assert.assertEquals("user09", purchase.getBuyer().getUserId());

		Assert.assertNotNull(purchaseService.getPurchase(2));
	}
	
	
	
	//@Test
	 public void testUpdatePurchase() throws Exception{
		 
		Purchase purchase = purchaseService.getPurchase(2);
		Assert.assertNotNull(purchase);
		System.out.println(purchase);
		
		
		purchase.setDivyRequest("빨리 주삼");
		purchase.setPaymentOption("1");
		purchase.setReceiverName("이감자");
		System.out.println(purchase);
		
		purchaseService.updatePurchase(purchase);
		
		purchase = purchaseService.getPurchase(2);
		Assert.assertNotNull(purchase);
		
		//==> console 확인
		System.out.println(purchase);
			
		//==> API 확인
		Assert.assertEquals("빨리 주삼", purchase.getDivyRequest());
		Assert.assertEquals("1", purchase.getPaymentOption().trim());
		Assert.assertEquals("이감자", purchase.getReceiverName());
		
		
	 }
	 
	
	
	 //@Test
	 public void testGetPurchaseListAll() throws Exception{
		 
	 	Search search = new Search();
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	
	 	Map<String,Object> map = new HashMap<String, Object>();
	 	map.put("search", search);
	 	map.put("userId", "user09");
	 	
	 	map = purchaseService.getPurchaseList(map);
	 	
	 	List<Object> list = (List<Object>)map.get("list");
	 	
	 	
	 	//==> console 확인
	 	System.out.println(list+"dㅏㄹㄹ/???????????????????????????????????????");
	 	
	 	Assert.assertEquals(2, list.size());
	 	
		
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 }
	 
	


	

}