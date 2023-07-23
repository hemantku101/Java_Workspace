# Steps to develop multithreaded application by extending java.lang.Thread class.

- i) Create a class that extends java.lang.Thread class.
- ii) override run() method.
- iii) write child thread task code in a run () method.
- iv) write main() method.
-  v) create an object of current class.
- vi) call start() method.
- vii)write main thread task code in a main() method()

# Ex:
- class Demo extends Thread
- {
-  public void run(){
- 	========  ->child thread
-   ========	->child thread task code
- }
- public static void main(String args){
	- Demo d= new Demo();
	- d.start();  -> implicitly super() is available
	- ===========  ->main thread task code
	- ===========  -> main thread
	- }
	- }
-
-
