class Email2 {

  // String型を持つ、変数title, address, textを宣言し、emailメソッドを定義する
  public static void email(String title, String address, String text) {

    // 各項目を表示
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }

  // String型を持つ、変数address, textを宣言し、emailメソッドを定義する
  public static void email(String address, String text) {
    
    email("テストメール", "abc@sample.com", "テストです。");
    // 各項目を表示
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }

  // mainメソッドを定義
  public static void main(String[] args) {
  email("テストメール", "def@sample.com", "テストだよ。");
  }

}