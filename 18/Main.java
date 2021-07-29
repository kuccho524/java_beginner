import java.io.*;
import java.sql.*;
import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
  public static void main(String[] args) throws Exception {

    // ファイルを１文字ずつ読み込む
    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    while (input != -1) {
      System.out.println((char)input);
      input = fr.read();
    }
    fr.close();

    // ファイルに１文字ずつ書き込む
    FileWriter fw = new FileWriter("data.txt");
    fw.write('そ');
    fw.write('れ');
    fw.write('で');
    fw.write('は');
    fw.close();

    /* DBに接続してSQLを送信する */
    Class.forName("org.h2.Driver");

    // 接続先DBを指定
    String dburl = "jbdc:h2:~/test";
    String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki)";

    // DBに接続
    Connection conn = DriverManager.getConnection(dburl);

    // SQLを送信
    conn.createStatement().executeUpdate(sql);

    // DB接続を閉じる
    conn.close();

    /* GUIプログラム */
    JFrame frame = new JFrame("初めてのGUI");
    JLabel label = new JLabel("Hello world");
    JButton button = new JButton("押してね");
    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}