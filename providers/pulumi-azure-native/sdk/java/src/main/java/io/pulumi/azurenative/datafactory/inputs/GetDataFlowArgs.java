// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataFlowArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataFlowArgs Empty = new GetDataFlowArgs();

    /**
     * The data flow name.
     * 
     */
    @InputImport(name="dataFlowName", required=true)
        private final String dataFlowName;

    public String getDataFlowName() {
        return this.dataFlowName;
    }

    /**
     * The factory name.
     * 
     */
    @InputImport(name="factoryName", required=true)
        private final String factoryName;

    public String getFactoryName() {
        return this.factoryName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDataFlowArgs(
        String dataFlowName,
        String factoryName,
        String resourceGroupName) {
        this.dataFlowName = Objects.requireNonNull(dataFlowName, "expected parameter 'dataFlowName' to be non-null");
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDataFlowArgs() {
        this.dataFlowName = null;
        this.factoryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataFlowName;
        private String factoryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataFlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataFlowName = defaults.dataFlowName;
    	      this.factoryName = defaults.factoryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDataFlowName(String dataFlowName) {
            this.dataFlowName = Objects.requireNonNull(dataFlowName);
            return this;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDataFlowArgs build() {
            return new GetDataFlowArgs(dataFlowName, factoryName, resourceGroupName);
        }
    }
}
