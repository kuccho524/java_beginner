class Areas {

  // 戻り値double型を持つcalcTriangleAreaメソッドを定義
  public static double calcTriangleArea(double bottom, double height) {

    double area = height * bottom / 2; 
    return area;
  }

  // 戻り値double型を持つcalcCircleAreaメソッドを定義
  public static double calcCircleArea(double radius) {

    final double PI = 3.14;
    double area = radius * radius * PI;
    return area;
    
  }

  // mainメソッドを定義
  public static void main(String[] args) {

    // 三角形の面積
    double triangle = calcTriangleArea(6.3, 4.8);
    System.out.println("三角形の面積：" + triangle + "平方cmです。");
    
    // 円の面積
    double circle = calcCircleArea(12.0);
    System.out.println("円の面積：" + circle + "平方cmです。");
  }

}