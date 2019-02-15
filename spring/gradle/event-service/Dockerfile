FROM java:8

RUN mkdir /app
WORKDIR /app

ADD build/libs/event-service-0.0.1-SNAPSHOT.jar /app
RUN ln -s event-service-0.0.1-SNAPSHOT.jar event-service-latest.jar

CMD java -jar /app/event-service-latest.jar