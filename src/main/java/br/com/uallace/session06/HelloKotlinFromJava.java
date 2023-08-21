package br.com.uallace.session06;

import br.com.uallace.session05.Generics.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {

        Person rob =  new Person("Robert","Martin");

        System.out.println("His name is " + rob.getFirstName());

        rob.setFirstName("Uncle Bob");

        System.out.println("His name is now " + rob.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2023);
        System.out.println("The max value is " + maxInt);


    }

}
