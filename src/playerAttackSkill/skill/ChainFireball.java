package playerAttackSkill.skill;

import javax.swing.ImageIcon;

import frames.Ground;
import player.Player;
import playerAttackSkill.SkillImpact;

public class ChainFireball extends SkillImpact {

	private String[] skillRightImage = { "C:/manonRush_project/rushGG/images/wizardSkill1.png", "C:/manonRush_project/rushGG/images/wizardSkill2.png",
			"C:/manonRush_project/rushGG/images/wizardSkill3.png", "C:/manonRush_project/rushGG/images/wizardSkill4.png", "C:/manonRush_project/rushGG/images/wizardSkill5.png", "C:/manonRush_project/rushGG/images/wizardSkill6.png",
			"C:/manonRush_project/rushGG/images/wizardSkill7.png", "C:/manonRush_project/rushGG/images/wizardSkill8.png", "C:/manonRush_project/rushGG/images/wizardSkill9.png", "C:/manonRush_project/rushGG/images/wizardSkill10.png",
			"C:/manonRush_project/rushGG/images/wizardSkill11.png", "C:/manonRush_project/rushGG/images/wizardSkill12.png", "C:/manonRush_project/rushGG/images/wizardSkill13.png",
			"C:/manonRush_project/rushGG/images/wizardSkill14.png", "C:/manonRush_project/rushGG/images/wizardSkill15.png", "C:/manonRush_project/rushGG/images/wizardSkill16.png" };
	private String[] skillLeftImage = { "C:/manonRush_project/rushGG/images/wizardSkillL1.png", "C:/manonRush_project/rushGG/images/wizardSkillL2.png",
			"C:/manonRush_project/rushGG/images/wizardSkillL3.png", "C:/manonRush_project/rushGG/images/wizardSkillL4.png", "C:/manonRush_project/rushGG/images/wizardSkillL5.png",
			"C:/manonRush_project/rushGG/images/wizardSkillL6.png", "C:/manonRush_project/rushGG/images/wizardSkillL7.png", "C:/manonRush_project/rushGG/images/wizardSkillL8.png",
			"C:/manonRush_project/rushGG/images/wizardSkillL9.png", "C:/manonRush_project/rushGG/images/wizardSkillL10.png", "C:/manonRush_project/rushGG/images/wizardSkillL11.png",
			"C:/manonRush_project/rushGG/images/wizardSkillL12.png", "C:/manonRush_project/rushGG/images/wizardSkillL13.png", "C:/manonRush_project/rushGG/images/wizardSkillL14.png",
			"C:/manonRush_project/rushGG/images/wizardSkillL15.png", "C:/manonRush_project/rushGG/images/wizardSkillL16.png" };

	public ChainFireball(Ground groundContext, Player player, int x, int y, int power, int skillPower, int skillWidth,
			int skillHeight) {
		super(groundContext, player, x, y, power, skillPower, skillWidth, skillHeight);

		initData();
		setInitLayout();
	}

	public void initData() {

		sight = 30;
		skillBeforeFly = 6;
		skillBeforeDisappear = 10;
		skillDisappear = 16;

		for (int i = 0; i < skillLeftImage.length; i++) {
			skillRightImpact[i] = new ImageIcon(skillRightImage[i]);
			skillLeftImpact[i] = new ImageIcon(skillLeftImage[i]);
		}
	}
}