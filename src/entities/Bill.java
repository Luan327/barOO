package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbercue;
    public int softDrink;

    public double cover(){
        if(beer + barbercue + softDrink < 30){
            return 4.00;
        }else{
            return 0;
        }
    }

    public double feeding(){
        return beer + barbercue + softDrink;
    }

    public double ticket(){
        if(gender == 'M'){
            return 10.0;
        }else{
            return 8.0;
        }
    }

    public double total(){
        return ticket() + cover() + feeding();
    }
}
