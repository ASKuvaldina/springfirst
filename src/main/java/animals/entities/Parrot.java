package animals.entities;

import org.springframework.stereotype.Component;

@Component("parrot-Vovka")
//Если нам надо явно указать спрингу что бин для этого класса должен иметь какое-то определенное имя — это имя можно указать в скобках после аннотации.
public class Parrot {
    private String name = "Вовка";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
