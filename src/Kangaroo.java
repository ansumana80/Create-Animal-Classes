/*
 * All Cats are Animals but all Animals are not Cats
 */
public class Kangaroo extends Animal {

    public Kangaroo() {
        super();
        System.out.println("Now I am a Kangaroo!");
    }

    @Override
    public String sleep() {
        return "A Kangoroo sleeps...";
    }

    @Override
    public String eat() {
        return "A Kangoroo eats...";
    }

    public String tail() {
        return "a large muscular tail to keep it balanced while in motion...";
    }

    public String live() {
        return "often live in large groups known as mobs...";
    }
}