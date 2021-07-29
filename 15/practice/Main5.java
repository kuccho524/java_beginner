/*
「現在の100日後の日付」を「西暦2020年09月24日」の形式で表示する

～やること～

①現在の日時をDate型で取得
②取得した日時情報をCalendarにセット
③Calendarから「日」の数値を取得
④取得した値に100を足した値をCalendarの「日」にセット
⑤Calendarの日時情報をDate型に変換
⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示

上記をTime APIを利用する
*/

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main5 {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    LocalDate future = now.plus(Period.ofDays(100));
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}
