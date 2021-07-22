/*
switch文を利用して下記を実行する
①画面に「[メニュー] 1:検索 2:登録 3:削除 4:変更>」と表示する。
②数字を入力し、変数selectedに代入する
③もし変数selectedが1なら「検索します」、2なら「登録します」、3なら「削除します」、4なら「変更します」と表示する
④変数selectedが1～4でない場合は何もしない
*/

class Select {

  public static void main(String[] args) {

    // 画面に「[メニュー] 1:検索 2:登録 3:削除 4:変更>」を出力
    System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更>");

    // 変数selectedを定義する
    int selected = new java.util.Scanner(System.in).nextInt();

    // もし変数selectedが1なら「検索します」、2なら「登録します」、3なら「削除します」、4なら「変更します」と出力し、1～4でない場合は何もしない
    switch(selected){
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
      default:
      break;
    }

  }

}