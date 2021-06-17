package step01;

//class Car {
//    void run() {
//        System.out.println("차가 달립니다.");        
//    }
//    // 정수 하나를 매개변수로 받는 메소드, run을 추가해 보세요.
//    void run(int a){
//        System.out.println("차가 " + a +"대 달립니다.");
//    }
//    
//}

public class Car {
    String name;
    int number;

    Car(){
        this("이름없음", 0);
    }
    
    Car(String name){
        this(name, 0);
    }
    
    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}