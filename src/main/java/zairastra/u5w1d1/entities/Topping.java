package zairastra.u5w1d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Topping {
    public String name;
    public double calorie;
    public double prezzo;

    @Override
    public String toString() {
        return name + "; calorie: " + calorie + "; prezzo: " + prezzo + " €";
    }

}
