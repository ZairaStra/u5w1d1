package zairastra.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Menu {
    public List<Pizza> pizze;
    public List<Topping> toppings;

    // aggiungo il numero per poter ordinare da scanner
    public void printMenu() {
        System.out.println("Benvenuto nella nostra pizzeria! Cosa vuoi ordinare?");
        for (int i = 0; i < pizze.size(); i++) {
            Pizza p = pizze.get(i);
            System.out.println((i + 1) + ". " + p.toString());
        }
    }

    public void printToppings() {
        System.out.println("Ingredienti extra:");
        for (int i = 0; i < toppings.size(); i++) {
            Topping t = toppings.get(i);
            System.out.println((i + 1) + ". " + t.toString());
        }
    }

}
