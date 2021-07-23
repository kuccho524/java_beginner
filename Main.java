import comment.Zenhan;

// MainクラスでZenhanクラスとKouhanクラスを呼び出す。
public class Main {

  public static void main(String[] args) throws Exception {

    // ZenhanクラスのWarusaメソッドとTogameメソッドを呼び出す
    Zenhan.doWarusa();
    Zenhan.doTogame();

    // KouhanクラスのcallDeaeクラスとshowMondokoroクラスを呼び出す。
    comment.Kouhan.callDeae();
    comment.Kouhan.showMondokoro();
  }

}