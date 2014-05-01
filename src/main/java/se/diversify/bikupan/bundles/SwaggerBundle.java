package se.diversify.bikupan.bundles;

import com.wordnik.swagger.config.ConfigFactory;
import com.wordnik.swagger.config.ScannerFactory;
import com.wordnik.swagger.config.SwaggerConfig;
import com.wordnik.swagger.jaxrs.config.DefaultJaxrsScanner;
import com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider;
import com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON;
import com.wordnik.swagger.jaxrs.listing.ResourceListingProvider;
import com.wordnik.swagger.jaxrs.reader.DefaultJaxrsApiReader;
import com.wordnik.swagger.reader.ClassReaders;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Environment;

public class SwaggerBundle extends AssetsBundle {

    public SwaggerBundle() {
        super("/api-ui", "/api-ui", "index.html");
    }

    @Override
    public void run(Environment environment) {
        super.run(environment);
        configureSwagger(environment);
    }

    void configureSwagger(Environment environment) {
        environment.jersey().register(new ApiListingResourceJSON());
        environment.jersey().register(new ApiDeclarationProvider());
        environment.jersey().register(new ResourceListingProvider());
        ScannerFactory.setScanner(new DefaultJaxrsScanner());
        ClassReaders.setReader(new DefaultJaxrsApiReader());
        SwaggerConfig config = ConfigFactory.config();
        config.setApiVersion("0.0.2");
        config.setBasePath(environment.getApplicationContext().getContextPath());
    }
}
