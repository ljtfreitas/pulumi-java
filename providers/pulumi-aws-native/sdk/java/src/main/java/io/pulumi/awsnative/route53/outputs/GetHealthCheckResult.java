// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53.outputs;

import io.pulumi.awsnative.route53.outputs.HealthCheckConfigProperties;
import io.pulumi.awsnative.route53.outputs.HealthCheckTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHealthCheckResult {
    /**
     * A complex type that contains information about the health check.
     * 
     */
    private final @Nullable HealthCheckConfigProperties healthCheckConfig;
    private final @Nullable String healthCheckId;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<HealthCheckTag> healthCheckTags;

    @CustomType.Constructor
    private GetHealthCheckResult(
        @CustomType.Parameter("healthCheckConfig") @Nullable HealthCheckConfigProperties healthCheckConfig,
        @CustomType.Parameter("healthCheckId") @Nullable String healthCheckId,
        @CustomType.Parameter("healthCheckTags") @Nullable List<HealthCheckTag> healthCheckTags) {
        this.healthCheckConfig = healthCheckConfig;
        this.healthCheckId = healthCheckId;
        this.healthCheckTags = healthCheckTags;
    }

    /**
     * A complex type that contains information about the health check.
     * 
    */
    public Optional<HealthCheckConfigProperties> getHealthCheckConfig() {
        return Optional.ofNullable(this.healthCheckConfig);
    }
    public Optional<String> getHealthCheckId() {
        return Optional.ofNullable(this.healthCheckId);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<HealthCheckTag> getHealthCheckTags() {
        return this.healthCheckTags == null ? List.of() : this.healthCheckTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HealthCheckConfigProperties healthCheckConfig;
        private @Nullable String healthCheckId;
        private @Nullable List<HealthCheckTag> healthCheckTags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckConfig = defaults.healthCheckConfig;
    	      this.healthCheckId = defaults.healthCheckId;
    	      this.healthCheckTags = defaults.healthCheckTags;
        }

        public Builder healthCheckConfig(@Nullable HealthCheckConfigProperties healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        public Builder healthCheckId(@Nullable String healthCheckId) {
            this.healthCheckId = healthCheckId;
            return this;
        }

        public Builder healthCheckTags(@Nullable List<HealthCheckTag> healthCheckTags) {
            this.healthCheckTags = healthCheckTags;
            return this;
        }
        public GetHealthCheckResult build() {
            return new GetHealthCheckResult(healthCheckConfig, healthCheckId, healthCheckTags);
        }
    }
}
