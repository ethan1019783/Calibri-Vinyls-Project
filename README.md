# Calibri Vinyls

A beginner Spring Boot website using Java, Thymeleaf templates, JavaScript, and Tailwind CSS.

## Project structure

```text
Calibri-Vinyls/
├── package.json
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/example/calibrivinyls/
        │       └── CalibriVinylsApplication.java
        └── resources/
            ├── templates/
            │   └── index.html
            └── static/
                ├── input.css
                ├── output.css
                └── script.js
```

## How to open in IntelliJ

1. Open IntelliJ IDEA.
2. Choose **Open**.
3. Select the `Calibri-Vinyls` folder.
4. Let IntelliJ import the Maven project.

## Run the Spring Boot app

In IntelliJ, run `CalibriVinylsApplication.java`, or use:

```bash
mvn spring-boot:run
```

Then open:

```text
http://localhost:8080
```

## Run Tailwind

First install dependencies:

```bash
npm install
```

Then run Tailwind watch mode:

```bash
npm run tailwind
```

Keep the Spring Boot app and Tailwind watch command running while developing.
# Calibri-Vinyls-Project
