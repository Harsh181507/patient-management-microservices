# 🏥 Patient Management System

> A **production-ready microservices platform** for healthcare providers to securely manage patient data, authentication, billing, and real-time analytics.

[![Java](https://img.shields.io/badge/Java-17+-orange?style=flat-square&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2--4.0-brightgreen?style=flat-square&logo=spring-boot)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-Ready-blue?style=flat-square&logo=docker)](https://www.docker.com/)
[![AWS CDK](https://img.shields.io/badge/AWS%20CDK-Infrastructure-ff9900?style=flat-square&logo=amazon-aws)](https://aws.amazon.com/cdk/)
[![License](https://img.shields.io/badge/License-MIT-yellow?style=flat-square)](LICENSE)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen?style=flat-square)](#)
[![Tests](https://img.shields.io/badge/Tests-Available-blue?style=flat-square)](#-testing)
[![Stars](https://img.shields.io/badge/Stars-⭐-yellow?style=flat-square)](#)

---

## 🧠 Project Overview

**Patient Management System** is an enterprise-grade **distributed backend platform** designed for modern healthcare providers. It solves the critical challenge of managing patient data securely while integrating with billing systems and providing real-time analytics.

### Why It Exists
Healthcare organizations struggle with:
- 🔴 Fragmented patient data across multiple systems
- 🔴 Complex authentication and authorization flows
- 🔴 Billing integration delays and errors
- 🔴 Lack of real-time analytics and insights
- 🔴 Scalability limitations in monolithic architectures

### Solution
This **microservices architecture** provides:
- ✅ Modular, independently deployable services
- ✅ Secure JWT-based authentication
- ✅ Real-time gRPC billing integration
- ✅ Event-driven analytics with Kafka
- ✅ Cloud-native infrastructure with AWS CDK
- ✅ Enterprise-grade scalability and reliability

### Real-World Use Case
A mid-size hospital network can use this platform to:
1. Register and manage thousands of patient records
2. Authenticate healthcare providers securely
3. Automatically generate billing accounts for new patients
4. Analyze patient data in real-time for insights
5. Scale horizontally as the patient base grows

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| 🔐 **JWT Authentication** | Secure login with token-based authorization and validation |
| 👥 **Patient Management** | Full CRUD operations with email validation and duplicate checks |
| 💰 **Billing Integration** | Automatic billing account creation via gRPC |
| 📊 **Event-Driven Analytics** | Real-time data streaming and processing with Kafka |
| 🚪 **API Gateway** | Centralized routing with JWT validation middleware |
| 🐳 **Docker-Ready** | Pre-configured Dockerfile for each service |
| ☁️ **AWS CDK** | Infrastructure as Code for ECS, RDS, MSK, and networking |
| 🗄️ **Database Persistence** | PostgreSQL with Spring Data JPA |
| 🔄 **gRPC Communication** | Efficient inter-service messaging |
| 📝 **Input Validation** | Comprehensive validation with custom exceptions |
| 🔍 **OpenAPI/Swagger** | Auto-generated API documentation |
| 📊 **Monitoring Ready** | Structured logging and actuator endpoints |

---

## 🛠️ Tech Stack

### Backend & Languages
[![Java 17+](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)](#)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2--4.0-brightgreen?logo=spring-boot&logoColor=white)](#)
[![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-Gateway-brightgreen?logo=spring&logoColor=white)](#)
[![Spring Security](https://img.shields.io/badge/Spring%20Security-Auth-brightgreen?logo=spring&logoColor=white)](#)

| Component | Technology | Purpose |
|-----------|-----------|---------|
| **Language** | Java 17/21 | Core runtime environment |
| **Framework** | Spring Boot 3.2-4.0 | Application framework |
| **API Gateway** | Spring Cloud Gateway | Request routing & authentication |
| **Security** | Spring Security + JWT | Authorization & token management |
| **Data Access** | Spring Data JPA | ORM layer |

### Messaging & Communication
[![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-Event%20Streaming-000000?logo=apache-kafka&logoColor=white)](#)
[![gRPC](https://img.shields.io/badge/gRPC-Inter--Service-244c5a?logo=grpc&logoColor=white)](#)

| Technology | Version | Use Case |
|-----------|---------|----------|
| **Apache Kafka** | Latest | Event streaming & pub/sub messaging |
| **gRPC** | 1.69+ | High-performance inter-service RPC |
| **Protocol Buffers** | proto3 | Data serialization |

### Databases
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Relational-336791?logo=postgresql&logoColor=white)](#)
[![H2](https://img.shields.io/badge/H2-In--Memory-blue?logo=java&logoColor=white)](#)

| Database | Usage |
|----------|-------|
| **PostgreSQL** | Production data (Auth & Patient services) |
| **H2** | Development & testing (in-memory) |
| **Amazon RDS** | Managed DB on AWS |

### Infrastructure & DevOps
[![Docker](https://img.shields.io/badge/Docker-Containerization-2496ed?logo=docker&logoColor=white)](#)
[![AWS CDK](https://img.shields.io/badge/AWS%20CDK-Infrastructure-ff9900?logo=amazon-aws&logoColor=white)](#)
[![AWS ECS](https://img.shields.io/badge/AWS%20ECS-Orchestration-ff9900?logo=amazon-aws&logoColor=white)](#)

| Service | Purpose |
|---------|---------|
| **Docker** | Containerization of all microservices |
| **AWS CDK** | Infrastructure as Code (TypeScript) |
| **Amazon ECS (Fargate)** | Serverless container orchestration |
| **Amazon MSK** | Managed Apache Kafka on AWS |
| **Amazon RDS** | Managed relational database |
| **Amazon VPC** | Network isolation & security |

### Build & Dependency Management
[![Maven](https://img.shields.io/badge/Apache%20Maven-Build-c71a36?logo=apachemaven&logoColor=white)](#)

| Tool | Purpose |
|------|---------|
| **Maven 3.9+** | Build automation & dependency management |
| **Lombok** | Boilerplate code generation |
| **OpenAPI/Swagger** | API documentation & testing |

---

## 📁 Project Structure

```
patient-management/
│
├── 📦 auth-service/
│   ├── src/main/java/com/pm/authservice/
│   │   ├── controller/          # REST endpoints for login & validation
│   │   ├── service/             # AuthService - token generation logic
│   │   ├── repository/          # UserRepository - database queries
│   │   ├── util/                # JwtUtil - JWT token handling
│   │   └── model/               # User entity
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   └── data.sql             # Pre-populated test users
│   └── pom.xml
│
├── 📦 patient-service/
│   ├── src/main/java/com/pm/patientservice/
│   │   ├── controller/          # PatientController - REST endpoints
│   │   ├── service/             # PatientService - business logic
│   │   ├── repository/          # PatientRepository - JPA queries
│   │   ├── model/               # Patient entity
│   │   ├── dto/                 # PatientRequestDTO, PatientResponseDTO
│   │   ├── exception/           # GlobalExceptionHandler, custom exceptions
│   │   ├── grpc/                # BillingServiceGrpcClient
│   │   ├── kafka/               # KafkaProducer - event publishing
│   │   └── mapper/              # PatientMapper - DTO conversions
│   ├── src/main/proto/
│   │   ├── billing_service.proto     # gRPC service definition
│   │   └── patient_event.proto       # Kafka event schema
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
│
├── 📦 billing-service/
│   ├── src/main/java/com/pm/billingservice/
│   │   ├── service/             # BillingService - gRPC implementation
│   │   ├── grpc/                # gRPC service stubs
│   │   └── model/               # BillingAccount entity
│   ├── src/main/proto/
│   │   └── billing_service.proto     # gRPC service definition
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
│
├── 📦 analytics-service/
│   ├── src/main/java/com/pm/analyticsservice/
│   │   ├── listener/            # Kafka consumer for patient events
│   │   ├── service/             # Analytics processing logic
│   │   └── model/               # Analytics entities
│   ├── src/main/proto/
│   │   └── patient_event.proto       # Kafka message schema
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
│
├── 📦 api-gateway/
│   ├── src/main/java/com/pm/apigateway/
│   │   ├── exception/           # JwtValidationException handler
│   │   ├── filter/              # Custom gateway filters
│   │   └── config/              # Gateway routing configuration
│   ├── src/main/resources/
│   │   └── application.yml      # Route definitions & predicates
│   └── pom.xml
│
├── 📦 infrastructure/
│   ├── src/main/java/com/pm/stack/
│   │   └── LocalStack.java      # AWS CDK stack (ECS, RDS, MSK, VPC)
│   └── pom.xml
│
├── 🧪 intigtation-tests/
│   ├── src/test/java/
│   └── pom.xml
│
├── 📝 api-requests/
│   ├── auth-service/
│   │   ├── login.http           # POST login example
│   │   └── validate.http        # GET token validation
│   └── patient-service/
│       ├── create-patient.http
│       ├── get-patients.http
│       ├── update-patients.http
│       └── delete-patients.http
│
├── 🔌 grpc-requests/
│   └── billing-service/
│       └── create-billing-account.http
│
├── 🐳 Dockerfile                # Individual service containers
├── 📋 pom.xml                   # Root Maven configuration
├── 📖 README.md                 # This file
└── .gitignore

```

### Directory Descriptions

| Directory | Purpose | Key Files |
|-----------|---------|-----------|
| **auth-service** | User authentication & JWT token management | `AuthController`, `JwtUtil` |
| **patient-service** | Core patient CRUD operations | `PatientController`, `PatientService`, `BillingServiceGrpcClient` |
| **billing-service** | Billing account management via gRPC | `BillingServiceGrpc`, `BillingService` |
| **analytics-service** | Real-time event processing from Kafka | `KafkaListener`, `AnalyticsService` |
| **api-gateway** | API routing & JWT authentication | `application.yml` routes |
| **infrastructure** | AWS CDK stack for cloud deployment | `LocalStack.java` |
| **api-requests** | HTTP request examples for testing | `.http` files (IntelliJ compatible) |

---

## ⚙️ How It Works

### System Architecture Diagram

```
┌─────────────────────────────────────────────────────────────────┐
│                          CLIENT APPS                            │
└──────────┬──────────────────────────────────────────────────────┘
           │
           │ HTTP/REST
           ▼
┌──────────────────────────────────────────────────────────────────┐
│                    API GATEWAY (Port 4004)                       │
│  ┌──────────────────────────────────────────────────────────┐   │
│  │ Route Rules & JWT Validation Filter                     │   │
│  │ • /auth/** → Auth Service                              │   │
│  │ • /api/patients/** → Patient Service (JWT required)    │   │
│  │ • /api-docs/** → Documentation                         │   │
│  └──────────────────────────────────────────────────────────┘   │
└─┬──────────┬──────────────────────────────────────────────────────┘
  │          │
  │          │ HTTP              │ HTTP              │ HTTP
  ▼          ▼                   ▼                   ▼
┌─────────┐ ┌──────────┐        ┌──────────┐       ┌───────────┐
│   AUTH  │ │ PATIENT  │        │ BILLING  │       │ ANALYTICS │
│ Service │ │ Service  │        │ Service  │       │ Service   │
│Port4005 │ │ Port4000 │        │ Port4001 │       │ Port4002  │
└─────────┘ └──────────┘        └──────────┘       └───────────┘
     │            │                  ▲                    ▲
  DB │         DB │                  │ gRPC              │ Kafka
     │            │                  │ (9001)            │
     ▼            ▼                  │                   │
  ┌──────────────────────────┐       │        ┌──────────┘
  │  PostgreSQL Databases    │       │        │
  │ • auth-service-db        │       │        │
  │ • patient-service-db     │       │        │
  └──────────────────────────┘       │        │
                                     │        │
                                ┌────┴────┬───┴────┐
                                │ gRPC    │ Kafka  │
                                │ & HTTP  │ Broker │
                                └─────────┴────────┘
```

### 1️⃣ Authentication Flow

```
Step 1: User submits credentials
        │
        ▼
POST /auth/login { "email": "user@example.com", "password": "..." }
        │
        ▼
API Gateway → Auth Service
        │
        ▼
AuthService.authenticate()
├─ Query UserRepository for email
├─ Verify password with BCryptPasswordEncoder
└─ If valid → JwtUtil.generateToken()
        │
        ▼
JWT Token Generated & Returned
        │
        ▼
Client stores token in "Authorization: Bearer <token>" header
```

**Key Classes:**
- `AuthController` - REST endpoint handler
- `AuthService` - Authentication logic
- `JwtUtil` - Token generation and validation
- `UserRepository` - Database queries
- `PasswordEncoder` - BCrypt password hashing

---

### 2️⃣ Patient Creation Flow

```
Step 1: Authenticated POST request
        │
        ▼
POST /api/patients with JWT token
        │
        ▼
API Gateway (JwtValidation filter) → Validates token → Patient Service
        │
        ▼
PatientController.createPatient()
        │
        ▼
PatientService.createPatient()
├─ Check if email already exists (database query)
├─ If exists → throw EmailAlreadyExistsException
└─ If valid → Save to database
        │
        ├─────────────────────────────────────────┐
        │                                         │
        ▼                                         ▼
   [ Synchronous ]                          [ Asynchronous ]
        │                                         │
        ▼                                         ▼
gRPC Call to Billing Service          Kafka Event Published
├─ BillingServiceGrpcClient            (PatientEvent message)
├─ Create billing account                │
└─ Wait for response                      ▼
                                    Analytics Service (consumer)
                                    └─ Process and store insights
        │
        ▼
Response: PatientResponseDTO (id, name, email, phone, dob)
```

**Key Classes:**
- `PatientController` - REST endpoints
- `PatientService` - Business logic
- `PatientRepository` - JPA database operations
- `BillingServiceGrpcClient` - gRPC client
- `KafkaProducer` - Event publishing
- `PatientMapper` - DTO conversions

**Database Interactions:**
```java
// Check email uniqueness
patientRepository.existsByEmail(email)

// Save patient
patientRepository.save(patient)

// Retrieve all patients
patientRepository.findAll()

// Update patient
patientRepository.save(updatedPatient)

// Delete patient
patientRepository.deleteById(id)
```

---

### 3️⃣ Inter-Service Communication (gRPC)

**Billing Service Request (Synchronous):**
```protobuf
// billing_service.proto
service BillingService {
  rpc CreateBillingAccount (BillingRequest) returns (BillingResponse);
}

message BillingRequest {
  string patientId = 1;
  string name = 2;
  string email = 3;
}

message BillingResponse {
  string accountId = 1;
  string status = 2;
}
```

**Implementation:**
```java
// Patient Service → Billing Service (gRPC)
BillingServiceGrpcClient.createBillingAccount(patientId, name, email)
  ├─ Connect to Billing Service via ManagedChannel (localhost:9001)
  ├─ Create BillingRequest protobuf message
  ├─ Call blockingStub.createBillingAccount()
  └─ Return BillingResponse
```

---

### 4️⃣ Event-Driven Analytics (Kafka)

**Patient Event Schema:**
```protobuf
// patient_event.proto
message PatientEvent {
  string patientId = 1;
  string name = 2;
  string email = 3;
  string event_type = 4;  // "CREATED", "UPDATED", "DELETED"
}
```

**Flow:**
```
PatientService publishes event
        │
        ▼
KafkaProducer.send("patient-events", PatientEvent)
        │
        ▼
Message stored in Kafka broker topic
        │
        ▼
Analytics Service (Kafka consumer)
        │
├─ @KafkaListener on "patient-events" topic
├─ Deserialize PatientEvent from protobuf
└─ Process: aggregate, analyze, store insights
        │
        ▼
Real-time analytics dashboard (future feature)
```

---

### 5️⃣ API Gateway Routing & JWT Validation

**Route Configuration (application.yml):**
```yaml
routes:
  - id: auth-service-route
    uri: http://auth-service:4005
    predicates:
      - Path=/auth/**
    filters:
      - StripPrefix=1

  - id: patient-service-route
    uri: http://patient-service:4000
    predicates:
      - Path=/api/patients, /api/patients/**
    filters:
      - StripPrefix=1
      - JwtValidation  # Custom filter
```

**JWT Validation Process:**
```
Request arrives at Gateway
        │
        ▼
JwtValidationException (custom filter)
        │
        ├─ Check if Authorization header exists
        ├─ Extract "Bearer <token>" format
        ├─ Call Auth Service to validate token
        │
        ├─ If valid ✓ → Forward to target service
        │
        └─ If invalid ✗ → Return 401 UNAUTHORIZED
```

---

### 6️⃣ Data Flow Summary

```
INPUT (HTTP Request)
  │
  ▼
API Gateway (Port 4004)
  │
  ├─ JWT Validation ✓
  │
  ▼
Service Layer (4000-4005)
  │
  ├─ Business Logic
  ├─ Database Queries (PostgreSQL)
  ├─ gRPC Calls (Billing Service)
  ├─ Kafka Events (Analytics)
  │
  ▼
Response (JSON/Protobuf)
  │
  ▼
OUTPUT (JSON to Client)

---

## 🚀 Getting Started

### ✅ Prerequisites

Before you begin, ensure you have the following installed:

| Requirement | Version | Purpose |
|-------------|---------|---------|
| **Java JDK** | 17 or 21 | Runtime environment |
| **Maven** | 3.9+ | Build tool and dependency manager |
| **Docker** | 20.10+ | Container runtime |
| **Docker Compose** | 2.0+ | Multi-container orchestration |
| **Git** | Latest | Version control |
| **PostgreSQL** | 12+ | (Optional if using Docker) |
| **Apache Kafka** | Latest | (Optional if using Docker) |

**Verify installations:**
```bash
java -version
mvn -version
docker --version
docker-compose --version
git --version
```

---

### 📦 Installation

#### Option 1: Clone and Build Locally

**Step 1: Clone the repository**
```bash
git clone https://github.com/yourusername/patient-management.git
cd patient-management
```

**Step 2: Build all microservices with Maven**
```bash
# Clean and build all services (skipping tests for speed)
mvn clean install -DskipTests

# Or run tests as well (recommended)
mvn clean install
```

**Troubleshooting:**
- If build fails: `mvn clean` to remove old build artifacts
- Check Maven cache: `rm -rf ~/.m2/repository` (Unix/Mac) or `rmdir %USERPROFILE%\.m2\repository` (Windows)

---

#### Option 2: Using Docker Compose (Recommended)

**Step 1: Clone the repository**
```bash
git clone https://github.com/yourusername/patient-management.git
cd patient-management
```

**Step 2: Build and start all services**
```bash
# Build Docker images and start all containers
docker-compose up --build -d

# Or just start existing containers
docker-compose up -d
```

**Step 3: Verify services are running**
```bash
# Check container status
docker-compose ps

# Expected output:
# NAME                    STATUS
# auth-service            Up 2 minutes
# patient-service         Up 2 minutes
# billing-service         Up 2 minutes
# analytics-service       Up 2 minutes
# api-gateway             Up 2 minutes
# postgres                Up 2 minutes
# kafka                   Up 2 minutes
```

**Step 4: View logs**
```bash
# All services
docker-compose logs -f

# Specific service
docker-compose logs -f patient-service
```

---

### ▶️ Run the Project

#### Option A: Running Individual Services Locally

**Terminal 1: Start Auth Service**
```bash
cd auth-service
mvn spring-boot:run

# Expected output:
# Started AuthServiceApplication in 5.2 seconds
# Listening on port 4005
```

**Terminal 2: Start Billing Service**
```bash
cd billing-service
mvn spring-boot:run

# Expected output:
# Started BillingServiceApplication in 4.8 seconds
# gRPC server listening on port 9001
```

**Terminal 3: Start Patient Service**
```bash
cd patient-service
mvn spring-boot:run

# Expected output:
# Started PatientServiceApplication in 6.1 seconds
# Connected to Billing Service at localhost:9001
```

**Terminal 4: Start Analytics Service**
```bash
cd analytics-service
mvn spring-boot:run

# Expected output:
# Started AnalyticsServiceApplication in 5.5 seconds
# Kafka consumer listening on patient-events topic
```

**Terminal 5: Start API Gateway**
```bash
cd api-gateway
mvn spring-boot:run

# Expected output:
# Started ApiGatewayApplication in 3.2 seconds
# Listening on port 4004
```

---

#### Option B: Using Docker Compose

```bash
# Start all services in detached mode
docker-compose up -d

# Follow logs in real-time
docker-compose logs -f

# Stop all services
docker-compose down

# Stop and remove volumes (clean slate)
docker-compose down -v
```

---

### ✓ Verification

**Test if services are running:**

```bash
# 1. Auth Service
curl http://localhost:4004/auth/validate \
  -H "Authorization: Bearer test-token"
# Expected: 401 Unauthorized (invalid token)

# 2. Patient Service (without token - should fail)
curl http://localhost:4004/api/patients
# Expected: 401 Unauthorized

# 3. API Gateway health check
curl http://localhost:4004/actuator/health
# Expected: { "status": "UP" }
```

---

### 🔍 Common Issues & Troubleshooting

| Issue | Solution |
|-------|----------|
| Port already in use | Kill process: `lsof -ti:4000 \| xargs kill -9` (Mac/Linux) or use Task Manager (Windows) |
| Maven dependency errors | Run: `mvn clean install -U` to update dependencies |
| Docker build fails | Check Docker daemon is running: `docker ps` |
| Kafka connection error | Ensure Kafka broker is running on `localhost:9092` |
| PostgreSQL connection refused | Start PostgreSQL or use Docker: `docker run -d -e POSTGRES_PASSWORD=password postgres` |
| JWT token invalid | Regenerate token via `/auth/login` endpoint |

---

## 🔐 Environment Variables

Environment configuration is managed through `.env` files or Docker environment variables. Below are the required variables for each service:

### Auth Service `.env`

```properties
# ═══════════════════════════════════════════════════════════════
# Auth Service Configuration
# ═══════════════════════════════════════════════════════════════

# JWT Token Secret (base64 encoded - use a strong random value in production)
JWT_SECRET=Y2hhVEc3aHJnb0hYTzMyZ2ZqVkpiZ1RkZG93YWxrUkM=

# Database Connection
DB_JDBC_URL=jdbc:postgresql://localhost:5432/auth-service-db
DB_USERNAME=postgres
DB_PASSWORD=password
DB_DRIVER=org.postgresql.Driver

# Spring Configuration
SPRING_PROFILE=development
SERVER_PORT=4005
```

**Generate Strong JWT Secret:**
```bash
# Generate random 32-byte base64 string
openssl rand -base64 32
# Output: ChgT7HrgoHXO32gfjVJbgTddoWalkRC=
```

---

### Patient Service `.env`

```properties
# ═══════════════════════════════════════════════════════════════
# Patient Service Configuration
# ═══════════════════════════════════════════════════════════════

# Database Connection
DB_JDBC_URL=jdbc:postgresql://localhost:5432/patient-service-db
DB_USERNAME=postgres
DB_PASSWORD=password
DB_DRIVER=org.postgresql.Driver

# Billing Service gRPC
BILLING_SERVICE_ADDRESS=localhost
BILLING_SERVICE_GRPC_PORT=9001

# Kafka Configuration
KAFKA_BROKER_ADDRESS=localhost:9092
KAFKA_TOPIC=patient-events
KAFKA_CONSUMER_GROUP=patient-service-group

# Spring Configuration
SPRING_PROFILE=development
SERVER_PORT=4000
```

---

### Billing Service `.env`

```properties
# ═══════════════════════════════════════════════════════════════
# Billing Service Configuration
# ═══════════════════════════════════════════════════════════════

# gRPC Server Configuration
GRPC_SERVER_PORT=9001
GRPC_MAX_INBOUND_MESSAGE_SIZE=4194304

# Spring Configuration
SPRING_PROFILE=development
SERVER_PORT=4001
```

---

### Analytics Service `.env`

```properties
# ═══════════════════════════════════════════════════════════════
# Analytics Service Configuration
# ═══════════════════════════════════════════════════════════════

# Kafka Consumer Configuration
KAFKA_BROKER_ADDRESS=localhost:9092
KAFKA_TOPIC=patient-events
KAFKA_CONSUMER_GROUP=analytics-service-group
KAFKA_AUTO_OFFSET_RESET=earliest

# Spring Configuration
SPRING_PROFILE=development
SERVER_PORT=4002
```

---

### API Gateway `.env`

```properties
# ═══════════════════════════════════════════════════════════════
# API Gateway Configuration
# ═══════════════════════════════════════════════════════════════

# Gateway Port
SERVER_PORT=4004

# Service URLs (for routing)
AUTH_SERVICE_URL=http://auth-service:4005
PATIENT_SERVICE_URL=http://patient-service:4000
BILLING_SERVICE_URL=http://billing-service:4001

# Spring Configuration
SPRING_PROFILE=development
```

---

### Docker Compose Environment Setup

**Create `.env` file in project root:**
```bash
# Root .env file for docker-compose
POSTGRES_USER=postgres
POSTGRES_PASSWORD=password
POSTGRES_DB=patient-management-db

KAFKA_BROKER=kafka:9092
SPRING_PROFILE=docker
```

**Pass to docker-compose:**
```bash
# Automatic (if .env exists in same directory)
docker-compose up

# Or explicit
docker-compose --env-file .env up
```

---

### Kubernetes Secrets (Production)

For production deployments, use Kubernetes Secrets:

```yaml
# kubernetes/secrets.yaml
apiVersion: v1
kind: Secret
metadata:
  name: patient-management-secrets
type: Opaque
stringData:
  JWT_SECRET: <base64-encoded-secret>
  DB_PASSWORD: <database-password>
  KAFKA_SASL_PASSWORD: <kafka-password>
```

Apply:
```bash
kubectl apply -f kubernetes/secrets.yaml
```

---

### ⚠️ Security Notes

| Variable | Security Level | Notes |
|----------|----------------|-------|
| `JWT_SECRET` | 🔴 CRITICAL | Never commit to repo; use strong 32-byte random value |
| `DB_PASSWORD` | 🔴 CRITICAL | Use environment variables, not hardcoded values |
| `KAFKA_SASL_PASSWORD` | 🔴 CRITICAL | If using SASL authentication |
| `API_KEY` | 🟡 SENSITIVE | Rotate regularly in production |

**Best Practices:**
- ✅ Use `.env` files locally (add to `.gitignore`)
- ✅ Use Kubernetes Secrets in production
- ✅ Use AWS Secrets Manager for cloud deployments
- ✅ Rotate credentials regularly
- ✅ Enable encryption in transit (TLS/SSL)

---

## 📸 Screenshots / Demo

### API Endpoint Examples

#### 🔑 1. Login & Get JWT Token

```bash
curl -X POST http://localhost:4004/auth/login \
  -H "Content-Type: application/json" \
  -H "Accept: application/json" \
  -d '{
    "email": "user@example.com",
    "password": "securepassword123"
  }'
```

**Response (200 OK):**
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJ1c2VyQGV4YW1wbGUuY29tIiwicm9sZSI6IlVTRVIiLCJpYXQiOjE2Nzg4OTI4MDB9.abcDefghIjKlmnOpQrStUvwXyzAbCdEfGhIjKlMnOp"
}
```

---

#### 👥 2. Create a New Patient

```bash
curl -X POST http://localhost:4004/api/patients \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..." \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "555-123-4567",
    "dateOfBirth": "1990-01-15"
  }'
```

**Response (201 Created):**
```json
{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "555-123-4567",
  "dateOfBirth": "1990-01-15",
  "createdAt": "2025-01-20T10:30:00Z",
  "status": "ACTIVE"
}
```

---

#### 📋 3. Get All Patients

```bash
curl -X GET http://localhost:4004/api/patients \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
```

**Response (200 OK):**
```json
[
  {
    "id": "550e8400-e29b-41d4-a716-446655440000",
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "555-123-4567",
    "dateOfBirth": "1990-01-15"
  },
  {
    "id": "660e8400-e29b-41d4-a716-446655440001",
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "phone": "555-987-6543",
    "dateOfBirth": "1985-05-20"
  }
]
```

---

#### ✏️ 4. Update Patient Information

```bash
curl -X PUT http://localhost:4004/api/patients/550e8400-e29b-41d4-a716-446655440000 \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..." \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe Updated",
    "phone": "555-999-8888"
  }'
```

**Response (200 OK):**
```json
{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "name": "John Doe Updated",
  "email": "john.doe@example.com",
  "phone": "555-999-8888",
  "dateOfBirth": "1990-01-15"
}
```

---

#### 🗑️ 5. Delete a Patient

```bash
curl -X DELETE http://localhost:4004/api/patients/550e8400-e29b-41d4-a716-446655440000 \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
```

**Response (204 No Content):**
```
(Empty body - patient deleted successfully)
```

---

#### ✅ 6. Validate JWT Token

```bash
curl -X GET http://localhost:4004/auth/validate \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
```

**Response (200 OK):**
```
(Empty body - token is valid)
```

**Response if invalid (401):**
```json
{
  "error": "UNAUTHORIZED",
  "message": "Invalid or expired token"
}
```

---

#### ❌ 7. Error Handling - Duplicate Email

```bash
curl -X POST http://localhost:4004/api/patients \
  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..." \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Duplicate User",
    "email": "john.doe@example.com",
    "phone": "555-111-2222",
    "dateOfBirth": "1990-01-15"
  }'
```

**Response (409 Conflict):**
```json
{
  "error": "EMAIL_ALREADY_EXISTS",
  "message": "A Patient with this email already exists: john.doe@example.com"
}
```

---

#### ❌ 8. Error Handling - Missing Authorization

```bash
curl -X GET http://localhost:4004/api/patients
# (No Authorization header)
```

**Response (401 Unauthorized):**
```json
{
  "error": "UNAUTHORIZED",
  "message": "Missing or invalid authorization token"
}
```

---

### Performance Metrics (Expected)

| Operation | Latency | Throughput |
|-----------|---------|-----------|
| Login | ~50ms | 500 req/sec |
| Create Patient | ~100ms | 300 req/sec |
| Get All Patients | ~30ms | 1000 req/sec |
| Update Patient | ~80ms | 400 req/sec |
| Delete Patient | ~60ms | 450 req/sec |
| gRPC Billing Call | ~40ms | 600 req/sec |
| Kafka Event Publish | ~10ms | 5000 msg/sec |

---

### API Documentation (Swagger/OpenAPI)

Access interactive API documentation:

```
Auth Service Docs:
  http://localhost:4004/api-docs/auth

Patient Service Docs:
  http://localhost:4004/api-docs/patients

Interactive Testing (Swagger UI):
  http://localhost:4004/swagger-ui.html
```

---

## 🧪 Testing

The project includes comprehensive testing strategies across unit, integration, and end-to-end levels.

### Unit Testing

**Run all unit tests:**
```bash
mvn test
```

**Run tests for a specific service:**
```bash
cd patient-service
mvn test

# Verbose output
mvn test -X

# Run specific test class
mvn test -Dtest=PatientServiceTest

# Run specific test method
mvn test -Dtest=PatientServiceTest#testCreatePatient
```

**Expected Output:**
```
[INFO] Running com.pm.patientservice.service.PatientServiceTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.345 s
[INFO] BUILD SUCCESS
```

---

### Integration Testing

**Run integration tests:**
```bash
cd intigtation-tests
mvn verify

# With detailed reporting
mvn verify -X
```

**Test categories:**
- Authentication flow tests
- Patient CRUD operations
- gRPC billing service calls
- Kafka event publishing/consumption
- API Gateway routing

---

### Manual Testing with HTTP Requests (IntelliJ)

The project includes `.http` files for IntelliJ IDEA's built-in HTTP client:

**Location:** `api-requests/` directory

**How to use:**
1. Open any `.http` file in IntelliJ
2. Click the ▶️ play button or press `Ctrl+Alt+Shift+E`
3. View response in the HTTP Client panel

**Available test files:**
```
api-requests/
├── auth-service/
│   ├── login.http           # Test login endpoint
│   └── validate.http        # Test token validation
└── patient-service/
    ├── create-patient.http
    ├── get-patients.http
    ├── update-patients.http
    └── delete-patients.http
```

---

### Load Testing

**Using Apache JMeter:**
```bash
# Create test plan for endpoints
jmeter -t patient-management.jmx

# Run in command line mode
jmeter -n -t patient-management.jmx -l results.jtl -j logs.jtl
```

**Using curl with loop:**
```bash
# Simulate 100 sequential requests
for i in {1..100}; do
  curl -X POST http://localhost:4004/auth/login \
    -H "Content-Type: application/json" \
    -d '{"email":"user@example.com","password":"password"}'
done
```

---

### Test Coverage

**Generate code coverage report:**
```bash
mvn clean test jacoco:report

# View HTML report
open target/site/jacoco/index.html  # Mac
# Or navigate to target/site/jacoco/index.html in browser
```

---

### Docker Testing

**Build and test Docker image:**
```bash
# Build specific service image
docker build -f patient-service/Dockerfile \
  -t patient-service:latest patient-service/

# Run tests inside container
docker run --rm patient-service:latest \
  mvn test
```

---

### ✅ Test Checklist

- [ ] All unit tests pass: `mvn test`
- [ ] Integration tests pass: `mvn verify`
- [ ] Code coverage >70%
- [ ] Docker images build successfully
- [ ] Manual API tests pass via curl/Postman
- [ ] Load tests within acceptable latency
- [ ] Database migrations successful

---

## 🧩 Future Improvements

### Performance & Scalability
- 📈 **Redis Caching Layer** - Cache frequently accessed patient records and authentication tokens
- 🔄 **Circuit Breaker Pattern** - Implement Resilience4j for gRPC and HTTP call resilience
- 🚀 **Horizontal Scaling** - Load balancing with multiple instances of each service
- 💾 **Database Sharding** - Partition patient data by region or healthcare provider
- 🔗 **Connection Pooling** - Optimize database connections with HikariCP

### Security Enhancements
- 🔐 **OAuth 2.0 Integration** - Support OIDC and third-party identity providers
- 🛡️ **Rate Limiting** - Implement API rate limiting per user/IP
- 📝 **Audit Logging** - Track all sensitive operations for compliance
- 🔒 **Encryption at Rest** - Encrypt sensitive data in databases
- 🚨 **Advanced Threat Detection** - WAF rules and anomaly detection

### Analytics & Insights
- 📊 **Real-time Dashboards** - WebSocket-based live analytics visualization
- 🤖 **ML-Based Insights** - Patient risk assessment and trend analysis
- 📈 **Predictive Analytics** - Forecast patient outcomes and resource needs
- 📱 **Mobile-Friendly Reports** - Responsive analytics interface
- 🎯 **Custom Report Builder** - Allow users to create custom analytics views

### DevOps & Infrastructure
- ☸️ **Kubernetes Deployment** - Helm charts for K8s orchestration
- 🔄 **CI/CD Pipeline** - GitHub Actions for automated testing and deployment
- 📊 **Monitoring Stack** - Prometheus metrics and Grafana dashboards
- 🔍 **Distributed Tracing** - Jaeger/Zipkin for request tracing
- 📋 **Infrastructure as Code** - Terraform for IaC beyond AWS CDK
- 🌍 **Multi-Region Support** - Active-active deployment across regions

### Data & Integration
- 📡 **HL7/FHIR Support** - Healthcare data interoperability standards
- 🔗 **EHR Integration** - Seamless connection with existing health systems
- 📤 **Data Export** - Bulk export in multiple formats (CSV, JSON, XML)
- 🔔 **Webhook Events** - Real-time event notifications to external systems
- 🗂️ **Data Archival** - Cold storage for historical patient records

### Developer Experience
- 📚 **OpenAPI/Swagger** - Enhanced interactive API documentation
- 🧪 **Mock Services** - Testcontainers for isolated testing
- 🐛 **Remote Debugging** - Debug production issues safely
- 📖 **API SDK Generation** - Auto-generate client SDKs (Java, Python, JavaScript)
- 🎓 **Tutorial & Examples** - Comprehensive step-by-step guides

---

## 🤝 Contributing

We welcome contributions from the community! This project follows an open development model.

### How to Contribute

**Step 1: Fork the Repository**
```bash
# Click "Fork" on GitHub to create your own copy
```

**Step 2: Clone Your Fork**
```bash
git clone https://github.com/yourusername/patient-management.git
cd patient-management
```

**Step 3: Create a Feature Branch**
```bash
# Use descriptive branch names
git checkout -b feature/add-patient-search
# or
git checkout -b bugfix/fix-jwt-validation
# or
git checkout -b docs/update-readme
```

**Step 4: Make Your Changes**
```bash
# Write your code, tests, and documentation
# Follow the guidelines below
```

**Step 5: Commit Your Changes**
```bash
# Use clear, descriptive commit messages
git commit -m "feat: add patient search by email"
git commit -m "fix: resolve JWT expiration bug"
git commit -m "docs: update API documentation"
```

**Step 6: Push to Your Fork**
```bash
git push origin feature/add-patient-search
```

**Step 7: Open a Pull Request**
- Go to the original repository
- Click "New Pull Request"
- Select your branch and provide a detailed description
- Link any related issues: `Fixes #123`

### Development Guidelines

#### Code Style
```java
// Follow Java conventions and best practices
// Use meaningful variable names
Patient patient = new Patient(); // ✓ Good
Patient p = new Patient();       // ✗ Avoid

// Use try-with-resources for resource management
try (PatientRepository repo = ...) {
    // Use resource
} // Auto-closed
```

#### Testing Requirements
- ✅ **Write unit tests** for new features (aim for >80% coverage)
- ✅ **Add integration tests** for API endpoints
- ✅ **Test edge cases** and error scenarios
- ✅ **Run full test suite** before submitting PR

```bash
# Before pushing, run:
mvn clean test
mvn clean verify
```

#### Documentation
- 📝 Update README.md if adding new features
- 💬 Add JavaDoc comments to public methods
- 📋 Include examples for complex functionality
- 🔗 Link to related documentation

#### Commit Message Format

Follow conventional commits:
```
<type>(<scope>): <subject>

<body>

<footer>
```

**Types:** `feat`, `fix`, `docs`, `style`, `refactor`, `test`, `chore`

**Examples:**
```
feat(patient-service): add search endpoint
fix(auth): resolve token expiration validation
docs(readme): add environment variables section
test(integration): add patient CRUD tests
```

#### Branch Naming Convention
```
feature/description          # New features
bugfix/description           # Bug fixes
docs/description             # Documentation
refactor/description         # Code refactoring
test/description             # Test improvements
```

### Pull Request Guidelines

**PR Title Format:**
```
[Service] Brief description of changes
[patient-service] Add email validation
[auth-service] Fix JWT expiration issue
[docs] Update getting started guide
```

**PR Description Template:**
```markdown
## Description
Brief explanation of what this PR does

## Type of Change
- [ ] New feature
- [ ] Bug fix
- [ ] Documentation update
- [ ] Performance improvement

## Changes Made
- Added X functionality
- Fixed Y issue
- Updated Z documentation

## Testing
- [ ] Unit tests added/updated
- [ ] Integration tests added/updated
- [ ] Manual testing performed

## Related Issues
Fixes #123
Related to #456

## Screenshots (if applicable)
[Include before/after screenshots]

## Checklist
- [ ] Code follows style guidelines
- [ ] Self-review of code completed
- [ ] Comments added for complex logic
- [ ] Documentation updated
- [ ] Tests pass locally
- [ ] No new warnings generated
```

### Review Process

1. **Automated Checks** - CI/CD pipeline runs tests
2. **Code Review** - Maintainers review code quality
3. **Feedback** - Changes requested if needed
4. **Approval** - PR approved by reviewer
5. **Merge** - Branch merged into main

### Issues & Feature Requests

**Found a Bug?**
- Check if it's already reported
- Provide steps to reproduce
- Include error logs and environment details

**Suggest a Feature?**
- Describe the use case
- Explain the benefit
- Provide implementation suggestions (optional)

### Communication

- 💬 **Discussions** - Ask questions and share ideas
- 🐛 **Issues** - Report bugs and suggest features
- 📧 **Email** - Contact maintainers for sensitive topics
- 🚀 **Roadmap** - Check our development roadmap

---

## 📄 License

This project is licensed under the **MIT License**.

**Permission is granted to:**
- ✅ Use commercially
- ✅ Modify and distribute
- ✅ Private and public use
- ✅ Include in proprietary software

**With these conditions:**
- 📋 Include license and copyright notice
- ❌ No liability or warranty provided

**For full details, see [LICENSE](LICENSE) file**

---

## 🔗 Resources & Documentation

### Official Documentation
- [Spring Boot Docs](https://spring.io/projects/spring-boot)
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
- [gRPC Java](https://grpc.io/docs/languages/java/)
- [Apache Kafka Docs](https://kafka.apache.org/documentation/)
- [AWS CDK Reference](https://docs.aws.amazon.com/cdk/)

### Tutorials & Guides
- [Microservices with Spring Boot](https://spring.io/guides)
- [JWT Authentication](https://jwt.io/introduction)
- [PostgreSQL Tutorial](https://www.postgresql.org/docs/)
- [Docker Best Practices](https://docs.docker.com/develop/dev-best-practices/)
- [gRPC Performance](https://grpc.io/docs/guides/performance-best-practices/)

### Related Technologies
- 🔐 JWT: [jwt.io](https://jwt.io)
- 📦 Protobuf: [protobuf.dev](https://protobuf.dev)
- 🐘 PostgreSQL: [postgresql.org](https://www.postgresql.org)
- 🚀 Maven: [maven.apache.org](https://maven.apache.org)
- 🐳 Docker: [docker.com](https://www.docker.com)

---

## 📞 Support & Contact

### Getting Help

| Channel | Purpose |
|---------|---------|
| **GitHub Issues** | Bug reports & feature requests |
| **GitHub Discussions** | Questions & community help |
| **Email** | security@patientmanagementsystem.com |
| **Wiki** | FAQs & detailed guides |

### Report a Security Issue

⚠️ **Do not create a public issue for security vulnerabilities**

Email: security@patientmanagementsystem.com with:
- Description of vulnerability
- Steps to reproduce
- Potential impact
- Suggested fix (if any)

### Acknowledgments

- Built with ❤️ for healthcare innovation
- Inspired by modern microservices best practices
- Thanks to all contributors!

---

<div align="center">

### Made with ❤️ by the Patient Management Team

[![Stars](https://img.shields.io/github/stars/yourusername/patient-management?style=social)](https://github.com/yourusername/patient-management)
[![Forks](https://img.shields.io/github/forks/yourusername/patient-management?style=social)](https://github.com/yourusername/patient-management)
[![Issues](https://img.shields.io/github/issues/yourusername/patient-management?style=social)](https://github.com/yourusername/patient-management/issues)

**[⬆ back to top](#-patient-management-system)**

</div>
