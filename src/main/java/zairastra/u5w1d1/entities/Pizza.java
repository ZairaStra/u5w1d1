package zairastra.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public abstract class Pizza {

    protected String mozzarella;
    protected String pomodoro;
    protected double calorieBase;
    protected double prezzoBase;
    protected List<Topping> extraTopping = new ArrayList<>();

    @Override
    public String toString() {
        return "Margherita: " + mozzarella + ", " + pomodoro + "; calorie: " + calorieBase + "; prezzo: " + prezzoBase + " €";
    }

    public void addTopping(Topping topping) {
        extraTopping.add(topping);
        System.out.println("Hai aggiunto l'ingrediente: " + topping.getName());
    }

    public double getTotalPrice() {
        return prezzoBase + extraTopping.stream().mapToDouble(Topping::getPrezzo).sum();
    }

    public double getTotalCalories() {
        return calorieBase + extraTopping.stream().mapToDouble(Topping::getCalorie).sum();
    }
}
