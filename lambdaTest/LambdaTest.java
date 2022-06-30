package com.company.lambdaTest;


public class LambdaTest {
    public static void main(String[] args) {
        SayHiLambda hiTurkish = (String who) -> System.out.println(who);
        hiTurkish.salute("Selam Türkçe !"); //çalıştırma

        SayHiLambda hiEnglish = (String who) -> System.out.println(who);
        hiEnglish.salute("Hi English !");

        SayHiLambda hiGerman = (String who) -> System.out.println(who);
        hiGerman.salute("Hallo Deutsch !");
        
    }
}

@FunctionalInterface
interface SayHiLambda {
    void salute(String who);
}