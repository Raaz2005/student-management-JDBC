# Student Management System using JDBC

A console-based Student Management System developed using **Java, JDBC, and MySQL**. This project performs CRUD (Create, Read, Update, Delete) operations on student records stored in a MySQL database.

## 📌 Features

- Add Student
- View All Students
- Search Student by ID
- Update Student Details
- Delete Student Record
- MySQL Database Integration using JDBC
- Menu-driven console application

## 🛠 Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Connector/J
- VS Code
- MySQL Workbench

## 📂 Project Structure

```
StudentManagementJDBC
│
├── src
│   ├── Student.java
│   ├── DBConnection.java
│   ├── StudentDAO.java
│   └── StudentApp.java
│
├── lib
│   └── mysql-connector-j-9.7.0.jar
│
├── Screenshots
│
├── Student_db.sql
│
└── README.md
```

## 🗄 Database Configuration

Database Name:

```sql
student_db
```

Table:

```sql
CREATE TABLE students(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT
);
```

## ⚙ Database Connection

Update the database credentials in:

```java
DBConnection.java
```

```java
private static final String URL =
        "jdbc:mysql://localhost:3306/student_db";

private static final String USER = "Raushan";

private static final String PASSWORD = "2005";
```

## ▶ How to Run

1. Install Java JDK.
2. Install MySQL Server.
3. Create the database and table.
4. Add MySQL Connector JAR.
5. Compile the files.
6. Run the application.

Run:

```bash
java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" StudentApp
```

## 📸 Screenshots

Project screenshots are available in the `Screenshots` folder.

## 📚 Learning Outcomes

- Understanding JDBC architecture
- Connecting Java with MySQL
- Performing CRUD operations
- Using PreparedStatement and ResultSet
- Building database-driven applications

## 👨‍💻 Author

**Raushan Raj**