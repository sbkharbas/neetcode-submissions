class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charFreqMap = new HashMap();
        for(Character c : s.toCharArray()){
            if(!charFreqMap.containsKey(c)){
                charFreqMap.put(c, 1);
            } else{
                charFreqMap.put(c, charFreqMap.get(c)+1);
            }
        }
        for(Character c : t.toCharArray()){
            if(charFreqMap.isEmpty()){
                return false;
            }
            Integer freq = charFreqMap.get(c);
            if(freq == null){
                return false;
            } else 
            if(freq == 1){
                charFreqMap.remove(c);
            }else{
                charFreqMap.put(c, freq-1);
            }
        }
        return charFreqMap.isEmpty();
    }
}
