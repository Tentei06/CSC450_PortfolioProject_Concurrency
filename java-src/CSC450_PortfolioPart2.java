public class CSC450_PortfolioPart2{

}

/*
CSC450 Programming III
Portfolio Project - Part 2
Concurrency and Multithreading in Java

Author: Cody G. Walker
Date: October 11, 2026

Purpose:
This program demonstrates concurrency concepts in Java using two threads.
The first thread counts upward from 0 to 20. After the first thread finishes,
a second thread counts downward from 20 to 0.

Pseudocode:

START

CREATE a function that counts upward
    FOR each number from 0 through 20
        PRINT the number
    END FOR
END function

CREATE a function that counts downward
    FOR each number from 20 through 0
        PRINT the number
    END FOR
END function

CREATE the first thread using the count-up function
START the first thread
WAIT for the first thread to finish

CREATE the second thread using the count-down function
START the second thread
WAIT for the second thread to finish

END
*/