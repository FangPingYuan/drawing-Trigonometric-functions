

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class tan extends Adapter{
	static double caculate_cot(double x) {
		double tanX = Math.tan(x);
		return 1/tanX;
	}
	public static Graphics Tan(int i, Graphics g) {
		//繪製tan圖形
		for (i = 0; i < 330; i += 1) {
			if ((i != 90)&&(i != 255)) {
				int x1 = i ;
				int x2 = i + 1;
				int y1 = (int) (caculate_cot(1.1 * (x1+90) * Math.PI / 180) * 90 + 550);
				int y2 = (int) (caculate_cot(1.1 * (x2+91) * Math.PI / 180) * 90 + 550);
				if (y1 > 270) {
					g.drawLine(x1, y1, x2 , y2);
				}
			}
			
		}
		int y = (int) (caculate_cot(1.2 * 135 * Math.PI / 180) * 90 + 717);//蝜芾ˊ�隞�耦��皞�
		g.setColor(Color.blue);
		//繪製x軸
		g.drawLine(0, (int) (caculate_cot(1.2 * 135 * Math.PI / 180) * 90 +807), 380,
				(int) (caculate_cot(1.2 * 135 * Math.PI / 180)) * 90 + 800);
		//繪製漸近線
		for (int j = 0; y - j >= y-200; j += 15) {
			g.drawLine(245, y - j, 245, y - 15 - j);
			g.drawLine(85, y - j, 85, y - 15 - j);
			j += 15;
		}
		for (int j = 0; y - j >= y - 400; j += 15) {
			g.drawLine(245, y + j, 245, y + 15 + j);
			g.drawLine(85, y + j, 85, y + 15 + j);
			j += 15;
		}
		//度數
		g.drawString("90", 85, y+105);
		g.drawString("0", 8, y+105);
		g.drawString("180", 170, y+105);
		g.drawString("270", 245, y+105);
		g.drawString("360", 322, y+105);
		g.drawString("deg", 350, y+105);

		g.setColor(Color.red);
		g.setFont(new Font("新細明體", Font.BOLD, 30));
		g.drawString("tan的圖形", 350, 280);
		return g;
	}
}
