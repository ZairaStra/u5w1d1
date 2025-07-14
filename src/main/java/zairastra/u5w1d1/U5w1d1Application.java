package zairastra.u5w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zairastra.u5w1d1.entities.Menu;

@SpringBootApplication
public class U5w1d1Application {
    //avrei voluto implementare lo scanner per la scelta delle pizze e degli ingredienti extra, ma non ho fatto in tempo

    public static void main(String[] args) {
        SpringApplication.run(U5w1d1Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5w1d1Application.class);

        Menu m1 = context.getBean(Menu.class);

        m1.printMenu();

        m1.printToppings();
    }

}
