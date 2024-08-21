import java.awt.*;
import java.applet.*;
public class NumValues extends Applet
{
public void paint(Graphics g)
{
int value1=50;
int value2=20;
int sum=value1+value2;
String s="sum:"+String.valueOf(sum);
g.drawString(s,100,100);
}
}