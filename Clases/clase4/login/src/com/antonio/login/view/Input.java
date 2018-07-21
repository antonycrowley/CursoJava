package com.antonio.login.view;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Input extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8307785652156640272L;
	
	private JLabel lbl;
	private JTextField txt;
	public Input(String text) {
		super();
		this.setLayout(new FlowLayout());
		
		lbl = new JLabel(text);
		txt = new JTextField(20);
		
		this.add(lbl);
		this.add(txt);
	}
	
	
	
	public void setText(String text) {
		txt.setText(text);
	}
	
	public String getText() {
		return txt.getText();
	}
	
	

}
