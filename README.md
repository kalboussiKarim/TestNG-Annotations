# TestNG Annotations

This project serves as an introduction to the core annotations in TestNG, a popular testing framework for Java. It provides practical examples and explanations of various TestNG annotations, their attributes, and their usage.

## Features and Examples

### 1. **@Test Annotation**
   - Demonstrates the `@Test` annotation and its `priority` attribute.
   - Includes examples of test methods executed based on their assigned priority.

### 2. **@BeforeMethod and @AfterMethod**
   - Illustrates the execution of setup tasks using `@BeforeMethod` before each test method.
   - Explains the use of `@AfterMethod` for cleanup tasks after each test method.

### 3. **@BeforeClass and @AfterClass**
   - Highlights the use of `@BeforeClass` for one-time setup tasks before any test method in the class runs.
   - Demonstrates the use of `@AfterClass` for one-time teardown tasks after all test methods in the class have run.

### 4. **Hard and Soft Assertions**
   - Provides examples that showcase the differences between hard assertions (e.g., `Assert.assertEquals`) and soft assertions (e.g., `SoftAssert`).
   - Explains scenarios where each type of assertion is more suitable.

### 5. **Executing Tests via XML Configuration**
   - Introduces the use of TestNG XML files for test suite configuration.
   - Explains how to use:
     - `@BeforeSuite` and `@AfterSuite` for setup and teardown at the suite level.
     - `@BeforeTest` and `@AfterTest` for setup and teardown at the test level.

### 6. **Comprehensive Example**
   - Combines all the above annotations into a single example.
   - Includes detailed log messages and prints to illustrate the sequence of execution.
   - Provides a complete understanding of TestNG's flow and behavior.

## How to Use
1. Clone the repository:
   ```bash
   git clone https://github.com/kalboussiKarim/TestNG-Annotations.git
   ```
2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Explore the examples in the provided code files.
4. Run the tests directly or via a TestNG XML configuration file.

## Prerequisites
- Java Development Kit (JDK) installed.
- TestNG library integrated with your project.
- A basic understanding of Java programming.

## Learning Outcomes
By exploring this project, you will:
- Gain a foundational understanding of TestNG annotations and their lifecycle.
- Learn how to write effective test cases with TestNG.
- Understand the role of XML configuration in managing complex test suites.
- Distinguish between hard and soft assertions and know when to use each.

