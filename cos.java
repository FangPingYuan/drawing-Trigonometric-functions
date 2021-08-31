

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class cos extends Adapter{
	public static Graphics Cos(int i, Graphics g) {
		// cos圖形
		for (i = 155; i < 490; i += 1) {
			int x1 = i;
			int x2 = i + 1;
			int y1 = (int) (Math.cos(1.1 * x1 * Math.PI / 180) * 90 + 530);
			int y2 = (int) (Math.cos(1.1 * x2 * Math.PI / 180) * 90 + 530);
			g.drawLine(x1 - 155, y1, x2 - 155, y2);
		}
		int y = (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 616);//蝜芾ˊ�隞�耦��皞�
		g.setColor(Color.blue);
		//繪製x軸
		g.drawLine(0, (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 616), 380,
				(int) (Math.cos(1.2 * 135 * Math.PI / 180)) * 90 + 530);
		//繪製極值垂直x軸的線
		for (int j = 0; y - j >= y - 63; j += 15) {
			g.drawLine(331, y - j, 331, y - 15 - j);
			j += 15;
		}
		for (int j = 0; y - j >= y - 63; j += 15) {
			g.drawLine(170, y + j, 170, y + 15 + j);
			j += 15;
		}
		//度數
		g.drawString("90", 85, (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 627));
		g.drawString("0", 8, (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 627));
		g.drawString("180", 170, (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 627));
		g.drawString("270", 245, (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 627));
		g.drawString("360", 322, (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 627));
		g.drawString("deg", 350, (int) (Math.cos(1.2 * 135 * Math.PI / 180) * 90 + 627));

		g.setColor(Color.red);
		g.setFont(new Font("新細明體", Font.BOLD, 30));
		g.drawString("cos的圖形", 350, 280);
		
		return g;
	}

}
