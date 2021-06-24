public class CommandLine
{
                public static void main(String args[])
                {
                                int invalid=0;    
                                int number,count=0;
                                for(int i=0;i<args.length;i++)

                                {
                                                try
                                                {
                                                                number=Integer.parseInt(args[i]);
                                                }
                                                catch(NumberFormatException e)
                                                {
                                                                invalid=invalid+1;             
                                                               
                                                                continue;             
                                                }
                                                count=count+1;
                                }

                System.out.println("Valid Elements = "+count);
                System.out.println("Invalid Elements = "+invalid);

            }
}
