## 08. RestfulServer, JSON

웹 구조, REST를 일반 앱에 활용하게 되면서, 
데이터를 주고받는 가장 일반적인 방식인 JSON을 연습했다.

RESTful Client에서 Http url, header, body등 생성하여 json객체로 만들고 RESTful Server로 전송했다. 

RESTful Server에서 @RequestBody를 통해 도메인객체로 바인딩된 JSON을 받았다.
Response할때에는 @Controller를 @RestController로 바꿈으로서 @ResponseBody에 매핑시켜 JSON을 바인딩했다.