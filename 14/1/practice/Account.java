/*
①口座番号「4649」残高1592円のAccountインスタンスの変数aに生成し、
画面に「\\1592(口座番号：4649)」と表示される

②口座番号が等しければ等価と判断される。
ただし、「 4649」など、口座番号の先頭に半角スペースがつけられた場合でも、
それを無視して比較できる。
*/

public class Account {
  String accountNumber; // 口座番号
  int balance; // 残高

  /* ①文字列表現のメソッド */
  public String toString() {
    return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")" ;
  }

  /* ②等価判定メソッド */
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Account) {
      Account a = (Account)o;
      String an1 = this.accountNumber.trim();
      String an2 = a.accountNumber.trim();
      if (an1.equals(an2)) {
        return true;
      }
    }
    return false;
  }
}