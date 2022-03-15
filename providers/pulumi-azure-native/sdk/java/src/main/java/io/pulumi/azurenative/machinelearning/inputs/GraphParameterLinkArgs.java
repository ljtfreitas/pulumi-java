// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Association link for a graph global parameter to a node in the graph.
 * 
 */
public final class GraphParameterLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphParameterLinkArgs Empty = new GraphParameterLinkArgs();

    /**
     * The graph node's identifier
     * 
     */
    @Import(name="nodeId", required=true)
      private final Output<String> nodeId;

    public Output<String> getNodeId() {
        return this.nodeId;
    }

    /**
     * The identifier of the node parameter that the global parameter maps to.
     * 
     */
    @Import(name="parameterKey", required=true)
      private final Output<String> parameterKey;

    public Output<String> getParameterKey() {
        return this.parameterKey;
    }

    public GraphParameterLinkArgs(
        Output<String> nodeId,
        Output<String> parameterKey) {
        this.nodeId = Objects.requireNonNull(nodeId, "expected parameter 'nodeId' to be non-null");
        this.parameterKey = Objects.requireNonNull(parameterKey, "expected parameter 'parameterKey' to be non-null");
    }

    private GraphParameterLinkArgs() {
        this.nodeId = Output.empty();
        this.parameterKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphParameterLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> nodeId;
        private Output<String> parameterKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphParameterLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeId = defaults.nodeId;
    	      this.parameterKey = defaults.parameterKey;
        }

        public Builder nodeId(Output<String> nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder nodeId(String nodeId) {
            this.nodeId = Output.of(Objects.requireNonNull(nodeId));
            return this;
        }

        public Builder parameterKey(Output<String> parameterKey) {
            this.parameterKey = Objects.requireNonNull(parameterKey);
            return this;
        }

        public Builder parameterKey(String parameterKey) {
            this.parameterKey = Output.of(Objects.requireNonNull(parameterKey));
            return this;
        }
        public GraphParameterLinkArgs build() {
            return new GraphParameterLinkArgs(nodeId, parameterKey);
        }
    }
}
