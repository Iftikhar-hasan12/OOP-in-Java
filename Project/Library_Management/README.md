📚 Library Management System (Java + Swing + MySQL)
This is a Java-based Library Management System built using Swing for GUI and MySQL for backend storage.
The system supports two interfaces: Admin and Student. Key features include issuing and returning books, viewing book/member lists, managing members and books, viewing issue history, and more — all integrated with a MySQL database. The system dynamically retrieves and updates data via the database to ensure real-time accuracy.

### 🚀 How to Run This Project

#### 1. Download the Project
- Click on the ZIP file provided.

- Open **NetBeans IDE** and **import the thiz Zip**.

#### 2. Set Up the Database
- Open **XAMPP** and start **MySQL**.
- Import the provided `.sql` file into **phpMyAdmin** to create the necessary database and tables.

#### 3. Update Database Credentials
- In the project, navigate to the `connection` package.
- Open the file responsible for establishing the database connection.
- Replace the **username** and **password** with your **local MySQL credentials**.

#### 4. Run the Project
- Clean and build the project in NetBeans.
- Then, run the project — the GUI will launch and you can start using the system.

#### 5. ⚠️ JDK Version Note
- If you face any issues related to the **JDK version**, ensure that your JDK version matches the one used in the project.
- You can change your JDK version in **NetBeans > Project Properties > Libraries > Java Platform**.
