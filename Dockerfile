FROM eclipse-temurin:17-jdk-alpine as builder
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw clean install

FROM eclipse-temurin:17-jre-alpine
COPY --from=builder /opt/app/target/*.jar /opt/app/app.jar
EXPOSE 2137
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]