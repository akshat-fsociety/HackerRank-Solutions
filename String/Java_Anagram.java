Map<Character,Integer>map = new HashMap<>();
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0; i<b.length(); i++){
            char c = b.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                Integer freq = map.get(c);
                map.put(c, ++freq);
            }
        }
       for(int j = 0; j<a.length();j++){
           char c1 = a.charAt(j);
           if(!map.containsKey(c1)) return false;
           Integer freq = map.get(c1);
           if(freq==0) return false;
           else{
               map.put(c1,--freq);
           }
       }
       return true;
