# Upskilling-Java Inheritance and Polimorphism

## Inheritance

In Java is possible inhertance the atributes and methods from one class to another. This are group in two categories:

- Subclass: The class inheritance from another.

- Superclass: The class where inheritance from .

To avoid that a class can be inheritance, the reserved word **final** is used:

```
 final class Example {
    .....
 }  
 
```

## Polimorphism

Is one of the pillars of OOP and describes the situations in something that can happend in many ways.
There are two differnt types of polimorphism:

### Estatic 
Java allows to implement multiple methods in the same class with the same name. The methods must differ in at least one of the following criteria:

- Have a different quantity of arguments.
- The Type of the arguments is different.
- The excepcted arguments are in different order (not recommended).

### Dynamic
In this way Polymorphism does not allow the compiler to determine the method that will be executed. The JVM determines the execution time.
Always in the context of Inheritance, a subclass can override a method of its parent class (superclass), allowing you to customize or replace its behavior entirely.


## Why to use Inheritance and Polimorphism?

Their principal advantage is that allows reuse the code.

## Is-A Test

Is a simple test that let us know the behaivor of the code before executed it.
We need to make this question:

Object1 IS A Class2?

**Example:**
If a class Telephone is inheritance from the class Device, we make us this question:

Object Telephone IS A Device?

In this case the answer is TRUE. 

If the object pass two tests is a polimorphism case.

Example:

```
     Cliente itzel = new Cliente("Itzel",26,"VIP","IAAG");
     
     System.out.println("Itzel Is-An Client: " + (itzel instanceof Cliente)); // its TRUE
     System.out.println("Itzel Is-An Person: " + (itzel instanceof Persona)); // its TRUE
```

Itzel is a Person? - Yes
Itzel is a Client? - Yes
