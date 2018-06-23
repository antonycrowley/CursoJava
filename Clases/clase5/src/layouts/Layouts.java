package layouts;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame implements ActionListener {

	private JButton borderBtn;
	private JButton flowBtn;
	private JButton gridBtn;

	public Layouts() {

		super("Layouts");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);

		borderBtn = new JButton("BorderLayout Window");
		borderBtn.addActionListener(this);

		flowBtn = new JButton("FlowLayout window");
		gridBtn = new JButton("Grid Layout window");
		gridBtn.addActionListener(this);


		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		container.add(borderBtn);
		container.add(flowBtn);
		container.add(gridBtn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String btnText = btn.getText();
		if (btnText.equals("BorderLayout Window")) {
			BorderLayoutEx borderLayout = new BorderLayoutEx();
			borderLayout.setVisible(true);
		}

		if (btnText.equals("Grid Layout window")) {
			GridLayoutEx gridLayout = new GridLayoutEx();
			gridLayout.setVisible(true);
		}
	}

}
