package playerAttackSkill.attack;

import javax.swing.ImageIcon;

import frames.Ground;
import player.Player;
import playerAttackSkill.SkillImpact;

public class Slash extends SkillImpact {

	private String[] skillLeftImage = { "C:/manonRush_project/rushGG/images/warriorAttack1.png", "C:/manonRush_project/rushGG/images/warriorAttack2.png",
			"C:/manonRush_project/rushGG/images/warriorAttack3.png", "C:/manonRush_project/rushGG/images/warriorAttack4.png", "C:/manonRush_project/rushGG/images/warriorAttack5.png",
			"C:/manonRush_project/rushGG/images/warriorAttack6.png", "C:/manonRush_project/rushGG/images/warriorAttack7.png" };
	private String[] skillRightImage = { "C:/manonRush_project/rushGG/images/warriorRightAttack1.png", "C:/manonRush_project/rushGG/images/warriorRightAttack2.png",
			"C:/manonRush_project/rushGG/images/warriorRightAttack3.png", "C:/manonRush_project/rushGG/images/warriorRightAttack4.png", "C:/manonRush_project/rushGG/images/warriorRightAttack5.png",
			"C:/manonRush_project/rushGG/images/warriorRightAttack6.png", "C:/manonRush_project/rushGG/images/warriorRightAttack7.png" };

	public Slash(Ground groundContext, Player player, int x, int y, int power, int skillPower, int skillWidth,
			int skillHeight) {
		super(groundContext, player, x, y, power, skillPower, skillWidth, skillHeight);

		initData();
		setInitLayout();
	}

	public void initData() {

		sight = 15;

		skillBeforeFly = 3;
		skillBeforeDisappear = 5;
		skillDisappear = 7;

		for (int i = 0; i < skillLeftImage.length; i++) {
			skillLeftImpact[i] = (new ImageIcon(skillLeftImage[i]));
			skillRightImpact[i] = (new ImageIcon(skillRightImage[i]));
		}

	}

}