# Calibri Vinyls — Tech Stack & Project Structure

## Backend
- **Java 21**
- **Spring Boot 3.3.5**
  - `spring-boot-starter-web` — REST/MVC support
  - `spring-boot-starter-thymeleaf` — server-side HTML templating
  - `spring-boot-devtools` — hot reload in development
- **Maven** — build & dependency management (`pom.xml`)

## Frontend
- **HTML** — static pages served directly (no JS framework)
- **Tailwind CSS (latest)** — utility-first styling
  - Built via `@tailwindcss/cli`: `input.css` → `output.css`
- **@tailwindplus/elements ^1.0.22** — pre-built Tailwind UI components
- **Vanilla JavaScript** (`script.js`)
- **npm** — frontend tooling (`package.json`)

## Project Structure

```
Calibri-Vinyls/
├── pom.xml                          # Maven config (Java/Spring)
├── package.json                     # npm config (Tailwind build)
├── src/
│   └── main/
│       ├── java/com/example/calibrivinyls/
│       │   └── CalibriVinylsApplication.java   # Entry point + controller
│       └── resources/
│           └── static/              # Frontend assets (served as-is)
│               ├── index.html
│               ├── login.html
│               ├── template.html
│               ├── profilepage/
│               ├── input.css        # Tailwind source
│               ├── output.css       # Tailwind compiled output
│               └── script.js
└── target/                          # Maven build output
```

## Architecture Notes
- Spring Boot serves static HTML files directly from `src/main/resources/static/` — no Thymeleaf templates in use yet (routing is commented out in the main class).
- CSS is compiled separately via npm/Tailwind CLI and output to the same static folder.
- No database or auth layer yet.
