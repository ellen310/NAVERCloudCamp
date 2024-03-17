## 07. URI pattern 변경


web.xml의 servlet-mapping을 /*.do 에서 / 형식으로 설정하면서<br/>
/로 들어오는 모든(정적, 동적)resource 요청시 처리를 해줘야하게 되었다.<br/>


common-servlet에 이러한 처리를 기술하였다.<br/>
동적자원 요청시 DispatcherServlet에게 처리방법지정,<br/>
정적자원요청시 <mvc:resources mapping="/resources/**" location="/resources/" />와 같이 처리 경로location을 지정하였다.<br/>
(resources폴더 아래에는 css, images, javascript등 동적 자원이 들어있다.)<br/>
<br/>
