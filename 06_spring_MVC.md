+ Spring MVC (`Model-View-Controller`) is a web framework that's part of the Spring Framework.
+ It helps you build web applications using the MVC architectural pattern, which separates the application logic into three interconnected parts:

## Components of Spring MVC:
### Model

+ Represents the application data and business logic.

+ Typically contains POJOs (Plain Old Java Objects).

+ Communicates with the database.

### View

+ Responsible for rendering the UI to the user.

+ Technologies used: JSP, Thymeleaf, etc.

### Controller

+ Handles user input, updates the model, and returns the appropriate view.

+ Defined using @Controller annotation.

### ⚙️ Spring MVC Workflow:
+ User sends a request to the server.

+ DispatcherServlet receives the request and acts as the front controller.

+ DispatcherServlet routes the request to the appropriate Controller.

+ Controller processes the request using the Model and returns a View name.

+ ViewResolver maps the view name to the actual view (e.g., a JSP file).

+ The view is rendered and sent back to the user.

### 🧩 Key Annotations:
+ `@Controller` : Marks a class as a controller.

+ `@RequestMapping` : Maps HTTP requests to handler methods.

+ `@GetMapping` ,` @PostMapping` : Shortcut annotations for `@RequestMapping`.

+ `@ModelAttribute`: Binds request parameters to model attributes.

+ `@ResponseBody`: Sends data (like JSON) directly in the response body.

+ `@RestController`: Combines @Controller and @ResponseBody.

### 📁 Typical Project Structure:
```
/src
  /controller
    - HomeController.java
  /model
    - User.java
  /service
    - UserService.java
  /repository
    - UserRepository.java
/webapp
  /WEB-INF
    - web.xml (DispatcherServlet config)
    - views/
```


## 🔍 What is Thymeleaf?
+ Thymeleaf is a server-side Java template engine for processing and creating `HTML` ,` XML`,` JavaScript` ,` CSS`, and `text` .
+  It is often used in `Spring Boot`  and` Spring MVC`  web applications to render the View part of the MVC pattern.

### ✅ Why use Thymeleaf?
+ ✔️ Seamlessly integrates with Spring MVC/Spring Boot

+ ✔️ Allows using HTML templates as-is (even outside the server)

+ ✔️ Has easy syntax for looping, conditionals, and form bindings

+ ✔️ Supports internationalization, fragments, and layout features

🧩 Example: Thymeleaf Template
HTML Template (home.html):

```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Welcome</title>
</head>
<body>
    <h1 th:text="'Hello, ' + ${name} + '!'">Hello, User!</h1>
</body>
</html>
```
Controller:

```
@Controller
public class HomeController {

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("name", "Chirag");
        return "home"; // maps to home.html
    }
}
```
#### ⚙️ Key Thymeleaf Syntax:
|Feature	|Syntax|
|---------|---------|
|Variable Output|`	th:text="${name}`|
|Conditionals	|`th:if="${condition}`|
|Iteration	|`th:each="item : ${items}`|
|URL linking|	`th:href="@{/page}`|
|Form Binding|	`th:field="*{property}`|


+ You're building a simple Spring Boot + Thymeleaf demo that displays the current server time on a web page. Here's a clear breakdown of what you've done in this
### example:

### ✅ 1. Controller: DemoController.java
```sh
@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloworld"; // refers to helloworld.html in templates/
    }
}
```
### 🔍 What it's doing:
+ `@Controller` : Marks this class as a web controller.

+ `@GetMapping("/hello"):`  Maps GET requests from /hello to the sayHello() method.

+ `Model theModel`: Used to pass data from the controller to the view (HTML).

+ `theModel.addAttribute("theDate", ...):` Adds current date-time to the model.

+ `return "helloworld":` Tells Spring to render the Thymeleaf template helloworld.html.

### ✅ 2. View: helloworld.html (Thymeleaf Template)
```
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf">
<head>
    <title>Thymeleaf Demo</title>
</head>
<body>
    <p th:text="'Time on the server is ' + ${theDate}" />
</body>
</html>
```
#### 🔍 What it's doing:
+ `xmlns:th="http://www.thymeleaf":` Enables Thymeleaf-specific attributes like `th:text`.
```sh
<p th:text="'Time on the server is ' + ${theDate}">:
```
+  This replaces the <p> tag’s content with the string:
+ 👉 "Time on the server is [current date/time]"

+ 🧪 What happens when you visit `http://localhost:8080/hello`:
+ Spring Boot runs the controller.

+ theDate is set to the current date/time.

+ Thymeleaf renders helloworld.html, injecting the value of theDate into the page.

✅ Output example:
```sh
Time on the server is 2025-05-05T16:42:15.789
```
