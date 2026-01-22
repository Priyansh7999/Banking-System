# Simple Banking System
A console-based Java application that demonstrates core Object-Oriented Programming (OOP) concepts through a simple banking system.

## Features

1. Create a bank account

2. Deposit money

3. Withdraw money

4. View account information and balance

5. Menu-driven console interface

## OOPs concepts

1. **Encapsulation**  
   - Private fields such as `accountNumber` and `name`
   - Access through public getter methods

2. **Abstraction**  
   - `BankAccount` is an abstract class defining common behavior

3. **Inheritance**  
   - `SavingsAccount` extends `BankAccount`

4. **Polymorphism**  
   - `withdraw()` method is overridden in `SavingsAccount`

## Project Files and Their Purpose

### 1.  BankAccount.java
- Abstract base class
- Contains common account properties:
  - Account number
  - Account holder name
  - Balance
- Implements deposit logic
- Declares abstract `withdraw()` method  
- Demonstrates **Encapsulation** and **Abstraction**

---

### 2. SavingsAccount.java
- Child class of `BankAccount`
- Implements the `withdraw()` method with balance validation
- Demonstrates **Inheritance** and **Polymorphism**

---

### 3.Main.java
- Entry point of the application
- Implements a menu-driven system using `switch-case`
- Handles all user interaction

## Separation of responsibilities

1. BankAccount → business logic

2. SavingsAccount → account-specific behavior

3. Main → user interaction