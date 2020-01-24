/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 */

package leetcode;

public class DefangIpAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));

    }
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
