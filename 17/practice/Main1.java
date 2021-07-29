/**
 * 17-1
 * ①String型を持つ変数sを宣言し、nullを代入する。
 * ②s.length()の内容を表示しようとする。
 * 
 * 17-2
 * ①「NullPointerException例外をcatchしました」と表示する
 * ②「--スタックトレース（ここから）--」と表示する
 * ③スタックトレースを表示する
 * ④「--スタックトレース（ここまで）--」と表示する
 */

public class Main1 {
  public static void main(String[] args) {

    // 17-1
    String s = null;
    System.out.println(s.length());

    // 17-2
    try {
      String s1 = null;
      System.out.println(s1.length());
    } catch(NullPointerException e) {
      System.out.println("NullPointerException例外をcatchしました");
      System.out.println("--スタックトレース（ここから）--");

      // スタックとレースを表示する
      e.printStackTrace();
      System.out.println("--スタックトレース（ここまで）--");
    }
  }
}