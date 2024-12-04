# Re-thrown ArrayIndexOutOfBoundsException in Java

This repository demonstrates a Java program that throws an `ArrayIndexOutOfBoundsException` within a `try-catch` block and re-throws the exception. While seemingly simple, re-throwing exceptions in this manner can be a source of subtle bugs if not carefully considered in the overall application design.  The solution shows how to properly handle the exception without needing to re-throw.

## Bug Description:

The `bug.java` file contains the buggy code.  It attempts to access an index outside the bounds of an array which generates an `ArrayIndexOutOfBoundsException`. Although the exception is caught, it's immediately re-thrown, potentially leading to unexpected behavior in calling methods if not handled correctly. This is uncommon because many programmers choose to handle the exception entirely within the try-catch block.

## Solution:

The `bugSolution.java` file provides a more robust solution.  Instead of re-throwing the exception, it handles it gracefully by printing an error message and taking appropriate action. This prevents the exception from propagating upwards, potentially improving the overall stability of the application.
