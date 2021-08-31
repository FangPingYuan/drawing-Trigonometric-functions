import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class cot extends Adapter{
	public static Graphics Cot(int i, Graphics g) {
		//繪製cot圖形
		for (i = 155; i < 490; i += 1) {
			if ((i-154 != 165)&&(i-155 != 327)) {
				int x1 = i;
				int x2 = i + 1;
				int y1 = (int) (Math.tan(1.1 * (x1 + 90) * Math.PI / 180) * 90 + 530);
				int y2 = (int) (Math.tan(1.1 * (x2 + 90) * Math.PI / 180) * 90 + 530);
				if (y1 > (int) (Math.tan(1.2 * 135 * Math.PI / 180) * 90 + 270)) {
					g.drawLine(x1 - 155, y1, x2 - 155, y2);
				}
			}
			
		}
		int y = (int) (Math.tan(1.2 * 135 * Math.PI / 180) * 90 + 570);//蝜芾ˊ�隞�耦��皞�
		g.setColor(Color.blue);
		//繪製x軸
		g.drawLine(0, (int) (Math.tan(1.2 * 135 * Math.PI / 180) * 90 + 560), 380,
				(int) (Math.sin(1.2 * 135 * Math.PI / 180)) * 90 + 530);
		//繪製漸近線
		for (int j = 0; y - j >= y - 270; j += 15) {
			g.drawLine(165, y - j, 165, y - 15 - j);
			j += 15;
		}
		for (int j = 0; y - j >= y - 300; j += 15) {
			g.drawLine(165, y + j, 165, y + 15 + j);
			g.drawLine(327, y + j, 327, y + 15 + j);
			j += 15;
		}
		//度數
		g.drawString("90", 85, y+5);
		g.drawString("0", 8, y+5);
		g.drawString("180", 170, y+5);
		g.drawString("270", 245, y+5);
		g.drawString("360", 322, y+5);
		g.drawString("deg", 350, y+5);

		g.setColor(Color.red);
		g.setFont(new Font("新細明體", Font.BOLD, 30));
		g.drawString("cot的圖形", 350, 280);
		return g;
	}
}
