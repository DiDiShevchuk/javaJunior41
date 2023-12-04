package lesson7;

public class Person {
  private String fullNane;
  private int age;
  public Person(){

  }
    public Person(String fullNane, int age){
      this.fullNane = fullNane;
      this.age = age;
    }

    public String getFullNane() {
        return fullNane;
    }

    public void setFullNane(String fullNane) {
        this.fullNane = fullNane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void move(){

      System.out.println(fullNane + " двигается");
    }
    void talk(){

      System.out.println(fullNane + " говорит");
    }
}
