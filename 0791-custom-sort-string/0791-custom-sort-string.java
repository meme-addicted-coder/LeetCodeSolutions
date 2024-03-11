class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> freqmap=new HashMap<>();
        //find frequency of character in s
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freqmap.put(ch,freqmap.getOrDefault(ch,0)+1);

        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<order.length();i++){
            char ch1=order.charAt(i);
            if(freqmap.containsKey(ch1)){
                int freq=freqmap.get(ch1);
                while(freq>0){
                    res.append(ch1);
                    freq--;
                }
                freqmap.remove(ch1);
            }
        }
        //append rem char
        for(Map.Entry<Character,Integer> entry: freqmap.entrySet()){
            int freq1=entry.getValue();
            char ch2=entry.getKey();
            while(freq1>0){
                res.append(ch2);
                freq1--;
            }
        }
        return (res.toString()); 
    }
}