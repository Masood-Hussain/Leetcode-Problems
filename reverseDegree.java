class ReverseDegreeSolution {
    public int reverseDegree(String s) {
        s = s.toLowerCase();
        int reverseDegree = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int reverseAlphabetValue = 'z' - ch + 1;
                int positionInString = i + 1;
                reverseDegree += reverseAlphabetValue * positionInString;
            }
        }

        return reverseDegree;
    }
}