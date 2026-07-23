public class ResultStruct {
    private double Price;
    private String Message;

    public ResultStruct(String Message, double Price) {
        this.Message = Message;
        this.Price = Price;
    }
     
    
    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

}
