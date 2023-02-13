public class StringReverse {
    public static void main(String args[]){
        String input = "RajatMahajan";
        String reverse = "";
        char ch;
        int i;

        //char[] name = input.toCharArray();
        //for(i = name.length -1; i>= 0; i--)
        //{
        //    System.out.print(name[i]);
        //}
        //System.out.println();
        for(i = 0; i< input.length(); i++)
        {
        ch = input.charAt(i);
        reverse = ch +reverse;
        }
        System.out.println(reverse);
    }
}
