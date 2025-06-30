package jframePractice;

import javax.swing.JFrame;

public class JFrameBestWay {
	private JFrame frame;

	public JFrameBestWay() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JFrame Best Way");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // using 'this.', Always refers to class field
																		// When field is shadowed by a parameter, or for
																		// clarity
		this.frame.setSize(800, 500);
		this.frame.setVisible(true);
		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(false);

	}
}
