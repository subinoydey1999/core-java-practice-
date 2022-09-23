/*
Program : Understanding Varargs
@author : subinoy dey
@date : 23.09.22
*/

class VarargsDemo
{
	static void printArray(int []ar)
	{
		
		for(int i:ar)
		{
			System.out.print(i+ " ");
		}
		System.out.println("-------------------------------")
	}
    public static void main(String...arg)
    {
        int a1[]={1,2,3};
        int a2[]={6,7,10,9};
        int a3[]={4,30,90,91,82,56};
        
        printArray(a1);
        printArray(a2);
        printArray(a3);

	}
}	