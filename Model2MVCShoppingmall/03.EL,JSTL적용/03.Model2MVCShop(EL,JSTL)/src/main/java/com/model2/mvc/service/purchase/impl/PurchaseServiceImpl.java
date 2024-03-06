package com.model2.mvc.service.purchase.impl;

import java.util.HashMap;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.purchase.PurchaseService;
import com.model2.mvc.service.purchase.dao.PurchaseDAO;
import com.model2.mvc.service.purchase.vo.PurchaseVO;

public class PurchaseServiceImpl implements PurchaseService {

	private PurchaseDAO purchaseDAO;
	
	public PurchaseServiceImpl() {
		purchaseDAO = new PurchaseDAO();
	}

	@Override
	public void addPurchase(PurchaseVO purchaseVO) throws Exception {
		// TODO Auto-generated method stub
		purchaseDAO.insertPurchase(purchaseVO);
	}

	@Override
	public PurchaseVO getPurchase(int tranNo) throws Exception {
		// TODO Auto-generated method stub
		return purchaseDAO.findPurchase(tranNo);
	}

	
	@Override
	public Map<String, Object> getPurchaseList(Search searchVO, String userId) throws Exception {
		// TODO Auto-generated method stub
		return purchaseDAO.getPurchaseList(searchVO, userId);
	}

	/*���� ���ʿ��ؼ� �̱���
	@Override
	public HashMap<String, Object> getSaleList(Search searchVO) throws Exception {
		// TODO Auto-generated method stub
		return purchaseDAO.getSaleList(searchVO);
	}
	*/

	@Override
	public PurchaseVO updatePurchase(PurchaseVO purchaseVO) throws Exception {
		purchaseDAO.updatePurchase(purchaseVO);
		
		//���⼭ tranNO�� PurchaseVO�� ���� �����ϱ�.(������ ���̵�� �̸��� ���õ�.) �װ� ���������.
		//UserService service2 = new UserServiceImpl();
		//User user = service2.getUser(purchaseVO.getBuyer().getUserId());
		//purchaseVO.getBuyer().setUserName( user.getUserName() );
		return purchaseVO; //������������ ���� �״�� return�ȴٸ�, Purchase2�����ؼ� purchaseVO.tranNo �־ get
	}

	@Override
	public void updateTranCode(PurchaseVO purchaseVO) throws Exception {
		// TODO Auto-generated method stub
		purchaseDAO.updateTranCode(purchaseVO);
	}

}
