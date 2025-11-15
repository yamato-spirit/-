package zoo_AI;

public class Cat extends Animal{

    // 修正箇所: 親クラス(Animal)のコンストラクタを呼ぶためのコンストラクタを追加
    public Cat(String name, int age) {
        super(name, age); // super() で親クラスのコンストラクタを呼び出します
    }

    // 修正箇所: @Overrideアノテーションを追加。親のメソッドを上書きしていることを明示
    @Override
    public void makeSound() {
        System.out.println("ニャー");
    }
}