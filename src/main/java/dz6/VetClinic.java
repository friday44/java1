package dz6;

import java.util.HashSet;
import java.util.Set;

public class VetClinic {
    static Set<Cat> cats = new HashSet<>();

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.id = 001;
        cat1.nickname = "Pushok";
        cat1.color = "red";
        cat1.age = 3;

        Cat cat2 = new Cat();
        cat2.id = 001;
        cat2.nickname = "Pushok";
        cat2.color = "red";
        cat2.age = 3;

        Cat cat3 = new Cat();
        cat3.id = 003;
        cat3.nickname = "Belka";
        cat3.color = "white";
        cat3.age = 4;

        Cat cat4 = new Cat();
        cat4.id = 004;
        cat4.nickname = "Vasya";
        cat4.color = "black";
        cat4.age = 5;

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        for (var item : cats) {
            System.out.println(item);
        }

        System.out.println(cat1.equals(cat2));
        System.out.println(cats.contains(cat2));

    }
}

class Cat {
    int id;
    String nickname;
    String color;
    int age;

    @Override
    public String toString() {
        return String.format("id:%d %s %s %d", id, nickname, color, age);
    }

    @Override
    public boolean equals(Object o) {
        Cat an = (Cat) o;
        return id == an.id && nickname == an.nickname && color == an.color && age == an.age;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
