FROM openjdk:8-jdk

RUN mkdir -p "/pet"

WORKDIR "/pet"

COPY "./target/pet-project-0.0.1-SNAPSHOT.jar" "/pet"

EXPOSE 8090

CMD ["java", "-jar", "pet-project-0.0.1-SNAPSHOT.jar"]