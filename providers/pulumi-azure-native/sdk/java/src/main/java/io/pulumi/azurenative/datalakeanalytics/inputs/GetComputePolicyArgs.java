// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetComputePolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetComputePolicyArgs Empty = new GetComputePolicyArgs();

    /**
     * The name of the Data Lake Analytics account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the compute policy to retrieve.
     * 
     */
    @InputImport(name="computePolicyName", required=true)
    private final String computePolicyName;

    public String getComputePolicyName() {
        return this.computePolicyName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetComputePolicyArgs(
        String accountName,
        String computePolicyName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.computePolicyName = Objects.requireNonNull(computePolicyName, "expected parameter 'computePolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetComputePolicyArgs() {
        this.accountName = null;
        this.computePolicyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComputePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String computePolicyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComputePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.computePolicyName = defaults.computePolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setComputePolicyName(String computePolicyName) {
            this.computePolicyName = Objects.requireNonNull(computePolicyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetComputePolicyArgs build() {
            return new GetComputePolicyArgs(accountName, computePolicyName, resourceGroupName);
        }
    }
}
