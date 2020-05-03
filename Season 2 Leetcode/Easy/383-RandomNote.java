class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character, Integer> magMap = new HashMap<>();
      HashMap<Character, Integer> noteMap = new HashMap<>();
      
      for (char c : ransomNote.toCharArray()) {
          noteMap.put(c, noteMap.getOrDefault(c, 0) + 1);
      }
      
      for (char c : magazine.toCharArray()) {
          magMap.put(c, magMap.getOrDefault(c, 0) + 1);
      }
      
      for (Character c : noteMap.keySet()) {
          int noteCount = noteMap.get(c);
          int magCount = magMap.getOrDefault(c, -1);
          if (noteCount > magCount) return false;
      }
      return true;
  }
}