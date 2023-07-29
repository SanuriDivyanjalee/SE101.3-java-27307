
package com.mycompany.practical5_2;

public class Practical5_2 {

    public static void main(String[] args) {
       Speaker speaker1=new Priest();
       speaker1.speak("Bless you!");
        Speaker speaker2=new Politician();
       speaker2.speak("Vote me");
        Speaker speaker3=new Lecturer();
       speaker3.speak("Learn java");
/*Output :
Priest:Bless you!
Politician:Vote me
Lecturer:Learn java
*/
    }
}
