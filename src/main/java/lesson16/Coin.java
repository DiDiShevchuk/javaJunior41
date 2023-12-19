package lesson16;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private int nominal;
    private int year;
    private String metall;
    private double diametr;

    public Coin() {
    }

    public Coin(int nominal, int year, String metall, double diametr) {
        this.nominal = nominal;
        this.year = year;
        this.metall = metall;
        this.diametr = diametr;
    }

    public int getNominal() {
        return nominal;
    }

    public int getYear() {
        return year;
    }

    public String getMetall() {
        return metall;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", metall='" + metall + '\'' +
                ", diametr=" + diametr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        if (Double.compare(coin.diametr, diametr) != 0) return false;
        return Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        result = 31 * result + year;
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        temp = Double.doubleToLongBits(diametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        // + 0 -, чтобы указать сторону куда мы идем
        // this - первая монета, которая будет вызываться методом Compable
        // o- вторая монета, куда она будет идти вправо или в влево
        // как сортируем- по номиналу, только тогда, когда разные номиналы, если совпадает, то идем сортируем по году и так далее
       if(this.nominal != o.nominal){
           return this.nominal - o.nominal; // 5 - 10 = -5 // возвращаем либо минус, либо плюс
       }
       if(this.year != o.year){
           return this.year - o.year; // 1900-1800  = 100// получили либо минус, либо плюс
       }
       if(this.metall.equals(o.metall)){
           return this.metall.compareTo(o.metall);

       }

        return Double.compare(this.diametr, o.diametr);
    }
}
