package Mid;


public class Mid_3 {
	Mid_2 md2[];
	
	Mid_3(int n){
		md2 = new Mid_2[n];
		input("������", "��õ��", 18);
		input("ȫ�浿", "��õ��", 19);
	}
	public Mid_2 input(String name, String address, int studentNum) {
		int i = 0;
		for(; i < md2.length; i++) {
			if(this.md2[i] == null) {
				md2[i] = new Mid_2(name, address, studentNum);
				break;
			}
		}
		return md2[i];
	}
	
	public String seek(String name) {
		for(int i=0; i < md2.length; i++) {
			if(this.md2[i].getName().equals(name)) {
				return md2[i].getAddress();
			}else
				return "����";
		}
		return null;
	}
	public String seek(int studentNum) {
		for(int i=0; i < md2.length; i++) {
			if(this.md2[i].getStudentNum() == studentNum) {
				return md2[i].getAddress();
			}else
				return "����";
		}
		return null;
	}

	public static void main(String[] args) {
		int n = 3;
		Mid_3 md3 = new Mid_3(n);
	
//		System.out.println(md3.seek("������"));
//		System.out.println(md3.seek(18));
		System.out.println(md3.seek(19));
//		System.out.println(md3.seek("ȫ�浿"));
	}
}
