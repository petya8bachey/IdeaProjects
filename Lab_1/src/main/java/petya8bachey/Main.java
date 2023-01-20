package petya8bachey;

import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

import static petya8bachey.Printer.print;

public class Main {
    public static void main(String[] args) {
        print(StringUtils.lowerCase(Arrays.toString(args)));
    }
}