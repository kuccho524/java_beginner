/*
①int型で要素数3の配列numbersを準備します。このとき初期値はそれぞれ「3」「4」「9」とする。
②画面に「1桁の数字を入力してください」と表示
③次のコードを用いてキーボードから数字の入力を受付、変数inputに代入する
④配列をループで回しながら、いずれかの要素と等しいか調べる。等しければ「アタリ！」と表示
*/

import java.util.Scanner;

class Numbers {

  public static void main(String[] args) {

    // int型で要素数3の配列numbersを準備し、初期値はそれぞれ「3」「4」「9」とする。
    int[] numbers = {3, 4, 9};

    // 「1桁の数字を入力してください」と表示し、変数inputに代入
    Scanner stdIn = new Scanner(System.in);
    System.out.println("1桁の数字を入力してください");
    int input = stdIn.nextInt();

    // 配列をループで回しながら、いずれかの要素と等しいか調べる。等しければ「アタリ！」と表示
    for(int i = 0; i < numbers.length; i++) {
      if (input == numbers[i]) {
        System.out.println("アタリ！");
      }
    }

  }

}