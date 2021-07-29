/*
* 起動直後にIOExceptionを送出して異常終了する
*/

import java.io.IOException;

public class Main4 {
  public static void main(String[] args) throws IOException {
    System.out.println("プログラムが起動しました");
    throw new IOException();
  }
}
