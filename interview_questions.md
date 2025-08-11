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

---

## 3. Spring Initializr 

#### 1. Saves Setup Time
No need to manually create the pom.xml (for Maven) or build.gradle (for Gradle) with dependencies.

You just select your project options, and it generates a complete ready-to-run project structure.

#### 2. Pre-configured Dependencies
You can choose from many Spring Boot starters (e.g., Spring Web, Spring Data JPA, Spring Security, etc.).

Spring Initializr adds the correct version of dependencies for the Spring Boot version you select, preventing conflicts.

#### 3. Standard Project Structure
Generates a clean, standard Maven/Gradle project that follows Spring’s conventions.

Includes the @SpringBootApplication main class, application.properties, and the necessary directories.

#### 4. Easy Integration with IDEs
Works directly with IntelliJ IDEA, VS Code, Eclipse, and STS — you can generate and import the project in seconds.

#### 5. Beginner-Friendly
No need to remember all dependency names or version numbers.

Lets you focus on coding instead of project setup.

### 💡 Example:
#### Instead of:

+ Creating folders manually.

+ Writing Maven XML by hand.

+ Figuring out compatible versions.

#### With Spring Initializr:

+ Go to start.spring.io

+ Select:

+ Project: Maven

+ Language: Java

+ Spring Boot version: 3.x.x

+ Dependencies: Spring Web, Spring Data JPA, MySQL Driver

+ Click Generate → Import into IDE → Start coding. ✅

If you want, I can also show you what happens behind the scenes when you generate a project from Spring Initializr so you fully understand it.


---
## 4. does spring replace spring mvc spring rest etc 

+ `No` — Spring Boot (and the broader Spring ecosystem) does not replace Spring MVC, Spring REST, etc.
Instead, it uses them under the hood and makes them easier to work with.

#### How it works:
+ `Spring MVC`  → Framework for building web applications and REST APIs.

+ `Spring REST → Basically Spring MVC + REST principles (using @RestController, @GetMapping, etc.).

_ `Spring Boot`  → Provides auto-configuration, embedded servers, and starter dependencies so you can use Spring MVC, REST, Data JPA, Security, etc., without heavy manual setup.

### 💡 Analogy:

+ `Spring MVC` = Car engine

+ `Spring REST`  = Engine tuned for highway driving

+ `Spring Boot` = Car showroom that gives you a ready-to-drive car instead of separate parts

---

## 5. Does Spring Boot run code faster than regular Spring code?
 + No.
 +  Behind the scenes, Spring Boot uses same code of Spring Framework
 +   Remember, Spring Boot is about making it easier to get started
 +    Minimizing configuration etc 
 ---
 ## 6. what is mavan?
+  Maven is a build automation and dependency management tool for Java projects.
```
  Maven Solution
 • Tell Maven the projects you are working with (dependencies)
 • Spring, Hibernate etc …. 
• Maven will go out and download the JAR files for those projects for you 
• And Maven will make those JAR files available during compile/run 
• Think of Maven as your friendly helper / personal shopper :-
```
#### What it does:
+ Builds your project

+ Compiles Java code

+ Runs tests

+ Packages into JAR/WAR files

#### Manages dependencies

+ You declare needed libraries in pom.xml

+ Maven downloads them automatically from online repositories

+ Standardizes project structure

+ `src/main/java` for source code

+ `src/test/java`  for tests

---
## 7. standard directory structure

+ standard directory structure looks like this:


```
my-project/
│
├── src/
│   ├── main/
│   │   ├── java/                # Your Java source code
│   │   │   └── com/example/app/
│   │   │       └── MyApplication.java
│   │   ├── resources/           # Config files, templates, static files
│   │   │   ├── application.properties
│   │   │   └── templates/       # Thymeleaf or other view templates
│   │   │   └── static/          # Static assets like CSS, JS, images
│   │
│   ├── test/
│   │   ├── java/                # Your unit and integration tests
│   │   └── resources/           # Test resources (if needed)
│
├── pom.xml                      # Maven configuration (dependencies, plugins, build settings)
└── target/                  # Auto-generated build output (JAR/WAR files, compiled classes)
```
#### Why it’s important
+ Maven follows this structure by default, so tools and IDEs know exactly where to find code, configs, and tests.

+ Spring Boot also expects this structure — if you follow it, no extra configuration is needed.
---

## 8. mavan pom.xml
+  Maven, the POM file (pom.xml) is the Project Object Model file — the main configuration file that tells Maven:

+ Project details (`name`,` version` ,` group` )

+ Dependencies (libraries your project needs)

+ Build settings (`plugins` ,` Java version` , etc.)

+ Packaging type (`JAR` ,` WAR` )

#### Basic Example of pom.xml in Spring Boot
```
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <!-- Maven model version -->
    <modelVersion>4.0.0</modelVersion>

    <!-- Project coordinates -->
    <groupId>com.example</groupId>      <!-- Company/project namespace -->
    <artifactId>demo-app</artifactId>   <!-- Project name -->
    <version>1.0.0</version>             <!-- Version -->
    <packaging>jar</packaging>          <!-- Packaging type -->

    <!-- Parent: Spring Boot starter -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.3.0</version>
    </parent>

    <!-- Dependencies -->
    <dependencies>
        <!-- Spring Web for REST APIs -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- Optional: MySQL driver -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
    </dependencies>

    <!-- Build settings -->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>

```
### Key Sections in a POM File
|Section	                  |    Purpose|
|----------------------|--------------|
|`<groupId>`	              |   Unique ID for your project’s organization (like a package name).|
| `<artifactId>`	           |   Name of your project.|
|`<version>`	              |   Project version.|
|`<packaging>`	            |   Output type (jar, war).|
|`<parent>`	               |   Parent project settings (Spring Boot starter parent in this case).|
|`<dependencies>`	         |   List of libraries your app needs.|
|`<build>`	                |  Build-related settings, plugins, and configurations.|


---

## 8. static content 
+ In Spring Boot, static content means files like `HTML` ,` CSS `,` JavaScript` , and `images` 
+ that are served directly to the browser without any processing by the server.
```
  src/
 └── main/
     └── resources/
         └── static/
             ├── index.html
             ├── style.css
             └── script.js
```

### How it works
+ If you put index.html in `static/`,` visiting http://localhost:8080/index.html` will load it directly.

+ No controller or backend code is needed.

Useful for:

+ Images

+ CSS and JS files

+ Downloadable files (PDF, docs)
---

## 9. Unit testing
Unit testing is a software testing method where you test `small` ,` isolated parts`  of your code (usually individual methods or classes) to make sure they work as expected.

Key Points
+ Tests only one unit of functionality at a time.

+ Should be independent (not rely on database, network, or other services).

+ Helps find bugs early, before integration or deployment.

+ Often written using JUnit in Java and Mockito for mocking dependencies.

---
## 10. what is springboot starters?
+ In Spring Boot, starters are `predefined dependency` bundles that make it easy to add specific features to your project without manually searching and adding all required libraries.

+ Think of them as `“ready-made packages”` for common tasks.

### Key Points:
+ A starter is basically a Maven or Gradle dependency.

 +It pulls in all other required dependencies for a given feature.

+ Saves you from remembering library names and versions.

Follows Spring Boot's version compatibility automatically.


### Common Spring Boot Starters
|Starter |	Purpose|
|---------|----------|
| `spring-boot-starter-web`	 |For building web apps, REST APIs (Spring MVC + Tomcat)|
| `spring-boot-starter-data-jpa` |For database access with Hibernate/JPA|
|`spring-boot-starter-security`	|For authentication and authorization|
| `spring-boot-starter-test`	|For unit and integration testing|
| `spring-boot-starter-thymeleaf`	|For server-side HTML rendering|
| `spring-boot-starter-actuator `|	For monitoring and metrics|

---
## 11. Spring Boot DevTools
+ Spring Boot DevTools is a developer-friendly feature in Spring Boot that makes the development process faster and easier by automatically `restarting`,` reloading` , and` refreshing `your application whenever code changes are detected.

##   Example: How It Works
+ Add spring-boot-devtools dependency.

+ Start your Spring Boot app.

+ Change a Java file or .html file.

+ DevTools detects the change → Restarts your app → Browser auto-refreshes.

--- 
## 12. spring boot actuators 
+ In Spring Boot, Actuator is a feature that helps you monitor and manage your application in production (and during development).

+ It exposes built-in endpoints (via HTTP or JMX) that give you details about your app’s` health`,` metrics` ,` environment`,
  ` configuration`, etc. — all without writing extra code.

#### Why Actuator is used
+ Monitor application health (/actuator/health)

+ View metrics (CPU, memory usage, request count, etc.)

+ Check running beans, configuration properties

+ Manage application remotely (shutdown, log level changes)

 +Integrates with monitoring tools (`Prometheus`,` Grafana` , etc.)

### How to add Actuator
In pom.xml:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
### Common Actuator Endpoints
|Endpoint	| Description|
|---------|-------------|
| /actuator/health	|Shows application health status|
| /actuator/info	|Application info (from application.properties)|
| /actuator/metrics	|Shows metrics like memory, CPU, request counts|
| /actuator/beans	|List of all Spring Beans|
| /actuator/env|	Environment properties|
| /actuator/mappings|	All request mappings|
| /actuator/threaddump	|Thread dump|
| /actuator/loggers	|View & change log levels|
| /actuator/shutdown|	Gracefully shutdown the app (needs enabling)|


### example 
of using Spring Boot Actuator in a real-time `Employee Management ` Project so you can see exactly how it works in practice.

#### Scenario
+ We have an Employee Management System built in Spring Boot.
+ We want to monitor application ` health`,` metrics` , and` HTTP request details`  using Spring Boot Actuator.

#### Step 1: Add Actuator Dependency
In your pom.xml:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
#### Step 2: Enable Specific Endpoints
In `application.properties`:
```sh
# Enable all actuator endpoints
management.endpoints.web.exposure.include=*

# Custom App Info
management.info.env.enabled=true

# Set custom port for monitoring (optional)
management.server.port=8081

# Add some app info
info.app.name=Employee Management System
info.app.version=1.0
info.app.description=Spring Boot app for managing employees
```
### Step 3: Example REST Controller
```
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final List<String> employees = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));

    @GetMapping
    public List<String> getEmployees() {
        return employees;
    }

    @PostMapping
    public String addEmployee(@RequestParam String name) {
        employees.add(name);
        return "Employee added: " + name;
    }
}
```
### Step 4: Using Actuator Endpoints in Real Time
Once you run the app:

##### 1. Health Check

+ `GET http://localhost:8081/actuator/health`
##### Response:
```
{
  "status": "UP"
}
```
+ This shows if your Employee Management app is running fine.

##### 2. App Info

+ `GET http://localhost:8081/actuator/info`
##### Response:
```
{
  "app": {
    "name": "Employee Management System",
    "version": "1.0",
    "description": "Spring Boot app for managing employees"
  }
}
```
#####  3. Metrics (Real-Time)

+ `GET http://localhost:8081/actuator/metrics/http.server.requests`
##### Response Example:
```
{
  "name": "http.server.requests",
  "measurements": [
    {
      "statistic": "COUNT",
      "value": 12
    }
  ],
  "availableTags": [
    {
      "tag": "uri",
      "values": ["/employees", "/employees/{id}"]
    }
  ]
}
```
+ This tells you how many requests were made to` /employees ` in real-time.

#### 4. Integration with Prometheus & Grafana
Add Prometheus dependency:
```
<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
</dependency>
```
+ Enable Prometheus endpoint:
```
management.endpoints.web.exposure.include=prometheus
```
#### Visit:

+ `http://localhost:8081/actuator/prometheus`
+ Now, Grafana can pull metrics from Prometheus and show dashboards with:

+ Number of employees added per minute

 +HTTP request response times

+ Error rate, etc.

✅ This is how you can monitor your Employee Management app in real-time with Actuator, Prometheus, and Grafana.

---
## 13. mavan wrapper file 
+ The Maven Wrapper (often called `mvnw` ) is basically a  `small set of files that allow you to run Maven without having Maven installed globally on your computer.`

## 📂 Files Involved in Maven Wrapper
When you enable the Maven Wrapper, you get these files in your project:
```
mvnw          → Unix shell script to run Maven
mvnw.cmd      → Windows batch script to run Maven

/.mvn/wrapper/maven-wrapper.jar
/.mvn/wrapper/maven-wrapper.properties
```
### 🔹 Why it Exists
####  Without the wrapper:

+ Every developer must install Maven manually.

+ They might have different Maven versions, which can cause build issues.

#### With the wrapper:

+ The correct Maven version will automatically be downloaded and used for your project.

+ You just run ./mvnw clean install (Linux/Mac) or mvnw.cmd clean install (Windows), and it works.

---
## 14. application.properties
+ In Spring Boot, the `application.properties`  file is a central configuration file where you define settings for your application — like `database connection details`,` server port`,` logging levels`, or` custom application variables` — without hardcoding them in your Java code.

#### 1. Location
Usually placed in the src/main/resources folder of your project.

Spring Boot automatically reads it during application startup.
```
# ==================================
# CORE SETTINGS
# ==================================
spring.application.name=employee-management
spring.main.banner-mode=off
logging.level.root=INFO
logging.level.com.example=DEBUG

# ==================================
# WEB SETTINGS
# ==================================
server.port=8081
server.servlet.context-path=/api

# ==================================
# SECURITY SETTINGS
# (Spring Security default login)
spring.security.user.name=admin
spring.security.user.password=admin123
spring.security.user.roles=ADMIN

# ==================================
# ACTUATOR SETTINGS
# ==================================
management.endpoints.web.exposure.include=health,info,metrics,beans,env
management.endpoint.health.show-details=always
management.endpoints.web.base-path=/actuator
management.endpoint.shutdown.enabled=true

# ==================================
# DATA (DATABASE) SETTINGS
# ==================================
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA & Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# ==================================
# SERVER PROPERTIES
# ==================================
server.tomcat.threads.max=200
server.tomcat.connection-timeout=20000
server.error.include-message=always

```
### ✅ How this works in an Employee Management Project

+ Core → App name & logging configuration.

+ Web → Runs on http://localhost:8081/api instead of default 8080.

+ Security → Protects app with basic login (admin/admin123).

+ Actuator → Exposes health, metrics, and environment endpoints at /actuator.

+ Data → Connects to MySQL database employee_db.

+ Server → Sets Tomcat thread limit and error details.

---

# spring core 

## 1. Inversion of Control (IoC)
 In Spring Boot (and Spring in general), Inversion of Control (IoC) is a principle where the control of object creation and dependency management is given to the framework instead of you manually creating and wiring objects in your code.

Simple definition:
Normally in Java, you do something like:
```
Car car = new Car();
```
Here, you are in control of creating the object.

With IoC, you tell Spring what you need, and Spring will create and give you that object automatically, without you using new.
You just declare dependencies, and Spring injects them for you.

### Why is it called "Inversion of Control"?
In normal programming → You control when and how objects are created.

In IoC → Spring controls when and how objects are created.

The control is inverted — hence Inversion of Control.


### Real-life example
Think of a restaurant:

### Without IoC:
+ You cook your own food → you buy ingredients, prepare, cook, clean.

### With IoC: 
+ You just place the order → the chef (Spring) cooks and serves it for you.
+ You only declare what you need, not how to make it.


### How Spring Boot implements IoC
+ IoC Container = The part of Spring responsible for creating and managing objects.

### Two main IoC containers in Spring:

+ ` BeanFactory ` → Basic IoC container.

+ `ApplicationContext ` → Advanced IoC container with more features (events, AOP, etc.).

+ You define beans (in` @Configuration`  or using annotations like `@Component`,` @Service`, etc.).

+ Spring scans and manages these beans and injects them where required.


### Example: Laptop uses Processor
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class IocExampleApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(IocExampleApplication.class, args);

        // Get Laptop object from Spring
        Laptop laptop = context.getBean(Laptop.class);
        laptop.start();
    }
}

@Component
class Processor {
    void run() {
        System.out.println("Processor is running...");
    }
}

@Component
class Laptop {
    private final Processor processor;

    @Autowired // IoC: Spring injects Processor here
    public Laptop(Processor processor) {
        this.processor = processor;
    }

    void start() {
        processor.run();
        System.out.println("Laptop is starting...");
    }
}
```
### How IoC works here
+ You don’t use new Processor() or new Laptop().

+ Spring creates both objects automatically when the application starts.

+ Spring injects the `Processor`  object into `Laptop`  via the `constructor` .

+ When you get the Laptop bean from Spring’s IoC container and call .start(), it uses the injected Processor.

🔹 Output:
```
Processor is running...
Laptop is starting...
```










### Manual (without IoC)
```
public class ManualExample {
    public static void main(String[] args) {
        // Manually create Processor object
        Processor processor = new Processor();

        // Manually create Laptop object and pass Processor
        Laptop laptop = new Laptop(processor);

        // Call method
        laptop.start();
    }
}

class Processor {
    void run() {
        System.out.println("Processor is running...");
    }
}

class Laptop {
    private final Processor processor;

    public Laptop(Processor processor) {
        this.processor = processor;
    }

    void start() {
        processor.run();
        System.out.println("Laptop is starting...");
    }
}
```
--- 
## 2 . spring Bean
+ In Spring, a bean is simply an object that is `created`,` managed` , and` destroyed`  by the Spring Container.

+ If the container didn’t create it, it’s just a normal Java object.
+ If the container did create it and is managing it, it’s a Spring Bean.
#### Simple Definition
+ A Spring Bean is:

+ A Java object that is registered in the Spring IoC container so that Spring can create it, inject its dependencies, and manage its entire lifecycle.

### Key points
+ Beans are the building blocks of a Spring application.

You define them either:

By annotating the class:

+ `@Component` 

+ `@Service`

+ `@Repository`

+ `@Controller`

Or by writing a method with @Bean inside a @Configuration class.

The container keeps a registry of all beans.

### 💡 Summary Table:

|Term	| Meaning|
|-------|-----------|
|Bean |	A Java object managed by the Spring container.|
|IoC  |Container	The system that creates and manages beans.|
|@Component / @Bean	 |Ways to tell Spring which objects should become beans.|


--- 

## 3.  ioc container

+ In IoC (Inversion of Control), the container is like a `box`  that:

+  `Creates` all the objects (beans) your app needs

+  `Stores` them safely inside

+  `Gives` them to you whenever you ask

+  `Manages` them until the app closes

### In Spring
When you run:
```
ApplicationContext context = SpringApplication.run(App.class, args);
```
+ That` ApplicationContext ` is the IoC container.
It:

+ Scans for your beans (`@Component`,` @Service`, etc.).

+ Creates and wires them together.

Keeps them ready for you to use with:
```
MyBean obj = context.getBean(MyBean.class);
```
## 4.   injection means

+ In Spring, injection means giving an object (dependency) to another object — instead of that object creating it by itself.

### Example Without Injection (Manual)
```
class Car {
    Engine engine = new Engine(); // Car creates Engine itself
}
```
❌ Problem: Car is tightly coupled to Engine — you can’t easily change or test it.

### Example With Injection
```
@Component
class Engine { }

@Component
class Car {
    private final Engine engine;

    @Autowired
    public Car(Engine engine) { // Engine is injected here
        this.engine = engine;
    }
}
```
+ ✅ Here, Car doesn’t create Engine. Spring injects it when creating Car.

### Why injection is important
+ Makes your code loose-coupled (easy to swap dependencies).

+ Easier to test (you can inject mock objects).

+ Follows Dependency Inversion Principle.

### Types of Injection in Spring
#### 1. Setter Injection
Spring calls your setter method to pass the dependency.
```
@Component
class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}

@Component
class Car {
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) { // Setter Injection
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
```
#### Flow:

+ Spring creates Engine

+ Spring creates Car

+ Spring calls setEngine(engine) to inject it

### 2. Constructor Injection (You said “getter” but I think you mean constructor — getter is just for reading values)
Spring passes the dependency through the constructor when creating the object.
```
@Component
class Car {
    private final Engine engine;

    @Autowired
    public Car(Engine engine) { // Constructor Injection
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
```
### Flow:

+ Spring creates Engine

+ Spring calls new Car(engine) and injects it

### Which is better?
+ `Constructor injection` → Recommended for required dependencies (ensures the object is fully ready at creation).

+ `Setter injection` → Good for optional dependencies or when you might change them later.

--- 
## 5. @Autowire
+ In Spring, ` @Autowired ` is an annotation that tells the IoC container:

+ `"Please inject this dependency for me — you find it, create it, and give it to me."`

### Simple Meaning
+ `@Autowired` = `"Spring, please give me an already-made object (bean) from your container."`

### Example — Constructor Injection
```
@Component
class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}

@Component
class Car {
    private final Engine engine;

    @Autowired // Spring will inject Engine here
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
```
+ When the app starts:

+ Spring makes an Engine bean.

+ Spring makes a Car bean.

+ Spring injects the Engine into Car via the constructor.

#### Example — Setter Injection
```
@Component
class Car {
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
```
#### Example — Field Injection (Not recommended for large projects)
```
@Component
class Car {
    @Autowired
    private Engine engine;
}

```
