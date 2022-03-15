// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.PublicIPAddressSkuResponse;
import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetIpTagResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machines scale set IP Configuration's PublicIPAddress configuration
 * 
 */
public final class VirtualMachineScaleSetPublicIPAddressConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetPublicIPAddressConfigurationResponse Empty = new VirtualMachineScaleSetPublicIPAddressConfigurationResponse();

    /**
     * Specify what happens to the public IP when the VM is deleted
     * 
     */
    @Import(name="deleteOption")
      private final @Nullable String deleteOption;

    public Optional<String> getDeleteOption() {
        return this.deleteOption == null ? Optional.empty() : Optional.ofNullable(this.deleteOption);
    }

    /**
     * The dns settings to be applied on the publicIP addresses .
     * 
     */
    @Import(name="dnsSettings")
      private final @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings;

    public Optional<VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse> getDnsSettings() {
        return this.dnsSettings == null ? Optional.empty() : Optional.ofNullable(this.dnsSettings);
    }

    /**
     * The idle timeout of the public IP address.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
      private final @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Optional.empty() : Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * The list of IP tags associated with the public IP address.
     * 
     */
    @Import(name="ipTags")
      private final @Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags;

    public List<VirtualMachineScaleSetIpTagResponse> getIpTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }

    /**
     * The publicIP address configuration name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    @Import(name="publicIPAddressVersion")
      private final @Nullable String publicIPAddressVersion;

    public Optional<String> getPublicIPAddressVersion() {
        return this.publicIPAddressVersion == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddressVersion);
    }

    /**
     * The PublicIPPrefix from which to allocate publicIP addresses.
     * 
     */
    @Import(name="publicIPPrefix")
      private final @Nullable SubResourceResponse publicIPPrefix;

    public Optional<SubResourceResponse> getPublicIPPrefix() {
        return this.publicIPPrefix == null ? Optional.empty() : Optional.ofNullable(this.publicIPPrefix);
    }

    /**
     * Describes the public IP Sku
     * 
     */
    @Import(name="sku")
      private final @Nullable PublicIPAddressSkuResponse sku;

    public Optional<PublicIPAddressSkuResponse> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    public VirtualMachineScaleSetPublicIPAddressConfigurationResponse(
        @Nullable String deleteOption,
        @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags,
        String name,
        @Nullable String publicIPAddressVersion,
        @Nullable SubResourceResponse publicIPPrefix,
        @Nullable PublicIPAddressSkuResponse sku) {
        this.deleteOption = deleteOption;
        this.dnsSettings = dnsSettings;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipTags = ipTags;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPPrefix = publicIPPrefix;
        this.sku = sku;
    }

    private VirtualMachineScaleSetPublicIPAddressConfigurationResponse() {
        this.deleteOption = null;
        this.dnsSettings = null;
        this.idleTimeoutInMinutes = null;
        this.ipTags = List.of();
        this.name = null;
        this.publicIPAddressVersion = null;
        this.publicIPPrefix = null;
        this.sku = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetPublicIPAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOption;
        private @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags;
        private String name;
        private @Nullable String publicIPAddressVersion;
        private @Nullable SubResourceResponse publicIPPrefix;
        private @Nullable PublicIPAddressSkuResponse sku;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetPublicIPAddressConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipTags = defaults.ipTags;
    	      this.name = defaults.name;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.sku = defaults.sku;
        }

        public Builder deleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder dnsSettings(@Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder ipTags(@Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder publicIPAddressVersion(@Nullable String publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder publicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder sku(@Nullable PublicIPAddressSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public VirtualMachineScaleSetPublicIPAddressConfigurationResponse build() {
            return new VirtualMachineScaleSetPublicIPAddressConfigurationResponse(deleteOption, dnsSettings, idleTimeoutInMinutes, ipTags, name, publicIPAddressVersion, publicIPPrefix, sku);
        }
    }
}
