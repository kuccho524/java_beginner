public class Main {
  public static void main(String[] args) {
    Object o1 = new Empty();
    Object o2 = new Hero();
    Object o3 = "こんにちは";

    // 等価
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;

    Hero.money = 100;
    System.out.println(Hero.money);
    System.out.println(h1.money);
    h1.money = 300;
    System.out.println(h2.money);

    Hero.steRandomMoney();
    System.out.println(Hero.money);
    Hero h3 = new Hero();
    System.out.println(h3.money);

    if(h1.equals(h2) == true) {
      System.out.println("同じ内容です。");
    } else {
      System.out.println("違う内容です。");
    }
  }

  public void printAnything(Object o){
    System.out.println(o.toString());
  }

  public boolean equals(Object o) {
    if(this == o) { return true; }
    else { return false; }
  }
}