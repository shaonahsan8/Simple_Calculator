package cal_GUI2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OpButtonsJP extends JPanel implements ActionListener{

	private JButton add = new JButton("+"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Plus.png")*/);
	//add.setIcon(new ImageIcon(OpButtonsJP.class.getResource("com/icon/Plus.png")));
	
	private JButton sub = new JButton("-"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Minus.png")*/);
	
	private JButton mul = new JButton("*"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Multiply.png")*/);
	private JButton div = new JButton("/"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Divide.png")*/);
	protected final JButton [] opsBtns = {add,sub, mul,div};
	
	public OpButtonsJP(){
		setLayout(new GridLayout(4,1));
		
		for(int i=0; i<opsBtns.length; i++){
			opsBtns[i].addActionListener(this);//make the button work
			opsBtns[i].setFont(new Font("Serif",Font.BOLD,40));
			
			add(opsBtns[i]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String op = e.getActionCommand().trim();
		System.out.println("The button that triggered actionPerformed was "+ op);
		//String currLblText = CalcJFrame.lblOut.getText().trim();
		//CalcJFrame.lblOut.setText(currLblText+op);
		CalcJFrame.updateLblOut(op);
	}
}
