class Javaque7
{
    public static void main(String args[])
    {
      int digit=Integer.parseInt(args[0]);
       
      if(digit>=1 && digit<=9)
      {
        System.out.println("it single digit"); 
      }
      else if(digit>=10 && digit<=99)
      {
         System.out.println("it is doubble digit");
      }
      else
      {
         System.out.println("it is not digit");
      }
    }



}