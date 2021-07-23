/*
名前（文字列）、年齢（整数）、身長(浮動小数点)、干支（1文字）を代入する、
自己紹介文を表示するプログラムを作成する。
*/

class Introduction {

  public static void introduceOneself(String name, int age, double height, char zodiac) {
    System.out.println("私は" + name + "、" + age + "歳、身長" + height + "cmの" + zodiac + "年生まれです");
  }

  public static void main(String[] args) {
    introduceOneself("Ryo", 30, 166.0, '未');
  }

}