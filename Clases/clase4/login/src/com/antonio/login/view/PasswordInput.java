package com.antonio.login.view;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PasswordInput extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2645790177350699152L;

	
	private JLabel lbl;
	private JPasswordField txt;
	public PasswordInput(String text) {
		super();
		this.setLayout(new FlowLayout());
		
		lbl = new JLabel(text);
		txt = new JPasswordField(20);
		
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
