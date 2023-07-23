# 1) What is a collection framework?
- A collection framework is a class library to handle group of objects. Collection framework 
is implemented in java.util. package.

# 2) Can we store a premitive data type into a collection?
- No, collection store only objects.


# 3) What is the diffrence between Iterator and ListIterator?
- Both are useful to retrieve elements from a collection. Iterator can retrieve the elements 
only in the forward direction. But ListIterator can retrieve the elements in forward 
and backward direction also.
- Iterator allows only remove operation while iterating elements, but ListIterator provides 
additional operations like add() and set() that are not available in Iterator.


# 4) Dose a collection object store copies of other objects or their references?
- A collection object store references of other objects.

# methods
- Iterator is an interface that contains methods to retrieve the elements one by one from a 
collection object. It has 3 methods
-i)boolean hasNext(): This method returns true if the iterator has more elements.
-ii)element next(): This method returns the next element in the iterator.
-iii)void remove(): This method removes from the collection the last element returned by the 
iterator.
-

-ListIterator Interface
-ListIterator is an interface that contains methods to retrieve the elements from a collection 
object, both in forward and reverse directions. It has the following important methods
-i)boolean hasNext(): This returns true if the ListIterator has more elements when traversing 
the list in the forward direction.
-ii)boolean hasPrevious (): This returns true if the ListIterator has more elements when traversing 
the list in the reverse direction.
-iii)element next(): This returns the next element in the list.
-iv)element previous (): This returns the previous element in the list. 
-v)void remove(): This removes from the list the last element that was returned by the next ()
or previous() methods.



# 5) What is the difference between Iterator and Enumeration?
- Both are useful to retrieve elements from a collection. Iterator is supports only 
forward direction, but listIterator supports both forward and backward direction .
Iterator has methods whose names are easy to follow and Enumeration are diffcult to remember.
Also Iterator has an option to remove elements from the collection which is not available in Enumeration. 
So, Iterator is preferred to Enumeration.



# 6) What is the difference between a Set and a List ?
-i)A set represents a collection of elements. Order of the elements may change in the 
set.
-i)A List represents ordered collection of elements.List preserves the order of elements 
in which they are entered.
-ii)Set will not allow duplicate values to be stored.
-ii)List will allow duplicate values.
-iii)Accessing elements by their index (position number) is not possible in case of 
sets.
-iii)Accessing elements by index is possibl in lists.
-iv)Set will not allow null elements.
-iv)List allows null elements to be stored.



# 7) What is the diffrence between Set and Map?
-i)Set is a one dimensional collection.
-i)Map is a two dimensional collection.
-ii)Set contains elements
-ii)Map contains key and value pairs.
-iii)It is an index based collection.
-iii)It is key based collection.
-iv)It does not allow duplicate elements.
-iv)It does not allow duplicate key (values may be duplicated).



# 8)What is the difference between HashMap and Hashtable?
-i)HashMap object is not synchronized by default.
-i)Hashtable object is synchronized by default.
-ii)In case of a single thread, using HashMap is faster then the Hashtable.
-ii)In case of multiple threads, using Hashtable is advisable. With a single thread, 
Hashtable becomes slow.
-iii)HashMap allows one null key and null values to be stored.
-iii)Hashtable does not allow null keys or values.
-iv)Iterator in the HashMap is fail-fast. This means Iterator will produce exception 
if concurrent updates are made to the HashMap.
iv)Enumeration for the Hashtable is not fail-fast. This means even if concurrent updations 
are done to Hashtable, there will not be any incorrect results produced by the Enumeration.


# ArrayList:
-It is a array representation of list implementatio class.
-It is an implementation of linear list data structure.
-It allows duplicate elements because it implements list interface.
-It allows null values also.
-It supports both homogeneous elements(same type) and hetroeneous elements(diffrent 
type) elements.
-Initial capacity of ArrayList is 10. 
-Load factor of Array list is 100%.

# methods:
-add(E e) >it take elements
-add(index,element)
-addAll(collection)
-clear()  >Remove all elements
-contains(object o)  >it return bollearn(true and false)
-hashcode()  >It return hashcode
-set()   >Replace the elements


# **Diffrence between Array and ArrayList**
**Array**
-An array is a collection of similar data elements.
-It supports homogeneous elements only.
-Here size of the data is limited.

**ArrayList**
-It is a resizable array of List implementation class.
-It supports both homogeneousand hetrogeneous element.
-Here size of the data is not limited.





#**LinkedList**
-It is present in java.util package.
-It is an implementation of double linked list data structure.
-It is a linked representation of List implements List interface.
-It allows null values.
-It allows duplicate elements because it implements List Interface.
-It occupies more memory because data store in Nodes.
-Here each node contains 3 parts
	-a)Left link field
	-b)Data Field
	-c)Right link field
-Left link field contains previous node address, data field contains data and right link field 
contains next node address.

# methods:
-add(E e) >it take elements
-add(index,element)
-addFirst(e)  >This method adds the element first position.
-removeFirst()  >This method remove the first element from linkedList.


# Diffrence between ArrayList and LinkedList
**ArrayList**
1-it is an array representation of list implementation class.
2-It occupies less memory.
3-In Arraylist insertion and deletion operations require shuffling of data.
4-it is an implementation of linear list data structure.

**linkedlist**
1-It is a linked representation of list implementation class.
2-It occupies more memory.
3-In LinkedList,it does not require suffling of data.
4-It is an implementation of double linkedlist data structure.

# What is the difference between a stack and linked list?

-1. A stack strictly follows LIFO order. A linked list does not follow any order. 
It can store and retrieve data randomly.

-2. A stack is generally used for the purpose of evaluation of expressions. 
A linked list is used to store and retrieve data.

-3. Insertion and deletion of elements is possible only from the top of the stack. 
Insertion and deletion of elements from anywhere is possible in case of a linked list.




#**HashSet**
1-It is an implementation of hashing technique with array representation.
2-Hashing is a technique which allows insertion, deletion and find operations in a constant average time.
3-Hashset does not allow duplicate element because it implements Set interface.
4-Hashset allow null value.
5-Initial capacity of HashSet is 16.
6-Load factor of HashSet is 75%.
7-Here insertion order is not preserved because it is an unordered set.
8-if we pass duplicate element, it is ignored.


#Methods in HashSet
METHOD

- add(E e)	Used to add the specified element if it is not present, if it is present then return false.
- clear()	Used to remove all the elements from set.
- contains(Object o)	Used to return true if an element is present in set.
- isEmpty()	Used to check whether the set is empty or not. Returns true for empty and false 
  for a non-empty condition for set.
- remove(obj)  This method remove the element obj from the HashSet, if it is present.It 
return true if the element is removed sucessfully otherwise it return false.
- size()  it will return how many elements present on HashSet.



#**LinkedHashSet**
-



