package Week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void runProgram() {

        System.out.println("Program starting");
        oppgave4();

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
}
