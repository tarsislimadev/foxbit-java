FROM openjdk:14-alpine

WORKDIR /app

COPY . .

CMD java app/src/main/java/com/foxbit/app/App.java
