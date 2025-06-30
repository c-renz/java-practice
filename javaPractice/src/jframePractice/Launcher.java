package jframePractice;

import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() { // used to run all java swing programs, kind of starting lines

			@Override
			public void run() {
				// SWING PRACTICE
				// SWING 01 // best practice on creating windows
//				MainWindow main = new MainWindow();
//				main.show();
				// SWING 02
				JFrameFirstWay frame1 = new JFrameFirstWay();
			}

		});
	}

}
