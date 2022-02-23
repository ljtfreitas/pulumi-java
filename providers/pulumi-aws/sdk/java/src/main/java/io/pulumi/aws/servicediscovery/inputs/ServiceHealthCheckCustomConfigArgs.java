// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceHealthCheckCustomConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckCustomConfigArgs Empty = new ServiceHealthCheckCustomConfigArgs();

    /**
     * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    @InputImport(name="failureThreshold")
    private final @Nullable Input<Integer> failureThreshold;

    public Input<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    public ServiceHealthCheckCustomConfigArgs(@Nullable Input<Integer> failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    private ServiceHealthCheckCustomConfigArgs() {
        this.failureThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckCustomConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> failureThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckCustomConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
        }

        public Builder setFailureThreshold(@Nullable Input<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }
        public ServiceHealthCheckCustomConfigArgs build() {
            return new ServiceHealthCheckCustomConfigArgs(failureThreshold);
        }
    }
}
