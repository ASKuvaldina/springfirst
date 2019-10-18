package animals.entities;

import org.springframework.stereotype.Component;

@Component
//спринг сканирует классы — он ищет "свои" спринговые аннотации там.
public class Cat {
    private String name = "Мишель";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
