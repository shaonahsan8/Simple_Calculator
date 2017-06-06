package cal_GUI2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumButtonsJP extends JPanel implements ActionListener{
	private JButton n0 = new JButton("0"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num0.png")*/);
	private JButton n1 = new JButton("1"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num1.png")*/);
	private JButton n2 = new JButton("2"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num2.png")*/);
	private JButton n3 = new JButton("3"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num3.png")*/);
	private JButton n4 = new JButton("4"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num4.png")*/);
	private JButton n5 = new JButton("5"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num5.png")*/);
	private JButton n6 = new JButton("6"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num6.png")*/);
	private JButton n7 = new JButton("7"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num7.png")*/);
	private JButton n8 = new JButton("8"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num8.png")*/);
	private JButton n9 = new JButton("9"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Num9.png")*/);
	
	private JButton clr = new JButton("C"/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/LetterC.png")*/);
	private JButton eql = new JButton("="/*,new ImageIcon("C:/Users/livei/Desktop/CMP 326/Equal.png")*/);
	
	protected final JButton [] btns = {n7,n8,n9,n4,n5,n6,n1,n2,n3,clr,n0,eql};

	public NumButtonsJP(){
		
		setLayout(new GridLayout(4,3));
		for(int i=0; i<btns.length; i++){
			btns[i].addActionListener(this);
			btns[i].setFont(new Font("Serif",Font.BOLD,40));
			add(btns[i]);
		}
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			String face = e.getActionCommand().trim();
			String equation = OutPut.lblOut.getText().trim();
			switch(face){
			case "0":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "1":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "2":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "3":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "4":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "5":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "6":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "7":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "8":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			case "9":{CalcJFrame.updateLblOut(face);
			System.out.println("The button "+face+" was clicked");}break;
			
			case "=":{CalcJFrame.clearLblOutAns();
				CalcJFrame.updateLblOutAns( CalcJFrame.getResultFromEquation(equation)  );
			CalcJFrame.clearLblOut();
			CalcJFrame.makeEqual();;

			//OutPut.setLblOut(OutPut.getLblOutAns());
			}break;
			case "C":{CalcJFrame.clearLblOut();
			CalcJFrame.clearLblOutAns();}break;
			}
		}
	

}
