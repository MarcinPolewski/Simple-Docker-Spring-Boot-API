
Usage: 
1. initialize database schema
   docker run  mysql:8.4.3
   docker run --name ${CONTAINER_NAME} -e MYSQL_ROOT_PASSWORD=${DB_ROOT_PASSWORD} -e MYSQL_USER=${DB_USER} -e MYSQL_PASSWORD=${DB_USER_PASSWORD} -e MYSQL_DATABASE=${DB_NAME} -d mvpgomes/epcisdb

docker run --name my-mysql-container -e MYSQL_ROOT_PASSWORD=my_password -d mysql:5.7.15

docker cp schema.sql my-mysql-container:/schema.sql

docker exec -i my-mysql-container mysql -uroot -pmy_password my_database < schema.sql


4. run command "docker-compose up" in folder with docker-compose file
3. wait untill everything boots up and server is ready to go