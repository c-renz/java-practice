package jframePractice;

import javax.swing.JFrame;

public class JFrameFirstWay extends JFrame { // not best practice
	public JFrameFirstWay() {
		initialize();
	}

	public void initialize() {
		setTitle("JFrame First Way");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(800, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false); // this make resizing of window not possible
	}

}
