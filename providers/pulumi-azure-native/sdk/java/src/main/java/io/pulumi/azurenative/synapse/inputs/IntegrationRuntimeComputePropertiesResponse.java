// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeDataFlowPropertiesResponse;
import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeVNetPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The compute resource properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeComputePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeComputePropertiesResponse Empty = new IntegrationRuntimeComputePropertiesResponse();

    /**
     * Data flow properties for managed integration runtime.
     * 
     */
    @InputImport(name="dataFlowProperties")
        private final @Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties;

    public Optional<IntegrationRuntimeDataFlowPropertiesResponse> getDataFlowProperties() {
        return this.dataFlowProperties == null ? Optional.empty() : Optional.ofNullable(this.dataFlowProperties);
    }

    /**
     * The location for managed integration runtime. The supported regions could be found on https://docs.microsoft.com/en-us/azure/data-factory/data-factory-data-movement-activities
     * 
     */
    @InputImport(name="location")
        private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Maximum parallel executions count per node for managed integration runtime.
     * 
     */
    @InputImport(name="maxParallelExecutionsPerNode")
        private final @Nullable Integer maxParallelExecutionsPerNode;

    public Optional<Integer> getMaxParallelExecutionsPerNode() {
        return this.maxParallelExecutionsPerNode == null ? Optional.empty() : Optional.ofNullable(this.maxParallelExecutionsPerNode);
    }

    /**
     * The node size requirement to managed integration runtime.
     * 
     */
    @InputImport(name="nodeSize")
        private final @Nullable String nodeSize;

    public Optional<String> getNodeSize() {
        return this.nodeSize == null ? Optional.empty() : Optional.ofNullable(this.nodeSize);
    }

    /**
     * The required number of nodes for managed integration runtime.
     * 
     */
    @InputImport(name="numberOfNodes")
        private final @Nullable Integer numberOfNodes;

    public Optional<Integer> getNumberOfNodes() {
        return this.numberOfNodes == null ? Optional.empty() : Optional.ofNullable(this.numberOfNodes);
    }

    /**
     * VNet properties for managed integration runtime.
     * 
     */
    @InputImport(name="vNetProperties")
        private final @Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties;

    public Optional<IntegrationRuntimeVNetPropertiesResponse> getVNetProperties() {
        return this.vNetProperties == null ? Optional.empty() : Optional.ofNullable(this.vNetProperties);
    }

    public IntegrationRuntimeComputePropertiesResponse(
        @Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties,
        @Nullable String location,
        @Nullable Integer maxParallelExecutionsPerNode,
        @Nullable String nodeSize,
        @Nullable Integer numberOfNodes,
        @Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties) {
        this.dataFlowProperties = dataFlowProperties;
        this.location = location;
        this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
        this.nodeSize = nodeSize;
        this.numberOfNodes = numberOfNodes;
        this.vNetProperties = vNetProperties;
    }

    private IntegrationRuntimeComputePropertiesResponse() {
        this.dataFlowProperties = null;
        this.location = null;
        this.maxParallelExecutionsPerNode = null;
        this.nodeSize = null;
        this.numberOfNodes = null;
        this.vNetProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeComputePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties;
        private @Nullable String location;
        private @Nullable Integer maxParallelExecutionsPerNode;
        private @Nullable String nodeSize;
        private @Nullable Integer numberOfNodes;
        private @Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeComputePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataFlowProperties = defaults.dataFlowProperties;
    	      this.location = defaults.location;
    	      this.maxParallelExecutionsPerNode = defaults.maxParallelExecutionsPerNode;
    	      this.nodeSize = defaults.nodeSize;
    	      this.numberOfNodes = defaults.numberOfNodes;
    	      this.vNetProperties = defaults.vNetProperties;
        }

        public Builder setDataFlowProperties(@Nullable IntegrationRuntimeDataFlowPropertiesResponse dataFlowProperties) {
            this.dataFlowProperties = dataFlowProperties;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMaxParallelExecutionsPerNode(@Nullable Integer maxParallelExecutionsPerNode) {
            this.maxParallelExecutionsPerNode = maxParallelExecutionsPerNode;
            return this;
        }

        public Builder setNodeSize(@Nullable String nodeSize) {
            this.nodeSize = nodeSize;
            return this;
        }

        public Builder setNumberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }

        public Builder setVNetProperties(@Nullable IntegrationRuntimeVNetPropertiesResponse vNetProperties) {
            this.vNetProperties = vNetProperties;
            return this;
        }
        public IntegrationRuntimeComputePropertiesResponse build() {
            return new IntegrationRuntimeComputePropertiesResponse(dataFlowProperties, location, maxParallelExecutionsPerNode, nodeSize, numberOfNodes, vNetProperties);
        }
    }
}
