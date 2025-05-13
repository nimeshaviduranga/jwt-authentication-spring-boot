### Spring Boot JWT Authentication

A simple JWT authentication implementation using Spring Boot 3.4.5, Maven, and Java 17.

### Features

- User registration and login with JWT authentication
- Password encryption using BCrypt
- Role-based authorization with Spring Security
- Customized access denied handling
- Logout mechanism
- Refresh token functionality

### Technologies

- Java 17
- Spring Boot 3.4.5
- Spring Security
- JSON Web Tokens (JWT)
- H2 Database (for development)
- Maven 3.9
- Lombok

### Getting Started

### Prerequisites

- JDK 17
- Maven 3.9.x

### Installation

1. Clone the repository 
```bash
git clone https://github.com/nimeshaviduranga/jwt-authentication-spring-boot.git
cd jwt-authentication-spring-boot
```

2. Build the project
```bash
mvn clean install
```

3. Run the application
```bash
mvn spring-boot:run
```

The application will start on http://localhost:8080

## Usage

### User Registration

```bash
curl -X POST 'http://localhost:8080/api/auth/signup' \
-H 'Content-Type: application/json' \
-d '{
    "username": "user",
    "email": "user@example.com",
    "password": "password",
    "role": ["user"]
}'
```

### User Login

```bash
curl -X POST 'http://localhost:8080/api/auth/signin' \
-H 'Content-Type: application/json' \
-d '{
    "username": "user",
    "password": "password"
}'
```

The response will contain the JWT token:

```json
{
    "token": "eyJhbGciOiJIUzI1NiJ9...",
    "type": "Bearer",
    "id": 1,
    "username": "user",
    "email": "user1@test.com",
    "roles": ["ROLE_USER"]
}
```