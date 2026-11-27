public class JdkIdentity {
    public static void main(String[] args) {
        String[] keys = {
            "java.version", "java.runtime.version", "java.vendor",
            "java.vendor.version", "java.vm.name", "java.vm.vendor",
            "java.home", "java.class.version", "os.name", "os.arch"
        };
        for (String key : keys) {
            System.out.printf("%-24s : %s%n", key,
                System.getProperty(key, "(not reported)"));
        }
    }
}
