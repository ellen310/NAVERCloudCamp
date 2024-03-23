package com.model2.mvc.service.product;

import java.util.List;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


public interface ProductService {
	
	public void addProduct(Product productVO) throws Exception;
	
	public Product getProduct(int productNo) throws Exception;
	
	public Map<String, Object> getProductList(Search searchVO) throws Exception;
	
	public Product updateProduct(Product productVO) throws Exception;
	
	// ��ǰ No �ߺ� Ȯ��
	public boolean checkDuplication(int prodNo) throws Exception;
	
	// �߰����:: �ڵ��ϼ� ���
	public List getAutoComplete(String searchKeyword) throws Exception;
}