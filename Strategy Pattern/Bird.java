public class Bird extends Animal{
    public Bird(){
        super();
        setSound("Tweet"); // sound of bird
        flyingType = new itFlys();
    }
}
