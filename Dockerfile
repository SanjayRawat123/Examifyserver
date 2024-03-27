examify-server-0.0.1-SNAPSHOT.jar
FROM openjdk
WORKDIR usr/lib
ADD ./target/examify-server-0.0.1-SNAPSHOT.jar /usr/lib/examify-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","examify-server-0.0.1-SNAPSHOT.jar"]