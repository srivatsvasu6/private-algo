class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
         int[] a = new int[s.length()];
         int[] b = new int[s.length()];
        int n = 0;
        
        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i<a.length;i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), n++);
            }
            a[i] = map.get(s.charAt(i));
            System.out.print(a[i]);
        }
     n=0;
           map.clear();
           for(int i = 0; i<b.length;i++){
            if(!map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), n++);
            }
            b[i] = map.get(t.charAt(i));
               System.out.print(b[i]);
        }
        System.out.println(map);
        
         for(int i = 0; i<b.length;i++){
             
             if(a[i] != b[i]){
                 return false;
             }
             
         }
        
        return true;
        
        
        
            
    }
}