class MyGen<String>{
    String obj;
    void add(String obj){this.obj=obj;}
    String get(){return obj;}
} //generic
//shortuct to sellact all ctrl alt shift g
//single alt j

public class TestGenerics3 {
    public static void main(String args[]){
        MyGen<Integer> m=new MyGen<Integer>();
        m.add(2);
        System.out.println(m.get());
    }
}
