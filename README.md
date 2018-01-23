# SpringBootRESTfulService

curl localhost:8080/health <br />
{"status":"UP"} <br />
curl localhost:8080/greeting <br />
{"id":1,"content":"Hello, Stranger!"}  <br />
curl localhost:8080/movie/  <br />
[{"id":1,"name":"Inception","ranking":9.5},  <br /> 
{"id":2,"name":"Forest Gump","ranking":10.0}] <br /> 
curl localhost:8080/movie/Inception <br /> 
{"id":1,"name":"Inception","ranking":9.5}

