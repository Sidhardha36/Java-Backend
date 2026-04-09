// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Child class

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// GrandChild class

class GermanSheperd extends Dog {
    void friendly() {
        System.out.println("German Sheperd is friendly");
    }
}

