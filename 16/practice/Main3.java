import java.util.*;

public class Main3 {
  public static void main(String[] args) {

    // 2人の勇者(斉藤、鈴木)をHeroとしてインスタンス化
    Hero h1 = new Hero("斉藤");
    Hero h2 = new Hero("鈴木");

    //それぞれの勇者が倒した数と、勇者をペアでコレクションに格納
    Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
    heroes.put(h1, 3);
    heroes.put(h2, 7);

    // １つずつ取り出す
    for(Hero key : heroes.keySet()) {
      int value = heroes.get(key);
      System.out.println(key.getName() + "が倒した数=" + value);
    }
  }
}
