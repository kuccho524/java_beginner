public class Cleric {
  
  // Clericのフィールドを定義
  String name;
  int hp = 50;
  int max_hp = 50;
  int mp = 10;
  int max_mp = 10;

  // セルフエイドメソッドを定義する
  public void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = max_hp;
    System.out.println("HPが最大まで回復した");
  }

  // 祈るメソッドを定義する
  public int prey(int sec) {
    System.out.println(this.name + "は、" + sec + "秒祈った。");
    
    // MP回復量を乱数を用いて計算する
    int recover = java.util.Random().nextInt(3) + sec;
    
    // 実際の回復量を計算する
    int recoverActual = Math.min(this.max_mp - this.mp, recover);
    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}