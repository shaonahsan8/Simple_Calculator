package cal_GUI2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SpButtons extends JPanel implements ActionListener{

	private JButton sqr = new JButton("^2");
	private JButton qub = new JButton("^3");
	private JButton sqrt = new JButton("sqrt");

	protected final JButton [] spopsBtns = {sqr,qub,sqrt};
	
	public SpButtons(){
		setLayout(new GridLayout(1,3));
		
		for(int i=0; i<spopsBtns.length; i++){
			spopsBtns[i].addActionListener(this);//make the button work
			spopsBtns[i].setForeground(Color.blue);
			spopsBtns[i].setFont(new Font("Serif",Font.BOLD,40));
			add(spopsBtns[i]);
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
