import java.awt.*;
import java.applet.Applet;
public class Rectangle extends Applet
{
public void paint(Graphics g)
{
int inset;
int rectWidth,rectHeight;
g.setColor(Color.blue);
g.fillRect(0,0,300,160);
inset=0;
rectWidth=299;
rectHeight=159;
g.setColor(Color.red);
g.drawString("Rectangles",150,200);
while(rectWidth>=0 && rectHeight>=0)
{
g.drawRect(inset,inset,rectWidth,rectHeight);
inset+=15;
rectWidth-=30;
rectHeight-=30;
}}}