package ex1_enum;

public class Ex2_enum {
	public static void main(String[] args) {
		Item start = Item.START;
		String str = start.getItemstr();
		System.out.println(str);
		
		//���� for���� �̿��Ͽ� �������� ��ü ���� ����ϱ�
		Item[] items = Item.values();
		for(Item item : items) {
			System.out.println(item.getItemstr()+","+item.getSymbol());
		}
	}
}
