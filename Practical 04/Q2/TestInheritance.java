

package com.mycompany.testinheritance;

public class TestInheritance {

    public static void main(String[] args) {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 
        /*ouptut when we run this code is :
        9
        6
Explanation:The first line of output is the result of calling the triple() method on the object of type SuperB.
 The triple() method in the SuperB class multiplies the value of x by 3, so the value of x will be 9.
The second line of output is the result of calling the triple() method on the object of type SubC.
Since the triple() method in the SubC class has overridden the triple() method in the SuperB class,
the triple() method in the SubC class adds 3 to the value of x, so the value of x will be 6 after the triple() method is called.
        */
}

    }
