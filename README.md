
Usage: 
1.(optional) modify docker-compose.yml and /qpi/srd/main/resources/application.properties and provide costom passwords
2. while being in folder with docker-compose run "docker-compose -up". At this point servers should be running

these standard http methods are available:
GET localhost:8080/api/hello
GET localhost:8080/api/books
GET localhost:8080/api/books/{your_book_id}
POST localhost:8080/api/books