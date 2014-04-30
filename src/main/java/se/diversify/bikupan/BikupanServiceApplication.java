package se.diversify.bikupan;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import se.diversify.bikupan.health.BikupanHealthcheck;
import se.diversify.bikupan.resources.HelloWorldResource;

public class BikupanServiceApplication extends Application<BikupanServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new BikupanServiceApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<BikupanServiceConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/assets/", "/", "index.html"));
    }

    @Override
    public void run(BikupanServiceConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().setUrlPattern("/api/*");
        environment.healthChecks().register("Bikupan", new BikupanHealthcheck());
        JerseyEnvironment jersey = environment.jersey();

        jersey.register(new HelloWorldResource());
    }

}

