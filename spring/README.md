$ spring init --list

#### 1 新建项目
##### 1.1 gradle
`$ spring init -dweb --build gradle myweb`
##### 1.2 maven
$ spring init -dweb --build maven myweb_maven
##### 1.3 网站新建项目
https://start.spring.io/

#### 2 运行项目
##### 2.1 测试运行
./gradlew bootRun
##### 2.2 生产运行
java -jar build/libs/myweb-0.0.1-SNAPSHOT.jar
##### 2.3 不同分支运行 yml文件
SPRING_PROFILES_ACTIVE=pro ./gradlew bootRun
SPRING_PROFILES_ACTIVE=pro java -jar build/libs/ymlTest-0.0.1-SNAPSHOT.jar


dockerFileTest

构建
$ docker build -t docker-file-test:latest .
-t 打tag

查看镜像
$ docker images

启动容器
$ docker run -d -p 8080:8080
$ docker run -d -p 8080:8080 docker-file-test:latest

查看
$ docker ps
停止容器
$ docker stop id
删除镜像
$ docker rmi

mongodb 启动 默认数据库路径 /data/db
$ sudo mkdir -p /Users/chaoqunshe/Developer/data/mongo/
$ sudo mongod --dbpath /Users/chaoqunshe/Developer/data/mongo/


docker-compose --help
运行docker-compose
docker-compose up --build
