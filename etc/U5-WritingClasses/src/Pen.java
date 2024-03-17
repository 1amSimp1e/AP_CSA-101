public class Pen {
    private String penColor;
    private String penType;

    // Setting the pen color and penType
    public Pen(String penColor, String penType){
        this.penColor = penColor;
        this.penType = penType;
    }
    
    // Acessor Method
    public String getPenColor(){
        return penColor;
    }

    // Getters Method
    public void setPenColor(String color){
        penColor = color;
    }


    public String getPenType(){
        return penType;
    }

    // Getters Method
    public void setPenType(String type){
        penType = type;
    }

    public String toString(){
        return "This is a " + penType + " with a color " + penColor;
    }
}
