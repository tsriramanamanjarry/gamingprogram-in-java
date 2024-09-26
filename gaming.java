import java.util.Scanner;
public class Game{
public static void main(String[]args){
Scanner s= new Scanner(System.in);
int ru,m1,m2,m3,r=0;
System.out.println("enter rupess");
ru=s.nextInt();
System.out.println("enter m1");
m1=s.nextInt();
System.out.println("enter m2");
m2=s.nextInt();
System.out.println("enter m3");
m3=s.nextInt();
while(ru!=0){
if(ru!=0){
m1=m1+1;
r=r+1;
ru=ru-1;
if(m1%25==0)
ru=ru+20;
}
else
break;
if(ru!=0){
m2=m2+1;
r=r+1;
ru=ru-1;
if(m2%120==0)
ru=ru+80;
}
else 
break;
if(ru!=0){
m3=m3+1;
r=r+1;
ru=ru-1;
if(m3%12==0)
ru=ru+8;
}
else
break;
}
System.out.println(r);
}
}
