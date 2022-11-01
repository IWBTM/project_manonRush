package boss.nomalBoss;

import javax.swing.ImageIcon;

import boss.Boss;
import frames.Ground;

public class NormalBoss extends Boss {

	private String[] bossImg = { "C:/manonRush_project/rushGG/images/boss1.png",
			"C:/manonRush_project/rushGG/images/boss2.png", "C:/manonRush_project/rushGG/images/boss3.png",
			"C:/manonRush_project/rushGG/images/boss2.png" };
	private String[] bossAttackImg = { "C:/manonRush_project/rushGG/images/bossMotion1.png",
			"C:/manonRush_project/rushGG/images/bossMotion2.png", "C:/manonRush_project/rushGG/images/bossMotion3.png",
			"C:/manonRush_project/rushGG/images/bossMotion4.png", "C:/manonRush_project/rushGG/images/bossMotion5.png",
			"C:/manonRush_project/rushGG/images/bossMotion6.png", "C:/manonRush_project/rushGG/images/bossMotion7.png",
			"C:/manonRush_project/rushGG/images/bossMotion8.png", "C:/manonRush_project/rushGG/images/bossMotion9.png",
			"C:/manonRush_project/rushGG/images/bossMotion10.png",
			"C:/manonRush_project/rushGG/images/bossMotion11.png",
			"C:/manonRush_project/rushGG/images/bossMotion12.png",
			"C:/manonRush_project/rushGG/images/bossMotion13.png",
			"C:/manonRush_project/rushGG/images/bossMotion14.png",
			"C:/manonRush_project/rushGG/images/bossMotion15.png",
			"C:/manonRush_project/rushGG/images/bossMotion16.png",
			"C:/manonRush_project/rushGG/images/bossMotion17.png",
			"C:/manonRush_project/rushGG/images/bossMotion18.png",
			"C:/manonRush_project/rushGG/images/bossMotion19.png" };
	private String[] bossDieImg = { "C:/manonRush_project/rushGG/images/bossDie1.png",
			"C:/manonRush_project/rushGG/images/bossDie2.png", "C:/manonRush_project/rushGG/images/bossDie3.png",
			"C:/manonRush_project/rushGG/images/bossDie4.png", "C:/manonRush_project/rushGG/images/bossDie5.png",
			"C:/manonRush_project/rushGG/images/bossDie6.png", "C:/manonRush_project/rushGG/images/bossDie7.png",
			"C:/manonRush_project/rushGG/images/bossDie8.png", "C:/manonRush_project/rushGG/images/bossDie9.png",
			"C:/manonRush_project/rushGG/images/bossDie10.png" };

	public NormalBoss(Ground groundContext, int hp, int power) {
		super(groundContext, hp, power);

		initData();
		setInitLayout();
		waiting();

	}

	public void initData() {
		for (int i = 0; i < bossImg.length; i++) {
			boss[i] = new ImageIcon(bossImg[i]);
		}

		for (int i = 0; i < bossAttackImg.length; i++) {
			bossAttack[i] = new ImageIcon(bossAttackImg[i]);
		}

		for (int i = 0; i < bossDieImg.length; i++) {
			bossDie[i] = new ImageIcon(bossDieImg[i]);
		}
	}
}
