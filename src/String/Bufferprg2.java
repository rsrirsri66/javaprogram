package String;

public class Bufferprg2 {

public static void main(String srg[]){
 StringBuffer s1=new StringBuffer();
 StringBuffer s2=new StringBuffer(20);
 StringBuffer s3=new StringBuffer("hi");
  System.out.println(s1);
  System.out.println(s2);
  System.out.println(s3);
  System.out.println(s1.length());
  System.out.println(s1.capacity());
  s1.append("sri sri sridharan r can sdjcnkd ");
  System.out.println(s1.length());
  System.out.println(s1.capacity());
  s1.setLength(6);
  System.out.println(s1.length());
  System.out.println("a"+s1.capacity());
  System.out.println(s1);
  System.out.println(s1.reverse());
  
}
}
