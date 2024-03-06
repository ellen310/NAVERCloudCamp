package com.model2.mvc.service.user.test;


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
import com.model2.mvc.service.product.ProductService;



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
public class ProductServiceTest {

	//==>@RunWith,@ContextConfiguration 이용 Wiring, Test 할 instance DI
	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;

	//@Test
	public void testAddProduct() throws Exception {
		
		Product product = new Product();
		product.setFileName("testFileName");
		product.setManuDate("22-01-10");
		product.setPrice(3000);
		product.setProdDetail("상품디테일임둥");
		product.setProdName("testProdName");
		product.setProdNo(10007); //원래는 직접 set못하는데 테스트니까 임의로.
		product.setRegDate(null);
		
		System.out.println(product+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		productService.addProduct(product);
		
		product = productService.getProduct(10008); //실제론 prod_no가 가변적이겠지만, 테스트위해 10008
		
		
		//==> API 확인
		Assert.assertEquals("testFileName", product.getFileName());
		//Assert.assertEquals("22-01-10", product.getManuDate()); //얘는 내부적으로 파싱하게 해둬서 값이 다를수밖에 없음. 그래서 테스트 제외
		Assert.assertEquals(3000, product.getPrice());
		Assert.assertEquals("상품디테일임둥", product.getProdDetail());
		Assert.assertEquals("testProdName", product.getProdName());
		Assert.assertEquals(10008, product.getProdNo());
	}
	
	
	
	//@Test
	public void testGetProduct() throws Exception {
		
		Product product = new Product();
		//==> 필요하다면 세팅. 근데 나는 add에서 세팅해둔걸로 get할게
//		user.setUserId("testUserId");
//		user.setUserName("testUserName");
//		user.setPassword("testPasswd");
//		user.setSsn("1111112222222");
//		user.setPhone("111-2222-3333");
//		user.setAddr("경기도");
//		user.setEmail("test@test.com");
		
		product = productService.getProduct(10008);

		//==> console 확인
		//System.out.println(product);
		
		//==> API 확인
		Assert.assertEquals("testFileName", product.getFileName());
		Assert.assertEquals(3000, product.getPrice());
		Assert.assertEquals("상품디테일임둥", product.getProdDetail());
		Assert.assertEquals("testProdName", product.getProdName());
		Assert.assertEquals(10008, product.getProdNo());

		Assert.assertNotNull(productService.getProduct(10008));
	}
	
	
	
	//@Test
	 public void testUpdateProduct() throws Exception{
		 
		Product product = productService.getProduct(10008);
		Assert.assertNotNull(product);
		
		product.setFileName("changeFileName");
		product.setPrice(5000);
		product.setProdDetail("상품디테일인데 update할게요~");
		
		productService.updateProduct(product);
		
		product = productService.getProduct(10008);
		Assert.assertNotNull(product);
		
		//==> console 확인
		//System.out.println(product);
			
		//==> API 확인
		Assert.assertEquals("changeFileName", product.getFileName());
		Assert.assertEquals(5000, product.getPrice());
		Assert.assertEquals("상품디테일인데 update할게요~", product.getProdDetail());
	 }
	 
	
	
	//@Test
	public void testCheckDuplication() throws Exception{

		//==> 필요하다면...
//		User user = new User();
//		user.setUserId("testUserId");
//		user.setUserName("testUserName");
//		user.setPassword("testPasswd");
//		user.setSsn("1111112222222");
//		user.setPhone("111-2222-3333");
//		user.setAddr("경기도");
//		user.setEmail("test@test.com");
//		
//		userService.addUser(user);
		
		//==> console 확인
		System.out.println(productService.checkDuplication(10008));
		System.out.println(productService.checkDuplication(0));
	 	
		//==> API 확인
		Assert.assertFalse( productService.checkDuplication(10008) );
	 	Assert.assertTrue( productService.checkDuplication(0) );
		 	
	}
	
	
	 //@Test
	 public void testGetProductListAll() throws Exception{
		 
	 	Search search = new Search();
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	Map<String,Object> map = productService.getProductList(search);
	 	
	 	List<Object> list = (List<Object>)map.get("list");
	 	Assert.assertEquals(3, list.size());
	 	
		//==> console 확인
	 	//System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	search.setSearchCondition("0");
	 	search.setSearchKeyword("");
	 	map = productService.getProductList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(3, list.size());
	 	
	 	//==> console 확인
	 	//System.out.println(list);
	 	
	 	totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 }
	 
	 
	 //@Test
	 public void testGetProductListByProdNo() throws Exception{
		 
	 	Search search = new Search();
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	search.setSearchCondition("0");
	 	search.setSearchKeyword("10006");
	 	Map<String,Object> map = productService.getProductList(search);
	 	
	 	List<Object> list = (List<Object>)map.get("list");
	 	Assert.assertEquals(1, list.size());
	 	
		//==> console 확인
	 	//System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setSearchCondition("0");
	 	search.setSearchKeyword(""+System.currentTimeMillis());
	 	map = productService.getProductList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(0, list.size());
	 	
		//==> console 확인
	 	//System.out.println(list);
	 	
	 	totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 }
	 
	 
	 //@Test
	 public void testGetProductListByProductName() throws Exception{
		 
	 	Search search = new Search();
	 	search.setCurrentPage(1);
	 	search.setPageSize(3);
	 	search.setSearchCondition("1");
	 	search.setSearchKeyword("testProdName");
	 	Map<String,Object> map = productService.getProductList(search);
	 	
	 	List<Object> list = (List<Object>)map.get("list");
	 	Assert.assertEquals(1, list.size());
	 	
		//==> console 확인
	 	System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setSearchCondition("1");
	 	search.setSearchKeyword("a1a5d5f"+System.currentTimeMillis());
	 	map = productService.getProductList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(0, list.size());
	 	
		//==> console 확인
	 	System.out.println(list);
	 	
	 	totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 }	 


	

}