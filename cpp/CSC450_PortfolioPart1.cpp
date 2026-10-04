/* 
CSC450 Programming III
Portfolio Project - Part 1 
Concurrency and Multithreading in C++

Author: Cody G. Walker 
Date: October 4, 2026

Purpose:
This program demonstrates concurrency concepts in C++ using two threads. 
The first thread counts upward from 0 to 20. After the first thread finishes, 
a second thread counts downward from 20 to 0. 

Pseudocode:

START

CREATE a function that counts upward
    FOR each number from 0 through 20
        PRINT the number
    END FOR
END function 

CREATE a function that counts downard
    FOR each number from 20 through 0
        PRINT the number
    END FOR
END function 

CREATE the first thread using the count-up function 
WAIT for the first thread to finish

CREATE the second thread using the count-down function
WAIT for the second thread to finish

END
*/