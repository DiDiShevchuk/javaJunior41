package lesson13;

public class RussianHen extends Hen{
    public String country(){
        return "Россия";
    }

    public int getCountOfEggsPerMonth(){
        return 412;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + this.country() + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
