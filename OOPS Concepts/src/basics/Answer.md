	# OOPS
- The languages like C,C++ are called Procedure Oriented programming 
languages since in these languages, a programmer uses procedures or functions to perform 
a task. When the programmer wants to write a program, he will first divide the task into 
separate sub tasks, each of which is expressed as a function. So a C program generally 
contains several functions which are called and controlled from a main() function. This 
approach is called Procedure Oriented approach.

- On the other hand, languages like C++ and Java use classes and objects in their programs 
and are called Object Oriented Programming languages. A class is a module which itself 
contains data and methods (functions) to achieve the task. The main task is divided into 
several modules, and these are represented as classes. Each class can perform some tasks 
for which several methods are written in a class. This approach is called Object oriented 
approach.
-**Explain about OOPS Concept?**
 -The process of constructing applications using the Class-Object concept is known as Object Oriented Programming.
 -In Object Oriented programming we control NonPrimitive data types or referential data types.

-features Object oriented programming System
-i)Class/Object
-ii)Encapsulation
-iii)Abstraction
-iv)Inheritance
-v)Polymorphism

-i)Class/Object:-
The entire OOP methodology has been derived from a single root concept called 'object'. 
An object is anything that really exists in the world and can be distinguished from others. 
This definition specifies that every thing in this world is an object. For example, a table, 
a ball, a car, a dog, a person, etc., every thing will come under objects. Then what is not 
an object? If something does not really exist, then it is not an object. For example, our 
thoughts, imagination, plans, ideas etc., are not objects, because they do not physically exist.

-Difference between class and an object
- A class is a model for creating objects and does not exist physically. An object is 
any thing that exists physically. Both the class and objects contain variables and methods.

-ii)Encapsulation:-
Encapsulation is a mechanism where the data (variables) and the code (methods) that 
act on the data will bind together. For Example, if we take a class, we write the variables 
and methods inside the class. Thus, class is binding them together. So class is an example 
for encapsulation.

-iii)Abstraction:-
There may be a lot of data, a class contains and the user does not need the entire data.The 
user requires only some part of the avaliable data. In this case, wecan hie the unnecessary 
data from the user and expose only that is of interest to user. This is called abstraction.

-iv)Inheritance:-
It creates new classes from existing classes, so that the new classes will acquire all 
the fratures of the existing classes is called Inheritance.

-v)Polymorphism:-
The word 'polymorphism' came from two Greek words'poly' meaning 'many' and 'morphos' 
meaning 'forms'. Thus, polymorphism represents the ability to assume several different 
forms. In programming, we can use a single variable to refer to objects of different 
types and thus, using that variable we can call the methods of the diffrent objects. 
Thus a method call can perform different tasks depending on the type of the object.


# 1)What is hash code?

-Hash code is a unique identification number allotted to the objects by the JVM. This hash code
 number is also called reference number which is created based on the location of the object in 
 memory, and is unique for all objects, except for String objects.

# 2)How can you find the hash code of an object?

-The hashCode() method of 'Object' class in java.lang package is useful to find the
 hash code of an object.
 
 # 3)Can you declare a class as 'private'?

-No, if we declare a class as private, then it is not available to Java compiler and hence a
 compile time error occurs. But, inner classes can be declared as private.
 
 # 4)When is a constructor called, before or after creating the object?

-A constructor is called concurrently when the object creation is going on. JVM first allocates
 memory for the object and then executes the constructor to initialize the instance variables. 
 By the time, object creation is completed, the constructor execution is also completed.
 
 # 5)Why instance variables are not available to static methods? 
 -After executing static methods, JVM creates the objects. So the instance variables of the
  objects are not available to static methods.
  
  # 6)In how many ways, can you create an object in Java? 
  
  -There are four ways of creating objects in Java:

-i) Using new operator .
Employee obj =new Employee ();
Here, we are creating Employee class object obj using new operator.

-ii). Using factory methods:
NumberFormat obj = NumberFormat.getNumberInstance(); 
Here, we are creating NumberFormat object using the factory method getNumberInstance().

-iii). Using newInstance() method.
 Here, we should follow two steps, as:
  -(a) First, store the class name 'Employee' as a string into an object. 
  For this purpose, factory method forName () of the class 'Class' will be useful:
  Class C Class = Class.forName("Employee");
   We should note that there is a class with the name 'Class' in java.lang package.
   -(b) Next, create another object to the class whose name is in the object c. For 
   this purpose, we need newInstance() method of the class 'Class', as:
   Employee obj = (Employee)c.newInstance();

-iv). By cloning an already available object, we can create another object. Creating
 exact copy of an existing object is called 'cloning":
 Employee obj1 = new Employee ();
  Employee obj2 = (Employee)objl.clone();
  -Earlier, we created obj2 by cloning the Employee object obj1. clone () method of
   Object class is used to clone an object. We should note that there is a class by
   the name 'Object' in java.lang package.
 