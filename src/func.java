import java.awt.Color;
import javax.swing.JPanel;

public class func {
 
 public static void setColor(JPanel panel)
 {
     panel.setBackground(new Color(75, 200, 227));
 }
 
 public static void resetColor(JPanel panel)
 {
     panel.setBackground(new Color(0,153,255));
 }
 
 public static void close_setColor(JPanel panel)
 {
     panel.setBackground(new Color(204,0,51));
 }
 
 public static void close_resetColor(JPanel panel)
 {
     panel.setBackground(new Color(0,153,255));
 }
 
  public static int name_check(String name){
        
        for(int i = 0; i < name.length(); ++i)
        {
            int ch = name.charAt(i);
            if((ch>64 && ch<91) || (ch>96 && ch<123) || ch==32)
                continue;
            else
                return -1;
        }
        return 1;
    }
 
  public static String url(){
      return "jdbc:mysql://localhost:3306/dataentrysystem";
  }
  public static String user(){
      return "root";
  }
  public static String pass(){
      return "mysql";
  }
     
 public static void main(String[] args)
    {
        Splash sp = new Splash();
        sp.setVisible(true);
        login sig = new login();
        try{
            for(int i=0; i<=100;i++){
                Thread.sleep(60);
                Splash.bar.setValue(i);
                if(i==100){
                    sp.setVisible(false);
                    sig.setVisible(true);
                }
            }
        }
        catch(InterruptedException e){
            e.getMessage();
        }
    }
}
