
public class MyFirst {

  public static void main(String[] args) {
    hello("world");
    hello("pip");
    hello("Anna");
    int a = 7;
    int b = 9;
    int l = 6;
    System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a,b) );
  }
  public static void hello (String somebody) {
    System.out.println("hello "+somebody);
  }
  public static int area (int p) {
    return p*p;
  }
  public static int area (int a, int b) {
    return a*b;
  }
}