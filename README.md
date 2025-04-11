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


### 💡 What is a @RestController in Spring Boot?
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






