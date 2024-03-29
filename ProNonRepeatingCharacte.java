class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
    HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        
        for (char ch : S.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : S.toCharArray()) {
            if (charFrequencyMap.get(ch) == 1) {
                return ch;
            }
        }

        return '$';
    }
}

