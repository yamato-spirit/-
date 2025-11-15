package zoo;

public class ZooMain {
    public static void main(String[] args) {
        Animal animal[] = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Lion();
        for (Animal a: animal) {
            a.makeSound(); // 各クラスのmakeSound()を実行
        }
    }
}
