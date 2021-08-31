import java.awt.Color;
import java.awt.Graphics;

public class arrow {
	public static void drawArrow(int size, Graphics g) {
		if (size <= 0) {//size小於0皆以0計算
			size = 0;
		} else {
			if (size >= 100) {
				size = 100;}
			g.setColor(Color.blue);
			//繪製三角形
			g.fillPolygon(new int[] { 380, 380 + size + 5, 380, 380 },
					new int[] { 530 - size - 5, 530, 530 + size + 5, 530 }, 4);
		}
	}
}
