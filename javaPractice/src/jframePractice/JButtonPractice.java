package jframePractice;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonPractice {
	private JFrame frame;
	private JPanel panel;
	private JButton button;

	public JButtonPractice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JButton Practice");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
//			this.frame.setResizable(false);
		panel = new JPanel();

		button = createButton();
		// add
		this.panel.add(button);
		this.frame.add(panel, BorderLayout.CENTER);
	}

	private JButton createButton() {
		JButton button = new JButton("Print");
		button.setFocusable(false);
		return button;
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
