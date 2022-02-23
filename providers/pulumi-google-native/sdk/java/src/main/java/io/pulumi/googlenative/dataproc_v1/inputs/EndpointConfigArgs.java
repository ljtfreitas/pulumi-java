// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Endpoint config for this cluster
 * 
 */
public final class EndpointConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigArgs Empty = new EndpointConfigArgs();

    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    @InputImport(name="enableHttpPortAccess")
      private final @Nullable Input<Boolean> enableHttpPortAccess;

    public Input<Boolean> getEnableHttpPortAccess() {
        return this.enableHttpPortAccess == null ? Input.empty() : this.enableHttpPortAccess;
    }

    public EndpointConfigArgs(@Nullable Input<Boolean> enableHttpPortAccess) {
        this.enableHttpPortAccess = enableHttpPortAccess;
    }

    private EndpointConfigArgs() {
        this.enableHttpPortAccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableHttpPortAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHttpPortAccess = defaults.enableHttpPortAccess;
        }

        public Builder setEnableHttpPortAccess(@Nullable Input<Boolean> enableHttpPortAccess) {
            this.enableHttpPortAccess = enableHttpPortAccess;
            return this;
        }

        public Builder setEnableHttpPortAccess(@Nullable Boolean enableHttpPortAccess) {
            this.enableHttpPortAccess = Input.ofNullable(enableHttpPortAccess);
            return this;
        }
        public EndpointConfigArgs build() {
            return new EndpointConfigArgs(enableHttpPortAccess);
        }
    }
}
