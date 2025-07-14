package zairastra.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Melanzane extends Pizza {

    public String melanzane;
    public String parmigiano;

    public Melanzane(String mozzarella, String pomodoro, double calorie, double prezzo, List<Topping> extraTopping, String melanzane, String parmigiano) {
        super(mozzarella, pomodoro, calorie, prezzo, extraTopping);
        this.melanzane = melanzane;
        this.parmigiano = parmigiano;
    }

    @Override
    public String toString() {
        return "Melanzane{" +
                "melanzane='" + melanzane + '\'' +
                ", parmigiano='" + parmigiano + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                ", pomodoro='" + pomodoro + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}