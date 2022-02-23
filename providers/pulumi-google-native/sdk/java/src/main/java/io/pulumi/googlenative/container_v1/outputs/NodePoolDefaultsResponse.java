// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1.outputs.NodeConfigDefaultsResponse;
import java.util.Objects;

@OutputCustomType
public final class NodePoolDefaultsResponse {
    /**
     * Subset of NodeConfig message that has defaults.
     * 
     */
    private final NodeConfigDefaultsResponse nodeConfigDefaults;

    @OutputCustomType.Constructor({"nodeConfigDefaults"})
    private NodePoolDefaultsResponse(NodeConfigDefaultsResponse nodeConfigDefaults) {
        this.nodeConfigDefaults = Objects.requireNonNull(nodeConfigDefaults);
    }

    /**
     * Subset of NodeConfig message that has defaults.
     * 
     */
    public NodeConfigDefaultsResponse getNodeConfigDefaults() {
        return this.nodeConfigDefaults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeConfigDefaultsResponse nodeConfigDefaults;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeConfigDefaults = defaults.nodeConfigDefaults;
        }

        public Builder setNodeConfigDefaults(NodeConfigDefaultsResponse nodeConfigDefaults) {
            this.nodeConfigDefaults = Objects.requireNonNull(nodeConfigDefaults);
            return this;
        }
        public NodePoolDefaultsResponse build() {
            return new NodePoolDefaultsResponse(nodeConfigDefaults);
        }
    }
}
