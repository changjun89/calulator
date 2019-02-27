package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnpanCalculatorRefac {


    public int calculator(String arg) throws Exception {
        if (arg == null || "".equals(arg)) {
            return 0;
        }

        int commaIdx = arg.indexOf(",");
        int colonIdx = arg.indexOf(":");
        int nIdx = arg.indexOf("\n");

        //둘다 있을때     | 이걸로 하니까 둘다 되네
        if (commaIdx > -1 && colonIdx > -1) {
            return add(arg.split(",|:"));
        }

        // , 만 있을때
        if (commaIdx > -1 && colonIdx == -1) {
            return add(arg.split(","));
        }

        // : 만 있을때
        if (commaIdx == -1 && colonIdx > -1) {
            return add(arg.split(":"));
        }

        //커스텀
        if (nIdx > -1) {
            return add(getCustormResult(arg));
        }

        return Integer.parseInt(arg);

    }

    public String[] getCustormResult(String arg) {
        Pattern compile = Pattern.compile("//(.)\n(.*)");
        Matcher matcher = compile.matcher(arg);
        if (matcher.find()) {
            return matcher.group(2).split(matcher.group(1));
        }

        return null;

    }

    public void checkMinus(String arg) {
        if (Integer.parseInt(arg) < 0) {
            throw new RuntimeException("음수가 들어옴");
        }
    }

    public int add(String[] arg) throws Exception {
        int result = 0;
        for (String num : arg) {
            checkMinus(num);
            result += Integer.parseInt(num);
        }
        return result;
    }


}
