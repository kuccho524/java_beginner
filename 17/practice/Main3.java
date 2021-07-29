/*
 * Integer.parseIntメソッドを実行し、文字列"三"の変換結果をint型変数iに代入。
 * parseIntがどのような例外を発生させる可能性があるかをAPIリファレンスで調べる
 */

public class Main3 {
  public static void main(String[] args) {
    try {
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException例外をcatchしました");
    }
  }
}
