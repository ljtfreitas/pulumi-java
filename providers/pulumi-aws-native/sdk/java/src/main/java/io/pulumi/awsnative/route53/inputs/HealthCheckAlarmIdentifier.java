// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the specified health check is healthy.
 * 
 */
public final class HealthCheckAlarmIdentifier extends io.pulumi.resources.InvokeArgs {

    public static final HealthCheckAlarmIdentifier Empty = new HealthCheckAlarmIdentifier();

    /**
     * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether this health check is healthy.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * For the CloudWatch alarm that you want Route 53 health checkers to use to determine whether this health check is healthy, the region that the alarm was created in.
     * 
     */
    @InputImport(name="region", required=true)
        private final String region;

    public String getRegion() {
        return this.region;
    }

    public HealthCheckAlarmIdentifier(
        String name,
        String region) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private HealthCheckAlarmIdentifier() {
        this.name = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckAlarmIdentifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckAlarmIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public HealthCheckAlarmIdentifier build() {
            return new HealthCheckAlarmIdentifier(name, region);
        }
    }
}
