import javax.swing.text.StringContent;
import java.util.Date;
import java.util.Calendar;
import java.time.*;

public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";
    if (s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です");
    if(s1.isEmpty()) {
      System.out.println("s1は空文字です");
    }

    String s4 = "Java and JavaScript";
    if (s4.contains("Java")) {
      System.out.println("文字列s4は、Javaを含んでいます");
    }
    if (s4.endsWith("Java")) {
      System.out.println("文字列s4は、Javaが末尾にあります");
    }
    System.out.println("文字列s4で最初にJavaが登場する位置は" + s4.indexOf("Java"));
    System.out.println("文字列s4で最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));

    String s5 = "Java programing";
    System.out.println("文字列s5の4文字目以降は" + s5.substring(3));
    System.out.println("文字列s5の4～8文字目は" + s5.substring(3, 8));

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < 10000; i++) {
      sb.append("Java");
    }

    // splitメソッドを利用する
    String s = sb.toString();

    String s6 = "abc,def:ghi";
    String[] words = s6.split("[,:]");
    for (String w : words) {
      System.out.println(w + "->");
    }

    // replaceAllメソッドを利用する
    String s7 = "abc,def:ghi";
    String w1 = s7.replaceAll("[beh]", "X");
    System.out.println(w1);

    // 処理時間を計測
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");

    // 現在日時を表示する
    Date now = new Date();
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1600705425827L);
    System.out.println(past);

    Calendar c = Calendar.getInstance();
    // 6つのint値からDateインスタンスを生成
    c.set(2019, 8, 22, 1, 23, 45);
    c.set(Calendar.MONTH, 9);
    Date d = c.getTime();
    System.out.println(d);

    // Dateインスタンスからint値を生成
    Date now1 = new Date();
    c.setTime(now1);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です。");

    // Instantの生成
    Instant i1 = Instant.now();

    // Instantとlong値の相互変換
    Instant i2 = Instant.ofEpochMilli(1600705425827L);
    long l = i2.toEpochMilli();

    // ZonedDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

    // InstantとZonedDateTimeの相互変換
    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

    // ZonedDateTimeの利用方法
    System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
    System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
    if(z2.equals(z3)) {
      System.out.println("これらは同じ瞬間を刺しています");
    }

    // LocalDateTimeの生成方法
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);

    // LocalDateTimeとZonedDateTimeの相互変換
    ZonedDateTime z4 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z4.toLocalDateTime();
  }
}