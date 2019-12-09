class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++){
            int value = groupSizes[i];
            if(map.containsKey(value)){
                List<Integer> temp = map.get(value);
                temp.add(i);
                map.put(value, temp);
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(value, temp);
            }
        }
        
        for(int key : map.keySet()){
            List<Integer> temp = map.get(key);
            int len = temp.size();
            int count = 0;
            if(len > key){
                while(len > 0){
                    List<Integer> sub = temp.subList(count,key + count);
                    System.out.println(sub);
                    len -= key;
                    count += key;
                    list.add(sub);
                    if(count == temp.size()){
                        break;
                    }
                }
            }else{
                list.add(temp);
            }
        }
        
        return list;
    }
}