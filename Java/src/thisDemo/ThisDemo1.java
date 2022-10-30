package thisDemo;

/**
 * @author Albert
 * this调用构造起
 */
public class ThisDemo1 {
  public ThisDemo1(){
    //this调用构造起必须放在第一行
    this("DD");
  }
  public ThisDemo1(String name){
    System.out.println(name);
  }

  public static void main(String[] args) {
    ThisDemo1 thisDemo1 = new ThisDemo1();
  }
}
