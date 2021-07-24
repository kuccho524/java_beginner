public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero("ミナト");
    h.hp = 100;
    h.sword = s;
    Wizard w = new Wizard();
    w.hp = 50;
    w.heal(h);
    System.out.println(h.hp);
    System.out.println(h.name);
    System.out.println("現在の武器は" + h.sword.name);

    Hero h2 = new Hero();
    System.out.println(h2.name);
  }
}