public class NormalCall implements AllTelephoneVisitor {

    @Override
    public void visit(ClaroPhone claroPhone) {
        System.out.println(claroPhone + "realizando uma chamada.");
    }

    @Override
    public void visit(VivoPhone vivoPhone) {
        System.out.println(vivoPhone + "realizando uma chamada");
    }
    
}
