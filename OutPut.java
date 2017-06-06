package cal_GUI2;

import java.awt.*;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OutPut extends JPanel {
	static protected JButton lblOut=new JButton(" ");
	static protected JButton lblOutAns=new JButton(" ");
	//private JButton btnEq;
	//private JButton btnClr;
	static final JButton[] Out={lblOut,lblOutAns};
	public OutPut(){
		setLayout(new GridLayout(2,1));
		for(int i=0; i<Out.length; i++){
			//Out[i].addActionListener(this);//make the button work
			Out[i].setBackground(Color.green);
			Out[i].setFont(new Font("Serif",Font.BOLD,40));
			Out[i].setHorizontalAlignment(SwingConstants.RIGHT);
			add(Out[i]);
		}
}
	public static JButton getLblOut() {
		return lblOut;
	}
	public static void setLblOut(JButton lblOut) {
		OutPut.lblOut = lblOut;
	}
	public static JButton getLblOutAns() {
		return lblOutAns;
	}
	public static void setLblOutAns(JButton lblOutAns) {
		OutPut.lblOutAns = lblOutAns;
	}
}