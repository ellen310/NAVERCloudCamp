> ## Annotation
컴포넌트별로 XML을 구분한다면(동기화 문제 등을 고려해서) 컴포넌트가 많아질수록 XML개수도 증가할 것이다.<br/>
XML이 많아진다면 Java코드별로 XML을 관리하기도 힘들어진다.
그래서 Java코드에 @을 붙여주어 한꺼번에 관리할 수 있다.


> ## Component-scan
Annotation을 붙인 Bean 클래스를 실행할 수 있도록 Scan한다.
