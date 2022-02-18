// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.GraphEdgeArgs;
import io.pulumi.azurenative.machinelearning.inputs.GraphNodeArgs;
import io.pulumi.azurenative.machinelearning.inputs.GraphParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the graph of modules making up the machine learning solution.
 * 
 */
public final class GraphPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphPackageArgs Empty = new GraphPackageArgs();

    /**
     * The list of edges making up the graph.
     * 
     */
    @InputImport(name="edges")
    private final @Nullable Input<List<GraphEdgeArgs>> edges;

    public Input<List<GraphEdgeArgs>> getEdges() {
        return this.edges == null ? Input.empty() : this.edges;
    }

    /**
     * The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
     * 
     */
    @InputImport(name="graphParameters")
    private final @Nullable Input<Map<String,GraphParameterArgs>> graphParameters;

    public Input<Map<String,GraphParameterArgs>> getGraphParameters() {
        return this.graphParameters == null ? Input.empty() : this.graphParameters;
    }

    /**
     * The set of nodes making up the graph, provided as a nodeId to GraphNode map
     * 
     */
    @InputImport(name="nodes")
    private final @Nullable Input<Map<String,GraphNodeArgs>> nodes;

    public Input<Map<String,GraphNodeArgs>> getNodes() {
        return this.nodes == null ? Input.empty() : this.nodes;
    }

    public GraphPackageArgs(
        @Nullable Input<List<GraphEdgeArgs>> edges,
        @Nullable Input<Map<String,GraphParameterArgs>> graphParameters,
        @Nullable Input<Map<String,GraphNodeArgs>> nodes) {
        this.edges = edges;
        this.graphParameters = graphParameters;
        this.nodes = nodes;
    }

    private GraphPackageArgs() {
        this.edges = Input.empty();
        this.graphParameters = Input.empty();
        this.nodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GraphEdgeArgs>> edges;
        private @Nullable Input<Map<String,GraphParameterArgs>> graphParameters;
        private @Nullable Input<Map<String,GraphNodeArgs>> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edges = defaults.edges;
    	      this.graphParameters = defaults.graphParameters;
    	      this.nodes = defaults.nodes;
        }

        public Builder setEdges(@Nullable Input<List<GraphEdgeArgs>> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setEdges(@Nullable List<GraphEdgeArgs> edges) {
            this.edges = Input.ofNullable(edges);
            return this;
        }

        public Builder setGraphParameters(@Nullable Input<Map<String,GraphParameterArgs>> graphParameters) {
            this.graphParameters = graphParameters;
            return this;
        }

        public Builder setGraphParameters(@Nullable Map<String,GraphParameterArgs> graphParameters) {
            this.graphParameters = Input.ofNullable(graphParameters);
            return this;
        }

        public Builder setNodes(@Nullable Input<Map<String,GraphNodeArgs>> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setNodes(@Nullable Map<String,GraphNodeArgs> nodes) {
            this.nodes = Input.ofNullable(nodes);
            return this;
        }

        public GraphPackageArgs build() {
            return new GraphPackageArgs(edges, graphParameters, nodes);
        }
    }
}
