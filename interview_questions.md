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

## 6. Development Process: Constructor Injection
### 1️⃣ Create the Dependency Class
This is the class your main class will depend on.
```
import org.springframework.stereotype.Component;

@Component // Marks this as a bean in Spring's container
public class Engine {
    public void start() {
        System.out.println("Engine started...");
    }
}
```
### 2️⃣ Create the Main Class that Depends on It
Use a constructor to accept the dependency.

```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine; // Dependency

    @Autowired // Tells Spring to inject Engine here
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
```
### 3️⃣ Create the Spring Boot Main Application
```
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConstructorInjectionExample {
    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(ConstructorInjectionExample.class, args);

        // Get Car bean from container
        Car car = context.getBean(Car.class);
        car.drive();
    }
}
```
### 4️⃣ How It Works
+ Spring scans for classes with 1`@Component.`

+ Finds `Engine` → creates and stores it as a bean.

+ Finds `Car` → sees it needs an Engine in the constructor.

+ Injects the Engine bean into the Car bean.

You request the Car from the container → it’s ready to use.

5️⃣ Output
```
Engine started...
Car is driving...
```
### 💡 Pro Tip:
+ If your class has only one constructor, you can skip @Autowired — Spring will still inject automatically:
```
public Car(Engine engine) { this.engine = engine; }
```
### build a Spring Boot example 
### 1️⃣ Coach Interface
```
package com.example.demo;

public interface Coach {
    String getDailyWorkout();
}
```
### 2️⃣ CricketCoach
```
package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
```
### 3️⃣ FootballCoach
```
package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice dribbling for 20 minutes!";
    }
}
```
### 4️⃣ HockeyCoach
```
package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice penalty shots for 30 minutes!";
    }
}
```
### 5️⃣ DemoController
```
package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;

    // Constructor Injection with @Qualifier to choose specific coach
    public DemoController(@Qualifier("footballCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
}
```
+ 🔹 Here, `@Qualifier("footballCoach")` tells Spring:

+ “From all the available Coach beans, inject the one named footballCoach.”

+ Bean names are automatically generated from class names (first letter lowercase).

+ CricketCoach → "cricketCoach"

+ FootballCoach → "footballCoach"

+ HockeyCoach → "hockeyCoach"

### 6️⃣ Main Application
```
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoachApp {
    public static void main(String[] args) {
        SpringApplication.run(CoachApp.class, args);
    }
}
```
### 7️⃣ How to Test
Run the app and visit:
```
http://localhost:8080/dailyworkout
```
You will get:

```
Practice dribbling for 20 minutes!
```
(because we used footballCoach in the `qualifier`)

+ If you change `@Qualifier("footballCoach")` to` @Qualifier("cricketCoach")` or `@Qualifier("hockeyCoach")`, you’ll get the respective output.
---
## 7. Component scanning
Component scanning means `Spring automatically finds ` and `registers ` your `beans` by looking for special annotations in your code.

What it looks like in our Coach example
### Folder structure:
```
com.example.demo
 ├── Coach.java
 ├── CricketCoach.java   (@Component)
 ├── FootballCoach.java  (@Component)
 ├── HockeyCoach.java    (@Component)
 ├── DemoController.java (@RestController)
 └── CoachApp.java       (@SpringBootApplication)

```
---
## 8. @primary annotation 
+ multiple Coach implementations and to choose one as the default using @Primary.

Here’s a simple Spring Boot example:

### 1. Coach Interface
```
package com.example.demo.coach;

public interface Coach {
    String getDailyWorkout();
}
```
### 2. Multiple Implementations
```
package com.example.demo.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
```
```
package com.example.demo.coach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   // This will be injected by default if multiple beans are found
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice dribbling for 30 minutes";
    }
}
```
```
package com.example.demo.coach;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice shooting for 20 minutes";
    }
}
```
### 3. Controller to Use the Coach
```
package com.example.demo.controller;

import com.example.demo.coach.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Coach coach;

    public DemoController(Coach coach) { // Constructor Injection
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
}
```
### 4. Main Application
```
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
```
#### How it works:
+ Spring scans and finds three beans implementing Coach:

+ CricketCoach

+ FootballCoach (marked @Primary) ✅

+ HockeyCoach

+ When DemoController asks for a Coach, Spring injects FootballCoach by default because of @Primary.

---

### Which one: @Primary or @Qualifier?
+  • `@Primary `leaves it up to the implementation classes
+  • Could have the issue of multiple @Primary classes leading to an error 
+ • @Qualifier allows to you be very specific on which bean you want 
+ • In general, I recommend using `@Qualifier`
+  • More specific
 + • Higher priority
---
## 8. @lazy 
+ In Spring, @Lazy means "`create this bean only when it’s first needed`" instead of at application startup.

## By default
 +Spring Boot creates all beans eagerly at startup (when the ApplicationContext loads).

+ This means all `@Component` or` @Bean`  objects are created before your app starts handling requests.

#### With @Lazy
+ Spring delays bean creation until you actually use it (lazy initialization).

+ This can make startup faster if some beans are heavy and not always needed.

---
## Bean Scopes
+ Bean Scopes in Spring
### A bean scope tells Spring:

+ How long should this bean exist in memory?

 + How many copies of this bean should be created?

+ How is it shared across the application?

### Main Bean Scopes
#### 1. Singleton (Default)
+ Only one instance of the bean is created for the entire Spring container.

+ Shared across the whole application.

+ Lifecycle: Created at application startup, destroyed at shutdown.
```
@Component
public class MyCoach { }
```
(No need to specify — default is singleton)

#### 2. Prototype
+ A new instance is created every time it’s requested.

+ Lifecycle: Created when requested, destroyed by the caller, not Spring.
```
@Component
@Scope("prototype")
public class MyCoach { }
```
### 3. Request (Web only)
+ One bean instance per HTTP request.

+ Lifecycle: Created at request start, destroyed at request end.
```
@Component
@Scope("request")
public class MyBean { }
```
#### 4. Session (Web only)
+ One bean instance per HTTP session.

+ Lifecycle: Created at session start, destroyed when session ends.

```
@Component
@Scope("session")
public class MyBean { }
```
#### 5. Application (Web only)
+ One bean instance per ServletContext.

+ Lifecycle: Created when context starts, destroyed when context shuts down.
```
@Component
@Scope("application")
public class MyBean { }
```
---
---
---

## Spring Beans, Scopes, @Primary, @Qualifier, and @Lazy — Q&A
### 1. In Spring, what is a bean?
A bean is an object that is created, managed, and destroyed by the Spring IoC (Inversion of Control) container.
You usually define beans using annotations like `@Component`,` @Service`,` @Repository`, or `@Bean`.
```
@Component
public class MyService {
    public void serve() {
        System.out.println("Service running...");
    }
}
```
#### 2. How does Spring create and manage beans internally?
+ Spring reads bean definitions (from annotations/XML).

+ Creates objects (by calling constructors).

+ Performs dependency injection.

+ Manages the lifecycle (initialization → usage → destruction).

#### 3. What is the default scope of a bean in Spring?
Singleton — only one instance per Spring container.

#### 4. How can you define a bean in Spring without using @Component?
Using `@Bean` inside a` @Configuration` class:
```
@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
```
Bean Scopes
#### 5. Name at least 5 bean scopes in Spring and explain.
+ singleton — One instance for entire Spring container (default).

+ prototype — New instance every time bean is requested.

+ request — One instance per HTTP request (web apps).

+ session — One instance per HTTP session (web apps).

+ application — One instance per ServletContext.

#### 6. Difference between singleton and prototype scope
```
@Component
@Scope("singleton")
class SingletonBean {}

@Component
@Scope("prototype")
class PrototypeBean {}
```
+ Singleton → One instance reused for all injections.

+ Prototype → A new object each time getBean() is called.

#### 7. In prototype scope, who destroys the bean?
Spring does not manage destruction — the client code must handle it.

#### 8. When to use request scope vs session scope?
Request → Temporary data for a single HTTP request (e.g., form submission).

Session → User-specific data across multiple requests (e.g., shopping cart).

#### 9. Can a singleton depend on a prototype bean?
+ Yes, but the prototype bean will be created only once at singleton creation unless you use `ObjectFactory `or` @Lookup`  to get fresh instances.

### @Primary and @Qualifier
#### 10. If two beans implement the same interface, how does Spring decide which one to inject?
Spring will throw `NoUniqueBeanDefinitionException ` unless you specify `@Primary` or `@Qualifier`.

#### 11. Purpose of @Primary
```
@Component
@Primary
class CricketCoach implements Coach {}

@Component
class FootballCoach implements Coach {}
```
Here, CricketCoach will be injected by default.

#### 12. How does @Qualifier differ from @Primary?
+ `@Primary` sets a default bean.

+ `@Qualifier` tells Spring exactly which bean to use in that injection point.

#### 13. Can we use @Primary and @Qualifier together?
+ Yes — but @Qualifier overrides @Primary.

### @Lazy
#### 14. What does @Lazy do?
Delays bean creation until it’s first needed.
```
@Component
@Lazy
class HeavyBean {
    public HeavyBean() {
        System.out.println("HeavyBean created!");
    }
}
```
#### 15. Default bean initialization strategy in Spring
+ Eager — Beans are created at container startup unless @Lazy is used.

#### 16. Make a singleton bean load only when needed
```
@Component
@Lazy
class ReportGenerator {}
```
#### 17. What if you put @Lazy on a prototype bean?
+ It has no real effect — prototype beans are already created only when requested.

Scenario Questions with Code
18. Default bean selection
```
@Component
@Primary
class CricketCoach implements Coach {}

@Component
class FootballCoach implements Coach {}
```
### 19. Need a new object every time for ShoppingCart
```
@Component
@Scope("prototype")
class ShoppingCart {}
```
#### 20. Optimize startup time for heavy bean
```
@Component
@Lazy
class BigDataProcessor {}
```
---

# Hibernate JPA CRUD
## 1. what is Hibernate?
+ Hibernate is a framework in Java that is used for Object Relational Mapping (ORM).

+ 👉 In simple words: it helps you map Java objects (classes) to database tables and vice versa, so you don’t have to write a lot of raw SQL queries for CRUD (Create, Read, Update, Delete) operations.

## 🔑 Key Points about Hibernate:

+ `ORM`  (Object Relational Mapping)

+ Java Class ↔ Database Table

+ Java Object ↔ Table Row

+ Java Field ↔ Table Column

## Database Independent

+ You can switch from MySQL to Oracle, PostgreSQL, etc., without changing much code.

## Reduces Boilerplate Code

+ You don’t need to write complex JDBC code (like ResultSet, PreparedStatement, etc.). Hibernate does it internally.

## HQL (Hibernate Query Language)

+ Instead of writing SQL queries, you can write queries using HQL, which is object-oriented and works on entities, not tables.

## Automatic Table Generation

+ Hibernate can automatically ` create ` or ` update`  database tables from your Java entities using configurations.

## 2. what ORM?
+ `ORM` (Object Relational Mapping) is a technique (not just a tool) that allows you to map objects in your programming language (like Java classes) to relational database tables.

**So in short:
ORM = A way to map Java objects ↔ Database tables so developers work with objects, not raw SQL.**

### 🔑 Simple Example

+ Suppose you have a table in a database:

students
```
id	name	city
1	Chirag	Boisar
```
And you have a Java class:
```
public class Student {
    private int id;
    private String name;
    private String city;
    
    // getters and setters
}
```

### 👉 ORM connects these two worlds:

+ The table students is mapped to the class Student.

+ A row in the table is mapped to a Java object.

+ Columns (`id`,` name `,` city` ) are mapped to fields (`id`,` name` ,` city`).

+ So instead of writing SQL like this:
```
INSERT INTO students (name, city) VALUES ('Chirag', 'Boisar');
```

You just write in Java:
```
Student st = new Student();
st.setName("Chirag");
st.setCity("Boisar");
session.save(st);  // Hibernate ORM saves it to the DB
```
### 🔧 Why ORM is useful?

#### Bridges Object-Oriented and Relational gap

+ Java works with `objects` , but DB works with `tables`  → ORM connects them.

#### Reduces Boilerplate Code

+ No need to manually handle `ResultSet`,` PreparedStatement` , etc.

#### Database Independent

+ Same Java code works with `MySQL`,` Oracle`,` PostgreSQL` , etc.

## Supports Relationships
```
ORM can handle `One-to-One`,` One-to-Many`,` Many-to-Many ` mappings between  `classes` and `tables`  easily.
```
### 🚀 Examples of ORM Frameworks

+ Hibernate (most popular in Java)

+ JPA (Java Persistence API) – a standard, Hibernate is one implementation

+ EclipseLink

+ Spring Data JPA (built on top of Hibernate/JPA)

## 3. what is JPA?
### 🔑 What is JPA?

+ JPA (Java Persistence API) is a specification in Java that defines how to manage relational data (tables in DB) using Java objects (entities).

### 👉 In simple words:

+ JPA is not a framework or tool itself.

+ It’s a set of rules (interfaces and annotations) for ORM in Java.

+ Frameworks like Hibernate, EclipseLink, OpenJPA implement JPA.

📌 Example

+ Suppose you want to map a Java class Student to a database table.
With JPA annotations, you do this:
```
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private String city;

    // getters and setters
}

```
Here:
```
@Entity → tells JPA this class is a database table.

@Table → maps it to the DB table name.

@Id → primary key.

@GeneratedValue → auto-generated ID.
```
👉 You only use annotations and JPA interfaces. The actual work (like SQL generation, DB communication) is done by JPA provider (like Hibernate).

## 4. 🪄 How to Save a Java Object with JPA (Simple Steps)

+ Create an Entity class → a normal Java class with JPA annotations.
```
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;

    // getters and setters
}

```
+ Configure JPA → in `persistence.xml`, tell JPA about DB connection (URL, user, password) and entities.

Use EntityManager to save:
```
import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Student st = new Student();
        st.setName("Chirag");
        st.setCity("Boisar");

        em.getTransaction().begin();  // start transaction
        em.persist(st);               // save object to DB
        em.getTransaction().commit(); // commit transaction

        em.close();
        emf.close();
    }
}
```
### 📝 In Plain Words

+ Step 1: Make a Java class (Student) and mark it as @Entity.

+ Step 2: Tell JPA about your database (in config).

+ Step 3: Create an object of Student.

+ Step 4: Use EntityManager.persist() to save it.

+ 👉 After running, JPA converts your Java object → SQL INSERT → Database row automatically.


## 5. When you create a Spring Boot project with Maven, the initial dependencies for using JPA are:

#### 🔑 Must-Have Dependencies for JPA with Spring Boot

###  `Spring Boot Starter Data JPA`

+ Provides JPA + Hibernate (default implementation).

+ Handles ORM, transactions, repositories.
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

```
### Database Driver
(depends on which DB you use, e.g., MySQL, PostgreSQL, Oracle).

✅ For MySQL:
```
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

```
✅ For PostgreSQL:
```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>

```
###  Spring Boot Starter Web (if you’re building REST APIs or web apps)
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
### ⚙️ Application Properties Example

In src/main/resources/application.properties:
```
# Database connection
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=yourpassword

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```

✅ That’s all you need initially:

+ `spring-boot-starter-data-jpa`

+ `database driver`

 + `(optional) spring-boot-starter-web`

After that, you just create Entity classes, Repositories, and Services, and Spring Boot + JPA takes care of saving objects into the database. 🚀

Do you want me to also give you a minimal working project structure (Entity + Repository + Controller) so

###  JPA / Hibernate
+ 1️⃣ `spring.jpa.hibernate.ddl-auto=update`

+ This tells Hibernate what to do with the database schema (tables) when your app starts.

### Options:

+ `create` → drop existing tables and create new ones every time (data lost).

+ `create-drop` → same as create, but drops tables when app stops.

+ `update` → update schema if needed (keeps old data, just modifies tables). ✅ (most used in dev)

+ `validate` → just validate if schema matches your entities, throws error if not.

none → do nothing.

+ 👉 update is usually used in development so you don’t have to manually create tables every time.

### 2️⃣ `spring.jpa.show-sql=true`

+ Tells Hibernate to print the actual SQL queries it executes into the console.

Example:
```
insert into student (city, name, id) values ('Boisar', 'Chirag', 1)
```

+ 👉 Very useful for debugging and learning. (Not compulsory, but highly recommended in dev.)

+ 3️⃣ `spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect`

+ Hibernate needs to know the SQL dialect (flavor of SQL) your database speaks.

+ Different DBs (MySQL, PostgreSQL, Oracle) have slightly different SQL syntax.

### Examples:

+ `org.hibernate.dialect.MySQLDialect` → MySQL

+ `org.hibernate.dialect.PostgreSQLDialect` → PostgreSQL

+ `org.hibernate.dialect.OracleDialect` → Oracle

+ 👉 If you don’t specify, Hibernate usually detects it from the JDBC URL, but setting it manually avoids mistakes.

### ✅ In short:

+ `ddl-auto` = how Hibernate manages tables

+` show-sql `= log SQL queries

+ `database-platform` = which DB SQL dialect to use
  
## 6. Java Annotations for Mapping Classes & Fields to Database Tables

+ When you use ` Spring Boot + JPA + Hibernate` , you can map Java classes to database tables and fields to table columns using annotations.

### Step 1: Map Class to Database Table

Use the `@Entity` and `@Table` annotations.
```
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity // Marks this class as a JPA entity (table in DB)
@Table(name = "students") // Maps class to table "students"
public class Student {

    // fields will go here

}
```
### Explanation:

### @Entity

+ Makes the class a persistent entity.

+ Required to tell JPA/Hibernate to create/manage a table for this class.

## @Table(name = "students")

+ By default, the table name = class name (Student → student).

+ If you want a custom name, specify @Table(name = "students").

### Step 2: Map Fields to Database Columns

Use annotations like `@Id`, `@GeneratedValue`, and `@Column`.
```
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id  // Marks this column as the PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id") // Maps field to "id" column
    private int id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    // Constructors, getters, setters...
}
```
Important Annotations for Fields
|Annotation	| Purpose	 |Example |
|----------|-----------|----------|
| `@Id` |	Marks field as Primary Key	 |@Id private int id;|
| `@GeneratedValue`	| Auto-generates primary key values | 	`@GeneratedValue(strategy = GenerationType.IDENTITY)` |
| `@Column` | 	Maps Java field to DB column and sets properties like nullable, length, unique |	@Column(name="first_name",nullable=false)|
|`@Transient ` |	Field is not persisted in DB |	@Transient private int tempValue;| 
| `@Temporal` |	Used for Date fields to specify date type |	@Temporal(TemporalType.DATE) |
|`@Lob`	| For large objects like images or long text | 	@Lob private byte[] photo; | 

## 7. What is ID Generation Strategy?

+ When you annotate a field with `@Id`  in JPA, you also need to define how the primary key is generated.
+ This is done using the `@GeneratedValue` annotation:
```
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

```
Here, GenerationType.IDENTITY is the ID generation strategy.

## AUTO Strategy (Default)
How it works

+ Hibernate automatically chooses the strategy based on the database dialect:

+ MySQL → uses IDENTITY

+ Oracle → uses SEQUENCE

+ Others → falls back to TABLE

Example
```
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;
}
```
