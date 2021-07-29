/*
1~100までの整数を連結した文字列sを生成し、
文字列の配列を持つ変数aに格納する。
*/

public class Main1 {
  public static void main(String[] args) {

    // StringBuilderメソッドを利用する
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 100; i++) {

      // 文字列の連結にappendメソッドを利用する
      sb.append(i + 1).append(",");
    }

    // 文字列を持つ変数sを宣言
    String s = sb.toString();

    // splitメソッドを利用して配列にし、変数aに格納する
    String[] a = s.split(",");
  }
}
