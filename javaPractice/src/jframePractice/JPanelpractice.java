package jframePractice;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelpractice {
	private JFrame frame;

	public JPanelpractice() {
		initialize();
	}

	private void initialize() {
		// creation
		frame = new JFrame();
		this.frame.setTitle("JPanel Practice");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);

		this.frame.setLocationRelativeTo(null);
//		this.frame.setResizable(false);

		JPanel panel = new JPanel(); // works like container
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5)); // Flowlayout(align, hgap,vgap): // align value
																	// represents the flow of things inside the
																	// panel/container
//		align the alignment value
//		hgap the horizontal gap between components and between the components and the borders of the Container
//		vgap the vertical gap between components and between the components and the borders of the Container
		panel.setBackground(Color.RED);
		panel.setPreferredSize(new Dimension(100, 100));
		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");

		// adding and showing the things created part
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		this.frame.add(panel, BorderLayout.WEST); // BorderLayout value represents the location of the panel/container
		this.frame.setVisible(true);
	}
}
