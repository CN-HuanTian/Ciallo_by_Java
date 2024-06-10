package ciallo;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Random;

public class Ciallo extends JPanel{
//  初始化成员变量
  private int SIZE = randomFontSize();
  private String COLOR = randomFontColor();
  public Ciallo(){
    super(); //继承父类构造方法,同时增加自身构造方法
    setBorder(new LineBorder(Color.CYAN));
    setBounds(10, 10, 364, 180);


    JLabel jLabel =new JLabel("<html><body>"
        + "<p style='color :"+COLOR+"; font-size:"+SIZE+"px; font-family = '宋体''>Ciallo</p>"
        + "</body></html>");
    add(jLabel);
    System.out.println(COLOR+SIZE);
  }
  private int randomFontSize(){
    Random r = new Random();
    return 60+r.nextInt(20);
  }
  private String randomFontColor(){
    char[] colorList = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    String s = "#";
    int x;
    for(int i=0;i<6;i++){
      x = new Random().nextInt(16);
      s+=colorList[x];
    }
    return s;
  }
}
