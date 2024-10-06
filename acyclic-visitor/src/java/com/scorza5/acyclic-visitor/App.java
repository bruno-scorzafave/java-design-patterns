public class App {
    public static void main(String[] args) throws Exception {
        var chamadaInternacional = new InternationalCall();
        var chamadaNormal = new NormalCall();

        var claro = new ClaroPhone();
        var vivo = new VivoPhone();

        claro.accept(chamadaInternacional);
        vivo.accept(chamadaInternacional);
        claro.accept(chamadaNormal);
        vivo.accept(chamadaNormal);
    }
}
