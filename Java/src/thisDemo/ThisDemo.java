package thisDemo;

/**
 * @author Albert
 */
public class ThisDemo {
  String name;
  public ThisDemo(String name){
    this.name = name;
    System.out.println("this.hashCode = "+this.hashCode());
  }

  public static void main(String[] args) {
    ThisDemo dog = new ThisDemo("Dog");
    System.out.println("dog.hashCode = "+dog.hashCode());
    System.out.println(dog.name);
  }
}
