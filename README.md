## Json Basics
### what is Json?
+ JSON stands for` JavaScript Object Notation.`
+ It's a lightweight data format used to store and exchange data.
+ JSON is easy to `read` and` write` for humans, and easy to parse and generate for machines.

#### 🔧 Basic Syntax of JSON
+ Data is in name/value pairs

+ Data is separated by commas

+ Curly braces `{} `hold `objects`

+ Square brackets `[]` hold` arrays`

### 🧱 Example of JSON:
```
{
  "name": "Prachi",
  "age": 22,
  "skills": ["Java", "SQL", "React"],
  "isStudent": false
}
```
### 📦 Common Uses of JSON:
+ Sending data between `client` and `server` (like in `APIs`)

+ Configuration files (e.g., `package.json` in Node.js)

+ Data storage in NoSQL databases (e.g., MongoDB)

### ✅ JSON Value
+ In `JSON`, a value can be one of the following types:

|Type	|Example|
|-----|--------|
|String	"Prachi"
|Number	|22, 3.14, -5|
|Boolean|	true or false|
|Object	|{ "name": "Prachi" }|
|Array	|[ "Java", "SQL", "React" ]|
|null	|null|
### 🔎 Example:
```
{
  "name": "Prachi",          // String value
  "age": 22,                 // Number value
  "isStudent": false,        // Boolean value
  "skills": ["Java", "SQL"], // Array value
  "details": {               // Object value
    "city": "Boisar",
    "country": "India"
  },
  "graduated": null          // Null value
}
```


###  What is a MIME Type?
+ `MIME` stands for` Multipurpose Internet Mail Extensions`.
+ It’s used in HTTP headers to describe the type of `content being sent`.

+ You usually see it in headers like this:
```
Content-Type: application/json
```
### 🧱 Basic Structure:
```
type/subtype
```
### For example:

+ text/html → HTML document

+ application/json → JSON data

+ image/png → PNG image

### 🔥 Common MIME Types
#### 📝 Text Formats
|MIME Type|	Description|
|--------|------------|
|text/plain|	Plain text|
|text/html	|HTML file|
|text/css|	CSS file|
|text/javascript|	JavaScript code|

### 🌐 Application Formats
|MIME Type|	Description|
|---------|-------------|
|application/json	|JSON data (APIs)|
|application/xml|	XML data|
|application/pdf	|PDF document|
|application/zip|	ZIP archive|
|application/octet-stream	|Binary data (downloads)|

### 🖼️ Image Formats
|MIME Type|	Description|
|---------|-------------|
|image/jpeg|	JPEG image|
|image/png	|PNG image|
|image/gif|	GIF image|
|image/svg+xml	|SVG image|

### 🎥 Media Formats
|MIME Type|	Description|
|--------|-------------|
|audio/mpeg|	MP3 audio|
|video/mp4	|MP4 video|
|video/webm|	WebM video|
📩 In Spring Boot:
+ When creating a `REST controller`, you can specify MIME types using ` @RequestMapping`  or` @GetMapping` like this:

```
@GetMapping(value = "/user", produces = "application/json")
public User getUser() {
    return new User("Chirag", 25);
}
```

### MIME Content types 

#### 📘 What are MIME Content Types?
+ MIME `(Multipurpose Internet Mail Extensions) ` Content Types tell the `browser` or` server`:

##  What is Postman?
+ Postman is a `free API testing tool` that lets you:

+ Send HTTP requests (`GET`,` POST`,` PUT`, `DELETE`)

+ View responses (`status code`,` body`,` headers`)

+ Add authentication, headers, and params easily

+ Save and organize requests into collections

### 🧪 How to Use Postman
#### 🔹 1. Install Postman
Download it from: https://www.postman.com/downloads

#### 🔹 2. Send a Basic GET Request
+ Open Postman

+ Set method to` GET` 

+ Enter URL like` http://localhost:8080/api/users`

+ Click Send

+ ✅ You'll see the response body, headers, and status code

#### 🔹 3. Send a POST Request with JSON
+ Choose POST method

+ Enter URL: http://localhost:8080/api/users

+ Go to Body → raw → JSON

+ Enter JSON like:
```
{
  "name": "Chirag Sankhe",
  "email": "chirag@example.com"
}
```
+ Click Send

+ If your Spring Boot controller accepts JSON, you’ll get a response like `"User created"`.

#### 🔹 4. Set Headers (optional)
+ Go to Headers tab and add:

|Key|	Value|
|----|------|
|Content-Type|	application/json|
|Authorization|	Bearer <your_token>|
#### 🔹 5. Testing with Path Variables & Query Params
+ URL with path variable:
```
http://localhost:8080/api/users/101
```
(use` @PathVariable` in controller)

+ URL with query param:
```
http://localhost:8080/api/users?city=Boisar
```
(use `@RequestParam` in controller)

### ✅ Postman Example with Spring Boot:
```
@PostMapping("/api/users")
public ResponseEntity<String> createUser(@RequestBody User user) {
    return ResponseEntity.status(HttpStatus.CREATED)
                         .body("User created: " + user.getName());
}
```
+ Test that in Postman with JSON body 👆


## 💡 What is a @RestController in Spring Boot?
+ `@RestController ` is a special Spring Boot annotation used to create RESTful web services (APIs).

### ✅ It tells Spring:
+ “This class will handle HTTP requests (like `GET`,` POST` ,` PUT` , ` DELETE`), and whatever this class returns should be sent directly to the client as the HTTP response body.”

### 🔧 Internally, it’s the same as:
```
@Controller
@ResponseBody
```
+ So, it doesn’t return `HTML` pages like traditional web apps. It returns:

+ String

+ JSON

+ XML

+ or any other raw data

### 📦 Example:
```sh
@RestController
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Chirag!"; // returned directly as HTTP response body
    }
}
```
+ If you open `http://localhost:8080/hello` , you'll see:
```
Hello Chirag!
```
### 📌 Why use @RestController?
|Feature	|Benefit|
|--------|-------|
|Simpler API development	|No need for @ResponseBody|
|Lightweight|	Ideal for frontend/backend projects|
|Works with JSON easily	|Integrates well with @RequestBody and Jackson|


## 🔧 What is @RequestMapping?
+ `@RequestMapping ` is used to map web requests to specific Java methods or classes.

### It tells Spring:

+ `“When a request comes to this URL,` call this method.”

### 🔧 Where can it be used?
+ `On a class ` – to define a base URL path

+ `On a method ` – to handle a specific request



✅ You can use it at two levels:
1. Class Level:
```sh
@RestController
@RequestMapping("/api")
public class MyController {
    // all URLs here will start with /api
}
```
2. Method Level:
```sh
@GetMapping("/hello")
public String sayHello() {
    return "Hello Chirag!";
}
```sh
+ You can also use `@RequestMapping(method = RequestMethod.GET)`  but`  @GetMapping`  is a shortcut for that.

📘 Example with @RequestMapping:
```sh
@RestController
@RequestMapping("/users") // base URL
public class UserController {

    @RequestMapping("/info") // GET by default
    public String getUserInfo() {
        return "User info";
    }
}
```
✅ URL:
+ `http://localhost:8080/users/info`  → returns "User info"

### ✨ Flexible: You can customize a lot!
```sh
@RequestMapping(
    value = "/save",
    method = RequestMethod.POST,
    consumes = "application/json",
    produces = "application/json"
)
```

### 🛠️ Parameters @RequestMapping can accept:
|Parameter|	Purpose|
|---------|--------|
|`value or path`	|URL path(s)|
|`method`| 	HTTP method (GET, POST, etc.)|
|`produces` |	Content type returned (e.g., JSON)|
|`consumes`	|Content type expected from the request|
|`headers`|	Match specific headers|
|`params`	|Match specific query parameters|

### ⚡ Shortcut Annotations (Recommended)
Spring Boot provides easier alternatives:

|Old (@RequestMapping)	|New (Shortcut)|
|---------------------|----------------|
|@RequestMapping(method = GET)	|@GetMapping|
|@RequestMapping(method = POST)	|@PostMapping|
|@RequestMapping(method = PUT)	|@PutMapping|
|@RequestMapping(method = DELETE)	|@DeleteMapping|

So now you can use `@RequestMapping ` for flexibility or use `@GetMapping1` ,` @PostMapping` , etc., for simplicity 🚀


### 🆚 @GetMapping vs @RequestMapping
|@RequestMapping|	@GetMapping, @PostMapping, etc.|
|---------------|--------------------------------|
|More flexible, supports all methods|Shortcut for specific methods
|Slightly more verbose	|Cleaner and simpler|
|Used in older Spring versions too|	Recommended in modern Spring Boot|


### 🔄 How to Convert JSON into a Java POJO
#### 📌 Step 1: Understand the JSON Structure
Let’s say you have this JSON:
```sh
{
  "id": 101,
  "name": "Chirag Sankhe",
  "email": "chirag@example.com"
}
```
This JSON represents a user with 3 properties: `id` ,` name` ,and ` email` .

#### 📌 Step 2: Create a Java POJO Class
We create a class in Java with the same fields as the JSON keys.
```sh
public class User {
    private int id;
    private String name;
    private String email;

    // No-arg constructor
    public User() {}

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
```
#### 📌 Step 3: Use a Library like Jackson to Map JSON to the POJO
Add Jackson dependency (if using Maven):
```sh
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.15.2</version>
</dependency>
```
Then in your Java code:
```sh
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        String json = "{\"id\":101,\"name\":\"Chirag Sankhe\",\"email\":\"chirag@example.com\"}";

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(json, User.class);

        System.out.println("Name: " + user.getName());
    }
}
```
#### ✅ Summary for Interview or Explanation:
+ To convert JSON into a Java POJO:

+ Analyze the JSON keys and types.

+ Create a Java class (POJO) with matching fields, constructors, and getters/setters.

+ Use a library like Jackson to deserialize the JSON into the Java object.



## REST path variable 


### 📁 File: Student.java (POJO)
#### ✅ Purpose:
+ This is a Plain Old Java Object (POJO) used to represent a student with a first name and last name.

👇 Code Breakdown:
```sh
public class Student {
    private String firstname;
    private String lastname;

    public Student() {}  // No-arg constructor (needed for JSON deserialization)

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters and Setters for first name and last name
}
```
#### 📌 Why it's needed:
+ Spring Boot uses this class to send and receive `JSON` data in `REST APIs` .

### 📁 File: StudentRestController.java (Controller)
#### ✅ Purpose:
+ This is a REST controller that handles HTTP requests related to Student.

#### 🔧 Annotations Used:
+ `@RestController`: Tells Spring this class handles REST API calls

+ `@RequestMapping("/api")`: All endpoints will start with /api

+ `@GetMapping`: Maps HTTP GET requests

+ `@PathVariable`: Gets values from the URL (like student ID)

#### 🔹 Field: private List<Student> theStudents;
+ A list to hold all student data in-memory (like a temporary database).

#### 🔹 Method: @PostConstruct public void loadData()
```sh
@PostConstruct
public void loadData() {
    theStudents = new ArrayList<>();

    theStudents.add(new Student("chirag","sankhe"));
    theStudents.add(new Student("prachi","sankhe"));
    theStudents.add(new Student("pranjal","sankhe"));
    theStudents.add(new Student("yadnesh","sankhe"));
}
```
#### ✅ Purpose:
+ This method runs once when the app starts.

+ It populates the list with 4 dummy students.

+ `@PostConstruct`  ensures it's loaded after the controller is created.

#### 🔹 Endpoint: /api/students
```sh
@GetMapping("/students")
public List<Student> getStudents() {
    return theStudents;
}
```
#### ✅ Purpose:
+ Returns all students as a list in JSON format.

+ You can test it using: `GET` `http://localhost:8080/api/students`

🔹 Endpoint: /api/students/{studentId}
```sh
@GetMapping("/students/{studentId}")
public Student getStudent(@PathVariable int studentId) {
    return theStudents.get(studentId);
}
```
✅ Purpose:
Returns one student by ID (index in the list).

Example: `GET /api/students/2` → returns "pranjal sankhe"


#### ✅ Summary
+ You created a REST API with:

+ A `student` class to represent data

+ A `controller` to serve student data

+ A list of students loaded at startup

+ Two endpoints: `get all students ` and `get a student by ID`
