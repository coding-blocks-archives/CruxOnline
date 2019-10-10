package Lecture10;

public class SUQPushEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       SUQPushEfficient stack=new SUQPushEfficient();
       
       // from top 60 50 40 30 20 10
       for(int i=1;i<=6;i++) {
    	   stack.push(i*10);
       }
       
       stack.display();// 60 50 40 30 20 10
       System.out.println(stack.pop());// 60
       stack.display();// 50 40 30 20 10
       
       System.out.println(stack.top());//50
       stack.display();
       
       
	}

}
