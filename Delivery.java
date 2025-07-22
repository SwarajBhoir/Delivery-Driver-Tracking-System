import java.util.*;

class Delivery{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enttotal number of customer orders: ");
        int orders=sc.nextInt();
        System.out.print("Enter total number of drivers: ");
        int drivers=sc.nextInt();

        int[] orderTimes=new int[orders];
        int[] deliveryTimes=new int[orders];
        int[] driverAvailableTime=new int[drivers];

        for(int i=0;i<orders;i++)
        {
            System.out.print("Enter the order time and time to deliver for Customer C"+(i+1)+": ");
            orderTimes[i]=sc.nextInt();
            deliveryTimes[i]=sc.nextInt();
        }
        for(int i=0;i<orders;i++)
        {
            int orderTime=orderTimes[i];
            int deliveryTime=deliveryTimes[i];
            boolean deliveryAssigned=false;

            for(int j=0;j<drivers;j++)
            {
                if(driverAvailableTime[j]<=orderTime)
                {
                    driverAvailableTime[j]=orderTime+deliveryTime;
                    System.out.println("C"+(i+1)+" : D"+(j+1));
                    deliveryAssigned=true;
                    break;

                }
            }

            if(!deliveryAssigned)
            {
                System.out.println("C"+(i+1)+" : No Food");
            }
        }
    }
}