public class StackArray {
   private String array[];
   private int size = 10;
   private int index = 0;

   public StackArray(){
       array = new String[this.size];
   }

   public StackArray(int size){
       array = new String[size];
       this.size = size;
   }

   public boolean isEmpty(){
       System.out.println("Stack is Empty = " + (this.index == 0));
       return (this.index == 0);
   }

   public boolean isFull(){
       System.out.println("Stack is Full = " + (this.index == this.size));
       return (index == size);
   }

   public boolean hasElements(){
       System.out.println("Stack has elements = " + (this.index != 0));
       return (this.index != 0);
   }

   public void push(String value){
       if(!isFull())
       {
           array[index++] = value;
           //index++;
       }
       else
       {
           System.out.println("Sorry: Stack is full");
       }
   }

   public String pop(){
       if(!isEmpty())
       {
           String temp = array[index - 1];
           index--;
           return temp;
       }
       else
       {
           System.out.println("Sorry: Stack is Full");
           return null;
       }
   }

   public String peek(){
       if(!isEmpty())
       {
           return array[index - 1];
       }
       else
       {
           return null;
       }
   }

}
