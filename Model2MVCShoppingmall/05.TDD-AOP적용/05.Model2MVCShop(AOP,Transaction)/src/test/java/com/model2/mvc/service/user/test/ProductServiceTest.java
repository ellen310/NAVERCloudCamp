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
public class ProductServiceTest {

	//==>@RunWith,@ContextConfiguration �̿� Wiring, Test �� instance DI
	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;

	//@Test
	public void testAddProduct() throws Exception {
		
		Product product = new Product();
		product.setFileName("testFileName");
		product.setManuDate("22-01-10");
		product.setPrice(3000);
		product.setProdDetail("��ǰ�������ӵ�");
		product.setProdName("testProdName");
		product.setProdNo(10007); //������ ���� set���ϴµ� �׽�Ʈ�ϱ� ���Ƿ�.
		product.setRegDate(null);
		
		System.out.println(product+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		productService.addProduct(product);
		
		product = productService.getProduct(10008); //������ prod_no�� �������̰�����, �׽�Ʈ���� 10008
		
		
		//==> API Ȯ��
		Assert.assertEquals("testFileName", product.getFileName());
		//Assert.assertEquals("22-01-10", product.getManuDate()); //��� ���������� �Ľ��ϰ� �صּ� ���� �ٸ����ۿ� ����. �׷��� �׽�Ʈ ����
		Assert.assertEquals(3000, product.getPrice());
		Assert.assertEquals("��ǰ�������ӵ�", product.getProdDetail());
		Assert.assertEquals("testProdName", product.getProdName());
		Assert.assertEquals(10008, product.getProdNo());
	}
	
	
	
	//@Test
	public void testGetProduct() throws Exception {
		
		Product product = new Product();
		//==> �ʿ��ϴٸ� ����. �ٵ� ���� add���� �����صаɷ� get�Ұ�
//		user.setUserId("testUserId");
//		user.setUserName("testUserName");
//		user.setPassword("testPasswd");
//		user.setSsn("1111112222222");
//		user.setPhone("111-2222-3333");
//		user.setAddr("��⵵");
//		user.setEmail("test@test.com");
		
		product = productService.getProduct(10008);

		//==> console Ȯ��
		//System.out.println(product);
		
		//==> API Ȯ��
		Assert.assertEquals("testFileName", product.getFileName());
		Assert.assertEquals(3000, product.getPrice());
		Assert.assertEquals("��ǰ�������ӵ�", product.getProdDetail());
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
		product.setProdDetail("��ǰ�������ε� update�ҰԿ�~");
		
		productService.updateProduct(product);
		
		product = productService.getProduct(10008);
		Assert.assertNotNull(product);
		
		//==> console Ȯ��
		//System.out.println(product);
			
		//==> API Ȯ��
		Assert.assertEquals("changeFileName", product.getFileName());
		Assert.assertEquals(5000, product.getPrice());
		Assert.assertEquals("��ǰ�������ε� update�ҰԿ�~", product.getProdDetail());
	 }
	 
	
	
	//@Test
	public void testCheckDuplication() throws Exception{

		//==> �ʿ��ϴٸ�...
//		User user = new User();
//		user.setUserId("testUserId");
//		user.setUserName("testUserName");
//		user.setPassword("testPasswd");
//		user.setSsn("1111112222222");
//		user.setPhone("111-2222-3333");
//		user.setAddr("��⵵");
//		user.setEmail("test@test.com");
//		
//		userService.addUser(user);
		
		//==> console Ȯ��
		System.out.println(productService.checkDuplication(10008));
		System.out.println(productService.checkDuplication(0));
	 	
		//==> API Ȯ��
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
	 	
		//==> console Ȯ��
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
	 	
	 	//==> console Ȯ��
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
	 	
		//==> console Ȯ��
	 	//System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setSearchCondition("0");
	 	search.setSearchKeyword(""+System.currentTimeMillis());
	 	map = productService.getProductList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(0, list.size());
	 	
		//==> console Ȯ��
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
	 	
		//==> console Ȯ��
	 	System.out.println(list);
	 	
	 	Integer totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 	
	 	System.out.println("=======================================");
	 	
	 	search.setSearchCondition("1");
	 	search.setSearchKeyword("a1a5d5f"+System.currentTimeMillis());
	 	map = productService.getProductList(search);
	 	
	 	list = (List<Object>)map.get("list");
	 	Assert.assertEquals(0, list.size());
	 	
		//==> console Ȯ��
	 	System.out.println(list);
	 	
	 	totalCount = (Integer)map.get("totalCount");
	 	System.out.println(totalCount);
	 }	 


	

}