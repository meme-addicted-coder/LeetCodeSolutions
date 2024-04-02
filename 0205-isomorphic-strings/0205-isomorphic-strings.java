//1 using hashmap
/*class Solution {
    public boolean isIsomorphic(String s, String t) { 
        StringBuilder sbs = new StringBuilder(s);
        StringBuilder sbt = new StringBuilder(t);
        HashMap<Character,Character> stot =new HashMap<>();
        HashMap<Character,Character> ttos =new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char sc=sbs.charAt(i);
            char tc=sbt.charAt(i);
            if(!stot.containsKey(sc)){
                stot.put(sc,tc);
            }
            if(!ttos.containsKey(tc)){
                ttos.put(tc,sc);
            }
            if(stot.get(sc)!=tc|| ttos.get(tc)!=sc){
                return false;
            }
        }
        return true;
    }
}
*/
//2 array ascii
class Solution {
    public boolean isIsomorphic(String s, String t) { 
        StringBuilder sbs = new StringBuilder(s);
        StringBuilder sbt = new StringBuilder(t);
        int[] stot = new int[128];
        int[] ttos = new int[128];
        Arrays.fill(stot,-1);
        Arrays.fill(ttos,-1);
        int n=s.length();
        for(int i=0;i<n;i++){
            char sc=sbs.charAt(i);
            char tc=sbt.charAt(i);
            if(stot[sc]==-1){
                stot[sc]=tc;
            }
            if(ttos[tc]==-1){
                ttos[tc]=sc;
            }
            if(stot[sc]!=tc || ttos[tc]!=sc){
                return false;
            }
        }
        return true;
    }
}