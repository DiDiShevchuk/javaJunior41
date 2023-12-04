package lesson13;

public class UkrainianHen extends Hen{

    public String country(){
        return "Украина";
    }

    public int getCountOfEggsPerMonth(){
        return 230;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + this.country() + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
