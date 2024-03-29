FROM ubuntu:latest

# Install necessary dependencies
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk

RUN mkdir /app

COPY ./target/calculator-1.0-SNAPSHOT.jar /app

WORKDIR /app

CMD ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"]
