# Form Tester Java Program

This repository contains a simple Java program that collects user information (first name, last name, and age) and performs a basic age check to determine eligibility.

## Description

The `FormTester` program uses the `Form` class to store user data.  It prompts the user for their first name, last name, and age.  It then performs input validation to ensure the age is a non-negative integer.  Finally, it checks if the user is 18 or older and displays a personalized greeting message indicating their eligibility status.

## Features

* Collects user's first name, last name, and age.
* Performs input validation for age (must be a non-negative integer).
* Checks if the user is 18 or older.
* Displays a personalized greeting message with eligibility information.
* Uses object-oriented programming principles with the `Form` class.
* Includes getter and setter methods for `Form` class fields.
* Handles `Scanner` correctly to avoid input issues.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) installed on your system.

### How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Osalino/Form-Java.git
   ```
   
2. Navigate to the project directory:

```bash
cd Form-Java
```

3. Compile the Java code:
```bash
javac Form.java FormTester.java
```

4. Run the program:
```bash

    java FormTester
```
### Usage

The program will prompt you to enter your first name, last name, and age.  Follow the on-screen instructions.  If you enter invalid input for age (e.g., text or a negative number), the program will ask you to re-enter it.

### Example
```
Enter your first name: John
Enter your last name: Doe
Enter your age: 25
Hello, John Doe! You are 25 years old and eligible.

Enter your first name: Jane
Enter your last name: Smith
Enter your age: -5  # Invalid input
Invalid input. Please enter a number for age.
Enter your age: 16
Hello, Jane Smith! You are 16 years old and not yet eligible.
````


Class Structure
```
    Form class:
        firstName (String): User's first name.
        lastName (String): User's last name.
        age (int): User's age.
        favouriteColor (String): User's favourite color.
        Form(String firstName, String lastName, int age): Constructor.
        ageCheck(): Returns true if age is 18 or older, false otherwise.
        Getters and setters for all fields.

    FormTester class:
        main(String[] args): Main method to run the program
```

## Contributing

Contributions are welcome!  Please open an issue or submit a pull request.
License

## MIT License  
MIT License

Copyright (c) 2025 Osazemen

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


### Author
#### Osazemen
## Contact
#### osazemenod@gmail.com
