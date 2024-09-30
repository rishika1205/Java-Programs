public class checkingencapsulation {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newname)
    {
        this.name=newname;
    }
    public static void main(String[] args) {
        checkingencapsulation a=new checkingencapsulation();
        a.setName("Rishika");
        System.out.println(a.getName());
    }
}
