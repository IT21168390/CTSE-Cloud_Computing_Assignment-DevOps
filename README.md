# CTSE Cloud Computing Assignment - DevOps

## Overview
This repository contains a Spring Boot microservice for course management, implemented with DevOps practices and cloud-native technologies. The project demonstrates modern cloud computing concepts and DevOps methodologies including containerization, CI/CD, and cloud deployment.

## Architecture
The system is built as a microservice architecture with the following components:
- Course Management Service (Port: 8083)
- MongoDB for data persistence
- Azure Blob Storage for file storage
- AWS ECR for container registry
- AWS EC2 for deployment

## Technologies Used
- **Backend Framework:** Spring Boot with Java 17
- **Database:** MongoDB
- **Cloud Platform:** 
  - AWS (EC2, ECR)
  - Azure (Blob Storage)
- **CI/CD:** GitHub Actions
- **Containerization:** 
  - Docker
  - Docker Compose
- **Build Tool:** Maven

## Prerequisites
- Java 17
- Maven
- Docker
- AWS CLI
- MongoDB
- Azure Storage Account

## Environment Variables
The following environment variables are required:
```
MONGODB_URI=<your-mongodb-connection-string>
AZURE_BLOB_CONNECTION_STRING=<your-azure-blob-connection-string>
AZURE_CONTAINER_NAME=<your-azure-container-name>
```

## Local Development
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd CTSE-Cloud_Computing_Assignment-DevOps
   ```

2. Set up environment variables in a `.env` file

3. Build and run using Docker Compose:
   ```bash
   docker-compose up --build
   ```

4. The service will be available at: `http://localhost:8083`

## Deployment
The project uses GitHub Actions for CI/CD pipeline that:
1. Builds the application
2. Creates Docker images
3. Pushes images to AWS ECR
4. Deploys to AWS EC2

The deployment workflow is triggered automatically on pushes to the main branch.

## API Documentation
The Course Management Service provides REST APIs for:
- Course CRUD operations
- File upload/download using Azure Blob Storage
- Cross-origin resource sharing (CORS) enabled

## Contributing
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request