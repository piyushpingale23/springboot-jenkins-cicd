# Spring Boot Jenkins CI/CD

A sample Spring Boot application built with Gradle and Java 21 to demonstrate a complete Continuous Integration and Continuous Deployment (CI/CD) pipeline using Jenkins.

## Project Objective

The primary purpose of this project is to learn and implement CI/CD practices using Jenkins.

The project serves as a hands-on example of how code changes pushed to GitHub can automatically trigger:

* Source code checkout
* Gradle build
* Unit testing
* Packaging the application
* Docker image creation
* Automated deployment

This repository is intended for learning DevOps concepts and understanding how Jenkins integrates with a Spring Boot application lifecycle.

## Technology Stack

* Java 21
* Spring Boot 3.x
* Gradle
* Jenkins
* GitHub
* Docker
* Linux

## Project Structure

```text
springboot-jenkins-cicd
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│
├── gradle
│   └── wrapper
│
├── Dockerfile
├── Jenkinsfile
├── build.gradle
├── settings.gradle
├── README.md
└── .gitignore
```

## Features

* REST API using Spring Boot
* Gradle-based build system
* Jenkins Pipeline as Code
* Automated build and test execution
* Docker image generation
* CI/CD workflow implementation

## CI/CD Workflow

```text
Developer
    │
    ▼
GitHub Repository
    │
    ▼
Jenkins Pipeline
    │
    ├── Checkout Source Code
    │
    ├── Gradle Build
    │
    ├── Execute Tests
    │
    ├── Package Application
    │
    ├── Build Docker Image
    │
    └── Deploy Application
    ▼
Running Environment
```

## Build the Project

```bash
./gradlew clean build
```

## Run the Application

```bash
./gradlew bootRun
```

Application URL:

```text
http://localhost:8080
```

## Verify Application

```bash
curl http://localhost:8080
```

Expected Response:

```text
Spring Boot Jenkins CI/CD Application Running
```

## Future Enhancements

* Add Jenkins Declarative Pipeline
* Integrate SonarQube for Code Quality
* Add Docker Hub Integration
* Implement Kubernetes Deployment
* Configure Multi-Stage Docker Builds
* Add GitHub Webhooks
* Add Automated Rollback Strategy

## Learning Outcomes

Through this project, I aim to gain practical experience with:

* Jenkins Pipeline Development
* Continuous Integration
* Continuous Deployment
* Build Automation
* Docker Containerization
* DevOps Best Practices
* Spring Boot Application Deployment

## Author

piyushpingale23

## License

This project is created for learning and educational purposes.
