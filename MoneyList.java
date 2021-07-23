/*
①3つの講座残高「121902」「8302」「55100」が格納されているint型配列moneyListを宣言する
②その配列の要素を1つずつ取り出す
③②を拡張for文で取り出す
*/

class MoneyList {

  public static void main(String[] args) {

    // 3つの講座残高「121902」「8302」「55100」が格納されているint型配列moneyListを宣言
    int[] moneyList = {121902, 8302, 55100};

    // その配列の要素を1つずつ取り出す
    for(int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }

    // 拡張for文で取り出す
    for(int value : moneyList) {
    System.out.println(value);
    }

  }

}