package zairastra.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Diavola extends Pizza {
    public String salame;

    public Diavola(String mozzarella, String pomodoro, double calorie, double prezzo, List<Topping> extraTopping, String salame) {
        super(mozzarella, pomodoro, calorie, prezzo, extraTopping);
        this.salame = salame;
    }
}
