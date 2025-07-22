package jframePractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JLabelPractice {
	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JButton button;

	public JLabelPractice() {
		initialize();
	}

	private void initialize() {
		// create
		frame = new JFrame();
		frame.setTitle("JLabel Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.GRAY);

		label = new JLabel("LABEL TEXT HERE");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Sans-serif", Font.BOLD, 10));
		label.setIcon(
				new ImageIcon(new ImageIcon("img/da.jpg").getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH)));
		label.setIconTextGap(10);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setVerticalTextPosition(SwingConstants.BOTTOM);

		button = createButton("Update 1", "SOUTH",
				"<html><p style=\"text-align: center; display: inline;\">Label Text Here<br>(UPDATED 1)</p></html>");
		button = createButton("Update 2", "WEST",
				"<html><p style=\"text-align: center; display: inline;\">Label Text Here<br>(UPDATED 2)</p></html>");
		button = createButton("Update 3", "EAST",
				"<html><p style=\"text-align: center; display: inline;\">Label Text Here<br>(UPDATED 3)</p></html>");
		// As is/conventional method
//		button = new JButton("Update Label Text");
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				label.setText(
//						"<html><p style=\"text-align: center; display: inline;\">Label Text Here<br>(UPDATED)</p></html>");
//
//			}
//		});

		// add
//		frame.add(button, BorderLayout.SOUTH);
		panel.add(label);
		frame.add(panel, BorderLayout.NORTH);
	}

	private JButton createButton(String name, String location, String changeLabelSetText) {
		JButton button = new JButton(name);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(changeLabelSetText);
			}
		});
		frame.add(button, getBorderLayoutConstant(location));
		return button;
	}

	private String getBorderLayoutConstant(String location) {
		switch (location.toUpperCase()) {
		case "NORTH":
			return BorderLayout.NORTH;
		case "SOUTH":
			return BorderLayout.SOUTH;
		case "EAST":
			return BorderLayout.EAST;
		case "WEST":
			return BorderLayout.WEST;
		case "CENTER":
			return BorderLayout.CENTER;
		default:
			throw new IllegalArgumentException("Invalid BorderLayout location: " + location);
		}
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
