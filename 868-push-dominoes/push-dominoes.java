class Solution {
    public String pushDominoes(String s) {
        s = "L" + s + "R";
        StringBuilder res = new StringBuilder();
        int p = 0;
        for (int curr = 1; curr < s.length(); ++curr) {
            if (s.charAt(curr) == '.') continue;
            int span = curr - p- 1;
            if (p > 0)
                res.append(s.charAt(p));
            if (s.charAt(p) == s.charAt(curr)) {
                for (int i = 0; i < span; ++i)
                    res.append(s.charAt(p));
            } else if (s.charAt(p) == 'L' && s.charAt(curr) == 'R') {
                for (int i = 0; i < span; ++i)
                    res.append('.');
            } else {
                for (int i = 0; i < span / 2; ++i)
                    res.append('R');
                if (span % 2 == 1)
                    res.append('.');
                for (int i = 0; i < span / 2; ++i)
                    res.append('L');
            }
            p = curr;
        }
        return res.toString();
    }
}