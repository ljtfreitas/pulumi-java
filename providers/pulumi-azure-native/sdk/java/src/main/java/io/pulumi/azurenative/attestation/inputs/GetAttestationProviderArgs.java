// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.attestation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAttestationProviderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAttestationProviderArgs Empty = new GetAttestationProviderArgs();

    /**
     * Name of the attestation provider.
     * 
     */
    @InputImport(name="providerName", required=true)
    private final String providerName;

    public String getProviderName() {
        return this.providerName;
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

    public GetAttestationProviderArgs(
        String providerName,
        String resourceGroupName) {
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAttestationProviderArgs() {
        this.providerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestationProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String providerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestationProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setProviderName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetAttestationProviderArgs build() {
            return new GetAttestationProviderArgs(providerName, resourceGroupName);
        }
    }
}
