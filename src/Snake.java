/*
 * All Cats are Animals but all Animals are not Cats
 */
public class Snake extends Animal {

    public Snake() {
        super();
        System.out.println("Now I am a Snake!");
    }

    @Override
    public String sleep() {
        return "A Snake sleeps...";
    }

    @Override
    public String eat() {
        return "A Snake eats...";
    }

    public String skin() {
        return "Snake scales don't grow so the skin has to be shed when the snake gets bigger...";
    }

    public String texture() {
        return "The skins from cobras, pythons, lizards, water snakes and other snakes has a beautiful texture and patterns...";
    }
}