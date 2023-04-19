package composite;

public class Card {

    private Content menu;

    public void setMenu (Content menu) {
        this.menu = menu;
    }

    public String getMenu() {
        if (this.menu == null) {
            throw new NullPointerException("Card without menu");
        }
        return this.menu.getContent();
    }
}
