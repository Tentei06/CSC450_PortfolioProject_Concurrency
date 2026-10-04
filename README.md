# CSC450 Portfolio Project - Concurrency

This repository contains the two-part Portfolio Project for CSC450 Programming III at Colorado State University Global. The project demonstrates concurrency and multithreading concepts using C++ and Java.

## Project Overview

The Portfolio Project compares implementations of the same multithreaded counter application in C++ and Java.

### Part 1 - C++

The C++ application creates two threads that act as counters:

- The first thread counts upward from 0 to 20.
- The program waits for the first thread to finish.
- The second thread then counts downward from 20 to 0.
- The program waits for the second thread to finish before exiting.

The use of `join()` ensures that each thread completes before the program continues to the next stage.

### Part 2 - Java

The Java implementation and comparison will be completed in Module 8.

## Repository Structure

```text
CSC450_PortfolioProject_Concurrency/
├── cpp/
│   └── CSC450_PortfolioPart1.cpp
├── .gitignore
├── LICENSE
└── README.md
```

## Concepts Demonstrated

- C++ multithreading with `std::thread`
- Thread creation and execution
- Thread synchronization using `join()`
- Sequential coordination of multiple threads
- Loop-based counters
- Basic concurrency considerations

## Building and Running Part 1

Compile the C++ program using:

```bash
g++ ./cpp/CSC450_PortfolioPart1.cpp -o ./cpp/CSC450_PortfolioPart1
```

Run the compiled application:

```bash
./cpp/CSC450_PortfolioPart1
```

The application will first display the numbers 0 through 20 and then display the numbers 20 through 0.

## Author

Cody G. Walker  
CSC450 Programming III  
Colorado State University Global

## License

This project is licensed under the MIT License.
