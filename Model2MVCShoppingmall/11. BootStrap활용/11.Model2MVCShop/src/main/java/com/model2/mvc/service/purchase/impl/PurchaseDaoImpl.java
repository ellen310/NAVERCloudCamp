package com.model2.mvc.service.purchase.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.Purchase;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.product.ProductDao;
import com.model2.mvc.service.purchase.PurchaseDao;


//==> ȸ������ DAO CRUD ����
@Repository("purchaseDaoImpl")
public class PurchaseDaoImpl implements PurchaseDao{
	
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public PurchaseDaoImpl() {
		System.out.println(this.getClass() +"������");
	}


	///Method
	//INSERT
	@Override
	public void addPurchase(Purchase purchase) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�ĳĳ�???/");
		int maxTranNo = 0;
		if( sqlSession.selectOne("PurchaseMapper.getMaxTranNo") != null) {
			maxTranNo = sqlSession.selectOne("PurchaseMapper.getMaxTranNo");
		}
		purchase.setTranNo(++maxTranNo);
		sqlSession.insert("PurchaseMapper.addPurchase", purchase);
	}

	//SELECT ONE
	@Override
	public Purchase getPurchase(int tranNo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("PurchaseMapper.getPurchase", tranNo);
	}

	//SELECT LIST
	@Override
	public List<Purchase> getPurchaseList(Map map) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("PurchaseMapper.getPurchaseList", map);
	}

	//UPDATE
	@Override
	public void updatePurchase(Purchase purchase) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("PurchaseMapper.updatePurchase", purchase);
	}
	@Override
	public void updateTranCode(Purchase purchase) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("PurchaseMapper.updateTranCode", purchase);
	}
	
	// �Խ��� Page ó���� ���� ��ü Row(totalCount)  return
	public int getTotalCount(Search search) throws Exception {
		return sqlSession.selectOne("PurchaseMapper.getTotalCount", search);
	}

	
	
	@Override
	public Map checkCoupon(Map<String,String> coupons) throws Exception {
		// TODO Auto-generated method stub
		
	
		//�ű԰������� add
		Date regDate = sqlSession.selectOne("PurchaseMapper.getRegDate",coupons);
		if(regDate!=null) {
			long subSec = (System.currentTimeMillis()) - regDate.getTime();
			int subDay = ( (int)subSec/1000 ) / (60*60*24) ;
			
			if(subDay<=3) { //�������� 3���� �� �Ǿ��ٸ� ���� ��.
				coupons.put("newbieCoupon", "10"); //��������: 10%����
			}
		}
		
		//������D.C ���� add
		
		//�߼�������� add
		
		//VIP ���� add
		
		return coupons;
	}

	
	
}