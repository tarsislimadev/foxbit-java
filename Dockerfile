FROM tmvdl/java:maven

WORKDIR /app

COPY . .

CMD java app/src/main/java/com/foxbit/app/App.java
