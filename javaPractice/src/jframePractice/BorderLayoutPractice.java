package jframePractice;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutPractice {
	private JFrame frame;

	public BorderLayoutPractice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame = new JFrame();
		this.frame.setTitle("Border Layout Practice");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
//		this.frame.setResizable(false);
		this.frame.setLayout(new BorderLayout(5, 20));

		// add section
		this.frame.add(new JButton("NORTH"), BorderLayout.NORTH);
		this.frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		this.frame.add(new JButton("CENTER"), BorderLayout.CENTER);
		this.frame.add(new JButton("WEST"), BorderLayout.WEST);
		this.frame.add(new JButton("EAST"), BorderLayout.EAST);

	}

	public void show() {
		this.frame.setVisible(true);
	}
}
