/*
①「ようこそ占いの館へ」と出力する
②「あなたの名前を入力してください」と出力
③入力された文字列を受け取る
④「あなたの年齢を入力してください」と出力
⑤入力された文字列を受け取る
⑥⑤で受け取った文字列を整数に変換する
⑦0～3までの乱数を生成し、int型の変数fortuneに代入
⑧fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にする。
⑨「占いの結果が出ました」と出力する
⑩「運気番号は～です。」とう表示する。運気番号は⑧で作った数を使用する。
⑪画面に「1：大吉～4：凶」を表示する
*/

class UranaiYakata {

  public static void main(String[] args) {
    // welcomeメッセージを出力
    System.out.println("ようこそ占いの館へ");

    // 名前入力のメッセージを表示させる
    System.out.println("あなたの名前を入力してください。");

    // 入力値をstring型の変数nameで取得
    String name = new java.util.Scanner(System.in).nextLine();

    // 年齢入力のメッセージを表示させる。
    System.out.println("あなたの年齢を入力してください。");

    // 入力値をstring型の変数ageStringで取得
    String ageString = new java.util.Scanner(System.in).nextLine();

    // 変数ageStringをint型ageに変換
    int age = Integer.parseInt(ageString);

    // 0～3の乱数を生成し、int型の変数fortuneに代入した後、インクリメント演算子で1増やす。
    int fortune = new java.util.Random().nextInt(4);
    fortune++;

    // 「占いの結果が出ました」と出力する
    System.out.println("占いの結果が出ました。");

    // 年齢、名前、運気番号を含むメッセージを出力する
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です。");

    // 運気番号に紐づく結果を表示する
    System.out.println("1:大吉 2:中吉 3:吉 4:凶");

  }

}
