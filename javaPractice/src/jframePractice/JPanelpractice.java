package jframePractice;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelpractice {
	private JFrame frame;

	public JPanelpractice() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JPanel Practice");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);

		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(false);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5)); // Flowlayout(align, hgap,vgap):
//		align the alignment value
//		hgap the horizontal gap between components and between the components and the borders of the Container
//		vgap the vertical gap between components and between the components and the borders of the Container
		panel.setBackground(Color.RED);
		this.frame.setVisible(true);
	}
}
