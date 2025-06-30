package jframePractice;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutPractice {
	private JFrame frame;
	private JPanel panel;

	public GridLayoutPractice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Grid Layout Practice");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
//			this.frame.setResizable(false);
		panel = new JPanel(new GridLayout(4, 5, 10, 5)); // (rows, columns, horizontal gap, vertical gap)

		for (int i = 1; i <= 20; i++) {
			JButton button = new JButton("Button " + Integer.toString(i));
			panel.add(button);
		}

		// add
		frame.add(panel);
		frame.pack();

	}

	public void show() {
		this.frame.setVisible(true);
	}
}
