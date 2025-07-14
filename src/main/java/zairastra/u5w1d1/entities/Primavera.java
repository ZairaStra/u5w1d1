package zairastra.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Primavera extends Pizza {
    public String rucola;
    public String grana;

    public Primavera(String mozzarella, String pomodoro, double calorieBase, List<Topping> extraTopping, double prezzoBase, String rucola, String grana) {
        super(mozzarella, pomodoro, calorieBase, prezzoBase, extraTopping);
        this.rucola = rucola;
        this.grana = grana;
    }

    @Override
    public String toString() {
        return "Primavera: " + pomodoro + ", " + mozzarella + ", " + rucola + ", " + grana + "; calorie: " + calorieBase + "; prezzo: " + prezzoBase + " €";
    }

}
