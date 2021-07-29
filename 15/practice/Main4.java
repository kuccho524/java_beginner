/*
「現在の100日後の日付」を「西暦2020年09月24日」の形式で表示する

～やること～

①現在の日時をDate型で取得
②取得した日時情報をCalendarにセット
③Calendarから「日」の数値を取得
④取得した値に100を足した値をCalendarの「日」にセット
⑤Calendarの日時情報をDate型に変換
⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main4 {
  public static void main(String[] args) {

    // ①現在の日時をDate型で取得
    Date now = new Date();
    Calendar c = Calendar.getInstance();

    // ②取得した日時情報をCalendarにセット
    c.setTime(now);

    // ③Calendarから「日」の数値を取得
    int day = c.get(Calendar.DAY_OF_MONTH);

    // ④取得した値に100を足した値をCalendarの「日」にセット
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);

    // ⑤Calendarの日時情報をDate型に変換
    Date future = c.getTime();

    // ⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}
