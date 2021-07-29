import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = new FileWriter("data.txt");

    try {
      FileWriter fw1 = new FileWriter("data.txt");
      fw1.write("helllo");
      fw1.close();
    } catch (IOException e) {
      System.out.println("エラーが発生しました");
    }

    // ざっくりと例外を補足する
    try {
      FileWriter fw2 = new FileWriter("data.txt");
      fw2.write("helllo");
      fw2.close();
    } catch (Exception e) {
      System.out.println("エラーが発生しました");
    }

    // ファイルを開いた時だけ後片付けをする
    FileWriter fw3 = null;
    try {
      fw3 = new FileWriter("data.txt");
      fw3.write("hello");
    } catch (Exception e) {
      System.out.println("何らかの例外が発生しました");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          ;
        }
      }
    }

    // 上記をtry-with-resources文の利用
    try (FileWriter fw4 = new FileWriter("data.txt");) {
      fw4.write("hello");
    } catch (Exception e) {
      System.out.println("何らかの例外が発生しました");
    }
  }

  // スロー宣言による例外伝播の許可
  public static void subsub() throws IOException {
    FileWriter fw5 = new FileWriter("data.txt");
  }
}