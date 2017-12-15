FROM openjdk:8-jre-slim
LABEL name="configuration-server" \
      author="bgrochal" \
      organization="device-tracking-system"

ADD target/configuration-server-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.config.location=classpath:pl/edu/agh/iet/dts/config/"]
