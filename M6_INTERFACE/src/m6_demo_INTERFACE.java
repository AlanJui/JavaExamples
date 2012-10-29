interface /*宣告成interface*/ IDisposable //  不能建立物件的參考型態 
{
    public void f1() ;
    public void f2 ();
}
abstract class Middle
 implements /* IDisposable只能被implements */ IDisposable {
    public void f3() { }
}
class Bottom extends Middle {
    public void f1 ( ) { }
    public void f2 ( ) { }
}
class m6_demo_INTERFACE {
 public static void main(String[] args) {
    IDisposable   R ;
    // R = new IDisposable() ; // 錯
    R = new Bottom(); //可存自己型態的參考值或是子孫型態的參考值
  }
}
