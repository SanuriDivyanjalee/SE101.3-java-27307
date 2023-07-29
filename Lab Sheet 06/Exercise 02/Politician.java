
package com.mycompany.practical5_2;
public class Politician implements Speaker {
    @Override
    public void speak(String phrase)
    {
        System.out.println("Politician:"+phrase);    
    }
}
