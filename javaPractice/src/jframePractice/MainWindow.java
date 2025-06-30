package jframePractice;

import javax.swing.JFrame;

public class MainWindow {
	public static void main(String[] args) {

	}

	private JFrame window;

	public MainWindow() {
		window = new JFrame();
		window.setTitle("JFrame Practice");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // this makes the x button on the top right corner of
																	// the window works properly
		window.setSize(800, 500);
		window.setLocationRelativeTo(null); // this pertains to the location of the window when run, relative to null
											// means center

	}

	public void show() {
		window.setVisible(true);

	}
}
