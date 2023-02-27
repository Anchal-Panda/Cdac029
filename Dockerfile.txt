# Use a Java runtime as the base image
FROM openjdk:latest
# Set the working directory
WORKDIR /app
# Copy the source code into the container
COPY . /app
# Compile the Java code
RUN javac Factorial.java
# Run the Java program
CMD ["java", "Factorial"]