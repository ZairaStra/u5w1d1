package zairastra.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Diavola extends Pizza {
    public String salame;

    public Diavola(String mozzarella, String pomodoro, double calorieBase, double prezzoBase, List<Topping> extraTopping, String salame) {
        super(mozzarella, pomodoro, calorieBase, prezzoBase, extraTopping);
        this.salame = salame;
    }

    @Override
    public String toString() {
        return "Diavola: " + pomodoro + ", " + mozzarella + ", " + salame + "; calorie: " + calorieBase + "; prezzo: " + prezzoBase + " €";
    }
}
