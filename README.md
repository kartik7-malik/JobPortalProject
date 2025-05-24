# Job Portal – Review 1 Submission

## Project Info

This is a simple Job Portal project made for Review 1.  
It is built using Java, JavaFX, MySQL, and JDBC.

This project includes:
- Login UI using JavaFX
- Database connection using JDBC
- MySQL table for users
- Project structure and setup

---
MySQL Login Details

Used in UserDAO.java:
username: root
password: Malik775



## How to Run (on macOS or VS Code)

### Step 1: Compile
```bash
javac --module-path /Users/kartikmalik/Downloads/javafx-sdk-24.0.1/lib \
      --add-modules javafx.controls \
      -cp "lib/mysql-connector-j-9.3.0.jar" \
      -d bin src/ui/Login.java
### Step 2: Run
java --module-path /Users/kartikmalik/Downloads/javafx-sdk-24.0.1/lib \
     --add-modules javafx.controls \
     -cp bin ui.Login

## Note for Other Systems

	•	If you’re using Windows, use backslashes (\) in paths.
	•	If you’re using IntelliJ or Eclipse, add JavaFX and JDBC via the project/module settings instead of using the command line.

⸻
