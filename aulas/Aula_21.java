package aulas;

import java.util.Scanner;

public class Aula_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um ano:");
        int ano = input.nextInt();

        boolean x = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);

        System.out.println(x);

    }
}