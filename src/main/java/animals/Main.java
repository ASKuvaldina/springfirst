package animals;

import animals.entities.Cat;
import animals.entities.Dog;
import animals.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("animals");
        //создаем объект контекста, и в конструкторе указываем ему имя пакета, которое надо сканировать на наличие в нем бинов. Cпринг пройдется по этому пакету и попробует найти такие классы, которые отмечены специальными аннотациями, дающими спрингу понять, что это — бин. После чего он создает объекты этих классов и помещает их себе в контекст.

        Cat cat = context.getBean(Cat.class); //Обращаясь к объекту контекста — мы просим его дать нам бин (объект), и указываем, какого класса объект нам нужен (можно указывать не только классы, но и интерфейсы). После чего нам спринг возвращает объект этого класса, который мы уже и сохраняем в переменную.
        Dog dog = (Dog) context.getBean("dog");
        //просим спринг достать нам бин, который называется "dog". Когда спринг будет создавать объект класса Dog — то он даст ему стандартное имя (если явно не указано имя создаваемого бина), которое является названием класса объекта, только с маленькой буквы. Поэтому, поскольку класс у нас называется Dog, то имя такого бина будет "dog".
        //у джавы нет точной уверенности какого именно класса будет такой объект — то возвращается просто некий Object, который мы уже потом ручками кастим к нужному нам типу Dog. Вариант с явным указанием класса удобнее.
        Parrot parrot = context.getBean("parrot-Vovka", Parrot.class);
        //может быть такая ситуация, что в контексте окажется несколько бинов какого-то одного класса, и для того, чтобы указать какой именно бин нам нужен — указываем его имя. Поскольку мы тут тоже явно указали класс — то и кастить нам уже не приходится.
        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
