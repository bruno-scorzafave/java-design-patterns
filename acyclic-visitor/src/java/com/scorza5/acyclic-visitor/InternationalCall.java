public class InternationalCall implements ClaroVisitor {

    @Override
    public void visit(ClaroPhone claroPhone) {
        System.out.println(claroPhone + "Realizando ligação internacional");
    }

}