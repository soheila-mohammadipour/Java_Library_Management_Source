# Java Library Management System (Desktop App)

A Java-based desktop application for managing a small library system.  
The application supports typical library workflows such as managing books, members, loans, returns and penalties.

## Features
- User login
- Add / manage books
- Add / manage members
- Loan (borrow) and return process
- Penalty (fine) management
- Reservation management (if applicable)

## Project Structure (Layered Architecture)
The project is organized in a clear layered structure:

- Model (Domain Layer): Classes/
  - Domain entities such as Book, Member, User, Amanat (Loan), Jarime (Fine), Rezerv (Reservation), etc.
- Data Access Layer: DataAcces/
  - Responsible for reading/writing data and separating persistence logic from UI.
- UI Layer: UIs/
  - Desktop UI forms (Java Swing). Contains screens like Login, addBook, addMember, AmanatForm, JarimeForm, etc.
- Resources: res/, pics/
  - Images/icons used by the UI.

## Tech Stack
- Java (OOP)
- Java Swing (Desktop UI)
- NetBeans project structure (`nbproject`, .form files)
- Apache Ant build (`build.xml`), manifest.mf

## How to Run
1. Open the project in IntelliJ IDEA or NetBeans
2. Build the project (Ant)
3. Run the main class (e.g., mainClass / main entry point)

> Note: Some build/run steps may differ depending on IDE setup.

## What I Learned
- Object-Oriented Programming (Encapsulation, modular design)
- Layered architecture & separation of concerns
- Desktop UI development with event-driven programming (Swing)
- Organizing a medium-size project structure and maintaining readability

## Future Improvements
- Replace file-based storage with a relational database (MySQL) and JDBC/JPA
- Add validation and better error handling
- Create REST API (Spring Boot) and a web-based frontend
- Add unit tests (JUnit) for business logic

---
Author: <YOUR NAME>
