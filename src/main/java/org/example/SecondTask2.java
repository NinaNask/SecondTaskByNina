package org.example;

public class SecondTask2 implements SecondTask, SecondTask1  {
    @Override
     public void replaceSymbolA(String string1) {
        System.out.println(string1.replace('a','z'));
    }

     public void replaceSymbolB(String string2){
         System.out.println(string2.replace('b','w'));

    }

}
