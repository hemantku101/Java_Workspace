# Thread:-
- thread represents a separate path of execution of a group of statements. In a Java program, 
if we write a group of statements, then these statements are executed by JVM one by one. 
This execution is called a thread, because JVM uses a thread to execute these statements. 
This means that in every Java program, there is always a thread running internally. This thread 
is used by JVM to execute the program statements.

-A thread is a piece of code that executes independently.
-Every program contains atleast one thread.i.e-main thread
-main thread default name is main only.
-main thread default priority is 5.
-These priority numbers will range from 1 to 10. 1 is the minimum priority, and 10 is 
the maximum priority o thread.

# Which thread always runs in a Java program by default?
- main thread

# Why threads are called light-weight?
- Threads are light-weight because they utilize minimum resources of the system. This means 
they take less memory and less processor time.
# What is the difference between single tasking and multi tasking? 
- Executing only one job at a time is called single tasking. Executing several jobs at a time 
is called multi tasking. In single tasking, the processor time is wasted, but in multi tasking, 
we can utilize the processor time in an optimum way.

# Uses of Threads:-
- Threads can be used for multiple purposes. Some of the uses of threads are:
- Threads are mainly used in server-side programs to serve the needs of multiple clients on a 
network or Internet. On Internet, a server machine has to cater the needs of thousands of clients, 
at a time. For this purpose, if we use threads in the server, they can do various jobs at a time, 
thus they can handle several clients.
- Threads are also used to create games and animation. Animation means moving the objects from 
one place to another. In many games, generally we have to perform more than one task simultaneously. 
There, threads will be of invaluable help. For example, in a game, a fight may be moving from left 
to right.

# Life cycle of a thread (or) Thread states :-
- There are two ways to create a new thread:
-i) By extending java.lang.Thread class.
-ii) By implementing java.lang.Runnable interface.
- Whenever Thread class constructor is called them new thread will born.
- Whenever destory() method is called then thread will die.
- sleep() method takes milisecond as a parameter.
1000 milisecond = 1 second
- run() method given as null body method in a Thread class to write child thread task code.
- start() method implicitly call run() method.

# How can you stop a thread in Java?
- First of all, we should create a boolean type variable which stores 'false'. When the user 
wants to stop the thread, we should store 'true' into the variable. The status of the variable 
is checked in the run() method and if it is true, the thread executes 'return' statement and then stops.

# What is the difference between 'extends Thread' and 'implements Runnable'? 
Which one is advantageous?
- extends Thread and implements Runnable - both are functionally same. But when we write extends 
Thread, there is no scope to extend another class, as multiple inheritance is not supported in Java.
- class Myclass extends Thread, AnotherClass //invalid
- if we write implements Runnable, then still there is scope to extend another class.
- class Myclass extends Another Class implements Runnable //valid
- This is definitely advantageous when the programmer wants to use threads and also 
wants to access the features of another class

# Which method is executed by the thread by default?
- public void run() method.

# What is Thread synchronization?
- When a thread is already acting on an object, preventing any other thread from acting on 
the same object is called Thread synchronization' or Thread safe' The object on which the 
threads are synchronized is called 'synchronized object. Thread synchronization is 
recommended when multiple threads are used on the same object (in multithreading).

# What is the difference between synchronized block and synchronized keyword?
- Synchronized block is useful to synchronize a block of statements. Synchronized keyword is 
useful to synchronize an entire method.

# What is Thread deadlock?
- When a thread has locked an object and is waiting for another object to be released by another
 thread, and the other thread is also waiting for the first thread to release the first object, 
 both the threads will continue waiting forever. This is called 'Thread deadlock.
 - When Thread deadlock occurs, any further execution is stopped and the program will come to a 
 halt. Thread deadlock is a drawback in a program. The programmer should take care to avoid 
 any such deadlocks in his programs.
 
 # what is the diffrence between the sleep() and wait() methods?
 - Both the sleep() and wait() methods are used to suspend a thread execution for a specified time.
  When sleep() is executed inside a synchronized block, the object is still under lock. 
  When wait() method is executed, it breaks the synchronized block, so that the object lock 
  is removed and it is available.
- Generally, sleep() is used for making a thread to wait for some time. But wait() is used 
in connection with notify() or notify All() methods in thread communication.

# What is the default priority of a thread?
- When a thread is created, by default, its priority will be 5.

# What are the advantages of thread pools?
- 1. Thread pools are useful to reduce overhead involved in creation of a new thread every time 
a task is to be handled. Thus they improve the response time of the server.
- 2. Every thread pool will restrict the number of threads. Hence, the maximum limit of number 
of threads allowed for the JVM will not be crossed.
- 3. Thread pools eliminate problems related to over-usage of memory.
- 4. Once the thread pool is created, the programmer need not manage the threads in the thread 
pool. He will be freed to concentrate on the business logic.

# What is thread life cycle?
- A thread is created using new Thread() statement and is executed by start() method. 
The thread enters 'runnable' state and when sleep() or wait() methods are used or when the 
thread is blocked on I/O, it then goes into 'not runnable' state. From 'not runnable' state, 
the thread comes back to the 'runnable' state and continues running the statements. 
The thread dies when it comes out of run() method. These state transitions of a thread are 
called 'life cycle of a thread' .



