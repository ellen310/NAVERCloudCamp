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
 * �� JUnit4 (Test Framework) �� Spring Framework ���� Test( Unit Test)
 * �� Spring �� JUnit 4�� ���� ���� Ŭ������ ���� ������ ��� ���� �׽�Ʈ �ڵ带 �ۼ� �� �� �ִ�.
 * �� @RunWith : Meta-data �� ���� wiring(����,DI) �� ��ü ����ü ����
 * �� @ContextConfiguration : Meta-data location ����
 * �� @Test : �׽�Ʈ ���� �ҽ� ����
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
										"classpath:config/context-aspect.xml",
										"classpath:config/context-mybatis.xml",
										"classpath:config/context-transaction.xml" })
public class PurchaseServiceTest {

	//==>@RunWith,@ContextConfiguration �̿� Wiring, Test �� instance DI
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
		purchase.setDivyAddr("���Ǳ�");
		purchase.setDivyDate(new Date(22,10,12));
		purchase.setDivyRequest("�ϳ�����D");
		purchase.setOrderDate(null);
		purchase.setPaymentOption("2"); 
		purchase.setReceiverName("�㿹��");
		purchase.setReceiverPhone("010-1111-1234");
		purchase.setTranCode("1");
		purchase.setTranNo(3);
		
	
		
		purchaseService.addPurchase(purchase);
		
		purchase = purchaseService.getPurchase(3); 
		System.out.println(purchase+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//==> API Ȯ��
		Assert.assertEquals("�ϳ�����D", purchase.getDivyRequest());
		Assert.assertEquals("2", purchase.getPaymentOption().trim());
		Assert.assertEquals("�㿹��", purchase.getReceiverName());
	}
	
	
	
	//@Test
	public void testGetPurchase() throws Exception {
		
		Purchase purchase = new Purchase();
		purchase = purchaseService.getPurchase(2);

		//==> console Ȯ��
		System.out.println(purchase);
		
		//==> API Ȯ��
		Assert.assertEquals("õõ�� �ֻ�", purchase.getDivyRequest());
		Assert.assertEquals("1", purchase.getPaymentOption().trim());
		Assert.assertEquals("�̰���", purchase.getReceiverName());
		Assert.assertEquals("user09", purchase.getBuyer().getUserId());

		Assert.assertNotNull(purchaseService.getPurchase(2));
	}
	
	
	
	//@Test
	 public void testUpdatePurchase() throws Exception{
		 
		Purchase purchase = purchaseService.getPurchase(2);
		Assert.assertNotNull(purchase);
		System.out.println(purchase);
		
		
		purchase.setDivyRequest("���� �ֻ�");
		purchase.setPaymentOption("1");
		purchase.setReceiverName("�̰���");
		System.out.println(purchase);
		
		purchaseService.updatePurchase(purchase);
		
		purchase = purchaseService.getPurchase(2);
		Assert.assertNotNull(purchase);
		
		//==> console Ȯ��
		System.out.println(purchase);
			
		//==> API Ȯ��
		Assert.assertEquals("���� �ֻ�", purchase.getDivyRequest());
		Assert.assertEquals("1", purchase.getPaymentOption().trim());
		Assert.assertEquals("�̰���", purchase.getReceiverName());
		
		
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
	 	
	 	
	 	//==> console Ȯ��
	 	System.out.println(list+"d������/???????????????????????????????????????");
	 	
	 	Assert.assertEquals(2, list.size());
	 	
		
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 }
	 
	


	

}