package calculadora12;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calcclass extends JFrame {
	private JPanel plnumbers;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt5;
	private JButton bt6;
	private JButton bt7;
	private JButton bt8;
	private JButton bt9;
	private JButton bt10;
	private JButton bt11;
	
	
	
    private JPanel plsinais;
	private JButton bt12;
	private JButton bt13;
	private JButton bt14;
	private JButton bt15;

	private JPanel plvisor;
	private JTextField visor;
    
	public  calcclass(){
		
    	this.getContentPane().setLayout(new BorderLayout());

    	this.getContentPane().add(getPlnumbers(),BorderLayout.CENTER);
    	this.getContentPane().add(getPlvisor(),BorderLayout.NORTH);

pack();
    	setSize(350,500);
    	setTitle("login");
    	setVisible(true);
       setResizable(false);
       
	}
	
   public JPanel getPlnumbers() {	   
	   
   if(plnumbers== null){
	   plnumbers= new JPanel();
		  
	   
			  plnumbers.setLayout(new GridLayout(5,4,5,5));
			  plnumbers.setPreferredSize(new Dimension(100,100));
	   //linha1
        
        Font F= new Font( Font.DIALOG,  Font.BOLD, 14);
        JButton bt1= new JButton("1");

        bt1.setFont(F);
 		bt1.setPreferredSize(new Dimension(2,2)); 	
  	    plnumbers.add(bt1);


		JButton bt2= new JButton("2");
        bt2.setFont(F);
		bt2.setPreferredSize(new Dimension(2,2));
  	    plnumbers.add(bt2);
  	     
		JButton bt3= new JButton("3");
        bt3.setFont(F);
	    bt3.setPreferredSize(new Dimension(2,2));
	    plnumbers.add(bt3);
	     
		 //****linha2
		JButton bt4= new JButton("x");
        bt4.setFont(F);
		bt4.setPreferredSize(new Dimension(2,2));		 
	    plnumbers.add(bt4);
	     
		JButton bt5= new JButton("4");
        bt5.setFont(F);

		bt5.setPreferredSize(new Dimension(2,2));
	    plnumbers.add(bt5);

		 	 //linha3
		 JButton bt6= new JButton("5");
	     bt6.setFont(F);
		 bt6.setPreferredSize(new Dimension(2,2));
	     plnumbers.add(bt6);

		 //****
		 JButton bt7= new JButton("6");
	     bt7.setFont(F);
		 bt7.setPreferredSize(new Dimension(2,2));
	     plnumbers.add(bt7);
	     
		 JButton bt8= new JButton("+");
	     bt8.setFont(F);
		 bt8.setPreferredSize(new Dimension(2,2));
	     plnumbers.add(bt8);

		JButton bt9= new JButton("7");
        bt9.setFont(F);
		bt9.setPreferredSize(new Dimension(2,2));
	    plnumbers.add(bt9);

		JButton bt10= new JButton("8");
        bt10.setFont(F);
		bt10.setPreferredSize(new Dimension(2,2));
	    plnumbers.add(bt10);

	    JButton bt11= new JButton("9");
        bt11.setFont(F);
        bt11.setPreferredSize(new Dimension(2,2));
	    plnumbers.add(bt11);
    
        JButton bt12= new JButton("-");
        bt12.setFont(F);
		bt12.setPreferredSize(new Dimension(2,2));
        plnumbers.add(bt12);

		JButton bt13= new JButton("0");
        bt13.setFont(F);
		bt13.setPreferredSize(new Dimension(2,2));
		plnumbers.add(bt13);

		JButton bt14= new JButton("%");
        bt14.setFont(F);
		bt14.setPreferredSize(new Dimension(2,2));
		plnumbers.add(bt14);
		
		

		JButton bt16= new JButton(",");
		
        bt16.setFont(F);
		bt16.setPreferredSize(new Dimension(2,80));
		plnumbers.add(bt16);
		
		JButton bt17= new JButton("=");
		
        bt17.setFont(F);
		bt17.setPreferredSize(new Dimension(2,2));
		plnumbers.add(bt17);
		
  
   }
		return plnumbers;
	}



	public JPanel getPlvisor() {
		if(plvisor== null){
		 plvisor= new JPanel();
		plvisor.setLayout(new GridLayout(1,1));
		plvisor.setPreferredSize(new Dimension (30,80));

		JTextField visor=new JTextField(10);
		visor.setEditable(false);
		
		plvisor.add(visor);
		
		
	}	
		return plvisor;
	}

}










