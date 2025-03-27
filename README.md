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
|`@Value`|	Injects values from property files.\
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






