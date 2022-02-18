// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountArgs Empty = new GetIntegrationAccountArgs();

    /**
     * The integration account name.
     * 
     */
    @InputImport(name="integrationAccountName", required=true)
    private final String integrationAccountName;

    public String getIntegrationAccountName() {
        return this.integrationAccountName;
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

    public GetIntegrationAccountArgs(
        String integrationAccountName,
        String resourceGroupName) {
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIntegrationAccountArgs() {
        this.integrationAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetIntegrationAccountArgs build() {
            return new GetIntegrationAccountArgs(integrationAccountName, resourceGroupName);
        }
    }
}
