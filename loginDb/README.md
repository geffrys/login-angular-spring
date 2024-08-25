# Initialization

Build the image with the same name defined at deployment file.

```bash

docker build -t <login-mysql>:<latest> .
docker run -d -p 3308:3306 --name login-mysql -e MYSQL_ROOT_PASSWORD=root login-mysql:0.X

```