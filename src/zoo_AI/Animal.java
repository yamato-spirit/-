package zoo_AI;

public abstract class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // public Animal() {;} // 修正箇所: 空のコンストラクタを削除。Animalは必ず名前と年齢を持つように強制します。
    
    public abstract void makeSound(); // abstractメソッドには{}がない

    // 修正箇所: カプセル化されたnameにアクセスするためのgetter（ゲッター）を追加
    public String getName() {
        return this.name;
    }

    // 修正箇所: カプセル化されたageにアクセスするためのgetter（ゲッター）を追加
    public int getAge() {
        return this.age;
    }
}