package zoo_AI;

public class ZooMain {
    public static void main(String[] args) {
        Animal animal[] = new Animal[3];

        // 修正箇所: コンストラクタに名前と年齢を渡すように変更
        animal[0] = new Dog("ポチ", 3);
        // 修正箇所: コンストラクタに名前と年齢を渡すように変更
        animal[1] = new Cat("タマ", 2);
        // 修正箇所: コンストラクタに名前と年齢を渡すように変更
        animal[2] = new Lion("レオ", 5);

        for (Animal a: animal) {
            // 修正箇所: getName()を使い、どの動物が鳴いているか分かりやすく出力
            System.out.print(a.getName() + ": "); 
            a.makeSound(); // 各クラスのmakeSound()を実行
        }
    }
}