# Steps to develop multithreaded application by implementing java.lang.Runnable interface

- create a class that implements java.lang.Runnale interface.
  - override run() method.
  - write child Thread task code in a run() method.
  - write main method()
  - create an object of current class and assign to Runnable reference.
  - create an object of thread class by passing Runnable reference in Thread class constructor.
  - call start() method.
  - write main thread task code in main() method.
  