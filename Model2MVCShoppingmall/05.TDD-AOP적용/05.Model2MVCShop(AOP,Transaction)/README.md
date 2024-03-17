## 05. AOP 적용

- ### AspectJ활용. 
임의로 main을 가진 TestApp.java를 두어 TDD 진행함.
<br/>

======================================================================================

<br/>

## 05-2. Spring @MVC 어노테이션 활용

- ### AS-IS

Action이라는 execute()기능을 공유하는 추상클래스를 통해<br/>
Action을 확장하여 반드시 execute()를 포함하는~Action 컨트롤러를 만들고,<br/>
properties파일에 listUser.do=listUserAction과 같이 기술하여 <br/>
DispatcherServlet은 ~Action컨트롤러의 execute()를 호출해 컨트롤러의 역할을 수행(B/L수행, Model과View연결 등)했었다. <br/>
<br/>

- ### TO-BE

이제는 Spring의 @MVC를 활용하여 코드를 수정하였다.<br/>
~ACTION클래스를 각각 만들지 않고, 하나의 Controller를 만들었다.<br/>
<br/>
URL pattern을 통해 /로 들어온 모든 request를 단일인입점 DispatcherServlet이 받으면<br/>
UserController의 @Controller와 @RequestMapping("/user/*") 어노테이션을 통해 매핑된다. <br/>
즉, /user/로 들어오는 모든 request는 UserController가 처리하며, UserController내 각 메서드는 기존 분리된 ~Action클래스들이다.<br/>
getUser, findUser등 서로 다른 비즈니스로직을 수행하던 컨트롤러 클래스들을 모았으며, <br/>
이들 uri 구분은 @RequestMapping("/findUser.do")와 같이 어노테이션을 붙여 Mapping한다.<br/>
==>/user/findUser.do 로 들어온 request는 해당 어노테이션이 붙은 메서드가 컨트롤 하는 것.<br/>
