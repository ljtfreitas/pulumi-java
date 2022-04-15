// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterAddonsConfigConfigConnectorConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAddonsConfigConfigConnectorConfigGetArgs Empty = new ClusterAddonsConfigConfigConnectorConfigGetArgs();

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    public ClusterAddonsConfigConfigConnectorConfigGetArgs(Output<Boolean> enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ClusterAddonsConfigConfigConnectorConfigGetArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigConfigConnectorConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigConfigConnectorConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }        public ClusterAddonsConfigConfigConnectorConfigGetArgs build() {
            return new ClusterAddonsConfigConfigConnectorConfigGetArgs(enabled);
        }
    }
}
