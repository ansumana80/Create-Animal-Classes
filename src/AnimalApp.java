
public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Kangaroo k = new Kangaroo();
        print(k.eat());
        print(k.sleep());
        print(k.tail());
        print(k.live());

        Snake s = new Snake();
        print(s.eat());
        print(s.sleep());
        print(s.skin());
        print(s.texture());



    }

    private static void print(String s) {
        System.out.println(s);
    }
}