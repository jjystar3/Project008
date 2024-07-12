package inheritance;

public class Quiz04 {

	public static void main(String[] args) {
		
		Monster monster = new Monster(10, 100);
		monster.showInfo();
		monster.useAttack();
		
		System.out.println();
		
		Slime slime = new Slime(30, 200, "마비");
		slime.showInfo();
		slime.useAttack();
		slime.useSkill();
		
	}

}

class Monster {
	int attack;
	int health;
	
	public Monster(int attack, int health) {
		this.attack = attack;
		this.health = health;
	}

	public void useAttack() {
		System.out.println("몬스터가 " + attack + "만큼 공격했다!");
	}

	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + attack + "이고, 체력은 " + health + "이다.");
	}
}

class Slime extends Monster {
	String skill;
	
	public Slime(int attack, int health, String skill) {
		super(attack, health);
		this.skill = skill;
	}

	public void useSkill() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
	}
}