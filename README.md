#Jenkins CI/CD Pipeline Demo
Project Overview

This project demonstrates the implementation of a Jenkins CI/CD Pipeline integrated with GitHub.

The pipeline automates:

Source code checkout from GitHub
Build process execution
Test execution
Deployment stage simulation
Continuous Integration workflow

 Build, Test, and Compile Workflow
1️⃣ Build
We use Maven to compile the Java source code:

mvn clean package
mvn clean removes any previous build artifacts.
mvn package compiles the code and packages it into a JAR file.
Output JAR: target/java-jenkins-docker-1.0-SNAPSHOT.jar
2️⃣ Test
The project includes a basic JUnit test:

mvn test
This runs all tests inside the src/test/java directory.

3️⃣ Compile
Maven automatically compiles the Java source files during the package phase:

mvn compile
This ensures all Java files are translated into .class files in the target/classes directory.

🚀 Running Locally
After building the project, run the application locally:

java -jar target/java-jenkins-docker-1.0-SNAPSHOT.jar
Expected Output:

Hello from Java Application for Jenkins CI/CD!
🐳 Running with Docker
1️⃣ Build Docker image
docker build -t java-jenkins-docker:latest .
2️⃣ Run Docker container
docker run --rm java-jenkins-docker:latest
