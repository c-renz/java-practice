package jframePractice;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonPractice {
	private JFrame frame;
	private JPanel panel;

	public JButtonPractice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Grid Layout Practice");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
//			this.frame.setResizable(false);
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
