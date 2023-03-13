public class OrderJava {
    boolean isFilled; //está em estoque
    double billAmount; // valor da conta
    String shipping; // envio
    String cuponCode; // cupon de desconto

    public OrderJava(boolean filled, double cost, String shippingMethod , String cupon) {
        if(cost > 24){
            System.out.println("Valor alto");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        cuponCode = cupon;
    }
    // fornece feedback
    public void ship(){
        if(isFilled){
            System.out.println("enviando");
            System.out.println("Enviando por: " + calculateShipping() );
        } else {
            System.out.println ("Não está pronto");
        }
    }
    public double calculateShipping() {
       double shippingCost = 50.00;
       switch(shipping){
        case "Regular":
        shippingCost = 0.0;
        break;
        case "Express":
        shippingCost = 1.75;
        break;
       }
    return shippingCost;
    }
    public static void main (String[] args){
        OrderJava book = new OrderJava(true, 9.99, "Express", "Não Possui");
        OrderJava chemi = new OrderJava(false, 72.5, "Regular","Possui");
        System.out.println("Detalhes do predido book: ");
        book.ship();
        System.out.println("Detalhes do pedido chemi: ");
        chemi.ship();
    }
}
