# Microframeworks-WEB-Lab-5-Arep

# Table of Contents
- [Project description](#project-description)
- [System estructure](#system-estructure)
- [Architecture Description](#architecture-description)
- [Installation](#installation)
- [Usage](#usage)
- [REST Services](#rest-services)
- [Static Files](#static-files)
- [Tests](#tests)
- [Conclusion](#conclusion)
- [Author](#author)

---

# Project description  
This project consists of the development of a lightweight web microframework in Java that allows developers to define REST services using lambda functions, handle query parameters, serve static files, and run everything on a custom HTTP server, without relying on traditional web frameworks such as Spring MVC.

The main goal of this laboratory is to understand how modern web frameworks work internally by building one from scratch

---

# System estructure
The project is organized into three main layers:

```text
src/main/java/arep
├── framework
│   ├── HttpServer.java        // Core HTTP server
│   ├── HttpRequest.java       // HTTP request representation
│   ├── HttpResponse.java      // HTTP response representation
│   └── WebFramework.java      // Route registration using lambdas
│
├── appexample
│   └── MathServices.java      // Example application using the framework
│
└── Lab5Application.java       // Application entry point
```

This structure:

- Separates the framework logic from application logic
- Improves maintainability and readability
- Makes the system easier to extend

---

# Architecture Description

Framework Layer

Includes the core code of the micro framework, i.e., the following components:
- Implementation of HTTP server
- Registration of routes by lambda expressions
- Query parameters
- Static file support

Application Layer
- Illustrates to developers how to use the micro framework to create RESTful services.

Entry
- Lab5Application class is responsible for creating the server and routes.

---

# Installation

Prerequisites:

- Java 17 or higher
- Maven 3.8 or higher
- Git

Steps:
1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/Microframeworks-WEB-Lab-5-AREP.git
    ```

2. Navigate to the project directory:

    ```bash
    cd Microframeworks-WEB-Lab-5-AREP
    ```

3. Compile the project using Maven:

    ```bash
    mvn clean install
    ```

---

# Usage
To run the application, execute the following command:

```bash 
mvn exec:java
```

Once the server is running, open your browser and access the following URLs.

---

# REST Services
The framework allows defining REST services using lambda functions. Below is a list of available endpoints and their descriptions:

| Endpoint                   | Description                              |
| -------------------------- | ---------------------------------------- |
| `/pi`                      | Returns the value of PI                  |
| `/euler`                   | Returns Euler's number                   |
| `/App/pi`                  | Returns PI using the application example |
| `/App/helloWorld`          | Returns "Hello World"                    |
| `/App/frommethod`          | Returns Euler using a method call        |
| `/App/hello?name=YourName` | Returns a personalized greeting          |

Here is the evidence of the REST services in action:

Pi:

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/webPi.PNG)

Euler:

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/webEuler.PNG)

App Pi:

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/webAppPi.PNG)

Hello World:

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/webAppHello.PNG)

From Method (Euler):

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/webAppFromMethod.PNG)

Hello with query parameter:

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/4urlMejoradoNombre.PNG)

Index.html:

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/newIndex.PNG)

In here we can see the evidence of static files and also we change the index so it shows the endpoints and how to use them and also if you click on the endpoints it will take you to the corresponding endpoint.

This will happen if we enter an invalid URL:

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/3pruebaError.PNG)

- Example requests
Here are some example requests you can make to the server:

  ```
  http://localhost:8080/App/hello?name=Pedro
  ```

- Example response
  ```
  Hello, Pedro!
  ```

---

# Static Files
The framework also supports serving static files. You can place your static files (e.g., HTML, CSS, JavaScript) in the `src/main/resources/static` directory. For example, if you have an `index.html` file in that directory, you can access it via:

```
http://localhost:8080/index.html
```

- Configuration Example:

```java
HttpServer.staticFiles("webroot/public");
``` 

- Static File Structure:
```
src/main/resources/static
├── index.html
├── styles.css
└── script.js
```

---

# Tests
The project includes automated tests using JUnit 5 to verify the correct behavior of the server and the application.

- Run tests using Maven:

```bash
mvn test
```

- Evidence

All tests execute successfully, validating:

- Route registration
- HTTP request handling
- Query parameter extraction
- Server execution

![image](https://github.com/CamiloFdez/Microframeworks-WEB-Lab-5-Arep/blob/main/images/tests.PNG)

---

# Conclusion
This project demonstrates the implementation of a lightweight web microframework in Java, allowing developers to define REST services using lambda functions, handle query parameters, serve static files, and run everything on a custom HTTP server. The architecture separates the framework logic from application logic, improving maintainability and readability while making the system easier to extend.

---

# Author
- Camilo Fernández
- GitHub: [CamiloFdez](https://github.com/CamiloFdez)

---