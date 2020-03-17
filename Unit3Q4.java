public class Unit3Q4
{
   public static void main(int j, int k, int m)
   {
       System.out.println(!((j == k) && (k > m))); //B is equivalent to this
       System.out.println("A." + ((j != k) || (k < m)));
       System.out.println("B. "+ ((j != k) || (k <= m)));
       System.out.println("C." + ((j == k) || (k < m)));
       System.out.println("D." + ((j != k) && (k <= m)));
       System.out.println("E." + ((j == k) && (k < m)));
}
}