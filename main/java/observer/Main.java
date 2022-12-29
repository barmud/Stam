package observer;

public class Main {
    public static void main(){

        GroupAdmin aAdmin = new GroupAdmin();
        ConcreteMember aMember = new ConcreteMember();
        ConcreteMember bMember = new ConcreteMember();
        aAdmin.register(aMember);
        aAdmin.register(aMember);
    }

}
