/**
 * Create by xuefeng on 2023.1.27
 */

public class Puppy {
    int puppyAge;

    public Puppy(String name){
        System.out.println("The Puppy is " + name);
    }

    public void setPuppyAge(int age){
        puppyAge = age;
    }

    public int getPuppyAge(){
        System.out.println("Now PuppyAge is: " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("kaiQi");
        myPuppy.setPuppyAge(5);
        int nowAge = myPuppy.getPuppyAge();
        System.out.println("nowAge: " + nowAge + "\nmyPuppy.puppyAge: " + myPuppy.puppyAge);
    }
}
