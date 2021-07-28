public class Hero {
  String name;
  int hp;
  static int money;

  public static void steRandomMoney() {
    Hero.money = (int)(Math.random() * 1000);
  }
}
