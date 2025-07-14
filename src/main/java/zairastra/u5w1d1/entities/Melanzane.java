package zairastra.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Melanzane extends Pizza {

    public String melanzane;
    public String parmigiano;

    public Melanzane(String mozzarella, String pomodoro, double calorieBase, double prezzoBase, List<Topping> extraTopping, String melanzane, String parmigiano) {
        super(mozzarella, pomodoro, calorieBase, prezzoBase, extraTopping);
        this.melanzane = melanzane;
        this.parmigiano = parmigiano;
    }

    @Override
    public String toString() {
        return "Melanzane: " + pomodoro + ", " + mozzarella + ", " + parmigiano + ", " + melanzane + "; calorie: " + calorieBase + "; prezzo: " + prezzoBase + " €";
    }

}