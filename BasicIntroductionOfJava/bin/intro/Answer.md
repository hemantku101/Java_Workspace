# Is Java a purely object oriented language or not?

- The following reasons are put forward by many people to say Java is not a purely object oriented
programming language.

- 1. 'Purely object oriented' means it should contain only classes and objects. It should not contain
    primitive datatypes like int, float, char etc, since they are neither classes nor objects.

- 2. In pure object oriented languages, we should access every thing by message passing 
  (through objects). But, Java contains static variables and methods which can be accessed 
  directly without using objects.

- 3. Java does not contain multiple inheritance. It means an important feature of object 
  oriented design is lacking. So how can we say it is purely object oriented?
  No doubt Java is a purely object oriented programming language. The preceding points 
  represent a lack of in depth understanding of Java.

- 1. Even if Java has primitive datatypes, these types are used inside a class and never 
  outside of it. So, they are part of a class. See the API specification on the class: 'Class'. 
  Java specification says that all the arrays and the primitive Java types (boolean, byte, char, 
  short, int, long, float, and double), and the keyword void are also represented as objects 
  of the class 'Class'.

- 2. Even static variables and static methods are written inside a class. When accessing them 
  from outside, we should use classname. It means they are part and parcel of class definition 
  and should not be considered as individual elements. For reducing memory utilization, only one 
  copy of them will be created in memory and shared by all objects.

- 3. Any purely object oriented language should follow all the 5 features of Object oriented 
   Programming System (OOPS). These features are: 1. Classes and objects, 2. Encapsulation, 
  3. Abstraction, 4. Inheritance and 5. Polymorphism. Remember Java contains all these features 
  and hence it is purely object oriented language. Just because Java does not contain multiple inheritance, 
  we should not say it is not purely object oriented language. Multiple inheritance is not the 
     the main feature of OOPS, it is only a sub feature under inheritance.
     
# Which part of JVM will allocate the memory for a Java program?
 - Class loader subsystem of JVM will allocate the necessary memory needed bt the Java program.
 
 # How can you call the garbage collector?
 - Garbage collector is automatically invoked when the program is being run. It can be also called by calling gc() 
 method of Runtime class or System class in Java.
 
 # What is JIT compiler?
 - JIT compiler is the part of JVM wich increases the speed of execution of a Java Program.
 
 # What happens if String args  is not written in main() method?
 
 - When main() method is written without String args as:
 public static void main()
 - the code will compile but JVM cannot run the code because it cannot recognize the main() 
 method as the method from where it should start execution of the Java Program. Remember JVM always looks for main() method with string 
 type array as parameter.
 
 # What is a unicode System?
 - Unicode system is an encoding standard that provides a unique number for every character, 
 no matter what the platform, program, or language is,. Unicode uses 2 bytes to represent a single character.
 
 # What is control statements?
 -Control statements are the statements which alter the flow of execution and provide better control to the programmer on the flow of execution. 
 They are useful to write better and complex programs.
 