package Transportation;

public class Main { // 부모 Class
    int Number;
    int Oil = 100;
    int Speed = 0;
    int Passenger = 0;
    int MaxPassenger;
    int Pay;
    boolean state = true;

    void CarState(boolean ChangeState) {
        if (ChangeState) {
            System.out.println("운행을 시작합니다.");
        } else {
            System.out.println("차고지로 돌아갑니다.");
        }
    }

    void SpeedCheck(int ChangeSpeed) { // 속도 어디감?
        this.Speed += ChangeSpeed;
        System.out.println("속도변경: " + Speed);
    }

    void OilCheck(int ChangeOil) {
        this.Oil += ChangeOil;
        System.out.println("기름상태: " + Oil);
        if (Oil < 10) {
            state = false;
            System.out.println("주유가 필요합니다. 차고지행");
        }
    }

    void PassengerCheck(int ChangePassenger) {
        this.Passenger += ChangePassenger;
        System.out.println(Passenger+ "명 탑승했습니다.");

        if (Passenger > this.MaxPassenger) {
            Passenger = Passenger - ChangePassenger;
            System.out.println("최대 승객 수 초과 " + Passenger+ "명 탑승 중 입니다.");
            System.out.println("잔여 승객 수: " + (MaxPassenger - Passenger));
        } else {
            System.out.println("잔여 승객 수: " + (MaxPassenger - Passenger));
            System.out.println("요금 확인: " + (Pay * Passenger));
        }
    }
}
