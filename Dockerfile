FROM openjdk:17-alpine
COPY target/CapStone-0.0.1-SNAPSHOT.jar CapStone-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CapStone-0.0.1-SNAPSHOT.jar"]
