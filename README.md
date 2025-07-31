## 📚 Task 1: Manual Test Cases (Excel)

Manual test cases cover functional, UI, negative, and boundary scenarios for the login functionality of the Janitri Dashboard.
## Output - MANUAL TEST CASES
https://github.com/Girish-NOV/JanitriLoginAutomation/blob/main/Girish_Janitri_Login_TestCases.xlsx
--Click the above link
-- After Clicking the Link View Raw to see the results of Task 1
| Test Case ID | Scenario                              | Test Type       |
|--------------|----------------------------------------|------------------|
| TC01         | Login with valid credentials           | Functional - Positive |
| TC02         | Login with blank fields                | Functional - Negative |
| TC03         | Login with only user ID                | Functional - Negative |
| TC04         | Login with only password               | Functional - Negative |
| TC05         | Login with invalid credentials         | Functional - Negative |
| TC06         | Check presence of UI elements          | UI              |
| TC07         | Check login button disabled initially  | UI              |
| TC08         | Check eye icon functionality           | UI              |
| TC09         | Password should be masked initially    | UI              |
| TC10         | User ID input max length               | Boundary        |
| TC11         | Password input max length              | Boundary        |
| TC12         | User ID with special characters        | Boundary        |
| TC13         | Password with only spaces              | Boundary        |

---

# ✅ Task 2: Janitri Dashboard Login Automation (QA Internship)

This project automates the login page UI testing of the **Janitri Dashboard** using Java, Selenium WebDriver, Maven, TestNG, and the Page Object Model (POM) design pattern.

---

## 🔗 Test Page URL

[https://dev-dash.janitri.in](https://dev-dash.janitri.in)

---

## 🧪 Tech Stack

- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Page Object Model (POM)  
- VS Code

---

## 📁 Project Structure

src/
├── main/
│ └── java/
│ └── com/janitri/pages/
│ └── LoginPage.java
├── test/
│ └── java/
│ └── com/janitri/tests/
│ ├── BaseTest.java
│ └── LoginTest.java

---

## ⚙️ Technologies Used

- **Language**: Java
- **Automation Tool**: Selenium WebDriver
- **Test Runner**: TestNG
- **Build Tool**: Maven
- **Design Pattern**: Page Object Model (POM)
- **Driver Management**: WebDriverManager

---

## 🚀 How to Run the Tests

### 🧰 Prerequisites

- Java 8 or above
- Maven
- Chrome browser

### 📦 Clone the Repository

git clone https://github.com/Girish-NOV/JanitriLoginAutomation.git
cd JanitriLoginAutomation

📥 Install Dependencies
mvn clean install

▶️ Run Tests with TestNG
mvn test
### 🖼️ Test Execution Screenshots

#### ✅ Screenshot 1 – Invalid Login Error Message

[![Screenshot 1](https://github.com/Girish-NOV/JanitriLoginAutomation/blob/main/Output%20Screenshot%201.png?raw=true)](https://github.com/Girish-NOV/JanitriLoginAutomation/blob/main/Output%20Screenshot%201.png?raw=true)

---

#### ✅ Screenshot 2 – Password Visibility Toggle

[![Screenshot 2](https://github.com/Girish-NOV/JanitriLoginAutomation/blob/main/Output%20Screenshot%202.png?raw=true)](https://github.com/Girish-NOV/JanitriLoginAutomation/blob/main/Output%20Screenshot%202.png?raw=true)

---

Vadamala Girish
📧 girishbhanu8@gmail.com
📍 Tirupati, India

