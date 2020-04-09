package Easy;

class Solution {
  // all anagrams are inclusive -> they will only belong to one anagram set
  // 1. Iterate through strs
  // 2. Iterate through the characters in strs[i]
  // 3. Sort alphabetically
  // 4. Check if exists in map
  // 4a. yes -> add to list
  // 4b. no -> create new entry in map
  
  // NOTE: map; key -> word, value -> position in reslist
  public List<List<String>> groupAnagrams(String[] strs) {
      int newestIndex = 0; // keeps track of most recent index in list
      List<List<String>> list = new ArrayList<>(); // result list
      HashMap<String, Integer> map = new HashMap<>(); // key -> sorted word, value -> index in list
      for (int i = 0; i < strs.length; i++) {
          // set up
          String s = strs[i];
          char[] c = s.toCharArray();
          Arrays.sort(c);
          String value = String.valueOf(c);
          
          // containsKey -> get index in list, add to it.
          if (map.containsKey(value)) {
              int index = map.get(value);
              list.get(index).add(s);
          } else {
              // doesn't create new list, add string, add that list to return, put in map, increment
              List<String> tempList = new ArrayList<>();
              tempList.add(s);
              list.add(tempList);
              map.put(value, newestIndex);
              newestIndex++;
          }
      }
      return list;
  }
}