package entities;

import java.sql.SQLOutput;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover() {
        if (beer * 5 + barbecue * 7 + softDrink * 3 < 30) {
            return 4.00;
        } else {
            return 0;
        }
    }

    public double feeding() {

        return beer * 5 + barbecue * 7 + softDrink * 3;
    }

    public double ticket() {
        if (gender == 'M') {
            return 10.0;
        } else {
            return 8.0;
        }
    }

    public double total() {
        return ticket() + cover() + feeding();
    }

    @Override
    public String toString() {
        return "Consumo =  R$" + String.format("%.2f\n", feeding())
                + "Couvert = R$" + String.format("%.2f\n", cover())
                + "Ingresso = R$" + String.format("%.2f\n", ticket())
                + "Valor Total = R$" + String.format("%.2f\n", total());
    }
}
