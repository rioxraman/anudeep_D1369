public class InterfaceDemo {
    public static void main(String[] args) {
        Richard raman = new Richard() {
            @Override
            public String getName() {
                return "";
            }
        };
        System.out.println(raman.getName());
    }
}
