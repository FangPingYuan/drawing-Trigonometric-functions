

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class sin extends Adapter {
	public static Graphics Sin(int i, Graphics g) {
		//繪製sin圖形
		for (i = 155; i < 490; i += 1) {
			int x1 = i;
			int x2 = i + 1;
			int y1 = (int) (Math.sin(1.1 * x1 * Math.PI / 180) * 90 + 530);
			int y2 = (int) (Math.sin(1.1 * x2 * Math.PI / 180) * 90 + 530);
			g.drawLine(x1 - 155, y1, x2 - 155, y2);
		}
		int y = (int) (Math.sin(1.2 * 135 * Math.PI / 180) * 90 + 503);//蝜芾ˊ�隞�耦��皞�
		g.setColor(Color.blue);
		//繪製x軸
		g.drawLine(0, y, 380, y );
		for (int j = 0; y - j >= y - 63; j += 15) {
			g.drawLine(90, y - j, 90, y - 15 - j);
			j += 15;
		}
		//繪製極值垂直x軸的線
		for (int j = 0; y - j >= y - 63; j += 15) {
			g.drawLine(255, y + j, 255, y + 15 + j);
			j += 15;
		}
		//度數
		g.drawString("90", 85, y+ 12);
		g.drawString("0", 8, y+ 12);
		g.drawString("180", 170, y+ 12);
		g.drawString("270", 245, y+ 12);
		g.drawString("360", 322, y+ 12);
		g.drawString("deg", 350, y+ 12);

		g.setColor(Color.red);
		g.setFont(new Font("新細明體", Font.BOLD, 30));
		g.drawString("sin的圖形", 350, 280);
		
		return g;
	}
}
