package zairastra.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString

public abstract class Pizza {
    protected String mozzarella;
    protected String pomodoro;
    protected double calorie;
    protected double prezzo;
    protected List<Topping> extraTopping = new ArrayList<>();

    public void addTopping(Topping topping) {
        extraTopping.add(topping);
        this.calorie += topping.getCalorie();
        this.prezzo += topping.getPrezzo();
        System.out.println("Gli ingredienti aggiunti sono: " + extraTopping + ", il conteggio delle calorie aggiornato è: " + this.calorie + ", il prezzo aggiornato è: " + this.prezzo);
    }
}
