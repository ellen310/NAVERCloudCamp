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

public class GetPurchaseAction extends Action { //dao-findPurchase

	
	public String execute(	HttpServletRequest request,HttpServletResponse response) throws Exception {
			
			String tranNo=request.getParameter("tranNo");
			System.out.println("find(get)�� ������ tranNo��===>"+tranNo);
			
			PurchaseService service = new PurchaseServiceImpl();
			PurchaseVO vo = service.getPurchase(Integer.parseInt(tranNo));
			
			UserService service2 = new UserServiceImpl();
			User user = service2.getUser(vo.getBuyer().getUserId());
			
			vo.getBuyer().setUserName( user.getUserName() );
			request.setAttribute("purchaseVO", vo);
			
			return "forward:/purchase/GetPurchase.jsp";
			
	}//end of execute
	
}
