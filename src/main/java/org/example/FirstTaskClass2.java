package org.example;

import com.sun.source.util.SourcePositions;

public class FirstTaskClass2  extends FirstTaskClass{
    public void countVowel (){
        //string ტიპის ცვლადი
        String string1 = "This is what you get when you mess with us";
        //დასათვლელად შემოვიტანე ინტ ტიპის ცვლადი
        int count = 0;
        //ციკლი რომელსაც დაატრიალებს სტრინგის სიგრძის მიხედვით
        for (int i=0; i<string1.length(); i++){
            char c = string1.charAt(i);
            //თუ C ცვლადი ანუ იმ მომენტში ასო, დაემთხვევა ჩამოთვლილ ხმოვნებს, თვლას დაამატებს 1ს
                if(c == 'a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U' ) {

                    count++;
        }
        }
        System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");



    }
}





