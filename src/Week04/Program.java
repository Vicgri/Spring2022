package Week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void runProgram() {

        System.out.println("Program starting");
        // oppgave4();
        oppgave6();

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
}
