

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class csc extends Adapter{
	public static double Csc(double x) {
		double sinX = Math.sin(x);
		return 1/sinX;
	}
	
	public static Graphics Csc(int i,Graphics g) {
		//繪製csc的圖形
		for( i=155; i<490; i+=1 ){
			int x1 = i;
			int x2 = i+1;
			int y1 = (int) (Csc( 1.1*x1*Math.PI/180) * 90 +530 );
			int y2 = (int) (Csc( 1.1*x2*Math.PI/180) * 90 +530 );
			if(y1> 240 && i-155!=254) {
				g.drawLine(x1-155, y1, x2-155, y2);
			}
			
		}
		int y = (int)(Csc( 1.2*135*Math.PI/180) * 90 +240 );//蝜芾ˊ�隞�耦��皞�
		g.setColor(Color.blue);
		//繪製x軸
		g.drawLine(0, (int)(Csc( 1.2*135*Math.PI/180) * 90 +240 ),390,  (int)(Csc( 1.2*135*Math.PI/180)) * 90 +261);
		//繪製漸近線、極軸垂直x軸的線
		for(int j = 0; y-j >= y-280; j+=15) {
			if(y-j >= y-70) {
				g.drawLine(90,y-j,90,y-15-j);
			}
			g.drawLine(170,y-j,170,y-15-j);
			j+=15;
		}
		for(int j = 0; y-j >= y-260; j+=15) {
			if(y-j >= y-70) {
				g.drawLine(250,y+j,250,y+15+j);
			}
			g.drawLine(324,y+j,324,y+15+j);
			g.drawLine(170,y+j,170,y+15+j);
			j+=15;
		}
		//度數
		g.drawString("90", 85, (int)(Csc( 1.2*135*Math.PI/180) * 90 +250 ));
		g.drawString("0", 8, (int)(Csc( 1.2*135*Math.PI/180) * 90 +250 ));
		g.drawString("180", 170, (int)(Csc( 1.2*135*Math.PI/180) * 90 +250 ));
		g.drawString("270", 250, (int)(Csc( 1.2*135*Math.PI/180) * 90 +250 ));
		g.drawString("360", 325, (int)(Csc( 1.2*135*Math.PI/180) * 90 +250 ));
		g.drawString("deg", 350, (int)(Csc( 1.2*135*Math.PI/180) * 90 +250 ));
		
		g.setColor(Color.red);
		g.setFont(new Font("新細明體",Font.BOLD,30));
		g.drawString("csc的圖形", 350, 280);
		
		return g;
	}
}
