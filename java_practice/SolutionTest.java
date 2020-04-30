class Solution{
    public static void main(String[] args) {
        String[] names = {"aditya","ankush"};
        String s =" like this";
        String g="";
        if(names.length==0){
            System.out.println("no one"+s);
        }else{
            if(names.length==1){
                g=g+names[0];
                
            }else if(names.length==2){
                g=g+names[0]+" and "+names[1];
            }else if(names.length>2){
                g=g+names[0]+", ";
                for(int i=1;i<names.length-1;i++){
                    g=g+names[i]+", ";
                }
                g=g+"and "+names[names.length];
            }
            g=g+s;
        }
        
        System.out.println(g);
    }
}