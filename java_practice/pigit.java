import java.util.Scanner;

class PigIt{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String s=in.next()+in.nextLine();
                String o="";
                String[] c = s.split(" ");
                for (String r : c){
                        if(r!=null){
                                char[] arr = r.toCharArray();
                                char temp=arr[0];
                                for(int i=0 ; i<r.length()-1;i++){
                                        arr[i]=arr[i+1];
                                }
                                arr[arr.length-1]=temp;
                                String g= new String(arr);
                                o=o+g+"ay ";
                        }else{
                                o=o+" ";
                        }
                }

                System.out.println(o);
                in.close();
        }

}
