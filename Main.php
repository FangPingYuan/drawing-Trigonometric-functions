

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.applet.*;

public class Main extends JFrame {
	

	public Graphics g;//?嚙踝蕭隞lass??嚙賜?嚙踝蕭
	private JPanel contentPane;
	private JPanel panDraw;
	private JTextField tfSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		//撱綽蕭?嚙箭utton?嚙緝adioButton?嚙瞑anel嚙�?
	    JRadioButton radSin;
	    JRadioButton radCos;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		radSin = new JRadioButton("sin", true);
		radCos = new JRadioButton("cos");
		radCos.setBounds(6, 31, 47, 23);
		JRadioButton radTan = new JRadioButton("tan");
		radTan.setBounds(6, 56, 105, 23);
		JRadioButton radCsc = new JRadioButton("csc");
		radCsc.setBounds(6, 81, 105, 23);
		JRadioButton radSec = new JRadioButton("sec");
		radSec.setBounds(6, 106, 105, 23);
		JRadioButton radCot = new JRadioButton("cot");
		radCot.setBounds(6, 131, 105, 23);
		JLabel labSize = new JLabel("\u7BAD\u982D(<=100)");
		labSize.setFont(new Font("?嚙踝蕭蝝堆蕭?嚙踝蕭??", Font.BOLD, 14));
		labSize.setBounds(88, 10, 91, 15);
		tfSize = new JTextField("5");
		tfSize.setBounds(88, 31, 96, 100);
		tfSize.setColumns(20);
		JButton btnDraw = new JButton("\u7E6A\u5716");
		btnDraw.setBounds(6, 160, 85, 30);
		JButton btnClean = new JButton("\u6E05\u9664");
		btnClean.setBounds(6, 189, 85, 30);
		JPanel panDraw = new JPanel();
        panDraw.setBounds(6, 292, 325, 227);
        contentPane.add(panDraw);
        panDraw.setLayout(new BoxLayout(panDraw, BoxLayout.X_AXIS)); 
        JPanel panArrow = new JPanel();
        panArrow.setBounds(325, 315, 78, 102);
        contentPane.add(panArrow);
		JPanel panMain = new JPanel();
		panMain.setBounds(6, 0, 88, 200);
		panMain.setLayout(new GridLayout(8, 1));
        panMain.add(radSin);
        panMain.add(radCos);
        panMain.add(radTan);
        panMain.add(radCsc);
        panMain.add(radSec);
        panMain.add(radCot);
        panMain.add(btnDraw);
        panMain.add(btnClean);
        contentPane.add(panMain);
        
        //ButtonGroup
        ButtonGroup radFunction = new ButtonGroup();
        radFunction.add(radSin);
        radFunction.add(radCos);
        radFunction.add(radTan);
        radFunction.add(radCsc);
        radFunction.add(radSec);
        radFunction.add(radCot);
        getContentPane().add(panMain);
        
        JPanel panSize = new JPanel();
		panSize.setBounds(100, 0, 88, 200);
		contentPane.add(panSize);
		panSize.setLayout(new GridLayout(8, 1));
        panSize.add(labSize);
        panSize.add(tfSize);
        getContentPane().add(panSize);
        getContentPane().add(new JPanel());
        getContentPane().add(new JPanel());
        getContentPane().add(new JPanel());
        getContentPane().add(new JPanel());
        getContentPane().add(new JPanel());

        
        btnDraw.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		
        		Graphics g = getGraphics();
        		
        		update(g);//���銝���
        		g.setFont(new Font("Calibri",Font.BOLD,12));
        		//閮剖����誘
        		radSin.setActionCommand("1");
        		radCos.setActionCommand("2");
        		radTan.setActionCommand("3");
        		radCsc.setActionCommand("4");
        		radSec.setActionCommand("5");
        		radCot.setActionCommand("6");
        		String Fuc = radFunction.getSelection().getActionCommand();
        		switch(Fuc) {
        		case("1"):
        			sin.Sin(0, g);
        			break;
        		case("2"):
        			cos.Cos(0, g);
    				break;
        		case("3"):
        			tan.Tan(0, g);
        			break;
        		case("4"):
        			csc.Csc(0, g);
        			break;
        		case("5"):
        			sec.Sec(0, g);
        			break;
        		case("6"):
        			cot.Cot(0, g);
        			break;
        		}
        		String str_size = tfSize.getText();//蝞剝憭批��
        		int size = Integer.parseInt(str_size);//頧nt
        		arrow.drawArrow(size, g);//蝜芾ˊ蝞剝
    		}
    	});
        
        btnClean.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent arg0) {
        		repaint();//皜征
        	}
        });

        
        
	}
	
	class Panel extends JPanel
	{
		
	}
	public static void panDraw() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
