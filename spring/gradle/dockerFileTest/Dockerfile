FROM java:8

RUN mkdir /app
WORKDIR /app

ADD build/libs/docker-file-test-0.0.1-SNAPSHOT.jar /app
RUN ln -s docker-file-test-0.0.1-SNAPSHOT.jar docker-file-test-latest.jar

CMD java -jar /app/docker-file-test-latest.jar