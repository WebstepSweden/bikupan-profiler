package se.diversify.bikupan;

import io.dropwizard.Application;
import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import se.diversify.bikupan.bundles.HealthCheckbundle;
import se.diversify.bikupan.bundles.SwaggerBundle;
import se.diversify.bikupan.resources.HelloWorldResource;

public class BikupanServiceApplication extends Application<BikupanServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new BikupanServiceApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<BikupanServiceConfiguration> bootstrap) {
       bootstrap.addBundle(new SwaggerBundle());
       bootstrap.addBundle(new HealthCheckbundle());
    }

    @Override
    public void run(BikupanServiceConfiguration configuration, Environment environment) throws Exception {
        JerseyEnvironment jersey = environment.jersey();
        jersey.register(new HelloWorldResource());
    }

}

