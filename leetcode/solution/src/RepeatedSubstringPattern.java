public class RepeatedSubstringPattern {

    /**
     * 先从重复两次开始试，再试重复3次，一直到重复1次
     */
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        boolean flag = true;
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                if (m % 2 == 0 && !flag) {
                    continue;
                }
                String subS = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);
                }
                if (sb.toString().equals(str)) return true;
                flag = false;
            }
        }
        return false;
    }
}
