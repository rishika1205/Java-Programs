public class usingthis {
    void display(){
        this.show();
        System.out.println("Inside display function");
    }
    void show(){
        System.out.println("Inside show function");
    }
    public static void main(String[] args)
    {
        usingthis s= new usingthis();
        s.display();
    }
    }
