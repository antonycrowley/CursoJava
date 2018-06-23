package layouts;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		super("Grid Layout");

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildGUI();
	}

	private void buildGUI() {
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 3));
		createButtons(container);

	}

	private void createButtons(Container container) {
		for(int i = 1; i <= 9 ; i++) {
			container.add(new JButton("Button" + i));
		}
		
	}

}
