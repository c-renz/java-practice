package jframePractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutPractice {
	private JFrame frame;
	private JPanel panel;

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

		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.red);

		for (int i = 1; i <= 5; i++) {
			JButton button = new JButton("Button " + Integer.toString(i));
			panel.add(button);
		}
		// add
		this.frame.add(panel, BorderLayout.CENTER);
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
