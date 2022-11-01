package boss.hellBoss;

import javax.swing.ImageIcon;

import boss.Boss;
import frames.Ground;

public class HellBoss extends Boss {

	private String[] bossImg = { "C:/manonRush_project/rushGG/images/boss1Hell.png", "C:/manonRush_project/rushGG/images/boss3Hell.png", "C:/manonRush_project/rushGG/images/boss2Hell.png",
			"C:/manonRush_project/rushGG/images/boss3Hell.png" };
	private String[] bossAttackImg = { "C:/manonRush_project/rushGG/images/bossMotion1Hell.png", "C:/manonRush_project/rushGG/images/bossMotion2Hell.png",
			"C:/manonRush_project/rushGG/images/bossMotion3Hell.png", "C:/manonRush_project/rushGG/images/bossMotion4Hell.png", "C:/manonRush_project/rushGG/images/bossMotion5Hell.png",
			"C:/manonRush_project/rushGG/images/bossMotion6Hell.png", "C:/manonRush_project/rushGG/images/bossMotion7Hell.png", "C:/manonRush_project/rushGG/images/bossMotion8Hell.png",
			"C:/manonRush_project/rushGG/images/bossMotion9Hell.png", "C:/manonRush_project/rushGG/images/bossMotion10Hell.png", "C:/manonRush_project/rushGG/images/bossMotion11Hell.png",
			"C:/manonRush_project/rushGG/images/bossMotion12Hell.png", "C:/manonRush_project/rushGG/images/bossMotion13Hell.png", "C:/manonRush_project/rushGG/images/bossMotion14Hell.png",
			"C:/manonRush_project/rushGG/images/bossMotion15Hell.png", "C:/manonRush_project/rushGG/images/bossMotion16Hell.png", "C:/manonRush_project/rushGG/images/bossMotion17Hell.png",
			"C:/manonRush_project/rushGG/images/bossMotion18Hell.png", "C:/manonRush_project/rushGG/images/bossMotion19Hell.png" };
	private String[] bossDieImg = { "C:/manonRush_project/rushGG/images/bossDie1.png", "C:/manonRush_project/rushGG/images/bossDie2.png", "C:/manonRush_project/rushGG/images/bossDie3.png",
			"C:/manonRush_project/rushGG/images/bossDie4.png", "C:/manonRush_project/rushGG/images/bossDie5.png", "C:/manonRush_project/rushGG/images/bossDie6.png", "C:/manonRush_project/rushGG/images/bossDie7.png",
			"C:/manonRush_project/rushGG/images/bossDie8.png", "C:/manonRush_project/rushGG/images/bossDie9.png", "C:/manonRush_project/rushGG/images/bossDie10.png" };

	public HellBoss(Ground groundContext, int hp, int power) {
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
