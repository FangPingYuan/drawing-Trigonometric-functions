

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class sec extends Adapter{
	public static double caculate_Sec(double x) {
		double cosX = Math.cos(x);
		return 1 / cosX;
	}

	public static Graphics Sec(int i, Graphics g) {
		// 繪製sec圖形
		for (i = 155; i < 490; i += 1) {
			int x1 = i;
			int x2 = i + 1;
			int y1 = (int) (caculate_Sec(1.1 * x1 * Math.PI / 180) * 90 + 526);
			int y2 = (int) (caculate_Sec(1.1 * x2 * Math.PI / 180) * 90 + 526);
			if (y1 > 240 && i - 155 != 254) {
				g.drawLine(x1 - 155, y1, x2 - 155, y2);
			}

		}
		int y = (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 626);//蝜芾ˊ�隞�耦��皞�
		g.setColor(Color.blue);
		//繪製x軸
		g.drawLine(0, (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 626), 380,
				(int) (caculate_Sec(1.2 * 135 * Math.PI / 180)) * 90 + 621);
		//繪製漸近線
		for (int j = 0; y - j >= y - 290; j += 15) {
			g.drawLine(90, y - j, 90, y - 15 - j);
			g.drawLine(255, y - j, 255, y - 15 - j);
			j += 15;
		}
		for (int j = 0; y - j >= y - 260; j += 15) {
			g.drawLine(255, y + j, 255, y + 15 + j);
			g.drawLine(90, y + j, 90, y + 15 + j);
			j += 15;
		}
		//度數
		g.drawString("90", 85, (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 636));
		g.drawString("0", 8, (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 636));
		g.drawString("180", 170, (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 636));
		g.drawString("270", 245, (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 636));
		g.drawString("360", 322, (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 636));
		g.drawString("deg", 350, (int) (caculate_Sec(1.2 * 135 * Math.PI / 180) * 90 + 636));

		g.setColor(Color.red);
		g.setFont(new Font("新細明體", Font.BOLD, 30));
		g.drawString("sec的圖形", 350, 280);
		return g;
	}
}
