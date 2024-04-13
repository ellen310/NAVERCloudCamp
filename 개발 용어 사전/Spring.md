> ## Annotation
컴포넌트별로 XML을 구분한다면(동기화 문제 등을 고려해서) 컴포넌트가 많아질수록 XML개수도 증가할 것이다.<br/>
XML이 많아진다면 Java코드별로 XML을 관리하기도 힘들어진다.<br/>
그래서 Java코드에 @을 붙여주어 한꺼번에 관리할 수 있다.<br/>
<br/><br/>

> ## Component-scan
Annotation을 붙인 Bean 클래스들을 Scan하여 실행할 수 있도록 등록한다.<br/>
Spring 공부할 때는 xml에서 <context:component-scan> 을 사용했다. <br/>
이 때 컨트롤단 메타데이터xml에서는 controller만 include하고 비즈니스로직에 관한 annotation들은 exclude하는 등 분리를 하기도 했다.<br/>
SpringBoot를 공부하면서는 XML을 없애는 대신 java설정파일을 만들었다. @Configuration를 붙여서 이를 표시하였고, Component-scan하도록 했다.<br/>

<br/><br/>
