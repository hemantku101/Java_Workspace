# Run-time error:
- These error represent ineffciency of the computer system to execute a particular statement. 
For Example, insufficient memory to store something or inability of the microprocessor 
to execute some statement come under run-time errors.

# What happenns if main() method is written without String args ?
- The code compiles but JVM cannot run it, as it cannot see the main() method with String 
args.

# Exceptions:-
- Basically, an exception is a runtime error. We can not call compile-time error compile-time 
errors also exceptions". They come under errors. All exceptions occur only at runtime but 
some exceptions are detected at compile time and some others at runtime. The exceptions 
that are checked at compilation time by the Java compiler are called 'checked exceptions' 
while the exceptions that are checked by the JVM are called 'unchecked exceptions'. 

# What are checked exceptions?
- The exceptions that are checked at compilation-time by the Java compiler are called 
'checked exceptions'. The exceptions that are checked by the JVM are called 
'unchecked exceptions". 

# Difference between Checked And Unchecked Exceptions?
-i)The exception classes that are derived from java.lang.Exception class are called 
checked Exceptions.
-i)The exceptions classes that are derived from java.lang.RuntimeException class 
are called Unchecked Exceptions.
-ii)All Checked Exceptions must be handled by programmer Explicitly, other-wise compiletime 
error occurs.
-ii)Handling unchecked exception are optional by programmer because  all unchecked exceptions 
are handled by system Implicitly.
-Unchecked Exceptions are handled by programmer to display user friendly error message 
only.
-iii)The java compiler checks try and catch blocks or throws clause for this kind of exceptions.
-iii)The java compiler doese not check try and catch block or throws clause for this 
kind of exceptions.
-iv)All application specific exceptions are comes under this category.
-iv)All general exceptions are comes under this category.

# What is Throwable?
- Throwable is a class that represents all errors and exceptions which may occur in Java.

# Which is the super class for all exceptions?
- Exception is the super class of all exceptions in Java.

# What is the difference between an exception and an error?
- An exception is an error which can be handled. It means when an exception happens, 
the programmer can do something to avoid any harm. But an error is an error which cannot be 
handled, it happens and the programmer cannot do any thing.

# throws Clause:-
- Even if a programmer is not handling runtime exceptions, the Java compiler will not give any 
error related to runtime exceptions. But the rule is that the programmer should handle 
checked exceptions. In case the programmer does not want to handle the checked exceptions, 
he should throw them out using throws clause. Otherwise, there will be an error flagged by 
Java compiler.where there is an IOException raised by readLine() method of BufferedReader class. 
This is checked exception and hence the compiler checks it at the compilation time. If it is not 
handled, the compiler expects at least to throw it out.

# throw Clause:-
- There is also a throw statement available in Java to throw an exception explicitly and catch it. 
Let us see how it can be used.

# Built-in Exceptions:-
- ArithmeticException:- Thrown when an exceptional condition has occurred in an arithmetic operation.
- ArrayIndexOutOfBoundsException- Thrown to indicate that an array has been accessed with an illegal 
index. The index is either negative or greater than or equal to the size of the array.
- ClassNotFoundException:- This exception is raised when we try to access a class whose definition is not found.
- FileNotFoundException:- Raised when a file is not accessible or does not open.
- IOException:- Thrown when an input-output operation failed or interrupted.
- InterruptedException:- Thrown when a thread is waiting, sleeping, or doing some processing, 
and it is interrupted.
- NoSuchFieldException:- Thrown when a class does not contain the field (or variable) specified.
- NoSuchMethodException:- Thrown when accessing a method which is not found.
- NullPointerException:- Raised when referring to the members of a null object. null represents nothing.
- NumberFormatException:- Raised when a method could not convert a string into a numeric format.
- RuntimeException:- This represents any exception which occurs during runtime.
- StringIndexOutOfBoundsException:- Thrown by String class methods to indicate that an index is 
either negative or greater than the size of the string.

# What is the difference between throws and throw?
- throws clause is used when the programmer does not want to handle the exception and throw it 
out of a method. throw clause is used when the programmer wants to throw an exception explicitly 
and wants to handle it using catch block. Hence, throws and throw are contradictory
















