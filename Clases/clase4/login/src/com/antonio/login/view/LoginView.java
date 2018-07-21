package com.antonio.login.view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.antonio.login.dao.PersonDAO;
import com.antonio.login.daoimpl.PersonDAOImpl;
import com.antonio.login.model.Person;
import com.antonio.login.util.SessionData;
import com.antonio.login.util.UtilFunctions;

public class LoginView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4765784781996532123L;
	
	/**
	 * 
	 */
	
	private JButton loginBtn;
	private JButton registerBtn;
	private Input userIn;
	private PasswordInput passwordIn;
	
	public LoginView() {
		super("Login");
		setSize(350,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildGUI();
	}
	
	public void buildGUI() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		createUserInput(container);
		createPasswordInput(container);
		createButtons(container);
		ImageIcon img = new ImageIcon("C:\\Users\\Miguel\\Documents\\GitHub\\CursoJava\\Clases\\clase4\\login\\resources\\Duke.png");
		this.setIconImage(img.getImage());
	}
	
	public void createUserInput(Container container) {
		userIn = new Input("Username: ");
		container.add(userIn);
	}
	
	public void createPasswordInput(Container container) {
		passwordIn = new PasswordInput("Password: ");
		container.add(passwordIn);
	}
	
	public void createButtons(Container container) {
		loginBtn = new JButton("Login");
		registerBtn = new JButton("Register");
		
		container.add(loginBtn);
		container.add(registerBtn);
		
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		
		
		registerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UtilFunctions.redirect(LoginView.this, new RegisterView());
			}
		});
	}
	
	public void login() {
		String personEmail = userIn.getText();
		PersonDAO personDao = new PersonDAOImpl();
		Person person = personDao.getByEmail(personEmail);
		
		String hashedPassword = UtilFunctions.hash(passwordIn.getText());
		
		try {
			if(hashedPassword.equals(person.getPassword())) {
				SessionData.setCurrentPerson(person);
				UtilFunctions.redirect(this, new MainView());
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect Password");
			}
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "User doesnt exist");
		}
	}

}
