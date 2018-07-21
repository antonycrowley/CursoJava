package com.antonio.login.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.antonio.login.daoimpl.PersonDAOImpl;
import com.antonio.login.util.SessionData;

public class MainView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2314067158770542154L;

	private JLabel welcomeLbl;
	private JLabel listLbl;

	public MainView() {
		super("Main");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildGUI();
	}

	public void buildGUI() {
		Container container = getContentPane();
		container.setLayout(new BorderLayout());

		welcomeLbl = new JLabel("Welcome " + SessionData.getCurrentPerson().getName());
		container.add(welcomeLbl, BorderLayout.NORTH);
		
		listLbl = new JLabel("<HTML>Lista <BR> de Personas <BR>" + "<BR><BR><HTML>" + new PersonDAOImpl().getAllPersons().toString());
		container.add(listLbl, BorderLayout.CENTER);

	}

}
