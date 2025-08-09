class FirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0; 

     
        for (int start = 0, end = m; end <= n; start++, end++) {
            String window = haystack.substring(start, end);
            if (window.equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}