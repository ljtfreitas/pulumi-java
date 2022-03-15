// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterDefaultSnatStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterDefaultSnatStatusGetArgs Empty = new ClusterDefaultSnatStatusGetArgs();

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    @Import(name="disabled", required=true)
      private final Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled;
    }

    public ClusterDefaultSnatStatusGetArgs(Output<Boolean> disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private ClusterDefaultSnatStatusGetArgs() {
        this.disabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDefaultSnatStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDefaultSnatStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Output<Boolean> disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Output.of(Objects.requireNonNull(disabled));
            return this;
        }
        public ClusterDefaultSnatStatusGetArgs build() {
            return new ClusterDefaultSnatStatusGetArgs(disabled);
        }
    }
}
