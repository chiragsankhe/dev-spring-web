## Interview questions 

### 1. What is Spring Boot?
+ Spring Boot is built on top of the Spring framework to create stand-alone RESTful web applications with very minimal configuration and there is no need of external servers to run the application because it has embedded servers like Tomcat and Jetty etc.

+ Spring Boot framework is independent.
+ It creates executable spring applications that are production-grade.

### 2. What is Spring Boot, and how is it different from the traditional Spring Framework?

+ Spring Boot is a framework built on top of the Spring Framework that simplifies the development of Java applications by providing auto-configuration, embedded servers, and opinionated defaults.

#### Differences from Traditional Spring Framework:
+ `Configuration`: Spring Boot eliminates the need for extensive XML or Java-based configuration, whereas traditional Spring requires manual setup.

+ `Embedded Server`: Spring Boot includes embedded servers like Tomcat and Jetty, while Spring requires an external server.

+ `Auto-Configuration`: Spring Boot automatically configures components based on dependencies, whereas Spring needs explicit configurations.

+ `Microservices Ready`: Spring Boot is optimized for building microservices, whereas Spring is more general-purpose.

+ `Faster Development`: With Spring Boot Starters, developers can quickly set up projects, while Spring requires adding and configuring dependencies manually.

### 3. What are the key features of Spring Boot?



##### Key Features of Spring Boot 🚀
##### Auto-Configuration 🛠️

+ Automatically configures Spring components based on dependencies.

+ Reduces the need for manual configuration.

##### Standalone Applications 🏃‍♂️

+ Comes with an embedded server (Tomcat, Jetty, Undertow).

+ No need for external deployment (WAR files).

##### Spring Boot Starters 🚀

+ Predefined dependency sets to simplify project setup.

+ Example: `spring-boot-starter-web`, `spring-boot-starter-data-jpa`.

##### Spring Boot CLI (Command Line Interface) 🖥️

+ Allows developers to run Groovy scripts to develop and test applications quickly.

##### Externalized Configuration 📄

+ Supports .properties and .yaml files for different environments.

+ Can read configurations from environment variables and command-line arguments.

##### Spring Boot Actuator 📊

+ Provides built-in monitoring, metrics, and health-check endpoints.

+ Example:` /actuator/health `, `/actuator/metrics.`

##### Spring Security Integration 🔐

+ Easy integration for authentication, authorization, and security features.

##### Microservices Support 🌍

+ Works seamlessly with Spring Cloud to build scalable microservices.

##### Production-Ready Features ⚙️

+ Logging (SLF4J, Logback), error handling, and performance monitoring.

##### Easy Testing ✅
+ Provides testing support with @SpringBootTest, MockMvc, and TestRestTemplate.  
