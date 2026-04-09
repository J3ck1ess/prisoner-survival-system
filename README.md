# Prisoner Survival System (Josephus Problem)

## 📌 Project Description

This project is a Java-based simulation and optimization of the classic **Josephus Problem**.

It demonstrates both:
- Simulation approach (process-based elimination)
- Mathematical solution (optimized computation)

The system supports user input, logging, and exception handling, and follows a layered architecture design.

---

## Problem Overview

- There are **N prisoners** standing in a circle.
- Each prisoner has a unique ID.
- Starting from a position, every **K-th prisoner is eliminated**.
- The process repeats until only one survivor remains.

---

## Features

- **Simulation Algorithm**
    - Iteratively removes prisoners
    - Easy to understand process
    - Time Complexity: `O(n²)`

- **Mathematical Algorithm**
    - Uses Josephus recurrence formula
    - Efficient computation without simulation
    - Time Complexity: `O(n)`

- **Object-Oriented Design**
    - Model / Service / Util separation

- **Exception Handling**
    - Custom exception (`PrisonerException`)
    - Input validation

- **Logging System**
    - Custom `LogUtil` for structured logs

- **Interactive Console**
    - User input for number of prisoners and step

---

## Project Structure

prisoner-survival-system  
├── App.java  
├── model  
│   └── Prisoner.java  
├── service  
│   └── PrisonerService.java  
├── util  
│   ├── PrisonerUtil.java  
│   └── LogUtil.java  
├── exception  
│   └── PrisonerException.java  
└── README.md

---

## 🚀 How to Run

1. Clone the repository
   git clone <your-repo-url>

2. Run App.java

3. Input:
   Enter the number of prisoners  
   Enter the step for elimination

---

## Example Output

====== Welcome to the Prisoner Survival System =====  
Enter the number of prisoners: 50  
Enter the step for elimination: 4

[INFO] Initial prisoners: [...]

[INFO]2026-04-09 15:31:30 - Elimination number: 191 - Remaining number: 49  
[INFO]2026-04-09 15:31:30 - Elimination number: 114 - Remaining number: 48

......

[INFO]2026-04-09 15:31:30 - Elimination number: 100 - Remaining number: 2  
[INFO]2026-04-09 15:31:30 - Elimination number: 162 - Remaining number: 1

Simulation Result:  
ID: 62, First position: 47

Mathematical Result:  
ID: 62, First position: 47

---

## Core Algorithm

f(n) = (f(n-1) + k) % n

- f(n): survivor index (0-based)
- k: step
- Base: f(1) = 0

---

## Simulation vs Mathematical

Simulation: O(n²)  
Mathematical: O(n)

---

## Key Design

- Defensive copy (new ArrayList<>)
- Layered structure
- Exception handling
- Dual algorithm implementation

---

## Tech Stack

- Java
- Collections
- OOP
- Algorithm

---

## Author

Agzhan Ayden