package se.diversify.bikupan.health;

import com.codahale.metrics.health.HealthCheck;

public class BikupanHealthcheck extends HealthCheck{

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
