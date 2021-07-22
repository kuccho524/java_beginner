/*
①int型の変数をisHungryを定義し、0か1を代入する。また、String型の変数foodを定義し、適当な食べ物の名前を代入する。
②画面に「こんにちは」を出力する
③もし変数isHungryが0であれば「お腹がいっぱいです」と表示される。
④もし変数isHungryが空腹を示すならば、変数foodを利用して「○○をいただきます」と表示する
⑤最後に「ごちそうさまでした」と表示する
*/

class Hungry {

  public static void main(String[] args) {

    // 変数isHungryをint型で定義し0を代入。変数foodをString型で定義し、食べ物の名前を代入する。
    int isHungry = 0;
    String food = "ハンバーガー";

    // 「こんにちは」と出力する
    System.out.println("こんにちは");

    // isHungryの条件分岐
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです。");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
    }

    // 「ごちそうさまでした」と出力する
    System.out.println("ごちそうさまでした。");
  }
}