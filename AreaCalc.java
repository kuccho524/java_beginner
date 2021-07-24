class AreaCalc {

  // 求めた面積を表示する
  public static void main(String[] args) {

    // 各メソッドに値を代入し、面積を求める
    int square = calcSquare(10);
    int rectangular = calcRectangular(12, 13);
    double triangle = calcTriangle(5.5, 12.7);
    double circle = calcCircle(6.7);

    // 面積を表示する
    System.out.println("正方形の面積は" + square + "平方cmです。");
    System.out.println("長方形の面積は" + rectangular + "平方cmです。");
    System.out.println("三角形の面積は" + triangle + "平方cmです。");
    System.out.println("円の面積は" + circle + "平方cmです。");
  }

  // 正方形の面積を求めるメソッドを定義
  public static int calcSquare(int hen) {

    // 正方形の面積を計算する
    int area = hen * hen;
    return area;
  }

  // 長方形の面積を求めるメソッドを定義
  public static int calcRectangular(int bottom, int height) {

    // 長方形の面積を求める
    int area = bottom * height;
    return area;
  }

  public static double calcTriangle(double bottom, double height) {

    // 三角形の面積を求める
    double area = bottom * height / 2;
    return area;
  }

  // 面の面積を求めるメソッドを定義
  public static double calcCircle(double radius) {

    // 円の面積を求める
    final double PI = 3.14;
    double area = radius * radius * PI;
    return area;
  }

}