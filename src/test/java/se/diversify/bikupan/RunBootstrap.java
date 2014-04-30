package se.diversify.bikupan;

public class RunBootstrap {

    public static final String CONFIG = "src/test/resources/bikupan-service.yml";

    public static void main(String[] args) throws Exception {
        BikupanServiceApplication.main(new String[]{"server", CONFIG});
    }

}
