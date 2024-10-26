
Usage: 
1. (optional) modify docker-compose.yml and /qpi/srd/main/resources/application.properties and provide costom passwords
2. while being in folder with docker-compose run "docker-compose -up". At this point servers should be running

these standard http methods are available:
GET localhost:8080/api/hello
GET localhost:8080/api/books
GET localhost:8080/api/books/{your_book_id}
POST localhost:8080/api/books

How to access server from other outside networks:
1. find computer's local ip and make it static(preferably in router settings)
2. also in router settings, add port forwarding(in this case port 8080 to port 8080) to local ip of computer 
3. in computer's terminal use command "curl ifconfig.me" which will return public ip 
4. now server is available outside of local network 

for instance paste link into web browser: 
http://1.1.1.1:8080/api/books , where 1.1.1.1 is previously found public ip