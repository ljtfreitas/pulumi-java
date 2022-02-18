// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExpressRouteGatewayPropertiesResponseBounds;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration {
    /**
     * Minimum and maximum number of scale units to deploy.
     * 
     */
    private final @Nullable ExpressRouteGatewayPropertiesResponseBounds bounds;

    @OutputCustomType.Constructor({"bounds"})
    private ExpressRouteGatewayPropertiesResponseAutoScaleConfiguration(@Nullable ExpressRouteGatewayPropertiesResponseBounds bounds) {
        this.bounds = bounds;
    }

    /**
     * Minimum and maximum number of scale units to deploy.
     * 
     */
    public Optional<ExpressRouteGatewayPropertiesResponseBounds> getBounds() {
        return Optional.ofNullable(this.bounds);
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
