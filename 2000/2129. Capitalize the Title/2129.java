class Solution {
    public String capitalizeTitle(String title) {
        int len = title.length();
        char[] chars = title.toCharArray();
        for (int i = 0; i < len; i++) {
            int fi = i;
            while (i < len && chars[i] != ' ') {
                chars[i] |= 32;
                i++;
            }
            if (i - fi > 2)
                chars[fi] &= ~32;
        }
        return String.valueOf(chars);
    }
}
