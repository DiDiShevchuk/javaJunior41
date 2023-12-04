package lesson13;

public class BelarusianHen extends Hen{
    public String country(){
        return "Беларусь";
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 150;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + this.country() + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
