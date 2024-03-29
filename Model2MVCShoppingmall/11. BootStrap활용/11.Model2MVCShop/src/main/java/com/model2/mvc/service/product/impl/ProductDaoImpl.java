package com.model2.mvc.service.product.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.product.ProductDao;


//==> ȸ������ DAO CRUD ����
@Repository("productDaoImpl")
public class ProductDaoImpl implements ProductDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public ProductDaoImpl() {
		System.out.println(this.getClass() +"������");
	}


	///Method
	
	//INSERT
	@Override
	public void addProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		
		int maxProdNo = 0;
		if( sqlSession.selectOne("ProductMapper.getMaxProdNo") != null) {
			maxProdNo = sqlSession.selectOne("ProductMapper.getMaxProdNo");
		}
		product.setProdNo(++maxProdNo);
		sqlSession.insert("ProductMapper.addProduct", product);
		
	}

	//SELECT ONE
	@Override
	public Product getProduct(int prodNo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("ProductMapper.getProduct", prodNo);
	}
	
	
	//SELECT LIST
	@Override
	public List<Product> getProductList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("ProductMapper.getProductList", search);
	}
	
	//SELECT LIST
	@Override
	public List<Map<String, String>> getProductTranList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return  sqlSession.selectList("ProductMapper.getProductTranList", search);
	}

	//UPDATE
	@Override
	public void updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("ProductMapper.updateProduct", product);
	}
	
	// �Խ��� Page ó���� ���� ��ü Row(totalCount)  return
	public int getTotalCount(Search search) throws Exception {
		return sqlSession.selectOne("ProductMapper.getTotalCount", search);
	}

	@Override
	public List getAutoComplete(String searchKeyword) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("ProductMapper.getAutoComplete", searchKeyword.toString());
	}
	
	
	
}