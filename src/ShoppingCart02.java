public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "camisas ";
        String message = custName+" quer comprar duas "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        
        double preço;
        double imposto;
        int quantidade;
        
        
        // Declare and assign a calculated totalPrice
        
        preço = 10.00;
        imposto = 2.89;
        quantidade = 2;
        
        preço *= quantidade;
        preço += quantidade * imposto;
        
       
        
        
        // Modify message to include quantity 
        
        System.out.println(message + "O custo total com o imposto é: " + preço );
        
        // Print another message with the total cost
        
    }    
}
