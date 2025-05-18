public class FoodDeliveryApp {

    public static void main(String[] args) {
        Customer customer = new Customer("예빈");
        App app = new App();
        Server server = new Server();
        Rider rider = new Rider("배달기사 김철수");

        customer.orderFood(app, server, rider);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void orderFood(App app, Server server, Rider rider) {
        System.out.println(name + " 고객이 주문을 시작합니다.");
        app.placeOrder(server, rider, this);
    }
}

class App {
    void placeOrder(Server server, Rider rider, Customer customer) {
        System.out.println("앱에서 주문을 서버로 전송합니다.");
        server.processOrder(rider, customer);
    }
}

class Server {
    void processOrder(Rider rider, Customer customer) {
        System.out.println("서버가 주문을 접수하고 배달기사에게 요청합니다.");
        rider.acceptOrder();
        System.out.println("서버가 고객에게 예상 배달시간을 보냅니다.");
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }

    void acceptOrder() {
        System.out.println(name + " 가 주문을 수락하였습니다.");
    }
}
