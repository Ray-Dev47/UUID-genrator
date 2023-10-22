/**
 * UUID
 */
import java.util.UUID;
public class UUID_generator {
    public static void main(String[] args) {
        UUID getUUID = UUID.randomUUID();
        String UUID_string = getUUID.toString();
        System.out.println(UUID_string);
    }
}