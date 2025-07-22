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
//				JFrameFirstWay frame1 = new JFrameFirstWay();
//				JFrameBestWay frame2 = new JFrameBestWay(); // Best way
				// SWING 03
//				JPanelpractice frame3 = new JPanelpractice();
				// SWING 04
//				BorderLayoutPractice borderPractice = new BorderLayoutPractice();
//				borderPractice.show();
				// SWING 05
//				FlowLayoutPractice flowPractice = new FlowLayoutPractice();
//				flowPractice.show();
				// SWING 06
//				GridLayoutPractice gridPractice = new GridLayoutPractice();
//				gridPractice.show();
				// SWING 07
//				JButtonPractice buttonPractice = new JButtonPractice();
//				buttonPractice.show();
			}

		});
	}

}
