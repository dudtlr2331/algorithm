package step01;

//class Car {
//    void run() {
//        System.out.println("���� �޸��ϴ�.");        
//    }
//    // ���� �ϳ��� �Ű������� �޴� �޼ҵ�, run�� �߰��� ������.
//    void run(int a){
//        System.out.println("���� " + a +"�� �޸��ϴ�.");
//    }
//    
//}

public class Car {
    String name;
    int number;

    Car(){
        this("�̸�����", 0);
    }
    
    Car(String name){
        this(name, 0);
    }
    
    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}