public class RuntimeStructure {

    public static void main(String[] args) {
        System.out.println(
            ClassLoader.getSystemResource("java/lang/String.class")
        );
    }
}
