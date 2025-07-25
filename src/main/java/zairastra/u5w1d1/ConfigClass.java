package zairastra.u5w1d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zairastra.u5w1d1.entities.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {
    @Bean
    public Topping prosciutto() {
        return new Topping("prosciutto", 130, 2.5);
    }

    @Bean
    public Topping bufala() {
        return new Topping("bufala", 150, 3);
    }

    @Bean
    public Topping basilico() {
        return new Topping("basilico", 10, 0.5);
    }

    @Bean
    public Topping acciughe() {
        return new Topping("acciughe", 87, 3);
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("mozzarella", "pomodoro", 700, 6, new ArrayList<>()) {
        };
    }

    @Bean
    public Capricciosa capricciosa() {
        return new Capricciosa("mozzarella", "pomodoro", 1050, 8, new ArrayList<>(), "prosciutto", "carciofini", "funghi", "olive");
    }

    @Bean
    public Diavola diavola() {
        return new Diavola("mozzarella", "pomodoro", 950, 6.5, new ArrayList<>(), "salame") {
        };
    }

    @Bean
    public Primavera primavera() {
        return new Primavera("mozzarella", "pomodoro", 700, new ArrayList<>(), 7.5, "rucola", "grana") {
        };
    }

    @Bean
    public Melanzane melanzane() {
        return new Melanzane("mozzarella", "pomodoro", 850, 7.5, new ArrayList<>(), "melanzane", "parmigiano") {
        };
    }

    @Bean
    public Pizza margheritissima() {
        Pizza pizza = new Pizza("mozzarella", "pomodoro", 700, 6, new ArrayList<>()) {
        };
        pizza.addTopping(bufala());
        pizza.addTopping(basilico());
        pizza.getTotalCalories();
        pizza.getTotalPrice();
        return pizza;
    }


//    @Bean
//    public Menu menu() {
//        List<Pizza> pizze = List.of(margherita(), capricciosa(), diavola(), primavera(), melanzane());
//
//        List<Topping> toppings = List.of(prosciutto(), bufala(), basilico(), acciughe());
//        return new Menu(pizze, toppings);
//    }

    @Bean
    public Menu menu() {
        //non funziona nemmeno se la aggiungo a mano alla lista, ovviamente
        //perchè il toString è sempre quello
        List<Pizza> pizze = new ArrayList<>(List.of(margherita(), capricciosa(), diavola(), primavera(), melanzane(), margheritissima()));
        //nel sout usa il toString di Margherita, che non si adatta alle aggiunte:
        //non cambia il nome né la somma di prezzo e calorie
        //però aggiunge alla lista
//        pizze.add(margheritissima());
        List<Topping> toppings = List.of(prosciutto(), bufala(), basilico(), acciughe());
        return new Menu(pizze, toppings);
    }

}
