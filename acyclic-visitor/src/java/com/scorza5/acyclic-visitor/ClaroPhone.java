public class ClaroPhone implements Telephone {

    @Override
    public void accept(TelephoneVisitor telephoneVisitor) {
        if (telephoneVisitor instanceof ClaroVisitor) {
            ((ClaroVisitor) telephoneVisitor).visit(this);
        } else {
            System.out.println("Only ClaroVisitor is allowed to visit Claro telephone");
        }
    }
    
}
