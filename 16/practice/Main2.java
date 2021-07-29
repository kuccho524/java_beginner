import java.util.*;

/*
2人の勇者(斉藤、鈴木)をHeroとしてインスタンス化し、ArrayListに格納。
1人ずつ順番に取り出す。
*/

public class Main2 {
  public static void main(String[] args) {

    // 2人の勇者(斉藤、鈴木)をHeroとしてインスタンス化
    Hero h1 = new Hero("斉藤");
    Hero h2 = new Hero("鈴木");

    // ArrayListに格納
    List<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);

    // 1人ずつ順番に取り出す
    for (Hero h : heroes) {
      System.out.println(h.getName());
    }
  }

}