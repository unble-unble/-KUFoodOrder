package Entity;

public class Order {

    private String orderTime; //주문시간
    private String orderId; //주문정보id
    private User user; //주문자정보
    private Food food; //주문음식
    private int quantity; //주문한 갯수

    public Order(String orderTime, String orderId, User user, Food food, int quantity) {
        this.orderTime = orderTime;
        this.orderId = orderId;
        this.user = user;
        this.food = food;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public User getUser() {
        return user;
    }

    public Food getFood() {
        return food;
    }

    public int getQuantity() {
        return quantity;
    }
}
