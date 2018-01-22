# SpringBootRESTfulService

server.port: 9000 <br />
management.port: 9001<br />

curl localhost:9001/health <br />
{"status":"UP"} <br />
curl localhost:9000/greeting <br />
{"id":1,"content":"Hello, Stranger!"}
