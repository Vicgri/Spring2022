package Week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void runProgram() {

        System.out.println("Program starting");
        // oppgave4();
        //oppgave6();
        oppgave7();

    }

    private void oppgave4() {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn tre ord");
        list.add(input.next());
        list.add(input.next());
        list.add(input.next());
        System.out.println("Du skrev inn: ");

        for (String s:
            list) {
            System.out.println(s);
        }

    }


    private void oppgave6() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Skriv inn et par tall. Avslutt med negative -tall");

        while (number>=0) {
            number = input.nextInt();
            if(number>=0) {
                numbers.add(number);
            }
        }

        int sum = 0;
        for (Integer i :
            numbers) {
            sum+=i;
        }
        System.out.println("Sum:"+sum);

    }

    private void oppgave7() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (choice!=3) {
            System.out.println("1. Add single word");
            System.out.println("2. Display all words");
            System.out.println("End");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Write word:");
                strings.add(input.next());
            } else if (choice == 2) {
                System.out.println("Here are all the words:");
                    for (String s :
                        strings) {
                        System.out.println(s);
                    }
            } else {
                System.out.println("BYE!");
            }
        }
    }
}
