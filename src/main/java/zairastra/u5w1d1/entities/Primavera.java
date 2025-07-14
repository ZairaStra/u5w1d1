package zairastra.u5w1d1.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Primavera extends Pizza {
    public String rucola;
    public String grana;

    public Primavera(String mozzarella, String pomodoro, double calorie, List<Topping> extraTopping, double prezzo, String rucola, String grana) {
        super(mozzarella, pomodoro, calorie, prezzo, extraTopping);
        this.rucola = rucola;
        this.grana = grana;
    }

    @Override
    public String toString() {
        return "Primavera{" +
                "rucola='" + rucola + '\'' +
                ", grana='" + grana + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                ", pomodoro='" + pomodoro + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
