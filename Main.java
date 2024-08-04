class Stack {
    int []s=new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
   void push(int num){
    if(tos==9)
        System.out.println("stack is full");
    else
        s[++tos]=num;
    }
    int pop(){
        if(tos>=0)
            return s[tos--];
        else {
            System.out.println("empty stack");
            return -1;
        }
            
    }

    
}
public class Main{
    public static void main(String []args){
        Stack s1=new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        
        System.out.println(s1.pop());
        s1.pop();
        System.out.println(s1.pop());

    }
}
