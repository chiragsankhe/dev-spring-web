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


      - home.jsp
