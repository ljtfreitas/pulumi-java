// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationRuntimeConnectionInfoArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeConnectionInfoArgs Empty = new GetIntegrationRuntimeConnectionInfoArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
      private final String factoryName;

    public String getFactoryName() {
        return this.factoryName;
    }

    /**
     * The integration runtime name.
     * 
     */
    @Import(name="integrationRuntimeName", required=true)
      private final String integrationRuntimeName;

    public String getIntegrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIntegrationRuntimeConnectionInfoArgs(
        String factoryName,
        String integrationRuntimeName,
        String resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIntegrationRuntimeConnectionInfoArgs() {
        this.factoryName = null;
        this.integrationRuntimeName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String factoryName;
        private String integrationRuntimeName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.integrationRuntimeName = defaults.integrationRuntimeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder factoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder integrationRuntimeName(String integrationRuntimeName) {
            this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIntegrationRuntimeConnectionInfoArgs build() {
            return new GetIntegrationRuntimeConnectionInfoArgs(factoryName, integrationRuntimeName, resourceGroupName);
        }
    }
}
