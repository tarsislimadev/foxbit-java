FROM openjdk:14-alpine

WORKDIR /app

COPY . .

CMD java Main.java
