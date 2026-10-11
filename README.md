# CSC450 Portfolio Project - Concurrency

This repository contains the two-part Portfolio Project for CSC450 Programming III at Colorado State University Global. The project demonstrates concurrency and multithreading concepts using C++ and Java.

## Project Overview

The Portfolio Project compares two implementations of the same multithreaded counter application. Both programs create two threads and coordinate their execution so that the first thread finishes counting upward before the second begins counting downward.

### Part 1 - C++

The C++ application uses `std::thread` and `join()` to coordinate two counters:

- The first thread counts upward from 0 to 20.
- The program waits for the first thread to finish.
- The second thread counts downward from 20 to 0.
- The program waits for the second thread to finish before exiting.

### Part 2 - Java

The Java application recreates the same behavior using Java's `Thread` class:

- The first thread counts upward from 0 to 20.
- The program starts the first thread and waits for it using `join()`.
- The second thread counts downward from 20 to 0.
- The program starts the second thread and waits for it to finish.
- An `InterruptedException` handler restores the main thread's interrupt status if a wait is interrupted.

Both implementations intentionally execute the counters in sequence to meet the project requirements.

## Repository Structure

```text
CSC450_PortfolioProject_Concurrency/
├── cpp/
│   └── CSC450_PortfolioPart1.cpp
├── java-src/
│   └── CSC450_PortfolioPart2.java
├── .gitignore
├── LICENSE
└── README.md
```

Compiled executable and class files are excluded from version control.

## Concepts Demonstrated

- C++ multithreading with `std::thread`
- Java multithreading with `Thread`
- Thread creation, execution, and lifecycle management
- Thread coordination using `join()`
- Java exception handling with `InterruptedException`
- Local loop variables and basic data-type considerations
- Concurrency performance and security considerations
- Comparison of C++ and Java implementations

## Building and Running Part 1 - C++

From the repository's root directory, compile the C++ application:

```powershell
g++ ./cpp/CSC450_PortfolioPart1.cpp -o ./cpp/CSC450_PortfolioPart1
```

Run the application in PowerShell:

```powershell
./cpp/CSC450_PortfolioPart1.exe
```

## Building and Running Part 2 - Java

From the repository's root directory, compile the Java application:

```powershell
javac ./java-src/CSC450_PortfolioPart2.java
```

Run the application:

```powershell
java -cp ./java-src CSC450_PortfolioPart2
```

The Java implementation was compiled and tested using Java 25.

## Expected Output

Both applications produce the same counting sequence:

```text
Count Up: 0
Count Up: 1
...
Count Up: 20
Count Down: 20
Count Down: 19
...
Count Down: 0
```

The first counter finishes before the second begins. This is intentional and demonstrates thread coordination rather than parallel execution of the two counters.

## Performance and Security Considerations

Creating threads introduces overhead, and these small counting tasks do not benefit from parallel execution because the assignment requires them to run sequentially. Neither implementation shares mutable counter data between threads, which avoids data races involving the loop counters.

The programs use fixed output labels rather than user-provided strings, so string-related exposure is limited. Both use signed integer counters within a small, fixed range. The accompanying portfolio analysis discusses broader concurrency, string, memory-management, and data-type vulnerabilities, along with the differences between C++ and Java.

## Author

**Cody G. Walker**  
CSC450 Programming III  
Colorado State University Global

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
