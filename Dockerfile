
FROM openjdk:8-jdk-slim
COPY "./target/chat-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 4000
ENTRYPOINT ["java","-jar","app.jar"]