package calculator;

public class AnpanCalculator {


    public int calculator(String arg) throws Exception {
        if (arg == null) {
            throw new Exception("값을 던져 주세요");
        }

        int commaIdx = arg.indexOf(",");
        int colonIdx = arg.indexOf(":");
        int nIdx = arg.indexOf("\n");
        int argLength = arg.length();

        String customDivider = null;

        if (commaIdx > -1 && colonIdx == -1) {
            return add(arg.split(","));
        } else if (commaIdx == -1 && colonIdx > -1) {
            return add(arg.split(":"));
        } else if (commaIdx > -1 && colonIdx > -1) {
            arg = arg.replace(",", ":");
            return add(arg.split(":"));
        } else if (nIdx > -1) {
            customDivider = getcustomDivider(arg, nIdx - 1, nIdx);
            arg = arg.substring(nIdx, argLength).trim();
            System.out.println("arg : " + arg);

            return add(arg.split(customDivider));
        } else {
            return 0;
        }

    }

    public int add(String[] arg) throws Exception {
        int result = 0;
        int chknum = 0;
        for (String num : arg) {
            chknum = Integer.parseInt(num);
            if (chknum < 0) {
                throw new RuntimeException("음수가 들어옴");
            }
            result += chknum;
        }
        return result;
    }

    public String getcustomDivider(String arg, int strIdx, int endIdx) {
        return arg.substring(strIdx, endIdx);
    }

    public String getSubStringResult(String arg, int idx) {
        return arg.substring(idx + 1, arg.length());
    }

}
