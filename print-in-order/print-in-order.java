class Foo {
    private volatile boolean  firstDone , secondDone;
    public Foo() {
     
    }
​
    public void first(Runnable printFirst) throws InterruptedException {
        
        synchronized(this){    
            printFirst.run();
            firstDone = true;
            notifyAll();
        }
        
        // printFirst.run() outputs "first". Do not change or remove this line.
    }
​
    public void second(Runnable printSecond) throws InterruptedException {
       synchronized(this){
           
           while(firstDone == false){
               try{    
                   wait();
               }catch(Exception e){
                   e.printStackTrace();
               }
           }
           
            printSecond.run();
