public class UConst
{
int x ,y;
// init block
{
System.out.println("Pre const call" + x + ""+y);
}
public UConst()
{
System.out.println("Default const call" + x + ""+y);
}

public static void main(String[] args) 
{ 
    UConst obj = new UConst();
System.out.println(obj.x+ "" +obj.y);
}
}
