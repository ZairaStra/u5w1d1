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


    public Capricciosa(String mozzarella, String pomodoro, double calorie, double prezzo, List<Topping> extraTopping, String prosciutto, String carciofini, String funghi, String olive) {
        super(mozzarella, pomodoro, calorie, prezzo, extraTopping);
        this.prosciutto = prosciutto;
        this.carciofini = carciofini;
        this.funghi = funghi;
        this.olive = olive;
    }

    @Override
    public String toString() {
        return "Capricciosa{" +
                "prosciutto='" + prosciutto + '\'' +
                ", carciofini='" + carciofini + '\'' +
                ", funghi='" + funghi + '\'' +
                ", olive='" + olive + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                ", pomodoro='" + pomodoro + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
