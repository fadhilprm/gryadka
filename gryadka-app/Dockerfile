FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD build/libs/gryadka-app-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
CMD  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

