// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.NodeConfigDefaultsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Subset of Nodepool message that has defaults.
 * 
 */
public final class NodePoolDefaultsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolDefaultsArgs Empty = new NodePoolDefaultsArgs();

    /**
     * Subset of NodeConfig message that has defaults.
     * 
     */
    @InputImport(name="nodeConfigDefaults")
      private final @Nullable Input<NodeConfigDefaultsArgs> nodeConfigDefaults;

    public Input<NodeConfigDefaultsArgs> getNodeConfigDefaults() {
        return this.nodeConfigDefaults == null ? Input.empty() : this.nodeConfigDefaults;
    }

    public NodePoolDefaultsArgs(@Nullable Input<NodeConfigDefaultsArgs> nodeConfigDefaults) {
        this.nodeConfigDefaults = nodeConfigDefaults;
    }

    private NodePoolDefaultsArgs() {
        this.nodeConfigDefaults = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodeConfigDefaultsArgs> nodeConfigDefaults;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolDefaultsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeConfigDefaults = defaults.nodeConfigDefaults;
        }

        public Builder setNodeConfigDefaults(@Nullable Input<NodeConfigDefaultsArgs> nodeConfigDefaults) {
            this.nodeConfigDefaults = nodeConfigDefaults;
            return this;
        }

        public Builder setNodeConfigDefaults(@Nullable NodeConfigDefaultsArgs nodeConfigDefaults) {
            this.nodeConfigDefaults = Input.ofNullable(nodeConfigDefaults);
            return this;
        }
        public NodePoolDefaultsArgs build() {
            return new NodePoolDefaultsArgs(nodeConfigDefaults);
        }
    }
}
