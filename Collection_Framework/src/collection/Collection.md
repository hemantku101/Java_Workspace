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
-1-It is an implementation of hashing technique with linked represenation.
2-LinkedHashSet does not allow duplicate elements because it implements set interface.
3-linkedHashset is allow null value.
4-LinkedHashSet occupie more memory because data stored in nodes.
5-In LinkedHashSet insertation order is preserved because it is an ordered set.
6-Initial capacity is 16.
7-Load factor is 75%

#**TreeSet**
-1-It is an implementation of binary search tree technique with linked representation.
2-**Binary Search tree**
A binary tree is said to be binary search tree if it is followiing rules:-
1-if the element is less then root element then it must be in left sub tree.
2-If the element is greater than root element then it must be in right sub tree.
-
-
--TreeSet does not allow duplicate elements because it implements set interface.
--TreeSet does not allow null value.
--Here all elements are shorted because it is a sorted set.
--It occupies more memory because data store in nodes.

# Diiffrence between HashSet, LinkedhashSet, TreeSet

**HashSet**
1-It is an implementation of hashing trchnique with array representation.
2-It occupie less memory.
3-It is an UnorderedSet.
4-It allow null value.

**LinkedHashSet**
1-It is an implementation of hashing technique with linked representation.
2-It occupies more memory because data stored in nodes.
3-It is an ordered set.
4-It allows null value.

**TreeSet**
1-It is an Implementation of binary search tree technique with linked representation.
2-It occupies more memory because data stored in nodes.
3-It is a shorted set.
4-It does not allow null value.

# HashMap<K,V>

1-It is a two dimensional collection class and it maintains key and value pairs.
2-It is an implementation of hashing technique with array representation.
3-It does not allows duplicate keys.(values may be duplicate).
4-It allows one null key and many null values.
5-It occupies more memory because data store in nodes.
6-Here each node contain 4 parts.
	i)key
	ii)hashcode
	iii)value
	iv)next node address
7-It is an unordered map.
8-Here insertion order is not preserved.
9-Initial capacityof hashmap is 16.
10-Load factor is 75% .
 
# LinkedHashMap

1-It is a two dimensional collection class and it maintains data as a key and values pairs.
2-It is an implementataion of hashing technique with linked representation.
3-It occupies more memory because data store in nodes.
4-It does not allow duplicate keys (values may be duplicates).
5-It allow one null key and many null values.
6-It is an ordered map.
7-Here insertion order is preserved.
8-Initial capacity of LinkedHashMap is 16.
9-It occupies more memory because data store in nodes.
10-Here each node contain 6 parts.

# TreeMap
1-It is a two dimensional collection class and it maintains data as key and value pairs.
2-It is implementation of binary search tree technique with linked representation.
3-It occupies more memory because data stored in nodes.
4-It does not allow duplicate keys(values may be duplicate).
5-It does not allow null key.
6-It allows null values.
7-It is a sorted map.
8-Here insertion order is not preserved.

# Differences between HashMap, LinkedHashMap, TreeMap

**HashMap**

-1-It is an implementation of hashing technique with array representation.
2-It occupies less memory.
3-It is an unordered map.
4-It allows one null key and many null values.

**LinkedHashMap**

1-It implementation of hashing technique with linked representation.
2-It occupie more memory because data stored in nodes.
3-It is an ordered map.
4-It allows one null key and many null values.

**TreeMap**
1-It is an implementation binary search tree technique with linked representation.
2-It occupies more memory because data stored in nodes.
3-It is a sorted map.
4-It is does not allow null key and allows null values.


# Diffrence between HashSet,LinkedHashSet,TreeSet and HashMap,LinkedHashMap,TreeMap

**HashSet,LinkedHashSet,TreeMap**
1-These are one dimensional collection class.
2-These collections contains elements.
3-These are index based collection.
4-These collections donot allow duplicate elements.

**HashMap,LinkedHashMap,TreeMap**
1-These are two dimensional collection classes.
2-These collections contain key and value pairs.
3-These are key based collections.
4-These collections do not allow duplicate keys.

# Vector

1-Vector organizes elements in sequence and which is synchronized class.
2-vector is a Legacy class in collection Framework and which has no replacement.
3-vector is an array representation of list implementation class.
4-It similar to ArrayList class.

# PriorityQueue
1-A PriprityQueue is a queue in which elements are inserted at rear end and delected at front end.
2-In a priorityQueue ,last element is a high priority.
3-Here priorities are compared by using java.util.Comparator Interface.
4-It allows duplicate elements.
5-It does not allow null values.
6-Initial capacity of PriorityQueue is 11.
7-Load factor of PriorityQueue is 100%.
8-Internally it uses heap tree dataStructure.
9-A heap tree is a tree in which each node grater then its child nodes.
10-Here, offer()method used to insert an element and pull()method used to delete an element.

# ArrayDeque
1-It is an implementation of double ended queue data structure with array representation.
2-It allows both inserion and delection at both the ends(rear end and front end) because it implements Deque interface.
3-It allows duplicate elements.
4-It does not allow null values.
5-initial capacity of ArrayDeque is 16.   
7-Load factor of Arraydeque is 100%.
8-Here insertion order is preserved.

# Differences between Queue and Deque:-
 **Queue**
 1-It is an implementation of queue data structure.
 2-It is a first in first out list(fifo).
 3-It allow insertion at rear end only.
 4-It allow deletion at front end.
 **Deque**
 1-It is an implementation of deque data structure.
 2-It is not a first in first out list.
 3-It allow insertion at both the ends.
 4-It allows deletion at both the ends. 
