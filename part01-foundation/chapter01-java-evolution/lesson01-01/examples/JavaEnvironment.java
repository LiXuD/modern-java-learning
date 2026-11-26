public class JavaEnvironment {

    public static void main(String[] args) {
        String[] keys = {
            "java.version",
            "java.specification.version",
            "java.vendor",
            "java.home",
            "java.vm.name",
            "java.vm.version",
            "java.vm.vendor",
            "java.class.version",
            "os.name",
            "os.arch"
        };

        for (String key : keys) {
            System.out.printf("%-30s : %s%n", key, System.getProperty(key));
        }
    }
}
