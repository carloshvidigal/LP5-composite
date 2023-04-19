package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CardTest {

    @Test
    void shouldReturnMenuOfTheDay() {
        Dish dish1 = new Dish("Salada Brasil");

        Dish dish2 = new Dish("Cortes de Frango do chef");
        Ingredient ingredient21 = new Ingredient("Peito de frango", 12.0f);
        dish2.addContent(ingredient21);

        Dish dish3 = new Dish("Macarrão Vasco da Gama");
        Ingredient ingredient31 = new Ingredient("Gravatinha", 7.50f);
        Ingredient ingredient32 = new Ingredient("Gorgonzola", 14.0f);
        dish3.addContent(ingredient31);
        dish3.addContent(ingredient32);

        Dish menuOfTheDay = new Dish("Menu do dia");
        menuOfTheDay.addContent(dish1);
        menuOfTheDay.addContent(dish2);
        menuOfTheDay.addContent(dish3);

        Card card = new Card();
        card.setMenu(menuOfTheDay);

        assertEquals("Dish: Menu do dia\n" +
                "Dish: Salada Brasil\n" +
                "Dish: Cortes de Frango do chef\n" +
                "Ingredient: Peito de frango - value: 12.0\n" +
                "Dish: Macarrão Vasco da Gama\n" +
                "Ingredient: Gravatinha - value: 7.5\n" +
                "Ingredient: Gorgonzola - value: 14.0\n", card.getMenu());
    }

    @Test
    void shouldReturnExceptionCardWithoutMenu() {
        try  {
            Card card = new Card();
            card.getMenu();
            fail();
        }
        catch (NullPointerException e)   {
            assertEquals("Card without menu", e.getMessage());
        }
    }

}
