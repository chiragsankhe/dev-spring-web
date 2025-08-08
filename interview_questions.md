## 1.why developers use Spring Boot:

##### 1. Faster Development
+ `No boilerplate setup` : You don’t have to manually configure Spring dependencies, XML files, or server setup.

+ `Auto-configuration` : It detects what you’ve added to your classpath and automatically configures your application accordingly.

You can start coding business logic instead of spending hours on configuration.

#### 2. Embedded Servers
+ Comes with embedded `Tomcat` ,` Jetty` , or` Undertow`  — so you don’t need to install or configure an external server.

+ Just run your main() method, and your web application starts like a normal Java program.

#### 3. Microservice Ready
+ Works perfectly for microservices architecture with Spring Cloud integration.

+ Easy to create REST APIs, connect to databases, and deploy in containers (like Docker).

#### 4. Production-Ready Features
+ Built-in `health checks`, ` metrics`, and `logging` via Spring Boot Actuator.

+ Supports externalized configuration (via `application.properties` or `application.yml`), making it easy to manage environments (dev, test, prod).

### 5. Opinionated Defaults (But Flexible)
Gives sensible defaults for project setup so you can get started fast.

Still allows customization — you can override defaults if you need.

#### 6. Huge Ecosystem & Community
+ Works with the full Spring ecosystem (`Spring Data JPA`,` Spring Security`,` Spring Batch`, etc.).

+ Strong community support and plenty of documentation/tutorials.

###  Example:
+ Without Spring Boot, to make a REST API you’d:

 + Configure a server (Tomcat).

 +Set up Spring dependencies manually.

+ Write a lot of XML config.

+ Deploy WAR to server.

---
