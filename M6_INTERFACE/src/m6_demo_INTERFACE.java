interface /*�ŧi��interface*/ IDisposable //  ����إߪ��󪺰Ѧҫ��A 
{
    public void f1() ;
    public void f2 ();
}
abstract class Middle
 implements /* IDisposable�u��Qimplements */ IDisposable {
    public void f3() { }
}
class Bottom extends Middle {
    public void f1 ( ) { }
    public void f2 ( ) { }
}
class m6_demo_INTERFACE {
 public static void main(String[] args) {
    IDisposable   R ;
    // R = new IDisposable() ; // ��
    R = new Bottom(); //�i�s�ۤv���A���ѦҭȩάO�l�]���A���Ѧҭ�
  }
}
