// Interface
interface Worker {
    void performDuties();
}

// Superclass
class Person2 {
    String name;
    int id;

    Person2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {

        Person2 p = new Person2("Manager", 101);
        Chef c = new Chef("Rohit", 201);
        Waiter w = new Waiter("Aman", 301);

        p.showDetails();
        System.out.println();

        c.showDetails();
        c.performDuties();
        System.out.println();

        w.showDetails();
        w.performDuties();
    }
}

// Subclass Chef
class Chef extends Person2 implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking food");
    }
}

// Subclass Waiter
class Waiter extends Person2 implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving food");
    }
}
