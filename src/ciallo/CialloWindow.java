package ciallo;

import javax.swing.*;
import java.awt.*;

public class CialloWindow extends JFrame {
  public CialloWindow() {
    setTitle("Ciallo"); // 窗口标题
    setSize(1000, 600); // 窗口大小
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭时事件
    getContentPane().setBackground(Color.BLACK); // 背景颜色
    getContentPane().setLayout(null); // 取消布局
    setVisible(true); // 显示界面
    add();
    add();
    add();
    add();
    add();
    add();
  }

  public void add() {
    Ciallo ciallo = new Ciallo();
    add(ciallo);
  }

  public static void main(String[] args) {
    CialloWindow cw = new CialloWindow();
  }
}
