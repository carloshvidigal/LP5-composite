package composite;

import java.util.ArrayList;
import java.util.List;

public class Dish extends Content{

    private List<Content> contents;

    public Dish(String description) {
        super(description);
        this.contents = new ArrayList<Content>();
    }

    public void addContent(Content content) {
        this.contents.add(content);
    }

    public String getContent() {
        String str = "";
        str = "Dish: " + this.getDescription() + "\n";
        for (Content content : contents) {
            str += content.getContent();
        }
        return str;
    }
}
