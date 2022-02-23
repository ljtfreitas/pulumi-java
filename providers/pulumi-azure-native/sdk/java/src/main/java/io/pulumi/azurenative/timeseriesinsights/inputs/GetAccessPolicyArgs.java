// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPolicyArgs Empty = new GetAccessPolicyArgs();

    /**
     * The name of the Time Series Insights access policy associated with the specified environment.
     * 
     */
    @InputImport(name="accessPolicyName", required=true)
        private final String accessPolicyName;

    public String getAccessPolicyName() {
        return this.accessPolicyName;
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @InputImport(name="environmentName", required=true)
        private final String environmentName;

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAccessPolicyArgs(
        String accessPolicyName,
        String environmentName,
        String resourceGroupName) {
        this.accessPolicyName = Objects.requireNonNull(accessPolicyName, "expected parameter 'accessPolicyName' to be non-null");
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAccessPolicyArgs() {
        this.accessPolicyName = null;
        this.environmentName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPolicyName;
        private String environmentName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyName = defaults.accessPolicyName;
    	      this.environmentName = defaults.environmentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccessPolicyName(String accessPolicyName) {
            this.accessPolicyName = Objects.requireNonNull(accessPolicyName);
            return this;
        }

        public Builder setEnvironmentName(String environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetAccessPolicyArgs build() {
            return new GetAccessPolicyArgs(accessPolicyName, environmentName, resourceGroupName);
        }
    }
}
