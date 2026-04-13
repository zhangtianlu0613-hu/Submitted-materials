package week2_zhangtianlu.practice2;

public class Armor implements Item{
	private int defenceValue;
	private String name;
	
	public Armor(String name,int defenceValue) {
		this.name = name;
		this.defenceValue = defenceValue;
	}

	public int getDefenceValue() {
		return defenceValue;
	}

	public String getName() {
		return name;
	}

	@Override
	public void use() {
		System.out.println(name+"を身に着けた");
		System.out.println("守備力が"+defenceValue+"上がった");
	}
	
	
}
