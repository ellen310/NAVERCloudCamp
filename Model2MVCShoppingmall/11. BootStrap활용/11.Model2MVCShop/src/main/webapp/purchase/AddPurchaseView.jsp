<%@ page language="java" contentType="text/html; charset=EUC_KR"
    pageEncoding="EUC_KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC_KR">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
	<!--   jQuery , Bootstrap CDN  -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	
	<!--   calendar.js  --> 
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css">
 	<script src="//code.jquery.com/jquery-1.12.4.js"></script>
  	<script src="//code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<!--  ///////////////////////// CSS ////////////////////////// -->
	<style>
       body > div.container{
        	border: 3px solid #D6CDB7;
            margin-top: 10px;
        }
    </style>
    
     <!--  ///////////////////////// JavaScript ////////////////////////// -->
	<script type="text/javascript">
	
	function fncAddPurchase() {
		
		var divyAddr=$("input[name='divyAddr']").val();
		
		if(divyAddr == null || divyAddr.length <1){
			alert("�������ּҴ� �ݵ�� �Է��ϼž� �մϴ�.");
			return;
		}
		
		$('form').attr("action", "/purchase/addPurchase").submit();
	}
	
	function change(couponVal) {
		
		//var uri ='/purchase/addPurchaseView?prod_no=${product.prodNo}&couponName=';
		//uri += couponVal;
		//window.location.href = uri;
		
		//���� ������(map<������, ������>)
		self.location = uri;
	}
	
	
	$(function(){
			
		$('#divyDate').datepicker({dateFormat: 'yy-mm-dd'});
		
		
		$('a:last').on("click", function(){
			$('form')[0].reset();
		});
		
		
		$('button:last').on("click", function(){
			fncAddPurchase();
		});
		
	})
	
	</script>
</head>

<body>

	<!-- ToolBar Start /////////////////////////////////////-->
	<div class="navbar  navbar-default">
        <div class="container">
        	<a class="navbar-brand" href="/index.jsp">Model2 MVC Shop</a>
   		</div>
   	</div>
   	<!-- ToolBar End /////////////////////////////////////-->


	<!--  ȭ�鱸�� div Start /////////////////////////////////////-->
	<div class="container">
	
		<div class="page-header">
		  <h1>${product.prodName} <small>${product.prodDetail}</small></h1>
		</div>
		<!-- form Start /////////////////////////////////////-->
		<form class="form-horizontal">
		
		<table class="table table-hover table-striped" >
      		<tbody>
				<div class="row">
					<div class="col-sm-12">
						<div class="thumbnail">
							 <img src="\images\uploadFiles\AHlbAAAAug1vsgAA.jpg" alt="...">
						</div>     
					</div>
				</div>
			</tbody>
		</table>
		
		
		  <div class="form-group">
		    <label for="prodNo" class="col-sm-offset-1 col-sm-3 control-label">��ǰ��ȣ</label>
		    <div class="col-sm-3">
		      <h3 type="prodNo" class="form-control" id="prodNo" name="prodNo" readonly>${product.prodNo}</h3>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="prodName" class="col-sm-offset-1 col-sm-3 control-label">��ǰ��</label>
		    <div class="col-sm-3">
		      <h3 type="prodName" class="form-control" id="prodName" name="prodName" readonly>${product.prodNo}</h3>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="prodDetail" class="col-sm-offset-1 col-sm-3 control-label">��ǰ������</label>
		    <div class="col-sm-3">
		      <h3 type="prodDetail" class="form-control" id="prodDetail" name="prodDetail" readonly>${product.prodDetail}</h3>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="manuDate" class="col-sm-offset-1 col-sm-3 control-label">��������</label>
		    <div class="col-sm-3">
		      <h3 type="manuDate" class="form-control" id="manuDate" name="manuDate" readonly>${product.manuDate}</h3>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="price" class="col-sm-offset-1 col-sm-3 control-label" >����</label>
		    <div class="col-sm-3">
		      <h3 type="price" class="form-control" id="price" name="price" readonly>${product.price}</h3>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="regDate" class="col-sm-offset-1 col-sm-3 control-label" >�������</label>
		    <div class="col-sm-3">
		      <h3 type="regDate" class="form-control" id="regDate" name="regDate" readonly>${product.regDate}</h3>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="buyer" class="col-sm-offset-1 col-sm-3 control-label" >�����ھ��̵�</label>
		    <div class="col-sm-3">
		      <h3 type="buyer" class="form-control" id="buyer" name="buyer" readonly>${user.userId}</h3>
		      <input type="hidden" name="buyer" value="${user.userId}" />
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="price" class="selectpicker col-sm-offset-1 col-sm-3 control-label">�������</label>
		    <select name="paymentOption" class="ct_input_g" style="width: 100px; height: 19px" maxLength="20">
				<option value="1" selected="selected">���ݱ���</option>
				<option value="2">�ſ뱸��</option>
			</select>
		  </div>
		  
		  
		  <div class="form-group">
		    <label for="couponOption" class="col-sm-offset-1 col-sm-3 control-label">��������</label>
		    <select	name="couponOption"		class="ct_input_g" style="width: 100px; height: 19px" maxLength="20"  onchange="change(this.value)">
				<option value="1" selected="selected">���� ����</option>
				
				<c:forEach var="item" items="${coupons}" >
					<c:if test="${fn:contains(item.key, 'Coupon')}">
						<option value="${item.key}">${item.key}</option>    
					</c:if>
				</c:forEach>
			</select>
		  </div>
		  
		  
		  <div class="form-group">
		    <label for="receiverName" class="col-sm-offset-1 col-sm-3 control-label">�������̸�</label>
		    <div class="col-sm-3">
		      <input type="text" class="form-control" id="receiverName" name="receiverName" value="${user.userName}"/>
		    </div>
		  </div>
		  
		  
		  <div class="form-group">
		    <label for="receiverPhone" class="col-sm-offset-1 col-sm-3 control-label">�����ڿ���ó</label>
		    <div class="col-sm-3">
		      <input type="text" class="form-control" id="receiverPhone" name="receiverPhone" value="${user.phone}">
		    </div>
		  </div>
		  
		  
		  <div class="form-group">
		    <label for="divyAddr" class="col-sm-offset-1 col-sm-3 control-label">�������ּ�</label>
		    <div class="col-sm-3">
		      <input type="text" class="form-control" id="divyAddr" name="divyAddr" value="${user.addr}">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label for="divyRequest" class="col-sm-offset-1 col-sm-3 control-label">���ſ�û����</label>
		    <div class="col-sm-3">
		      <input type="text" class="form-control" id="divyRequest" name="divyRequest" placeholder="���ſ�û����">
		    </div>
		  </div>
		  
		  
		  <div class="form-group">
		    <label for="divyDate" class="col-sm-offset-1 col-sm-3 control-label">����������</label>
		    <div class="col-sm-3">
		      <input type="divyDate" class="form-control" id="divyDate" name="divyDate" placeholder="����������" >
		    </div>
		  </div>
		 
		  
		  <div class="form-group">
		    <div class="col-sm-offset-4  col-sm-3 text-center">
		      <button type="button" class="btn btn-primary"  >�� &nbsp;��</button>
			  <a class="btn btn-primary btn" href="#" role="button">��&nbsp;��</a>
		    </div>
		  </div>
		  
		  
		</form>
		<!-- form End /////////////////////////////////////-->
		
 	</div>
	<!--  ȭ�鱸�� div End /////////////////////////////////////-->



</body>
</html>