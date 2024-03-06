package com.model2.mvc.view.purchase;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.purchase.PurchaseService;
import com.model2.mvc.service.purchase.impl.PurchaseServiceImpl;
import com.model2.mvc.service.purchase.vo.PurchaseVO;
import com.model2.mvc.service.user.UserService;
import com.model2.mvc.service.user.impl.UserServiceImpl;

public class UpdatePurchaseAction extends Action {

	public String execute(	HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		request. setCharacterEncoding("UTF-8");
		
		PurchaseVO purchaseVO = new PurchaseVO();
		PurchaseService service=new PurchaseServiceImpl();
		
		purchaseVO = service.getPurchase(Integer.parseInt(request.getParameter("tranNo")));
		purchaseVO.setPaymentOption(request.getParameter("paymentOption"));
		purchaseVO.setReceiverName(request.getParameter("receiverName"));
		purchaseVO.setReceiverPhone(request.getParameter("receiverPhone"));
		purchaseVO.setDivyAddr(request.getParameter("receiverAddr"));
		purchaseVO.setDivyRequest(request.getParameter("receiverRequest"));
		purchaseVO.setDivyDate(request.getParameter("divyDate"));
		
		//�����Ҷ�: �����ھ��̵�, �������̸�(?������ �̸��� �ٲ۴ٴ°� ������̸��� �ٲ۴ܰǵ�? //////���Ź��, �������ּ�, �����ڿ���ó, ���ſ�û����, ���������� ����.
		//�ش� tranNo�� �� 4���� �ٲ�. 
		purchaseVO = service.updatePurchase(purchaseVO); 
		
		//ȭ�鿡 ������ purchaseVO���� (����������&�����̷����� ����)
		UserService service2 = new UserServiceImpl();
		User user = service2.getUser(purchaseVO.getBuyer().getUserId());
		purchaseVO.getBuyer().setUserName( user.getUserName() );
		
		request.setAttribute("purchaseVO", purchaseVO);
		
		return "forward:purchase/GetPurchase.jsp";
		
		
	}
}
