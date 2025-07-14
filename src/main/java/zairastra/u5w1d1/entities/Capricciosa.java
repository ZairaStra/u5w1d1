package zairastra.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Capricciosa extends Pizza {
    public String prosciutto;
    public String carciofini;
    public String funghi;
    public String olive;


    public Capricciosa(String mozzarella, String pomodoro, double calorieBase, double prezzoBase, List<Topping> extraTopping, String prosciutto, String carciofini, String funghi, String olive) {
        super(mozzarella, pomodoro, calorieBase, prezzoBase, extraTopping);
        this.prosciutto = prosciutto;
        this.carciofini = carciofini;
        this.funghi = funghi;
        this.olive = olive;
    }

    @Override
    public String toString() {
        return "Capricciosa: " + pomodoro + ", " + mozzarella + ", " + prosciutto + ", " + carciofini + ", " + funghi + ", " + olive + "; calorie: " + calorieBase + "; prezzo: " + prezzoBase + " €";
    }
}
