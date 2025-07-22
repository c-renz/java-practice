package jframePractice;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonPractice {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;

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
		label = new JLabel();

		button = createButton();
		// add
		this.panel.add(button);
		this.frame.add(panel, BorderLayout.CENTER);
	}

	private JButton createButton() {
		JButton button = new JButton("Print");
		button.setFocusable(false);
		button.setIcon(
				new ImageIcon(new ImageIcon("img/da.jpg").getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH)));
		button.setIconTextGap(10);
		/// this is the format when theres a need to resize the image and get the image
		/// path in one line
		button.setSize(10, 50);
		button.setMnemonic(KeyEvent.VK_P); // makes have underline on P and can use Alt + p
		button.setToolTipText("Hello, this is the hover effect");
		button.setFont(new Font("Arial", Font.PLAIN, 20));
		button.setMargin(new Insets(10, 20, 30, 40));
		button.addActionListener(new ActionListener() { // action related on the button

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ACTION PERFORMED");
				label.setText("Action performed!");
				panel.add(label);
			}
		});
		return button;
	}

	public void show() {
		this.frame.setVisible(true);
	}
}
