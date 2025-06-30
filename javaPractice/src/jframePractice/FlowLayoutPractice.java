package jframePractice;

import javax.swing.JFrame;

public class FlowLayoutPractice {
	private JFrame frame;

	public FlowLayoutPractice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame = new JFrame();
		this.frame.setTitle("Flow Layout Practice");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
//		this.frame.setResizable(false);
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
