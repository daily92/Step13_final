package test.mypac;
/*
 *  ���� ����� (���� ��� �̿�)
 */
public class AttackUnit {
	// ���ڸ� ���ȭ ��Ű��
		//�ǹ� ���� ���� 0, 1, 2 �� FIST, SWORD, GUN �̸� �ο��� ȿ��!
	public static final int FIST= 0;
	public static final int SWORD= 1;
	public static final int GUN=2;
	
	private int weaponState= 0;
	
	// ������ ���¸� �ٲٴ� �޼ҵ�
		//setw + ctrl + space
	public void setWeaponState(int weaponState) {
		this.weaponState = weaponState;
	}
	
	// ���� �ϴ� �޼ҵ�
	public void attack() {
		if(weaponState==AttackUnit.FIST) {
			System.out.println("�ָ����� ����!");
		}else if(weaponState==SWORD) {
			System.out.println("Į�� ����!");
		}else if(weaponState==GUN) {
			System.out.println("������ ����!");
		}
	}
}
