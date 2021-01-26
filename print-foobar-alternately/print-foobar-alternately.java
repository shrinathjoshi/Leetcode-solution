class FooBar {
    private int n;
 //   private FooBarTask fooBarTask;
    private  int counter=1;
    public FooBar(int n) {
        this.n = n;
//        fooBarTask =  new FooBarTask(n);
    }
​
    public synchronized void foo(Runnable printFoo) throws InterruptedException {
         while(counter <=2*n-1){
                while(counter%2 != 1)
                {
                     try{
                        wait();
                    }catch(Exception e)
                    {
                        System.out.println(" Exception while printing Foo");
                    }
                }
                
                printFoo.run();
                counter++;
                notifyAll();
            }
        
           
        
    }
​
    public synchronized void bar(Runnable printBar) throws InterruptedException {
       
            while(counter <=2*n){
                while( counter%2 != 0)
                {    
                    try{
                        wait();
                    }catch(Exception e)
                    {
                        System.out.println(" Exception while printing Bar");
                    }
                
                }
                printBar.run();
                counter++;
                notifyAll();
            }
        
    }
}
