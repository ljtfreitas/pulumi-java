// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetProtectionContainerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProtectionContainerArgs Empty = new GetProtectionContainerArgs();

    /**
     * Name of the container whose details need to be fetched.
     * 
     */
    @InputImport(name="containerName", required=true)
        private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Name of the fabric where the container belongs.
     * 
     */
    @InputImport(name="fabricName", required=true)
        private final String fabricName;

    public String getFabricName() {
        return this.fabricName;
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
    @InputImport(name="vaultName", required=true)
        private final String vaultName;

    public String getVaultName() {
        return this.vaultName;
    }

    public GetProtectionContainerArgs(
        String containerName,
        String fabricName,
        String resourceGroupName,
        String vaultName) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetProtectionContainerArgs() {
        this.containerName = null;
        this.fabricName = null;
        this.resourceGroupName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProtectionContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String fabricName;
        private String resourceGroupName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProtectionContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.fabricName = defaults.fabricName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public GetProtectionContainerArgs build() {
            return new GetProtectionContainerArgs(containerName, fabricName, resourceGroupName, vaultName);
        }
    }
}
