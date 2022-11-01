package playerAttackSkill.skill;

import javax.swing.ImageIcon;

import frames.Ground;
import player.Player;
import playerAttackSkill.SkillImpact;

public class MegaSlash extends SkillImpact {

	private String[] skillLeftImage = { "C:/manonRush_project/rushGG/images/warriorSkill1.png", "C:/manonRush_project/rushGG/images/warriorSkill2.png",
			"C:/manonRush_project/rushGG/images/warriorSkill3.png", "C:/manonRush_project/rushGG/images/warriorSkill4.png", "C:/manonRush_project/rushGG/images/warriorSkill5.png",
			"C:/manonRush_project/rushGG/images/warriorSkill6.png", "C:/manonRush_project/rushGG/images/warriorSkill7.png", "C:/manonRush_project/rushGG/images/warriorSkill8.png",
			"C:/manonRush_project/rushGG/images/warriorSkill9.png", "C:/manonRush_project/rushGG/images/warriorSkill10.png", "C:/manonRush_project/rushGG/images/warriorSkill11.png" };
	private String[] skillRightImage = { "C:/manonRush_project/rushGG/images/warriorRightSkill1.png", "C:/manonRush_project/rushGG/images/warriorRightSkill2.png",
			"C:/manonRush_project/rushGG/images/warriorRightSkill3.png", "C:/manonRush_project/rushGG/images/warriorRightSkill4.png", "C:/manonRush_project/rushGG/images/warriorRightSkill5.png",
			"C:/manonRush_project/rushGG/images/warriorRightSkill6.png", "C:/manonRush_project/rushGG/images/warriorRightSkill7.png", "C:/manonRush_project/rushGG/images/warriorRightSkill8.png",
			"C:/manonRush_project/rushGG/images/warriorRightSkill9.png", "C:/manonRush_project/rushGG/images/warriorRightSkill10.png", "C:/manonRush_project/rushGG/images/warriorRightSkill11.png" };

	public MegaSlash(Ground groundContext, Player player, int x, int y, int power, int skillPower, int skillWidth,
			int skillHeight) {
		super(groundContext, player, x, y, power, skillPower, skillWidth, skillHeight);

		initData();
		setInitLayout();
	}

	public void initData() {

		sight = 15;
		skillBeforeFly = 4;
		skillBeforeDisappear = 5;
		skillDisappear = 11;

		for (int i = 0; i < skillLeftImage.length; i++) {
			skillLeftImpact[i] = new ImageIcon(skillLeftImage[i]);
			skillRightImpact[i] = new ImageIcon(skillRightImage[i]);
		}
	}
}