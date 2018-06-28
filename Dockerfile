#Dockerfile
FROM alpine/git as clone-stage
ENV giturl https://github.com/rajesh-raja/java-basis.git
WORKDIR /app
RUN git clone $giturl

FROM maven:3.5-jdk-8-alpine as build-stage
ENV projectname java-basis
WORKDIR /app
COPY --from=clone-stage /app/$projectname /app
RUN mvn install
