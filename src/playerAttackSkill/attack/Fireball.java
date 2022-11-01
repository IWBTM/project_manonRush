package playerAttackSkill.attack;

import javax.swing.ImageIcon;

import frames.Ground;
import player.Player;
import playerAttackSkill.SkillImpact;

public class Fireball extends SkillImpact {

	private String[] skillImage = { "C:/manonRush_project/rushGG/images/wizardAttack1.png", "C:/manonRush_project/rushGG/images/wizardAttack2.png", "C:/manonRush_project/rushGG/images/wizardAttack3.png",
			"C:/manonRush_project/rushGG/images/wizardAttack4.png", "C:/manonRush_project/rushGG/images/wizardAttack5.png", "C:/manonRush_project/rushGG/images/wizardAttack6.png",
			"C:/manonRush_project/rushGG/images/wizardAttack7.png", "C:/manonRush_project/rushGG/images/wizardAttack8.png", "C:/manonRush_project/rushGG/images/wizardAttack9.png",
			"C:/manonRush_project/rushGG/images/wizardAttack10.png", "C:/manonRush_project/rushGG/images/wizardAttack11.png", "C:/manonRush_project/rushGG/images/wizardAttack12.png" };

	public Fireball(Ground groundContext, Player player, int x, int y, int power, int skillPower, int skillWidth,
			int skillHeight) {
		super(groundContext, player, x, y, power, skillPower, skillWidth, skillHeight);

		initData();
		setInitLayout();
	}

	public void initData() {

		sight = 10;

		skillBeforeDisappear = 10;
		skillDisappear = 10;

		for (int i = 0; i < skillImage.length; i++) {
			skillRightImpact[i] = new ImageIcon(skillImage[i]);
			skillLeftImpact[i] = new ImageIcon(skillImage[i]);
		}
	}
}