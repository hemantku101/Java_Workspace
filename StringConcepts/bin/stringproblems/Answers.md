# 1) Is String a class or data type
- String is a class in java.lang package. But in java all classes are also consider 
as data types. So we can take String as a data type also.

# 2)what is object reference?
- Object reference is a unique hexadecimal number representing the memory address of 
the object. It is usefull to access the members of the object.

# 3)what is the difference between == and equals() while comparing strings? Which one 
is reliable?
- == operator compares the references of the string objects. it does not compare the 
contents of the objects. equals() method compares the contents. While comparing the 
strings, equals() method should be used as it yields the correct result.

# 4)what is String constant pool?
- String constant pool is a separate block of memory where the string objects are held 
by JVM. If a string object is created directly, using assignment operator as, String 
s= "Hello", then it is stored in string constant pool.

# 5)what is he difference between String and StringBuffer classes?
- String class objects are immutable and hence their contents cannot be modified. StringBuffer 
class objects are mutable, so they can be modified. Moreover the methods that directly 
manipulate data of the object are not available in String class. Such methods are available 
in StringBuffer class.

# 6) Explain the difference between the following two statements:
	-i). String = "Hello":

 -ii). String s = new String("Hello");

-In the first statement, assignment operator is used to assign the string literal to the String
 variable s. In this case, JVM first of all checks whether the same object is already available
  in the string constant pool. If it is available, then it creates another reference to it.
   If the same object is not available, then it creates another object with the content "Hello" 
   and stores it into the string constant pool.

-In the second statement, new operator is used to create the string object. In this case,
 JVM always creates a new object without looking in the string constant pool.
 
 # 7)What is the difference between String and StringBuffer classes?
 -String class objects are immutable and hence their contents cannot be modified.
  StringBuffer class objects are mutable, so they can be modified. Moreover the methods 
  that directly manipulate data of the object are not available in String class. 
  Such methods are available in StringBuffer class.

# 8)What is the difference between StringBuffer and StringBuilder classes?
- StringBuffer class is synchronized and StringBuilder is not synchronized. When the 
programmer wants to use several threads, he should use StringBuffer as it gives reliable 
results. If only one thread is used, StringBuilder is preferred, as it improves execution 
time.