/*
①「【数あてゲーム】」と表示する
②0～9までの整数の中かからランダムな数を1つ生成して変数ansに代入する
③for文を用いた「5回繰り返すループ」を作る。その際には以下の④～⑦はループの中に記述する
④「0～9の数字を入力してください」と出力する
⑤数字を入力し、変数numに代入する
⑥もし変数ansと等しかったら「アタリ！」と表示して繰り返しを終了する
⑦もし変数numが変数ansと等しくない場合は「違います」と出力する
⑧繰り返しのブロックの外で「ゲームを終了します」と出力
*/

class NumberGame {

  public static void main(String[] args) {

    // 「【数あてゲーム】」と表示
    System.out.println("【数あてゲーム】");

    // 0～9までの整数の中かからランダムな数を1つ生成して変数ansに代入
    int ans = new java.util.Random().nextInt(9);

    // for文を用いた「5回繰り返すループ」を作る。
    for (int i = 0; i < 5; i++) {

      // 「0～9の数字を入力してください」と出力
      System.out.println("0～9の数字を入力してください");

      // 数字を入力し、変数numに代入
      int num = new java.util.Scanner(System.in).nextInt();

      // もし変数numが変数ansと等しかったら「アタリ！」と表示して繰り返しを終了
      if (num == ans) {
        System.out.println("アタリ！");
        break;
      } else {

        // もし変数numが変数ansと違っていたら「違います」と出力。
        System.out.println("違います");
      }
    }

    // 「ゲームを終了します」と出力
    System.out.println("ゲームを終了します");

  }

}