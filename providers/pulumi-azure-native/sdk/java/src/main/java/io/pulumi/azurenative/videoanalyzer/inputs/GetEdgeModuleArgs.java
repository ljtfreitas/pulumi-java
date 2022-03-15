// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEdgeModuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEdgeModuleArgs Empty = new GetEdgeModuleArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the edge module to retrieve.
     * 
     */
    @Import(name="edgeModuleName", required=true)
      private final String edgeModuleName;

    public String getEdgeModuleName() {
        return this.edgeModuleName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEdgeModuleArgs(
        String accountName,
        String edgeModuleName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.edgeModuleName = Objects.requireNonNull(edgeModuleName, "expected parameter 'edgeModuleName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEdgeModuleArgs() {
        this.accountName = null;
        this.edgeModuleName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEdgeModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String edgeModuleName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEdgeModuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.edgeModuleName = defaults.edgeModuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder edgeModuleName(String edgeModuleName) {
            this.edgeModuleName = Objects.requireNonNull(edgeModuleName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetEdgeModuleArgs build() {
            return new GetEdgeModuleArgs(accountName, edgeModuleName, resourceGroupName);
        }
    }
}
