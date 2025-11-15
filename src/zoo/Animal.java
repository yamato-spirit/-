package zoo;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name; this.age = age;
    }
    public Animal() {;} // name, ageの入力をスキップできるように設定
    
    public abstract void makeSound(); // abstractメソッドには{}がない
}
