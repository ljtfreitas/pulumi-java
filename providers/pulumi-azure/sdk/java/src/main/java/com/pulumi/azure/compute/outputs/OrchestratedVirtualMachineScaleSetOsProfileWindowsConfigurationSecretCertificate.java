// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate {
    private final String store;
    /**
     * @return The Secret URL of a Key Vault Certificate.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate(
        @CustomType.Parameter("store") String store,
        @CustomType.Parameter("url") String url) {
        this.store = store;
        this.url = url;
    }

    public String store() {
        return this.store;
    }
    /**
     * @return The Secret URL of a Key Vault Certificate.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String store;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.store = defaults.store;
    	      this.url = defaults.url;
        }

        public Builder store(String store) {
            this.store = Objects.requireNonNull(store);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate build() {
            return new OrchestratedVirtualMachineScaleSetOsProfileWindowsConfigurationSecretCertificate(store, url);
        }
    }
}
