public interface Flys {
    String fly();
}

 class itFlys implements Flys{
    public String fly(){
        return "I can fly";
    }
}

class CantFly implements Flys{
    public String fly(){
        return "I can't fly";
    }
}
