package io.github.xuanguofeng.futilslib;

/**
 * description:
 * created time: 2017/11/22 17:01
 *
 * @author xuanguofeng
 */

public class FNumberUtils {

    /**
     * keep assign decimals
     *
     * @param number float type
     * @param bits   The number of digits to keep
     * @return String type number
     */
    public static String twoBitsRemaining(float number, int bits) {
        return String.format("%." + bits + "f", number);
    }

    /**
     * keep assign
     *
     * @param number double type
     * @param bits   The number of digits to keep
     * @return String type number
     */
    public static String twoBitsRemaining(double number, int bits) {
        return String.format("%." + bits + "f", number);
    }
}
