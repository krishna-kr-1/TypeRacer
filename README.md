# 🚗 TypeRacer - Java Selenium Automation

This project automates the [TypeRacer](https://play.typeracer.com/) game using Java and Selenium WebDriver.

---

## 🧰 Tech Stack

- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
- ![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
- Maven for dependency management
- ChromeDriver
  
---

## 💡 Features

- 🌐 Opens and navigates to TypeRacer
- 🔍 Extracts the text to type
- ⌨️ Simulates typing using Java Robot class
- ⚙️ Built using Selenium WebDriver and Java AWT Robot
- ✅ Includes both `.jar` and `.exe` versions


---

## 📁 Project Structure
```
TypeRacer/
├── Executables/
│   ├── TypeRacer.jar
│   └── Type.exe
│
├── src/test/java/Full/
│   ├── typeRacerMain.java
│   └── typeRacerMain.class
│
├── pom.xml
├──.gitattributes
└── README.md
```

## 🚀 How to Run

### 🔧 Requirements
- Java 11+ installed
- Chrome Browser
- ChromeDriver (compatible with your Chrome version)
- Maven (if building from source)

### 💻 Run Executable:
Double click on:
- `Type.exe` (Windows)
- Or run the `.jar` file:  
  ```bash
  java -jar TypeRacer.jar
