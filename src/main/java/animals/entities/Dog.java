package animals.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Адель";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
