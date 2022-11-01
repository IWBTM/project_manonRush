package bottomFire;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import frames.Ground;
import lombok.Getter;
import lombok.Setter;
import player.Player;

@Getter
@Setter
public class BottomFire extends JLabel {

	private Player player;
	private Ground groundContext;

	private ImageIcon[] bottomFires = new ImageIcon[10];
	private String[] bottomFireImages = { "C:/manonRush_project/rushGG/images/bottomFire1.png", "C:/manonRush_project/rushGG/images/bottomFire2.png", "C:/manonRush_project/rushGG/images/bottomFire3.png",
			"C:/manonRush_project/rushGG/images/bottomFire4.png", "C:/manonRush_project/rushGG/images/bottomFire5.png", "C:/manonRush_project/rushGG/images/bottomFire6.png", "C:/manonRush_project/rushGG/images/bottomFire7.png",
			"C:/manonRush_project/rushGG/images/bottomFire8.png", "C:/manonRush_project/rushGG/images/bottomFire9.png", "C:/manonRush_project/rushGG/images/bottomFire10.png" };

	private final int DAMAGE = 1;
	private final int WIDTH = 500;
	private final int HEIGHT = 200;

	private int x;
	private int y;

	private int playerX;
	private int playerY;

	private int playerWidth;
	private int playerHeight;

	public BottomFire(Player player) {
		this.player = player;

		initData();
		setInitLayout();
		burning();
	}

	private void initData() {
		x = 495;
		y = 530;

		playerX = player.getX();
		playerY = player.getY();

		playerWidth = player.getWidth();
		playerHeight = player.getHeight();

		for (int i = 0; i < bottomFires.length; i++) {
			bottomFires[i] = new ImageIcon(bottomFireImages[i]);
		}
	}

	private void setInitLayout() {
		setIcon(bottomFires[0]);
		setLocation(x, y);
		setSize(WIDTH, HEIGHT);
	}

	public void burning() {

		new Thread(() -> {

			while (true) {
				for (int i = 0; i < bottomFireImages.length; i++) {
					try {
						setIcon(bottomFires[i]);
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		}).start();
	}
}
