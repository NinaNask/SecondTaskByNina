package org.example;


public class Main {

    public static void main (String[] args) {

        //ობიექტი countVowel მეთოდისთვის
        FirstTaskClass2 object1 = new FirstTaskClass2();
        object1.countVowel();

        //ობიექტი რომ მივწვდეთ სიმბოლოების შეცვლის მეთოდებს
        SecondTask2 object2 = new SecondTask2();
        //მეთოდები რომეელიც არგუმენტად ელოდება სტრინგს და დაბეჭდავს შეცვლილ სიმბოლოებს
        object2.replaceSymbolA("nina");
        object2.replaceSymbolB("ninab");


        //მასივი დავალებაში მოცემული სიტყვითი მნიშვნელობებით
        int[] numbers  = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        //პირველი ციკლი რომ გადაუაროს მთელ მასივს, პირველი რიცხვით დაიწყებს
        for (int i = 0; i < numbers.length ;i ++){
            //მეორე რეცხვიდან გადაუვლის მასივს
            for (int j=i+1; j<numbers.length; j++){
                //შეადარებს პირველი მასივიდან i და მეორედან j მნიშვნელობებს
                if (numbers[i]>numbers[j]){
                    //თუ i მეტია j ზე, შემოვიტანე ინტ ტიპის ცვლადი n, აქ შეიანხავს iს ანუ უფრო დიდ რიცხვს, მერე iში შეინახავს jს, და Jში ისევ iს, ანუ ადგილებს გაუცვლის ამ ორს
                    int n = numbers[i] ;
                    numbers[i] = numbers[j];
                    numbers[j]= n;

                }
            }

        }
        System.out.print("მასივში არსებული ელემენტები ზრდადობით: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


    }


}