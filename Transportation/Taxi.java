package Transportation;

public class Taxi extends Main {

    Taxi() {
        this.Passenger = 0;
        this.MaxPassenger = 4;
        this.Oil = 100;
        this.Pay = 3000;
        this.state = true;
        this.Speed = 0;
    }

    String Destination = "";
    int DestinationLen = 0;
    int LenPay = 1000;
    int Basic = 1;
    int AccumulatePay = 0;


    void DestinationCheck(String FinalDestination) {
        this.Destination = FinalDestination;
        System.out.println("목적지: " + Destination);
    }

    void DestinationLen(int DestinationLenChange) {
        this.DestinationLen = DestinationLenChange;
        this.Basic = DestinationLenChange;
        System.out.println("목적지까지 거리:" + DestinationLen+"km");
    }

    @Override
    void PassengerCheck(int ChangePassenger) {
        this.Passenger += ChangePassenger;
        System.out.println(Passenger + "명 탑승했습니다.");

        if (Passenger > MaxPassenger) {
            Passenger = Passenger - ChangePassenger;
            System.out.println("최대 승객 수 초과 " + Passenger + "명 탑승 중 입니다.");
            System.out.println("잔여 승객 수: " + (MaxPassenger - Passenger));
        } else {
            AccumulatePay +=  Pay + (Basic * LenPay);
            System.out.println("잔여 승객 수: " + (MaxPassenger - Passenger));
            System.out.println("기본 요금 확인: " + Pay);
            System.out.println("지불할 요금: " + (Pay + (Basic * LenPay)));
        }
    }
}