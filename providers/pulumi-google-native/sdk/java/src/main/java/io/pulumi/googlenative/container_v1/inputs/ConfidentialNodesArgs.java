// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ConfidentialNodes is configuration for the confidential nodes feature, which makes nodes run on confidential VMs.
 * 
 */
public final class ConfidentialNodesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfidentialNodesArgs Empty = new ConfidentialNodesArgs();

    /**
     * Whether Confidential Nodes feature is enabled for all nodes in this cluster.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public ConfidentialNodesArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private ConfidentialNodesArgs() {
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialNodesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public ConfidentialNodesArgs build() {
            return new ConfidentialNodesArgs(enabled);
        }
    }
}
