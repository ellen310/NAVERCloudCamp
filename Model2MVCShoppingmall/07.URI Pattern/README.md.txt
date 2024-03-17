## 07. URI pattern

web.xml의 servlet-mapping을 /*.do에서 / 형식으로 변경하면서<br/>
(웹개발에는 struts의 영향으로 .do가 관행적이지만, 앱에 기존 웹구조 활용을 고려하면서부터 수정했다. 사실 개발자 마음)
아무튼 그래서 /로 들어오는 모든(정적, 동적)resource 요청시 처리를 해줘야하게 되었다.

common-servlet에 이러한 처리를 기술하였다.
동적자원 요청시 DispatcherServlet에게 처리방법지정,
정적자원요청시 <mvc:resources mapping="/resources/**" location="/resources/" />와 같이 처리 경로location을 지정하였다.
(resources폴더 아래에는 css, images, javascript등 동적 자원이 들어있다.)