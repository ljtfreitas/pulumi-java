// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationRecoveryServicesProviderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicationRecoveryServicesProviderArgs Empty = new GetReplicationRecoveryServicesProviderArgs();

    /**
     * Fabric name.
     * 
     */
    @InputImport(name="fabricName", required=true)
        private final String fabricName;

    public String getFabricName() {
        return this.fabricName;
    }

    /**
     * Recovery services provider name
     * 
     */
    @InputImport(name="providerName", required=true)
        private final String providerName;

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public GetReplicationRecoveryServicesProviderArgs(
        String fabricName,
        String providerName,
        String resourceGroupName,
        String resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetReplicationRecoveryServicesProviderArgs() {
        this.fabricName = null;
        this.providerName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationRecoveryServicesProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricName;
        private String providerName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationRecoveryServicesProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setProviderName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public GetReplicationRecoveryServicesProviderArgs build() {
            return new GetReplicationRecoveryServicesProviderArgs(fabricName, providerName, resourceGroupName, resourceName);
        }
    }
}
