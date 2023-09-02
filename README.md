Java Object-Oriented-PROGRAMMING
OOPs is the process of creating code with classes as well as the object.
### class/object 
: assume we have to create a car -> structure is the class which also has the properties.

class should always be there for constructing the object. we can create any number of object with one class.
class is the logical 
Entities 
Properties
  
new keyword : is used to create the memory of the object is allocated dynamically.

### constructor :
constructor is the special type of function, they are used to inititalize the data of the object.
It automatically gets calls whenever we create constructor
Properties : 
- Class name should be same as constructor
- Constructor does not return any value not even void . No return data type
- There are 2 types of constructor parameterized and non-parameterized : parameterized has any number of parameter whereas no parameter is non-one.

### Defualt constructor: 
If class does not have any constructor java creates one default constructor.

### Overloading in Constructor:
If we are making consturctor with different parameter with same name then it is overloading constructor.

Method Overloading:
If we are making similar method which already exists with different parameter or differnt return datatype.

Method Overriding:
If we are making similar method which already exits with same signature. Then it is method overriding can change the implementation of the function or constructor according to the usecase.(they can redine the function).
We can even put return data type of parent as "classname" of that and in that case we can ever change the return data type of the child too , to it's classname.

## What is signature?
- same return data type
- same name of the function
- same number and same data type of the parameter

### this keyword: 
They must be written in first line of the constructor.
Refers to current invoking object.
**this()** -> calling for current class constructor from inside fifernt constructor of same class.
It is use for referring the object in more lame language.
this considers it as a object and now consider -> as the function call and it'll make the object there.
current object's variable , whenever parent has the same name as the provided in argument.
This is very helpful for jumping from one constructor to another.

## Inheritance:
It is the mechanism in java by which one class is allowed to inherit the features of another class.
In java inheritance happens from "extends"
class name extends superclass/baseclass/parentClass:
Inheritance can only happen from parent to subclass/derivedclass/child not other way around.

### Types of inheritance:
Single inheritance : single parent and child
- MultiLevel inheritance: more generation of Single.
- Hierarical : one parent and more child
- Multiple Inheritance:one child more parents. It is not done with classes in java but it can be done with  use of interfaces.
- Hybrid Inheirtance: both hierarical and as well as the multiple inheritance simultaneously.
- Cyclic Inheritance: child is being his own parent. Or there should not be any loops between the relationship in them.

### super Keyword:
super keyword regers to immediate parent.
``` super() ``` we are calling parent class's consturctor.
They must be written in first line of the constructor.
it is helpful for calling the parent class. Or it's properties.
difference between super and this:
If we want to access the properties of parent which child class also has in the same name then use super.methodname/variable
whereas this keyword will only work for that class only as it is current invoking object.

## Encapsulation:
Wrapping of data memebers(variable) and member methos(method in a single unit).
They are use for security purpose as well as the data hiding. Usually we should provide private data access to the variables and have getters and setters applied to it.

## Abstraction:
showing features and hiding internal detail or implementation.
eg. CPU is on computer we know whenever we'll switch on/off it will turn on/off  we know the feature but not working.
We know what not how!
100% abstraction we can get using interfaces
or ever we can use abstract classes.
-> abstract method: which are not concrete methods or the methods which does not have body it's just have a declaration,
eg. public void call(); -> no body so it's a abstract(incomplete) method.
to make it abstarct :
 abstract public void call();
to make a method abstract we must use :
```
abstract public class className{
...
}
```
now you can never instantiate abstract class.
or you can never create object of abstract class.
Then how we'll use it?
-> child of that class will do the work..
if there is any abstract method in the abstract class then it's body must be given by the child.
Here we while making the object we can even refer to the parent class and make to the child class eg.

``` Parentclass name = new Childclassname; ```

## what is concreate method: - a method which has both declaration as well as the body.

## Interfaces:
public interface classname{};
in interfaces varibles are automatically attached with the,
public static final int a = 2;
even though we'll not apply it will be there
If we'll create any method ultimately it'll become public abstract

to make interface as the parent then we have to apply  instead of extends "implements".
and it'll provide it's body and can normal use. 

# Interface vs Abstract
1. Abstract class can have abstract and non-abstract methods.
Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2. Abstract class doesn't support multiple inheritance.
Interface supports multiple inheritance.
3. Abstract class can have final, non-final, static and non-static variables.
Interface has only static and final variables.
4. Abstract class can provide the implementation of interface.
Interface can't provide the implementation of abstract class.
5. The abstract keyword is used to declare abstract class.
The interface keyword is used to declare interface.
6. An abstract class can extend another Java class and implement multiple Java interfaces.
An interface can extend another Java interface only.
7. An abstract class can be extended using keyword "extends".
An interface can be implemented using keyword "implements".
8. A Java abstract class can have class members like private, protected, etc.
Members of a Java interface are public by default.
9. Example:
```
public abstract class Shape{
public abstract void draw();
}	
Example:
public interface Drawable{
void draw();
}
```

## Polymorphism : 
Overloading and overriding
which means many forms, 
Overloading -> Compile time , Static binding
Overriding -> Runtime , Dynamic Binding

## Multi-threading:
Multithreading in java is a process of executing multiple threads simultaneously.
A thread is a lightweight sub-process, the smalles unit of processing.
Main thread is default thread.
OS leve is the multi processing, whereas in a single process there can be n threads. That is call mult-threading

# How to create Thread in java?
Using Runnable -> it is a interface which has a run() method.
Using thread class -> it is already given by java.
1 way is make a class and implement Runnab;e interface and override run method.
2 And or we can extend thread class and write the class/Override the run method.
e.g.

1. 
```
class Mythread implements Runnable
{
      public void run()
{
...
}
psvm
Mythread t = new Mythread();
Thread thread = new Thread(t); // extra line..
thread.start();
}
```
2. 
```
class Mythread extends Thread
{
    public void run()
{}
psvm
Mythread t = new Mythread();
t.start();
}
```
# Life Cycle:
1. Thread will start from the "new " creation of the object, then as soon as we start() the thread it gets into the runnabe.
2. After getting into the runnable it will check the "running state" whether it is empty or not if it is then thread from runnable -> running.
3. But if, running state thread is been used for function such as .. sleep() , i/o , wait or suspend then it will go into the blocked state and other runnabe will run.
4. If we'll call the stop it'll get termintated or aftering completing it's process it'll get termintated.

Daemon Thread:
Daemon thread in java is a service provider thread that provides service to the user thread. There whole life cycle is dependent on another thread.
Garbage collector is best example of DAEMON thread.
we can make any thread as DAEMON THREAD BY JUST CALLING .. setDaemon(Boolean)
to check whether the thread is daemon or not we can go into run and check by 
``` public Boolean isDaemon() ```

Synchronized, Inter-thread communication;
Consider 1 producer and 1 consumer and producer can only produce 1 thread at a time/ process. Now we have to make a thread which only consumes after producer has produced exactly 1 process.. Is called producer consumer problem/ synchronized thread.
Synchronized will make the thread in such a way until those threads are terminated no thread can participate.