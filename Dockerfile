FROM openjdk:8-jdk-slim
COPY "./target/chat-0.0.1-SNAPSHOT.jar" "app.jar"
ENV DBTYPE POSTGRESQL
ENV HOSTDB sapamigosdb
ENV USERDB postgres
ENV PASSDB postgres
ENV DB PALABRAS

EXPOSE 4000
ENTRYPOINT ["java","-jar","app.jar"]HOSTDB 