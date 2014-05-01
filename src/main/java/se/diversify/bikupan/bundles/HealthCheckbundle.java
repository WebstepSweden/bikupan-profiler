package se.diversify.bikupan.bundles;

import io.dropwizard.Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import se.diversify.bikupan.health.BikupanHealthcheck;

public class HealthCheckbundle implements Bundle {
    @Override
    public void initialize(Bootstrap<?> bootstrap) {
        // Empty by design
    }

    @Override
    public void run(Environment environment) {
        environment.healthChecks().register("Bikupan", new BikupanHealthcheck());
    }

}
