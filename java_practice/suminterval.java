import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] n={{1, 2}, {6, 10}, {11, 15}};
        int sum=0;
        if(n!=null){
            System.out.println("hwllo");
            for(int i =0; i<n.length;i++){
                int x,y;
                x=n[i][0];
                y=n[i][1];
                System.out.println(x+" "+y);
                if(x<0 && y<0){
                    if(x>y)
                        sum=sum+(x-y);
                    else
                        sum=sum+(y-x);
                }else if(x<0 && y>=0){
                    sum=sum+(x-y);
                }else if (x>=0 && y<0){
                    sum=sum+(y-x);
                }else {
                    if(x>y)
                        sum=sum+(x-y);
                    else
                        sum=sum+(y-x);
                }
                System.out.println(sum);

            }
        }
        System.out.println(sum);
        in.close();
    }
}