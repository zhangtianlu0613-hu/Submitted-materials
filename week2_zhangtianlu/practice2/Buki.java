package week2_zhangtianlu.practice2;

public class Buki implements Item{
	private int attackValue;
	private String name;
	
	public Buki(String name,int attackValue) {
		this.name = name;
		this.attackValue = attackValue;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public String getName() {
		return name;
	}

	@Override
	public void use() {
		System.out.println(name+"でこうげき!");
		System.out.println("敵に"+attackValue+"のダメージ!");
	}
	
	
}
