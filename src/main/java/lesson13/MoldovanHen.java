package lesson13;

public class MoldovanHen extends Hen {
    public String country(){
        return "Молдавия";
    }


    public int getCountOfEggsPerMonth() {
        return 128;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + this.country() + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";

    }
}
