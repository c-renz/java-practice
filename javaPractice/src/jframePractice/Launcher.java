package jframePractice;

import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() { // used to run all java swing programs, kind of starting lines

			@Override
			public void run() {
				MainWindow main = new MainWindow();
				main.show();

			}

		});
	}

}
