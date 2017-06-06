package cal_GUI2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CalcJFrame extends JFrame{
	
	//static protected JButton lblOut;
	//private JButton btnEq;
	//private JButton btnClr;
	
	public CalcJFrame(){
		JPanel container = new JPanel();
		container.setLayout(new BorderLayout());
		
		OutPut out=new OutPut();
		
		NumButtonsJP numbtns = new NumButtonsJP();//create an instance of a number button jpanel
		OpButtonsJP opbtns = new OpButtonsJP();
		SpButtons spopbtns = new SpButtons();
		//spopbtns.setBorder(BorderFactory.createLineBorder(Color.red));
		
		container.add(out, BorderLayout.NORTH);
		out.setPreferredSize(new Dimension(500, 250));
		container.add(numbtns, BorderLayout.CENTER);//add the number button panel to the container
		numbtns.setPreferredSize(new Dimension(500, 400));
		container.add(opbtns, BorderLayout.EAST);
		opbtns.setPreferredSize(new Dimension(150, 400));
		container.add(spopbtns, BorderLayout.SOUTH);
		spopbtns.setPreferredSize(new Dimension(400, 100));
		add(container);//container now has all the jpanels in it.. so we add it to the jframe
		
	}


	public static void updateLblOut(String text) {
		
		String currLblText = OutPut.lblOut.getText().trim();
		if(currLblText.equals("0.0")||currLblText.equals("error"))
		OutPut.lblOut.setText(text);
		else
		OutPut.lblOut.setText(currLblText+text);
	}
	public static void updateLblOutAns(String text) {
		String currLblText = OutPut.lblOutAns.getText().trim();
		OutPut.lblOutAns.setText("="+currLblText+text);
		//CalcJFrame.lblOut.setText(currLblText+text);
	}
	public static void makeEqual() {
		String currLblText = OutPut.lblOutAns.getText().trim();
		OutPut.lblOut.setText(currLblText.substring(1, currLblText.length()));
		//CalcJFrame.lblOut.setText(currLblText+text);
	}
	public static void clearLblOut() {
		//CalcJFrame.lblOut.setText(" ");
		OutPut.lblOut.setText(" ");
	}
	public static void clearLblOutAns() {
		//CalcJFrame.lblOut.setText(" ");
		OutPut.lblOutAns.setText(" ");
	}

	public static String getResultFromEquation(String eq) {
		String result = "";
		if(eq.startsWith("-")){
			eq=eq.substring(1, eq.length());
			if(eq.indexOf("+")!=-1){
				
				int i=eq.indexOf("+");
				double a=Double.parseDouble(eq.substring(0, (i)));
				double b=Double.parseDouble(eq.substring((i+1),eq.length()));
					result+=""+(-a+b);
				}
				else if(eq.indexOf("-")!=-1){				
					int i=eq.indexOf("-");
					double a=Double.parseDouble(eq.substring(0, (i)));
					double b=Double.parseDouble(eq.substring((i+1),eq.length()));
						result+=""+(-a-b);	
					}
				else if(eq.indexOf("*")!=-1){				
					int i=eq.indexOf("*");
					double a=Double.parseDouble(eq.substring(0, (i)));
					double b=Double.parseDouble(eq.substring((i+1),eq.length()));
						result+=""+((-a)*b);
					}
				else if(eq.indexOf("/")!=-1){				
					int i=eq.indexOf("/");
						double a=Double.parseDouble(eq.substring(0, (i)));
						double b=Double.parseDouble(eq.substring((i+1),eq.length()));
						if(b==0.0){
							result+="error";
						}
						else
						result+=""+(-a/b);//chech o
					}
				else if(eq.indexOf("^2")!=-1){				
					int i=eq.indexOf("^2");
					double a=Double.parseDouble(eq.substring(0, (i)));
						result+=""+(a*a);
					}
				else if(eq.indexOf("^3")!=-1){				
					int i=eq.indexOf("^3");
					double a=Double.parseDouble(eq.substring(0, (i)));
					result+=""+(-a*a*a);
					}
				else if(eq.indexOf("sqrt")!=-1){				
						
					result+="error";
					}
				else return "-"+eq;
				return result;
		}
		else {if(eq.indexOf("+")!=-1){
		
		int i=eq.indexOf("+");
		double a=Double.parseDouble(eq.substring(0, (i)));
		double b=Double.parseDouble(eq.substring((i+1),eq.length()));
			result+=""+(a+b);
		}
		else if(eq.indexOf("-")!=-1){				
			int i=eq.indexOf("-");
			double a=Double.parseDouble(eq.substring(0, (i)));
			double b=Double.parseDouble(eq.substring((i+1),eq.length()));
				result+=""+(a-b);	
			}
		else if(eq.indexOf("*")!=-1){				
			int i=eq.indexOf("*");
			double a=Double.parseDouble(eq.substring(0, (i)));
			double b=Double.parseDouble(eq.substring((i+1),eq.length()));
				result+=""+(a*b);
			}
		else if(eq.indexOf("/")!=-1){				
			int i=eq.indexOf("/");
				double a=Double.parseDouble(eq.substring(0, (i)));
				double b=Double.parseDouble(eq.substring((i+1),eq.length()));
				if(b==0.0){
					result+="error";
				}
				else
				result+=""+(a/b);//chech o
			}
		else if(eq.indexOf("^2")!=-1){				
			int i=eq.indexOf("^2");
			double a=Double.parseDouble(eq.substring(0, (i)));
				result+=""+(a*a);
			}
		else if(eq.indexOf("^3")!=-1){				
			int i=eq.indexOf("^3");
			double a=Double.parseDouble(eq.substring(0, (i)));
			result+=""+(a*a*a);
			}
		else if(eq.indexOf("sqrt")!=-1){				
			int i=eq.indexOf("sqrt");
			double s=Math.sqrt(Double.parseDouble(eq.substring(0, (i))));
			System.out.println(result);	
			result+=""+s;
			}
		else return eq;
		return result;}
	}

	


	public static void main(String [] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				CalcJFrame gui = new CalcJFrame();
				gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
				gui.setSize(500,500);
				gui.pack();
				gui.setVisible(true);
				
			}
		});
	}



}
