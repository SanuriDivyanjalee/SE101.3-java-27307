

package com.mycompany.animalmain;


public class Animalmain {

    public static void main(String[] args) {
             Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
      /* ouput of this code is :
   true
   true
   true */

/*Explanation:
The instanceof operator is a binary operator which takes two operands: an object and a class.It  returns true only if the object is an instance of the class.
In the first line m instanceof Animal ,it checks if the object of type Mammal is an instance of class Animal. Since Mammal is a subclass of Animal, any object of type Mammal is also an instance of the class Animal.Therefore the output is true.
In the second line d instanceof Mammal ,it checks if the object of type Dog is an instance of class Mammal. Since Dog is a subclass of Mammal, any object of type Dog is also an instance of the class Mammal.Therefore the output is true.
In the third line d instanceof Animal ,it checks if the object of type Dog is an instance of class Animal. Since Dog is a subclass of Mammal and Mammal is a subclass of Animal, any object of type Dog is also an instance of the class Animal.Therefore the output is true.
      */

    }
}
