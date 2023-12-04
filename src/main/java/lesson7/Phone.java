package lesson7;

public class Phone {
    private String number;
    private String model;
    private int weight;
    public Phone(){

    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String model, int weight){
        this.model = model;
        this.weight = weight;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    void receiveCall(String name){
        System.out.printf("Звонит %s \n", name);
    }

}
