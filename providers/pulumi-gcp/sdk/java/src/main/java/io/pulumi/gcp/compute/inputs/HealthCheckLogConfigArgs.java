// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckLogConfigArgs Empty = new HealthCheckLogConfigArgs();

    /**
     * Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    @InputImport(name="enable")
        private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    public HealthCheckLogConfigArgs(@Nullable Input<Boolean> enable) {
        this.enable = enable;
    }

    private HealthCheckLogConfigArgs() {
        this.enable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enable;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }
        public HealthCheckLogConfigArgs build() {
            return new HealthCheckLogConfigArgs(enable);
        }
    }
}
