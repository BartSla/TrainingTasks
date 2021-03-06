package pl.coderstrust.ipValidation;

import java.util.regex.Pattern;

public class IpValidation {

    public final static String IP_ADDRESS_PATTERN = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])" +
            "\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

    Pattern pattern = Pattern.compile(IP_ADDRESS_PATTERN);

    public boolean isIpAddress(String input) {
        return pattern.matcher(IP_ADDRESS_PATTERN).matches();
    }
}