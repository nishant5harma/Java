
public class FirstOppsAnimal {
    public void eat() {
        System.out.println("Dog is Eating");
    }

    public static void main(String[] args) {

        // Creating an object

        FirstOppsAnimal buzo = new FirstOppsAnimal();
        birds eagle = new birds();

        buzo.eat();
        eagle.fly();

    }

}

class birds {

    void fly() {
        System.out.println("I'm flying");
    }

}