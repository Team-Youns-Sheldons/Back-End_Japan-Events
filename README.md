# Japan Events Project

This project is an events page in Japan, featuring various events across the country. Users can choose which events to participate in based on their date, event capacity, and location.

The page includes a login system where users can identify themselves as either regular users or administrators. Administrators have exclusive sections for adding, deleting, and editing events, while regular users can only sign up or withdraw from an event. Upon signing up for an event, users receive a confirmation email to stay informed about the event date.

For this project, we used Vue 3 as the foundation for our frontend, along with JavaScript and Sass. The backend is built with Spring Boot and Java, utilizing SQL databases and Docker containers.

The project was developed entirely from scratch by our development team, and the design is also our own creation.


## Screenshots

Login 

LandingPage

Events 


## Tecnologies Used

### Front-End

Vue 3: Framework for building user interfaces.

JavaScript: Programming language for client-side scripting.

Sass: Stylesheet language to enhance the design and structure of the project.

### Back-End

### Frontend

- **Vue 3:** 🖼️ Framework for building user interfaces.
- **JavaScript:** 🌐 Programming language for client-side scripting.
- **Sass:** 🎨 Stylesheet language to enhance the design and structure of the project.

### Backend

- **Spring Boot:** ☕ Framework for building Java-based enterprise applications.
- **Java:** ☕ Widely used programming language for enterprise-level applications.
- **SQL Databases:** 🗃️ Utilized for storing and managing data related to events and users.
- **Docker Containers:** 🐳 Platform for packaging, distributing, and running applications in containers.

## Roadmap

- Additional browser support

- Add more integrations


## Run Locally Front-End

Clone the project

```bash
  git clone https://github.com/Team-Youns-Sheldons/Front-End_Japan-Events.git
```

Go to the project directory

```bash
  cd Front-End_Japan-Events
```

Install dependencies

```bash
  npm install
```

Start the server

```bash
  npm run dev
```

## Install Back-End 

Clone the project

```bash
  git clone https://github.com/Team-Youns-Sheldons/Back-End_Japan-Events.git
```
Start the server
```bash
  mvn spring-boot:run
```
Start Container Docker
```bash
  docker pull mysql:8.0-debian
```
```bash
  docker run --name japan-events_db -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:8.0-debian
```
And create Schema SQL japan-events_db



## Deployment

To deploy this project run

```bash
  npm run build
```


## Running Tests

To run tests, run the following command

```bash
  npm run test:unit
```


## Authors

- [@GitNinja0](https://github.com/GitNinja0)
- [@nxcxdev](https://github.com/nxcxdev)
- [@Colunga-D](https://github.com/Colunga-D)
- [@rominaruizdiaz](https://github.com/rominaruizdiaz)
- [@stiv-32](https://github.com/stiv-32)



