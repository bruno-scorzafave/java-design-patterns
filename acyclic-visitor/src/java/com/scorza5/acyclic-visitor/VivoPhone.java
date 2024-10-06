public class VivoPhone implements Telephone {

    @Override
    public void accept(TelephoneVisitor telephoneVisitor) {
        // TODO Auto-generated method stub
        if (telephoneVisitor instanceof VivoVisitor) {
            ((VivoVisitor) telephoneVisitor).visit(this);
        } else {
            System.out.println("Only VivoVisitor is allowed to visit Vivo telephone");
        }
    }
    
}
