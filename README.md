# 🚀 Jenkins CI/CD Pipeline Demo

![Jenkins](https://img.shields.io/badge/Jenkins-CI%2FCD-red)
![Java](https://img.shields.io/badge/Java-21-orange)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![Docker](https://img.shields.io/badge/Docker-Containerization-2496ED)
![GitHub](https://img.shields.io/badge/GitHub-Version%20Control-black)

## 📌 Project Overview

This project demonstrates a complete **CI/CD pipeline using Jenkins, GitHub, Maven, Java, and Docker**.

Whenever code is pushed to GitHub, Jenkins automatically:

✅ Fetches the latest source code
✅ Compiles the application
✅ Executes automated tests
✅ Builds the application artifact (JAR)
✅ Creates a Docker image
✅ Runs the application inside a Docker container

---

## 🏗️ CI/CD Workflow

```text
Developer
    │
    ▼
GitHub Repository
    │
    ▼
Jenkins Pipeline
    │
 ┌──┴─────────────┐
 ▼                ▼
Build          Test
 │                │
 └──────┬─────────┘
        ▼
Package JAR
        │
        ▼
Docker Build
        │
        ▼
Container Deployment
```

---

## ⚙️ Technologies Used

| Technology   | Purpose                 |
| ------------ | ----------------------- |
| Java 21      | Application Development |
| Maven        | Build Automation        |
| Jenkins      | CI/CD Automation        |
| Docker       | Containerization        |
| Git & GitHub | Version Control         |
| JUnit        | Unit Testing            |

---

## 📂 Project Structure

```text
.
├── Pipeline
│   ├── Declarative
│   └── scripted
├── Screenshots
│   ├── Screenshot1.png
│   ├── Screenshot2.png
│   ├── Screenshot3.png
│   └── images
├── src
│   └── test
│       └── java
│           └── CalculatorTest.java
├── README.md
└── pom.xml

---

## 🔨 Build Stage

The application is built using Maven.

```bash
mvn clean package
```

### What Happens?

* Removes old build files
* Compiles Java source code
* Runs tests
* Generates executable JAR

### Generated Artifact

```text
target/java-jenkins-docker-1.0-SNAPSHOT.jar
```

---

## 🧪 Test Stage

Run automated unit tests:

```bash
mvn test
```

The pipeline validates application quality before deployment.

---

## ⚡ Compile Stage

Compile Java source code only:

```bash
mvn compile
```

Compiled classes are generated inside:

```text
target/classes
```

---

## ▶️ Run Application Locally

Execute the generated JAR:

```bash
java -jar target/java-jenkins-docker-1.0-SNAPSHOT.jar
```

### Output

```text
Hello from Java Application for Jenkins CI/CD!
```

---

## 🐳 Docker Integration

### Build Docker Image

```bash
docker build -t java-jenkins-docker:latest .
```

### Run Docker Container

```bash
docker run --rm java-jenkins-docker:latest
```

### Expected Output

```text
Hello from Java Application for Jenkins CI/CD!
```

---

## 🔄 Jenkins Pipeline Stages

| Stage        | Description           |
| ------------ | --------------------- |
| Checkout     | Pull code from GitHub |
| Build        | Compile source code   |
| Test         | Execute JUnit tests   |
| Package      | Create JAR artifact   |
| Docker Build | Build Docker image    |
| Deploy       | Run Docker container  |

---


## 🎯 Key Learning Outcomes

* Jenkins Pipeline Creation
* GitHub Integration
* Maven Build Automation
* Docker Containerization
* Continuous Integration (CI)
* Continuous Delivery (CD)
* Automated Testing

---
