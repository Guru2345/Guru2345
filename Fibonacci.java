import java.util.*;
    class Firsts{
public static void main(String []args){
int n=100;
int first=0;int second=1;
System.out.println(first);
System.out.println(second);
int i;
for(i=2;i<n;i++){
int x=first+second;
System.out.println(x);
first=second;
second=x;
}
}
}
