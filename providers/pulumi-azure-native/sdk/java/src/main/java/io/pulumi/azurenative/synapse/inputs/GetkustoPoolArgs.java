// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetkustoPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetkustoPoolArgs Empty = new GetkustoPoolArgs();

    /**
     * The name of the Kusto pool.
     * 
     */
    @InputImport(name="kustoPoolName", required=true)
    private final String kustoPoolName;

    public String getKustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetkustoPoolArgs(
        String kustoPoolName,
        String resourceGroupName,
        String workspaceName) {
        this.kustoPoolName = Objects.requireNonNull(kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetkustoPoolArgs() {
        this.kustoPoolName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetkustoPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kustoPoolName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetkustoPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kustoPoolName = defaults.kustoPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setKustoPoolName(String kustoPoolName) {
            this.kustoPoolName = Objects.requireNonNull(kustoPoolName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetkustoPoolArgs build() {
            return new GetkustoPoolArgs(kustoPoolName, resourceGroupName, workspaceName);
        }
    }
}
