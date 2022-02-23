// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ServiceDeploymentCircuitBreakerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceDeploymentCircuitBreakerArgs Empty = new ServiceDeploymentCircuitBreakerArgs();

    @InputImport(name="enable", required=true)
        private final Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable;
    }

    @InputImport(name="rollback", required=true)
        private final Input<Boolean> rollback;

    public Input<Boolean> getRollback() {
        return this.rollback;
    }

    public ServiceDeploymentCircuitBreakerArgs(
        Input<Boolean> enable,
        Input<Boolean> rollback) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.rollback = Objects.requireNonNull(rollback, "expected parameter 'rollback' to be non-null");
    }

    private ServiceDeploymentCircuitBreakerArgs() {
        this.enable = Input.empty();
        this.rollback = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreakerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enable;
        private Input<Boolean> rollback;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentCircuitBreakerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        public Builder setEnable(Input<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Input.of(Objects.requireNonNull(enable));
            return this;
        }

        public Builder setRollback(Input<Boolean> rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }

        public Builder setRollback(Boolean rollback) {
            this.rollback = Input.of(Objects.requireNonNull(rollback));
            return this;
        }
        public ServiceDeploymentCircuitBreakerArgs build() {
            return new ServiceDeploymentCircuitBreakerArgs(enable, rollback);
        }
    }
}
