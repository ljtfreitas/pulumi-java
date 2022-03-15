// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ServiceDeploymentCircuitBreaker {
    private final Boolean enable;
    private final Boolean rollback;

    @CustomType.Constructor
    private ServiceDeploymentCircuitBreaker(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("rollback") Boolean rollback) {
        this.enable = enable;
        this.rollback = rollback;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    public Boolean getRollback() {
        return this.rollback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreaker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Boolean rollback;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder rollback(Boolean rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }
        public ServiceDeploymentCircuitBreaker build() {
            return new ServiceDeploymentCircuitBreaker(enable, rollback);
        }
    }
}
