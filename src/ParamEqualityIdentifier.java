public class ParamEqualityIdentifier
{
    public static void main(String[] args)
    {
        getEquality(1,1,1);
        getEquality(1,1,2);
        getEquality(-1,-2,3);
        getEquality(0,0,0);

    }

    public static void getEquality(int a , int b , int c )
    {
      if(a<0 || b<0 || c<0)
        {
            System.out.println("less than Zero Values are not allowed");
        } else if (a==b && a==c && b==c)
          {
              System.out.println("All numbers are equal");
          } else if (a!=b && a!=c && b!=c)
             {
                 System.out.println("All numbers are different");
             }
      else {
          System.out.println("MIxed and Match");
      }
    }
}
