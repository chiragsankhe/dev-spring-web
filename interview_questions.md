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

## 2. spring and springboot 
###   1. What is Spring?
+ Spring Framework is a huge Java framework for building enterprise applications.

+ It provides modules like `Spring Core`,` Spring MVC` ,` Spring Data JPA` ,` Spring Security` , etc.

+ It is powerful but requires a lot of manual configuration (XML or Java-based).

#### Example – Creating a REST API in Spring (without Spring Boot)

#### Steps:

+ Create Maven project.

+ Add dependencies for Spring MVC, Jackson, Servlet API, etc. (manually in pom.xml).

+ Configure DispatcherServlet in web.xml.

+ Configure beans in XML or Java config.

+ Deploy WAR file to Tomcat manually.


#### Drawbacks:

+ Lots of boilerplate (XML, web.xml, bean configuration).

+ Need to deploy WAR to server manually.

#### 2. What is Spring Boot?
+ Spring Boot is a layer on top of Spring Framework.

+ It uses `opinionated defaults`  and `auto-configuration`  to remove boilerplate setup.

+ Comes with embedded servers (Tomcat, Jetty, Undertow) so you just run your app like a normal Java program.

+ No web.xml, no manual WAR deployment — just run it.

#### Example – Same REST API in Spring Boot

Steps:

+ Create project from Spring Initializr.

+ Select Spring Web dependency.

+ Write code — no XML needed.



##### Advantages:

+ No XML configuration — all Java-based.

+ Embedded Tomcat — run with java -jar myapp.jar.

+ Ready for microservices and production.

