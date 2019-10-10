package Lecture10;

public class SUQPopEfficientClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      SUQPopEfficient stack=new SUQPopEfficient();
      
      // 60 50 40 30 20 10
      for(int i=1;i<=6;i++) {
    	  stack.push(i*10);
      }
      
      stack.display();// 60 50 40 30 20 10
      
      System.out.println(stack.top());//60
      System.out.println(stack.pop());//60
      stack.display();//50 40 30 20 10
      
      System.out.println(stack.size());
      
	}

}
