// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ExpressRouteGatewayPropertiesResponseBounds;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for auto scaling.
 * 
 */
public final class ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration Empty = new ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration();

    /**
     * Minimum and maximum number of scale units to deploy.
     * 
     */
    @InputImport(name="bounds")
        private final @Nullable ExpressRouteGatewayPropertiesResponseBounds bounds;

    public Optional<ExpressRouteGatewayPropertiesResponseBounds> getBounds() {
        return this.bounds == null ? Optional.empty() : Optional.ofNullable(this.bounds);
    }

    public ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration(@Nullable ExpressRouteGatewayPropertiesResponseBounds bounds) {
        this.bounds = bounds;
    }

    private ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration() {
        this.bounds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExpressRouteGatewayPropertiesResponseBounds bounds;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bounds = defaults.bounds;
        }

        public Builder setBounds(@Nullable ExpressRouteGatewayPropertiesResponseBounds bounds) {
            this.bounds = bounds;
            return this;
        }
        public ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration build() {
            return new ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration(bounds);
        }
    }
}
