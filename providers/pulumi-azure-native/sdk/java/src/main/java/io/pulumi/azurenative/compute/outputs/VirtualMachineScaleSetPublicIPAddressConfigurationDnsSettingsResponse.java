// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse {
    /**
     * The Domain name label.The concatenation of the domain name label and vm index will be the domain name labels of the PublicIPAddress resources that will be created
     * 
     */
    private final String domainNameLabel;

    @OutputCustomType.Constructor({"domainNameLabel"})
    private VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse(String domainNameLabel) {
        this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
    }

    /**
     * The Domain name label.The concatenation of the domain name label and vm index will be the domain name labels of the PublicIPAddress resources that will be created
     * 
     */
    public String getDomainNameLabel() {
        return this.domainNameLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainNameLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
        }

        public Builder setDomainNameLabel(String domainNameLabel) {
            this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
            return this;
        }
        public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse build() {
            return new VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse(domainNameLabel);
        }
    }
}
