FROM openjdk:8-jdk
COPY /calc/out/artifacts/calc_jar/calc.jar calc.jar
CMD ["java", "-jar", "calc.jar"]

