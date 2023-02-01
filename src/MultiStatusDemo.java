public class MultiStatusDemo {
    public static void main(String[] args) {
        Master master = new Master();
        Animal cat = new Cat();
        Food fish = new Fish();
        Animal dog = new Dog();
        Food bone = new Bone();

        master.feed(cat, fish);
        System.out.println("************");
        master.feed(dog, bone);
    }
}

class Master {
    protected void feed(Animal animal, Food food) {
        System.out.println("主人开始喂食啦");
        animal.eat();
        food.foodIs();
    }
}

abstract class Animal {
    protected abstract void eat();
}

abstract class Food {
    protected abstract void foodIs();
}

class Cat extends Animal {
    protected void eat() {
        System.out.println("猫吃");
    }
}

class Dog extends Animal {
    protected void eat() {
        System.out.println("狗吃");
    }
}

class Fish extends Food {
    protected void foodIs() {
        System.out.println("食物是鱼");
    }
}

class Bone extends Food {
    protected void foodIs() {
        System.out.println("食物是骨头");
    }
}
