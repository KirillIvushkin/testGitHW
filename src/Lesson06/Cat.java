package Lesson06;
import models.Animal;

public class Cat extends Animal {

    private String catName =  "Кошка";
    private static int catMaxRunDistance = 200;
    private static int catMaxSwimDistance = 0;

    private static int catsCount = 0;


    public Cat(String nickname) {
        super(nickname);
        setSkillsToDefault(catName, catMaxRunDistance, catMaxSwimDistance);
        catsCount += 1;
    }
    public Cat(String nickname, int maxRunDistance, int maxSwimDistance) {
        super(nickname, maxRunDistance, maxSwimDistance);
        this.name = catName;
        catsCount += 1;
    }
    public Cat(String nickname, String sex, int age){
        super(nickname, sex, age);
        setSkillsToDefault(catName, catMaxRunDistance, catMaxSwimDistance);
        catsCount += 1;
    }
    public Cat(String nickname, String sex){
        super(nickname, sex);
        setSkillsToDefault(catName, catMaxRunDistance, catMaxSwimDistance);
        catsCount += 1;
    }

    @Override
    public void swim(int distance) { //Плавание
        System.out.println(name + " " + nickname + " говорит, что не умеет плавать");

    }
//    @Override
    public static int getAnimalCount() {return Cat.catsCount;}
    //Не совсем понятно, почему не работает Override?

}

