package pramp;

/* ip = '192.168.0.1'
output: true

ip = '0.0.0.0'
output: true

ip = '123.24.59.99'
output: true

ip = '192.168.123.456'
output: false

 */

public class ValidateIPAddress {

    static boolean validateIP(String ip) {

        String[] split = ip.split("[.]");
        System.out.println(split.length);
        if(split.length != 4)
            return false;
        for (String str : split){
            int parseInt = Integer.parseInt(str);
            if(parseInt < 0 || parseInt > 255)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(validateIP("192.168.123.456"));
    }
}
