import ciallo.CialloWindow;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    System.out.println(randomFontColor());
  }
  public static String randomFontColor(){
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
