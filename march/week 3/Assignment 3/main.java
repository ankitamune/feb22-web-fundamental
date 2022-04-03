class dog{
    String name;
    int leg;
    dog(String name,int leg){
        this.name=name;
        this.leg=leg;
    }
}
class cat{
    String name;
    int leg;
    boolean iscute;
    dog(String name,int leg,boolean iscute){
        this.name=name;
        this.leg=leg;
        this.iscute=iscute;
    }
}

public class main{
    public static void main(String args[]){
        dog d=new dog("puppy",4);
        System.out.println(d.name+" "+d.leg);
        cat c=new cat("money",4,true);
        System.out.println(d.name+" "+d.leg+" "+d.iscute);


    }
}