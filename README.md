## Interview questions 

## 1. What is Spring Boot?
+ Spring Boot is a framework built on top of Spring Framework that simplifies the development of Java-based web applications and microservices. It eliminates a lot of boilerplate code, provides built-in configurations, and allows developers to focus on writing business logic rather than managing infrastructure.

+ Spring Boot in Simple Terms
+ Spring Boot is a framework that makes it easy to create Java applications. It helps developers by:

+ ✅ `Removing complex configurations` (No XML needed)
+ ✅ `Providing built-in servers` (No need for Tomcat setup)
+ ✅ `Auto-configuring components `(Less manual setup)
+ ✅ `Simplifying dependencies `(Using "Starters")
+ ✅ `Making development faster` (Ideal for microservices)

+ With Spring Boot, you can quickly build web applications and REST APIs without worrying about setup

## 2. What is Spring Boot, and how is it different from the traditional Spring Framework?

+ Spring Boot is a framework built on top of the Spring Framework that simplifies the development of Java applications by providing auto-configuration, embedded servers, and opinionated defaults.

#### Differences from Traditional Spring Framework:
+ `Configuration`: Spring Boot eliminates the need for extensive XML or Java-based configuration, whereas traditional Spring requires manual setup.

+ `Embedded Server`: Spring Boot includes embedded servers like Tomcat and Jetty, while Spring requires an external server.

+ `Auto-Configuration`: Spring Boot automatically configures components based on dependencies, whereas Spring needs explicit configurations.

+ `Microservices Ready`: Spring Boot is optimized for building microservices, whereas Spring is more general-purpose.

+ `Faster Development`: With Spring Boot Starters, developers can quickly set up projects, while Spring requires adding and configuring dependencies manually.

## Spring vs. Spring Boot: When to Use Each in Java
Both Spring and Spring Boot are used for Java application development, but they serve different purposes and simplify development in different ways.

### 1️⃣ Spring Framework
+ Spring is a comprehensive framework that provides core features for `building enterprise applications`. It offers:

+ ✅ `Dependency Injection` (DI) – Manages object creation and dependencies.
+ ✅ `Aspect-Oriented Programming (AOP)` – Helps separate concerns like logging and security.
+ ✅ `Spring MVC` – For building web applications.
+ ✅ `Spring Security` – Handles authentication and authorization.
+ ✅ `Spring Data JPA` – Simplifies database access.
+ ✅ `Spring Cloud` – Helps in building microservices.

### 📌 When to Use Spring?
+ When you need full control over application configurations.

+ For large enterprise applications with complex requirements.

+ If you want a modular approach and don't need built-in defaults.

### 2️⃣ Spring Boot
+ Spring Boot is built on top of Spring and simplifies development by:

+ ✅ Auto-configuring Spring components.
+ ✅ Providing embedded servers (Tomcat, Jetty) so no external deployment is needed.
+ ✅ Offering Spring Boot Starters to simplify dependencies.
+ ✅ Supporting microservices development with Spring Cloud.

### 📌 When to Use Spring Boot?
+ When you want fast development with minimal setup.

+ For microservices and cloud-based applications.

+ When you don’t want to configure an external web server.

+ If you need a production-ready application with built-in monitoring (Actuator).

### 🚀 Simple Comparison Table
|Feature|	Spring|	Spring Boot|
|--------|--------|----------|
|Configuration	|Manual setup (XML, Java-based)|	Auto-configuration|
|Server Setup	|External server (Tomcat, JBoss) required| 	Embedded server (Tomcat, Jetty)|
|Microservices|	Needs additional setup|	Built-in support for microservices|
|Speed of Development|	Slower due to configurations	|Faster with pre-configured defaults|
|Learning Curve|	Steeper (more manual setup)	|Easier for beginners|
### 💡 Key Takeaway:
+ If you need `flexibility` and `full control`, use Spring.

+ If you want to develop `faster` with `less setup`, use Spring Boot.  

## 3. What are the key features of Spring Boot?



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

## 4. Does Spring Boot Replace Spring MVC, Spring Security, etc.? 🤔
+ `No`, Spring Boot `does NOT `replace `Spring MVC`, `Spring Security`, or other Spring modules. Instead, it makes them easier to use by providing `auto-configuration` and `reducing boilerplate code`.

### 🔹 Spring Boot vs. Spring MVC, Spring Security, etc.
|Spring Technology|	What It Does|	Spring Boot's Role|
|-------------|----------------|--------------------|
|Spring MVC	|Builds web applications (Controllers, Views, REST APIs)	|Spring Boot auto-configures MVC settings and embeds a server|
| Spring Security| Handles authentication, authorization, and security|	Spring Boot simplifies security setup with `spring-boot-starter-security`|
| Spring Data| JPA	Manages database access with Hibernate and JPA	|Spring Boot configures JPA and provides default settings|
| `Spring Cloud|	Supports microservices, service discovery, and cloud features|	Spring Boot helps in easier microservices development|
### 🔹 How Spring Boot Works with Spring Modules
+ Spring Boot builds on top of Spring's core modules and enhances them with `auto-configuration`.

+ For example, in a Spring MVC app (without Spring Boot), you must manually:
+ ✅ Set up a DispatcherServlet
+ ✅ Configure View Resolvers
+ ✅ Define beans in xml or Java configuration

With Spring Boot, it’s all `pre-configured`. Just add `spring-boot-starter-web`, and MVC works out of the box! 🚀

### 🔹 Key Takeaway
+ Spring Boot does not replace Spring MVC, Spring Security, or Spring Data JPA.

+ Instead, it makes them easier to configure and use by providing auto-configuration and embedded servers.

## 5 Does Spring Boot Run Code Faster Than Regular Spring? 

+ `No`, Spring Boot does not make code execution faster than regular Spring, but it makes development faster by reducing configuration and boilerplate code.

### 🔹 Performance Comparison: Spring Boot vs. Spring
|Feature	|Spring (Without Boot)|	Spring Boot|
|---------|--------------------|-------------|
|Startup Time|	Faster (less auto-configuration)	|Slightly slower (auto-configuration overhead)|
|Runtime Performance	|Same as Spring Boot|	Same as Spring|
|Development Speed	|Slower (manual setup)|	Faster (auto-configured)|
|Memory Usage	|Lower (only necessary components)|	Slightly higher (extra dependencies)|

## 6 what is use of mavan in java springboot ?
+ Maven is a build `automation tool` used primarily for `Java projects`, including Spring Boot applications. It helps manage` project dependencies`,` build lifecycle`, and `packaging`.

#### Key Uses of Maven in Spring Boot:
### Dependency Management

+ Maven simplifies adding and managing dependencies using the `pom.xml` file.

+ Spring Boot provides a starter dependency system, e.g.:
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
+ It automatically downloads the required JAR files from Maven Central Repository.

### Project Structure and Build Management

+ It standardizes project structure with directories like `src/main/java `and `src/test/java.`

+ Uses predefined build lifecycle phases (`compile`, `test`,` package`, `install`, `deploy`).

### Simplifies Compilation and Packaging

+ Easily compiles Java code using `mvn` compile.

+ Packages the project into a `.jar` or `.war` file using `mvn `package.

### Spring Boot Plugin for Easy Execution

+ The Spring Boot Maven plugin allows running applications directly:
```
mvn spring-boot:run
```
### Integration with CI/CD & DevOps

+ Works well with `Jenkins`, `GitHub Actions`, and `Docker` for automation.

+ Used in deployment pipelines for building and testing applications.

### Conclusion
+ Maven simplifies `dependency management`,` builds`, `testing`, and` deployment in Spring Boot projects`, making development `faster` and more `efficient`.

## 7 What is a Spring Boot Starter?
+ A Spring Boot Starter is a `pre-configured dependency` that bundles commonly used libraries for a specific feature, making it easy to set up a Spring Boot project.

+ Instead of manually adding multiple dependencies, Starters provide a single dependency that includes everything needed for a particular functionality.

### Example of a Spring Boot Starter
+ To create a `REST API` in Spring Boot, you need the Spring Web Starter:
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
##### This automatically includes dependencies like:
 + ✅ Spring MVC
+ ✅ Tomcat (embedded server)
+ ✅ Jackson (for JSON conversion)

#### Popular Spring Boot Starters
|Starter Name	|Purpose|
|-------------|--------|
|`spring-boot-starter-web`|	For building REST APIs (Spring MVC + Tomcat)|
|1spring-boot-starter-data-jpa`	|For database access using JPA/Hibernate.|
|`spring-boot-starter-security`|	For authentication and security features.|
|`spring-boot-starter-thymeleaf `|	For using Thymeleaf templating engine.|
| `spring-boot-starter-test`|	For unit and integration testing.|
| `spring-boot-starter-actuator`|	For monitoring and application metrics.|
### Why Use Spring Boot Starters?
+ ✔ Simplifies dependency management
+ ✔ Reduces boilerplate code
+ ✔ Ensures compatibility between libraries
+ ✔ Speeds up development

##  What is Spring Initializr?
+ Spring Initializer is a tool that helps us to create skeleton of spring boot project or project structure by providing a `maven `or` gradle `file to build the application. It set up the framework from scratch.

## 6. Explain the internal working of Spring Boot?
+ Here are the main steps involved in how Spring Boot works:

1. Start by creating a new Spring Boot project.
2. Add the necessary dependencies to your project.
3.Annotate the application with the appropriate annotations.
4.Run the application.

##  Define the Key Components of Spring Boot?
+ The key components of Spring Boot are listed below:

1.Spring Boot starters
2. Auto-configuration
3. Spring Boot Actuator
4. Spring Boot CLI
5. Embedded Servers

## Spring Annotations in Java
+ Spring provides a wide range of annotations for `dependency injection`, `component scanning`,` REST APIs`,` database access`, and `security`.
+ Here’s a categorized list of the most important Spring annotations`:

#### 1️⃣ Core Spring Annotations (Configuration & Beans)
|Annotation|	Description|
|--------|---------------|
| `@SpringBootApplication`	|Marks the main Spring Boot application class (combines` @Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`).|
|@Configuration|	Marks a class as a Spring configuration class (used for defining beans).|
|@Bean|	Defines a Spring-managed bean inside a @Configuration class.|
|@ComponentScan|	Enables scanning for components (@Component, @Service, @Repository).|
+ ✅ Example:
```
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
```
#### 2️⃣ Dependency Injection Annotations
|Annotation	|Description|
|----------|------------|
|`@Autowired`|	Automatically injects dependencies.|
|`@Qualifier`	|Used when multiple beans of the same type exist.|
|`@Primary`	|Marks a bean as the default if multiple candidates exist.|
|`@Value`|	Injects values from property files.|
✅ Example:

```
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}
```
#### 3️⃣ Spring MVC (Web) Annotations
|Annotation	|Description|
|-----------|------------|
|@Controller|	Marks a class as a Spring MVC controller.|
|@RestController|	Combines @Controller and @ResponseBody (used for REST APIs).|
|@RequestMapping|	Maps web requests to controller methods.|
|@GetMapping, @PostMapping, @PutMapping, @DeleteMapping	|Handles specific HTTP request types.|
|@PathVariable|	Extracts values from the URL.|
|@RequestParam|	Extracts query parameters.|
|@RequestBody|	Maps the request body to a Java object.|
✅ Example:
```
@RestController
@RequestMapping("/api")
public class UserController {
    
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id) {
        return "User ID: " + id;
    }
}
```
#### 4️⃣ Spring Boot JPA (Database) Annotations
|Annotation	|Description|
|-----------|-----------|
|@Entity|	Marks a class as a JPA entity (database table).|
|@Table(name = "users")|	Specifies the table name for the entity.|
|@Id	|Marks a field as the primary key.|
|@GeneratedValue(strategy = GenerationType.IDENTITY)|	Auto-generates primary key values.|
|@Column|	Defines column properties in the database.|
|@Repository	|Marks a class as a DAO (Data Access Object).|
+ ✅ Example:

```
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
}
```
#### 5️⃣ Spring Security Annotations
|Annotation|	Description|
|----------|-------------|
|@EnableWebSecurity|	Enables Spring Security|
|@PreAuthorize("hasRole('ADMIN')")|Restricts access based on roles.|
|@Secured("ROLE_USER")|	Allows access only for users with a specific role.|
✅ Example:
```
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin")
public String adminPage() {
    return "Admin Page";
}
```
#### 6️⃣ Transaction Management Annotations
|Annotation	 | Description |
|------------|-------------|
|@Transactional|	Marks a method or class as transactional.|
|@EnableTransactionManagement|	Enables transaction management in Spring.|

+ ✅ Example:
```
@Service
public class AccountService {
    
    @Transactional
    public void transferMoney(Long fromAccount, Long toAccount, double amount) {
        // Money transfer logic
    }
}
```
#### 7️⃣ Spring Boot Miscellaneous Annotations
|Annotation | 	Description |
|-----------|----------------|
|@CrossOrigin(origins = "http://localhost:3000")|	Allows CORS for REST APIs.|
|@Scheduled(fixedRate = 5000)|	Runs a method every 5 seconds.|
|@Lazy	|Delays bean initialization until needed.|
|@Scope("prototype") |	Defines the scope of a Spring bean.|

+ ✅ Example:
```
@Scheduled(fixedRate = 5000)
public void runTask() {
    System.out.println("Task running every 5 seconds");
}
```
### Conclusion
+ Spring annotations make it easy to build configurable, scalable, and maintainable applications. 🚀


## Spring Boot Actuator 🚀
Spring Boot Actuator provides built-in endpoints to monitor and manage your application in production.

## 🌟 Why Use Spring Boot Actuator?
+ ✔` Health Monitoring 🩺` - Check if the app is running.
+ ✔ `Metrics 📊 `- View CPU, memory, and request stats.
+ ✔ `Logging & Tracing 📜` - Monitor logs and exceptions.
+ ✔ `Application Info ℹ `- View build version and environment details.
+ ✔ `Custom Endpoints ✨` - Create your own monitoring endpoints.

### 🛠 How to Enable Spring Boot Actuator?
#### Step 1: Add Actuator Dependency
+ Add this to `pom.xml`:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```
#### Step 2: Configure Actuator Endpoints
+ By default, only the `/actuator/health` and `/actuator/info` endpoints are enabled.
+ To enable all endpoints, add this to application.properties:
```
management.endpoints.web.exposure.include=*
```
+ 🔹 This makes all Actuator endpoints accessible via `http://localhost:8080/actuator`

### 🚀 Common Actuator Endpoints
| Endpoint| 	Description|
|----------|---------------|
|/actuator/health	|Shows the health status of the application.|
|/actuator/info|	Displays application info (version, name, etc.).|
|/actuator/metrics|	Shows various metrics (CPU, memory, GC, threads).|
|/actuator/env	|Displays environment properties.|
|/actuator/beans	|Lists all Spring beans in the app.|
|/actuator/mappings	|Shows all URL mappings.|
|/actuator/loggers	|Manages logging levels dynamically.|
+ ✅ Example: `Checking App Health`
```
GET http://localhost:8080/actuator/health
```
Response:
```
{
    "status": "UP"
}
```
#### 🔐 Securing Actuator Endpoints
+ Since Actuator exposes system information, it's important to secure it.

+ Enable Authentication for Actuator
+ Add this to application.properties:
```
management.endpoints.web.exposure.include=health,info
management.endpoint.health.show-details=always
```
+ 🔹 This limits Actuator access to only` /health` and `/info.`

### ✨ Custom Actuator Endpoints
+ You can create your own Actuator endpoints by defining a bean:

+ ✅ Example: `Custom /actuator/custom `Endpoint
```
@Component
@Endpoint(id = "custom")
public class CustomEndpoint {

    @ReadOperation
    public String customEndpoint() {
        return "Hello, Prachi! This is a custom actuator endpoint!";
    }
}
```
+ Now, you can access it at:
```
GET http://localhost:8080/actuator/custom
```
### 🎯 Conclusion
+ Spring Boot Actuator is a powerful tool for `monitoring`, `managing`, and `debugging ` Spring Boot applications. 🚀



### Spring Boot Security Endpoints 🔐
Spring Boot Security provides various `built-in` endpoints to help monitor and manage `authentication`, `authorization`, and `user sessions`.

## 🌟 Common Security Endpoints in Spring Boot
|Endpoint	|Description|
|---------|-------------|
|/login|	Default login page (when Spring Security is enabled).|
|/logout |Logs out the user and invalidates the session.|
|/actuator/loggers|	Displays and manages security-related logs.|
|/actuator/health|	Shows the health status of the app, including security checks.|
|/actuator/env|	Displays security-related environment properties.|
### 🛠 How to Enable Security Endpoints?
+ By default, Spring Boot Secures All Endpoints 🔒
+ To enable Actuator Security Endpoints, update application.properties:
```
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always
```
+ 🔹 This allows access to all Actuator endpoints, including security-related ones.

## 🔐 Securing Actuator Endpoints
+ Since Actuator exposes sensitive data, you should restrict access using Spring Security.

#### Step 1: Add Security Dependency
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```
#### Step 2: Configure Authentication for Security Endpoints
+ Add security settings in application.properties:
```
# Secure all Actuator endpoints (default behavior)
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always
spring.security.user.name=admin
spring.security.user.password=admin123
```
+ 🔹 This requires authentication for all endpoints.

### 🚀 Custom Security Configuration
+ To customize which endpoints are protected, create a Security Config class:

✅ Example: Secure Actuator Endpoints with Basic Auth
```
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/actuator/**").hasRole("ADMIN") // Restrict actuator to admins
                .anyRequest().authenticated()
            )
            .httpBasic(); // Enable basic authentication
        return http.build();
    }
}
```
+ 🔹 Now, only users with ADMIN role can access `/actuator/* `endpoints.

#### 🛡 Protecting Specific Endpoints
+ You can restrict access to login/logout pages and other security endpoints:

+ ✅ Example: Restricting 1Login/Logout` Endpoints
```
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/admin/**").hasRole("ADMIN") // Protect admin endpoints
            .requestMatchers("/user/**").hasRole("USER") // Restrict user endpoints
            .anyRequest().permitAll()
        )
        .formLogin() // Enable login page
        .and()
        .logout(logout -> logout.logoutUrl("/logout").logoutSuccessUrl("/"));
    return http.build();
}
```
+ 🔹 Admin endpoints require ADMIN role, User endpoints require USER role, and other requests are public.

#### ✨ Conclusion
+ Spring Boot Security provides built-in security endpoints and customizable authentication for monitoring and protecting your application.


## Running a Spring Boot App from the Command Line 🚀
You can run a Spring Boot application from the command line using Maven, Gradle, or a built JAR file.

### 1️⃣ Run Using Maven (Direct Execution)
+ If you're using Maven, navigate to your project folder and run:
```
mvn spring-boot:run
```
 + 🔹 This command compiles and runs your Spring Boot application.

+ ✅ If you want to specify a profile:
```
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```
+ 2️⃣ Run Using Gradle
If you're using Gradle, run:
```
./gradlew bootRun  # For Linux/macOS
gradlew bootRun     # For Windows
```
🔹 This starts the application without needing to build a JAR file.

✅ Run with a profile:

```
./gradlew bootRun --args='--spring.profiles.active=dev'
```
### 3️⃣ Run from a JAR File
+ If you built your project into a JAR file, follow these steps:

#### Step 1: Build the JAR File
Run the following command to create a JAR:
```
mvn clean package  # For Maven
./gradlew bootJar  # For Gradle
```
+ This generates a JAR file inside the target/ or build/libs/ directory.

#### Step 2: Run the JAR File
+ Once built, run the JAR file using:
```
java -jar target/myapp.jar  # Replace with your JAR file name
```
+ ✅ Run with a specific profile:

sh
Copy
Edit
java -jar target/myapp.jar --spring.profiles.active=dev
✅ Run on a different port:
```
java -jar target/myapp.jar --server.port=8081
```
#### 4️⃣ Running with Docker 🐳 (Optional)
+ If you have Docker installed, you can create a Docker image and run your app inside a container.

##### Step 1: Create a Dockerfile
```
FROM openjdk:17
COPY target/myapp.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
```
#### Step 2: Build and Run the Container
```
docker build -t myapp .
docker run -p 8080:8080 myapp
```
🔹 Your app will now be running in a Docker container.

### 🎯 Conclusion
+ You can run your Spring Boot app using:
+ ✅ ` mvn spring-boot:run` (Maven)
+ ✅ `./gradlew bootRun` (Gradle)
+ ✅ `java -jar myapp.jar `(JAR File)
+ ✅ `docker run myapp` (Docker)

## Spring Boot IOC (Inversion of Control)

### What is IOC (Inversion of Control)?
+ Inversion of Control (IOC) is a design principle used in Spring Framework to manage `object creation` and `dependency injection`. Instead of an application manually creating and managing objects, Spring Container takes care of it.

### How does IOC Work in Spring Boot?
+ Spring Boot uses `Spring Container` to implement IOC.
+  The container `creates`,` configures`, and` manages the lifecycle of beans (objects)`,` injecting dependencies` wherever required.

### Key Concepts of IOC in Spring Boot:
+ `Spring Container`: The core of IOC, responsible for managing bean lifecycles.

+ `Beans`: Objects managed by Spring Container.

+ `Dependency Injection (DI)`: The process of injecting dependencies automatically.

### Configuration Methods:

+ `XML` Configuration (not commonly used in Spring Boot)

+ `Annotation-Based` Configuration (`@Component`,` @Service`, `@Repository`,` @Controller`)

+ `Java-Based `Configuration (`@Bean`,` @Configuration`)

### IOC in Action
### IoC Using Annotations
#### Simple Example of Spring IoC Using Annotations
 +Let's take a very simple example to demonstrate Spring IoC (Inversion of Control) using annotations.

#### Step 1: Create an Interface
```
public interface Animal {
    void sound();
}
```
+ This is a simple interface with a method `sound()`.

### Step 2: Create Implementations
Dog Class
```
import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring Bean
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
```
Cat Class
```
import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring Bean
public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}
```
+ `@Component` tells Spring that these classes should be managed as `Spring Beans`.

### Step 3: Create a Zoo Class That Uses an Animal
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring-managed Component
public class Zoo {

    private final Animal animal;

    @Autowired // Injects a bean of type Animal
    public Zoo(Animal animal) {
        this.animal = animal;
    }

    public void makeSound() {
        animal.sound();
    }
}
```
+ `@Autowired`: Spring automatically injects an implementation of Animal (either `Dog `or `Cat`).

+ If multiple implementations exist, we need to `specify` which one to use with` @Qualifier` (not used here).


### Step 4: Create the Main Application
```
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // Enables component scanning and auto-configuration
public class IoCExampleApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IoCExampleApplication.class, args);

        // Get the Zoo bean from the Spring Context
        Zoo zoo = context.getBean(Zoo.class);
        
        // Call the method
        zoo.makeSound();
    }
}
```
+ `@SpringBootApplication`: This is a shortcut for enabling Spring Boot `auto-configuration` and `component scanning`.

+ `ApplicationContext`: Manages all the `beans` and `dependencies`.

### How Spring IoC Works Here?
+ Spring detects `@Component` classes (`Dog`, `Cat`, `Zoo`) and registers them as `beans`.

+ Spring automatically injects a bean of `Animal `into the` Zoo `class using `@Autowired`.

+ The `main()` method retrieves the` Zoo `bean and calls` makeSound()`, which calls `sound()` on the injected Animal bean.

+ If multiple beans of Animal exist (`Dog` & `Cat`), Spring might throw an `error` unless we specify which one to use.

Output (if Spring picks Dog)
```
Dog barks: Woof Woof!
```
+ OR
+ If Spring picks Cat:
```
Cat meows: Meow Meow!
```
### How to Specify Which Bean to Use?
+ If you have multiple beans of the same type, use `@Qualifier`:
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

    private final Animal animal;

    @Autowired
    public Zoo(@Qualifier("dog") Animal animal) { // Specify which bean to use
        this.animal = animal;
    }

    public void makeSound() {
        animal.sound();
    }
}
```
+ Now, Spring will always inject the Dog implementation.

### Conclusion
+ This is a very simple Spring IoC example that: 
+ ✅ Uses `@Component` for automatic bean detection.
+ ✅ Uses `@Autowired` for dependency injection.
+ ✅ Demonstrates how Spring manages objects instead of using new.

## 2. Java-Based Configuration (Using @Bean)
Instead of `@Component`, we can explicitly define beans using `@Bean`.
```
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engine engine() {
        return new Engine();
    }

    @Bean
    public Car car(Engine engine) {
        return new Car(engine);
    }
}
```
### Benefits of IOC in Spring Boot
+ ✔ `Loose Coupling` – Objects depend on abstractions, not concrete implementations.
+ ✔ `Easier Testing` – Dependencies can be injected via mocks.
+ ✔ `Better Maintainability` – Dependencies are managed automatically.
+ ✔ `Improved Modularity` – Components can be replaced easily.

### Understanding Spring IoC (Inversion of Control) with an Example
+ Spring IoC (Inversion of Control) is a design principle where the control of `object creation `and `dependency management `is transferred from the application code to the Spring Container.
+  This helps in reducing tight coupling between components and enhances `flexibility`.

#### Let's create a Spring IoC example with all required annotations and then explain it step by step.

### Example: Dependency Injection Using Spring IoC
+ We'll create a basic Spring Boot application that demonstrates IoC using annotations like `@Component`, `@Autowired`, `@Service`, and` @Configuration`.

### Step 1: Create a Spring Boot Project
+ If you are using Spring Boot, you can create a simple project with Spring Boot dependencies.

### 1. Create a Service Interface
```
public interface MessageService {
    void sendMessage(String message);
}
```
Here, we define an interface` MessageService` with a method `sendMessage`.

### 2. Implement the Service Interface
```
import org.springframework.stereotype.Service;

@Service // Marks this class as a Spring-managed service
public class EmailService implements MessageService {
    
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
```
+ `@Service`: Indicates that `EmailService` is a service component and should be managed by the` Spring container`.

### 3. Create Another Implementation
```
import org.springframework.stereotype.Service;

@Service // This class is also managed by Spring
public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}
```
Now, we have two implementations (`EmailService` and `SMSService`) of `MessageService`.

### 4. Create a Component That Uses the Service
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Marking this class as a Spring-managed component
public class NotificationSender {

    private final MessageService messageService;

    @Autowired // Automatically injects a MessageService implementation
    public NotificationSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}
```
+ `@Autowired` tells Spring to inject a dependency of type `MessageService` into` NotificationSender`.

+ Spring will automatically choose one of the implementations (EmailService or SMSService).

### 5. Configure Which Implementation to Use
```
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean // Explicitly defining a bean
    public MessageService messageService() {
        return new EmailService(); // You can change this to SMSService if needed
    }
}
```
+ `@Configuration`: Indicates that this class contains Spring bean definitions.

+ `@Bean`: Explicitly defines a` Spring-managed bean.`

+ Now, Spring will use EmailService as the MessageService implementation.

### 6. Run the Application
```
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCExampleApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IoCExampleApplication.class, args);

        // Get the NotificationSender bean from the context
        NotificationSender sender = context.getBean(NotificationSender.class);
        
        // Send a message
        sender.send("Hello, Spring IoC!");
    }
}
```
### 🔹 How IoC Works in This Example
+ Spring creates and `manages `objects instead of us manually instantiating them using new keyword.

+ The `@Service ` annotation allows Spring to automatically detect the `EmailService` and` SMSService` classes.

+ The `@Autowired` annotation injects the appropriate implementation of `MessageService` into `NotificationSender`.

 +The `@Configuration` class (AppConfig) explicitly defines which implementation to use.

## 🔹 How to Make the Code Unusable?
If we remove or misuse IoC annotations, the code won’t work properly:
+ Removing @Autowired in NotificationSender

+ Spring will not know how to inject MessageService, leading to a NullPointerException.

+ Not marking EmailService and SMSService with @Service

+ Spring won’t detect these classes, and dependency injection will fail.

+ Not defining a bean explicitly (@Bean) or removing @Configuration

+ If there are multiple implementations, Spring will not know which one to use, causing an error.

## Constructor Injection vs Setter Injection in Spring Boot (Simple Explanation)
+ Spring Boot uses dependency injection to manage objects.
+ There are two main ways to inject dependencies into a class:

#### Constructor Injection

#### Setter Injection

##### 1. What is Dependency Injection in Spring?
+ Spring Boot follows `Inversion of Control (IoC)`, meaning the framework controls the creation and management of objects instead of us manually creating them using `new` keyword.

Instead of:
```
CarService carService = new CarService(new Engine());
```
+ Spring automatically injects dependencies when needed.

##### 2. Constructor Injection (Preferred)
#### How it Works?

+ Spring scans for components (`@Component`, `@Service`, etc.).

+ Finds the constructor and checks required dependencies.

+ Creates the dependencies first (e.g., `Engine` object).

+ Passes the dependency into the constructor.

+ Stores the object in the Spring `container.`

Example: Constructor Injection
```
import org.springframework.stereotype.Service;

@Service // Tells Spring to create and manage this object
public class CarService {
    private final Engine engine;  // Dependency

    // Constructor Injection
    public CarService(Engine engine) {  
        this.engine = engine;
    }

    public void startCar() {
        engine.run();
    }
}
```
```
import org.springframework.stereotype.Component;

@Component // Marks Engine as a Spring-managed component
public class Engine {
    public void run() {
        System.out.println("Engine is running...");
    }
}
```
#### What Happens Behind the Scenes?
+ Spring Boot Application Starts

+ It scans all classes for` @Component`,` @Service`, etc.

+ Finds `CarService `and `Engine`.

+ Spring Identifies Dependencies

+ `CarService` has a constructor with `Engine` as a parameter.

+ It sees that Engine is already available as a `@Component`.

+ Spring Creates Objects in Order

+ First, it creates` Engine` and stores it in its ApplicationContext (Spring Container).

+ Then, it calls new `CarService(engine)`, passing the created Engine instance.

+ `Object` is Ready to Use

+ Now, `CarService` can use `engine.run();` in `startCar().`

#### Pros of Constructor Injection
+ ✅ Makes dependencies mandatory (cannot be null).
+ ✅ Supports immutability (uses final fields).
+ ✅ Easy to write unit tests (dependencies can be mocked).

### 3. Setter Injection
#### How it Works?

+ Spring scans and creates the object first without dependencies.

+ It calls the setter method to inject dependencies later.

+ This allows optional dependencies.

Example: Setter Injection
```
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CarService {
    private Engine engine;  // No final keyword, can change

    // Setter Injection
    @Autowired  // Tells Spring to call this method for injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.run();
    }
}
```
```
import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void run() {
        System.out.println("Engine is running...");
    }
}
```
#### What Happens Behind the Scenes?
+ Spring Boot Application Starts

 +It scans and finds `CarService `and `Engine.`

+ Spring Creates `CarService` First

+ It does not inject Engine yet.

+ Calls new CarService() with no parameters.

+ Spring Calls Setter Method

+ setEngine(Engine engine) is called automatically.

+ The Engine object is injected.

### Pros of Setter Injection
+ ✅ Good for optional dependencies.
+ ✅ Allows changing dependencies at runtime.

### Cons
+ ❌ Dependencies can be null if setter is not called.
+ ❌ Less secure (someone can overwrite dependencies).

### 4. Behind-the-Scenes: ApplicationContext & Bean Lifecycle
+ Spring Boot manages all `objects` in an IoC container called `ApplicationContext`.
+ When the app starts, Spring follows these steps:

#### Step 1: Component Scanning
+ Spring scans for` @Component`, `@Service`, and `@Repository` classes.

#### Step 2: Bean Creation Order
+  `Constructor Injection`: Creates dependencies first.

+ `Setter Injection`: Creates the object first, then injects later.

#### Step 3: Storing Beans in the Container
+ Spring stores these objects in the ApplicationContext.

#### Step 4: Dependency Injection
+ Constructor Injection: Happens when the object is created.

+ Setter Injection: Happens after the object is created.

#### 5. Debugging: How to Check Spring Beans?
+ To see how Spring injects dependencies, you can print all beans in the container:
```
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanLister implements CommandLineRunner {
    private final ApplicationContext context;

    public BeanLister(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) {
        System.out.println("All Beans in Spring Context:");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
```
+ This will list all created objects and show that CarService and Engine exist.

#### 6. When to Use Which?
|Feature	|Constructor Injection	|Setter Injection|
|-----------|-----------------------|----------------|
|Dependency Required?|	Yes (Mandatory)|	No (Optional)|
|Immutability|	Yes (final fields)|	No (Can Change)|
|Best for	|Required dependencies	|Optional dependencies|
|Spring Execution|	At object creation|	After object is created|
|Testing	|Easier (Mocking in unit tests)|	Harder|

### ✅ Recommended Approach
+ Use Constructor Injection for required dependencies (Best Practice ✅).

+ Use Setter Injection only for optional dependencies.

##  @Qualifier 
#### Understanding @Qualifier in Spring
+ The @Qualifier annotation in Spring is used to resolve `ambiguity` when multiple beans of the same type exist.
+  It tells Spring which specific bean to inject.

### 🔍 Why Do We Need @Qualifier?
#### Scenario Without @Qualifier
+ If we have multiple implementations of an interface, Spring doesn't know which one to inject.
```
@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice serving for 30 minutes.";
    }
}
```
+ Now, if we inject Coach in a controller or service without `@Qualifier`, Spring will throw an error:
```
@RestController
public class DemoController {

    private final Coach coach;

    // ❌ ERROR: Spring doesn't know whether to inject CricketCoach or TennisCoach
    public DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
}
```
+ `Spring Error`: "No qualifying bean of type Coach available"
+ Why? Because both CricketCoach and TennisCoach implement Coach.

#### ✅ Fixing Ambiguity Using @Qualifier
 +We explicitly tell Spring which bean to inject.

#### 1️⃣ Naming Beans with @Component
+ By default, Spring assigns bean names in `lowercase` of the class name:

+ `CricketCoach` → `cricketCoach`

+ `TennisCoach` → `tennisCoach`
If we want to give a custom name, we can specify it in `@Component`:
```
@Component("cricketCoach")  // Custom bean name
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
```
```

@Component("tennisCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice serving for 30 minutes.";
    }
}
```
### 2️⃣ Using @Qualifier in the Controller
```
@RestController
@RequestMapping("/api")
public class DemoController {

    private final Coach coach;

    public DemoController(@Qualifier("cricketCoach") Coach coach) {  // ✅ Specify bean name
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
}
```
+ Now, Spring will inject `CricketCoach `into` DemoController`.
+ If we want to inject `TennisCoach`, we change `@Qualifier("tennisCoach")`.

### ⚡ Rules for Using @Qualifier
+ The name in @Qualifier must match the bean name exactly.

+ If` @Component("cricketCoach") `→ use `@Qualifier("cricketCoach")`

+ If` @Component("CricketCoach")` → use `@Qualifier("CricketCoach")`

+ If @Component has no name → Spring defaults to "cricketCoach" (`lowercase first letter`)

+ Case sensitivity matters when specifying bean names in @Qualifier.

+ If only one bean exists, `@Qualifier` is `not needed`.

### 📌 Example: Constructor Injection vs. Setter Injection
#### 1️⃣ Constructor Injection with @Qualifier
```
@RestController
@RequestMapping("/api")
public class DemoController {

    private final Coach coach;

    public DemoController(@Qualifier("tennisCoach") Coach coach) {  // ✅ Inject TennisCoach
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
}
```
#### 2️⃣ Setter Injection with @Qualifier
```
@RestController
@RequestMapping("/api")
public class DemoController {

    private Coach coach;

    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach coach) {  // ✅ Inject CricketCoach
        this.coach = coach;
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return coach.getDailyWorkout();
    }
}
```
+ Both methods work the same! Constructor injection is preferred for required dependencies.

### 🔍 What Happens Internally?
Spring scans for components `(@Component)` in the specified `package`.

+ It creates beans:

+ CricketCoach → cricketCoach

+ TennisCoach → tennisCoach

+ When injecting Coach, Spring sees multiple choices.

+ `@Qualifier("cricketCoach")` tells Spring to inject CricketCoach bean.

### ✅ Key Takeaways
+ Use `@Qualifier` when multiple beans exist for the same type.

+ Bean names are `lowercase by default` (TennisCoach → "tennisCoach").

+ Use @Qualifier("beanName") exactly as defined in @Component("beanName").

+ Works with both constructor and setter injection.


## @Primary annatation 

+ The `@Primary` annotation in Spring is used to indicate which bean should be given `preference` when multiple beans of the same type are available in the Spring container.
+ It helps in resolving ambiguity when dependency injection occurs.

+ `Example:` Using @Primary Annotation in Spring Boot
+ `Scenario:` Multiple Implementations of an Interface
+ Let's say we have an interface `PaymentService` with two implementations: `CreditCardPaymentService `and `UPIPaymentService`. We use `@Primary ` to give preference to `CreditCardPaymentService`.

### Step 1: Define an Interface
```
public interface PaymentService {
    void processPayment(double amount);
}
```
### Step 2: Create Two Implementations
```
import org.springframework.stereotype.Service;

@Service
@Primary  // This bean will be preferred when injected
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}
```
```
import org.springframework.stereotype.Service;

@Service
public class UPIPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}
```
### Step 3: Inject the Bean into a Controller
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String makePayment(@RequestParam double amount) {
        paymentService.processPayment(amount);
        return "Payment processed successfully!";
    }
}
```
#### Explanation:
+ There are two beans of PaymentService type: `CreditCardPaymentService` and ` UPIPaymentService`.

+ The `@Primary` annotation on `CreditCardPaymentService` makes it the `default choice` when PaymentService is injected.

+ When we call `makePayment()`, it will use `CreditCardPaymentService` by default.

+ Output (If accessed via `http://localhost:8080/pay?amount=1000`):

+ Processing credit card payment of ₹1000.0
#### What If We Want to Use UPI Instead?
+ If we want to override the @Primary behavior, we can use `@Qualifier("UPIPaymentService")` in the constructor:
```
@Autowired
public PaymentController(@Qualifier("UPIPaymentService") PaymentService paymentService) {
    this.paymentService = paymentService;
}
```
+ Now, `UPIPaymentService` will be used instead.





## @Lazy Annotation in Spring Boot – Detailed Explanation
+ The `@Lazy` annotation in Spring Boot is used to delay the initialization of a Spring bean until it is actually needed.
+  By default, Spring initializes all beans at `startup`, which can `slow down the application`, especially when there are many beans or `resource-heavy objects`.
+ `@Lazy` helps optimize performance by loading beans only when they are required.

### 1️⃣ How Spring Loads Beans by Default?
+ By default, Spring follows `Eager Initialization`, meaning:

+ All singleton beans are created and initialized at the time of application startup.

+ This ensures that dependencies are resolved in advance but increases startup time.

+ If a bean is never used, it is still created, wasting memory.

### 🔹 Example (Without @Lazy)
```
import org.springframework.stereotype.Service;

@Service
public class HeavyService {
    
    public HeavyService() {
        System.out.println("HeavyService Initialized!");
    }

    public void performTask() {
        System.out.println("Performing a heavy task...");
    }
}
```
Output at Application Startup
```
HeavyService Initialized!
Application started successfully!
```
+ Even if the `HeavyService` is never used, it gets initialized at startup.

### 2️⃣ How @Lazy Works?
+ When we use @Lazy, Spring defers the creation of the bean until it is `actually needed`.

### 🔹 Example (With @Lazy)
```
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy  // Bean will be initialized only when needed
public class HeavyService {
    
    public HeavyService() {
        System.out.println("HeavyService Initialized!");
    }

    public void performTask() {
        System.out.println("Performing a heavy task...");
    }
}
```
```
Behavior at Startup
Application started successfully
```
### ✅ The HeavyService bean is NOT initialized at startup.

+ When we call a method that requires HeavyService
+ If we have a controller like this:
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeavyController {

    private final HeavyService heavyService;

    @Autowired
    public HeavyController(HeavyService heavyService) {
        this.heavyService = heavyService;
    }

    @GetMapping("/task")
    public String executeTask() {
        heavyService.performTask();
        return "Task executed!";
    }
}
```
+ Now, if we access `http://localhost:8080/task`, the console output will be:
```
HeavyService Initialized!
Performing a heavy task...
```
+ 📌 The bean is created only when `/task` is called, `saving memory` and` improving startup time`.

### 3️⃣ Where Can We Use @Lazy?
#### ✅ Use @Lazy when:
+ ✔ The bean is rarely used or only needed in specific scenarios.
+ ✔ The bean has high resource consumption, like database connections, large objects, or third-party integrations.
+ ✔ You want to optimize application startup time.

### 🚫 Do NOT use @Lazy when:
+ ❌ The bean is frequently used in the application.
+ ❌ The bean is a critical dependency that must be available at startup (e.g., Security configurations, database connections).

### 4️⃣ @Lazy at Class and Bean Level
#### 🔹 Applying @Lazy at the Class Level
If you annotate a class with @Lazy, the whole bean will be lazily initialized:
```
@Service
@Lazy
public class ReportService {
    public ReportService() {
        System.out.println("ReportService Initialized!");
    }
}
```
#### 🔹 Applying @Lazy at the Bean Level
You can also use @Lazy inside a configuration class:
```
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    @Bean
    @Lazy
    public ReportService reportService() {
        return new ReportService();
    }
}
```
+ 📌 This ensures that ReportService is not created at startup but only when required.

### 5️⃣ @Lazy with @Autowired Dependencies
+ By default, if a dependency is required in a constructor, Spring will create it at startup.
+ To make it lazy, we can explicitly mark it with @Lazy.
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService;

    @Autowired
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder() {
        System.out.println("Processing order...");
        paymentService.processPayment();
    }
}
```
+ PaymentService is only initialized when` processOrder()` is called.

### 6️⃣ @Lazy with @ComponentScan
+ We can apply @Lazy globally to all beans in a package:
```
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example", lazyInit = true)
public class AppConfig {
}
```
+ 📌 Now, all beans in com.example will be lazily loaded.

### 7️⃣ Key Takeaways
+ 🔹 By default, Spring beans are eagerly initialized at startup.
+ 🔹 @Lazy delays bean creation until first use, improving performance.
+ 🔹 It can be applied to classes, methods, or dependencies.
+ 🔹 Use @Lazy when a bean is rarely used or resource-heavy.
+ 🔹 Avoid @Lazy for critical or frequently used beans.

## @Beans 
### Spring Boot Beans Overview
 + In Spring Boot, a bean is an object that is managed by the Spring `Inversion of Control (IoC)` container. 
 + Beans are created, wired, and managed by Spring.
 + You define beans using annotations like `@Component`, `@Service`, `@Repository`, or by explicitly defining them in a configuration class using `@Bean`.

#### Bean Scopes in Spring Boot
+ Spring provides different scopes for beans, but the most common are:

+ `Singleton` (Default Scope) – Only one instance of the bean is created for the entire Spring container.

+ `Prototype` – A new instance is created every time it is requested.

+ `Request` – A new instance is created for each HTTP request (used in web applications).

+ `Session` – A new instance is created for each HTTP session.

### What is Singleton in Spring Boot?
+ Singleton is the default scope for beans in Spring Boot.

+ This means that only one instance of the bean is created and shared across the entire application context.

+ Even if multiple objects request the bean, they all receive the same instance.

Example of Singleton Bean
```
import org.springframework.stereotype.Component;

@Component  // This bean is Singleton by default
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean instance created!");
    }
}
```
### Using the Bean in Another Class
```
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private SingletonBean singletonBean;
}
```
No matter how many times MyService requests `SingletonBean`, the same instance will be provided.

### How to Change the Scope to Prototype?
+ If you want a new instance every time the bean is requested, you can change its scope:
```
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")  // Creates a new instance every time
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("PrototypeBean instance created!");
    }
}
```

## beans lifecycle 

+ The lifecycle of a Spring Bean consists of several stages, from creation to destruction. Spring provides hooks to customize the behavior at different stages.

### 1️⃣ Bean Lifecycle Stages in Spring Boot
+ Instantiation – Spring creates an instance of the bean.

+ Populate Properties – Spring injects dependencies into the bean.

+ Post-Initialization (Bean Initialization Phase)

+ Any custom initialization logic can be executed here.

+ Bean is Ready to Use – The bean is available for use in the application.

+ Pre-Destroy (Cleanup Phase) – When the application shuts down, Spring allows custom cleanup.

+ Destruction – The bean is removed from the container.

### 2️⃣ Lifecycle Methods in Spring
Spring provides different ways to hook into the bean lifecycle:

### A. Using @PostConstruct and @PreDestroy (Recommended)
```
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("1️⃣ Constructor: Bean instance created!");
    }

    @PostConstruct
    public void init() {
        System.out.println("2️⃣ @PostConstruct: Bean is initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("3️⃣ @PreDestroy: Bean is about to be destroyed.");
    }
}
```
🔹 Output when the application starts:
```
1️⃣ Constructor: Bean instance created!
2️⃣ @PostConstruct: Bean is initialized.
```
🔹 Output when the application stops:
```
3️⃣ @PreDestroy: Bean is about to be destroyed.
```
## Hibernate and JPA 
## what is Hibernate ?
+ Hibernate is a Java-based `Object-Relational Mapping` (ORM) framework that helps developers interact with `relational databases` in an easier and more object-oriented way.

### 🔹 In Simple Words:
+ Hibernate allows you to map Java classes (objects) to database tables. 
+ It handles all the behind-the-scenes SQL operations for you, so you don’t need to write complex SQL queries manually.

### 🔸 Why Use Hibernate?
+ ✅ Reduces boilerplate code — No need to write repetitive SQL for CRUD operations.

+ ✅ Database-independent — You can switch databases (e.g., from MySQL to PostgreSQL) with minimal code change.

+ ✅ Automatic table mapping — Maps Java classes to tables using annotations or XML.

+ ✅ Caching support — Improves performance by reducing database hits.

+ ✅ Lazy loading — Loads data only when needed.

### 🔹 Key Features:
+ `@Entity`, `@Table,` `@Id`,` @Column` – used for mapping.

+ `SessionFactory` – main entry point for Hibernate operations.

+ `HQL` (Hibernate Query Language) – similar to SQL but works with Java objects instead of tables.

🔸 Example:
Here’s a simple class mapped with Hibernate:
```
@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_name")
    private String name;

    // Getters and setters
}
```
+ If you're learning Hibernate, I can also help you with setup, configuration (hibernate.cfg.xml), or performing basic operations like save(), update(), delete().

### 🔹 What is JPA?
+ JPA (Java Persistence API) is a standard specification (part of Java EE / Jakarta EE) for object-relational mapping (ORM) in Java.
+ It defines how Java objects should be mapped to relational database tables.

+ 🔸 JPA is just a `specification`, not an `implementation`.

### 🔹 Then who implements JPA?
#### Frameworks like:

+ ✅ Hibernate (most popular)

+ ✅ EclipseLink

+ ✅ OpenJPA

+ ...implement the JPA specification.

+ So when you're using Hibernate with JPA annotations, you're using Hibernate as a JPA provider.

🔸 Why JPA?
+ Works with annotations like @Entity, @Table, @Id, etc.

+ Makes your code portable across different JPA providers (like Hibernate, EclipseLink).

+ Helps you focus on business logic, not SQL.

+ Standardized API = cleaner code.

+ 🔹 Example JPA Entity:
```
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_name")
    private String name;

    // getters and setters
}
```
### 🔸 JPA vs Hibernate (Quick Comparison):
|Feature	|JPA	|Hibernate|
|-----------|-------|---------|
|Type	|Specification	|Implementation of JPA|
|API Provided?	|Yes (standard)	|Yes (proprietary & JPA-based)|
|Flexibility	|Portable across providers	|Tightly coupled to Hibernate|
|Custom Features|	No|	Yes (e.g., Hibernate caching, custom dialects)|

+ So in short:

##### ✅ JPA is the "what" (specification), Hibernate is the "how" (implementation).


### 🔹 Basic JPA Annotations
### 1. @Entity
+ Marks a Java class as an entity (a table in the database).
```
@Entity
public class Student { ... }
```
### 2. @Table(name = "student_table")
+ Specifies the table name to map this entity to.
```
@Table(name = "student_table")
```
## 3. @Id
Specifies the `primary key `of the entity.
```
@Id
private int id;
```
### 4. @GeneratedValue
+ Tells `JPA` how to generate the primary key (`auto increment`,` sequence` , etc).
```
@GeneratedValue(strategy = GenerationType.IDENTITY)
```
+ Other strategies: `AUTO`, `SEQUENCE`,` TABLE`

### 5. @Column
Used to map a Java field to a specific column in the database table.
```
@Column(name = "student_name")
private String name;
```
### 6. @Transient
Marks a field that should not be stored in the database.
```
@Transient
private String tempData;
```
+ 🔹 Relationships (for joins)
### 7. @OneToOne
Defines a `one-to-one` relationship between entities.
```
@OneToOne
private Address address;
```
### 8. @OneToMany and @ManyToOne
Used for `one-to-many `and` many-to-one` relationships (like a department and its students).
```
@OneToMany(mappedBy = "department")
private List<Student> students;
```
```
@ManyToOne
private Department department;
```
### 9. @ManyToMany
For many-to-many relationships, like students and courses.
```
@ManyToMany
private List<Course> courses;
```
### 10. @JoinColumn
Defines the `foreign key` column for a relationship.
```
@JoinColumn(name = "department_id")
private Department department;
```
✅ Example using all:
```
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Transient
    private String tempData;
}
```

### ID generation strategies in JPA using the @GeneratedValue 
🔹 Syntax
```
@GeneratedValue(strategy = GenerationType.STRATEGY_NAME)
```
#### 🔸 1. GenerationType.AUTO
+ Default strategy.

+ JPA chooses the most appropriate strategy based on the database.

+ Portable across databases.
```
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
```
+ ✅ Best for: Beginners or general use when you don't want to worry about database-specific strategies.

### 🔸 2. GenerationType.IDENTITY
+ Uses auto-increment columns (like in MySQL, PostgreSQL).

+ The database handles the primary key generation.

```
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```
+ ✅ Best for: MySQL or when your DB table has AUTO_INCREMENT.

+ ❗ Note: No pre-allocation — can slow performance for batch inserts.

### 🔸 3. GenerationType.SEQUENCE
Uses a database sequence to generate unique IDs.
```
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
@SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
private Long id;
```
+ ✅ Best for: Databases like Oracle, PostgreSQL (which support sequences).

### 🔸 4. GenerationType.TABLE
Uses a separate table to simulate sequence-like behavior.
```
@Id
@GeneratedValue(strategy = GenerationType.TABLE, generator = "student_gen")
@TableGenerator(name = "student_gen", table = "id_generator", pkColumnName = "gen_name", valueColumnName = "gen_value", allocationSize = 1)
private Long id;
```
+ ✅ Best for: Portability if your DB doesn't support sequences. ❌ Downside: Slower than others due to extra table lookups.

### ⚡ Quick Comparison
|Strategy	|DB Required	|Auto-increment	|Fast?	|Notes|
|----------|--------------|---------------|-------|--------|
|AUTO	|No||	Depends	|Yes	|Default and portable|
|IDENTITY	|Yes|	Yes	|Medium	|DB |controls ID, no batching|
|SEQUENCE|	Yes|	No|	High|	Great for performance|
|TABLE	|No	|No|	Low	Portable but slowest|
