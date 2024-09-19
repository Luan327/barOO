import entities.Bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().toUpperCase().charAt(0);
        while (bill.gender != 'M' && bill.gender != 'F') {
            System.out.print("Sexo incorreto, Digite (F/M): ");
            bill.gender = sc.next().toUpperCase().charAt(0);
        }
        System.out.print("Quantidade de cerveja: ");
        bill.beer = sc. nextInt();

        System.out.print("Quantidade de refrigerante: ");
        bill.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinho: ");
        bill.barbecue = sc.nextInt();

        System.out.println("\nRELATÓRIO: ");
        System.out.println(bill);

    }
}