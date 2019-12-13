
//Evil Lily's Password: JesusChrist123!
import javax.swing.JFrame;

public class TheAppleToMyPie {
	JFrame frame;
	final int _width = 600;
	final int _height = 800;

	public static void main(String[] args) {
		new TheAppleToMyPie().setup();
	}

	TheAppleToMyPie() {
		frame = new JFrame();
	}

	void setup() {
		frame.setVisible(true);
		frame.setSize(_width, _height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub

	}
}
