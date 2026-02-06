class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        // build need map
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int end = 0;

        while (end < s2.length()) {

            char c = s2.charAt(end);

            // character not needed → reset window
            if (!need.containsKey(c)) {
                have.clear();
                end++;
                start = end;
                continue;
            }

            // add character to have
            have.put(c, have.getOrDefault(c, 0) + 1);

            // shrink window if count exceeds
            while (have.get(c) > need.get(c)) {
                char startChar = s2.charAt(start);
                have.put(startChar, have.get(startChar) - 1);
                start++;
            }

            // check window size
            if (end - start + 1 == s1.length()) {
                return true;
            }

            end++;
        }

        return false;
    }
}
