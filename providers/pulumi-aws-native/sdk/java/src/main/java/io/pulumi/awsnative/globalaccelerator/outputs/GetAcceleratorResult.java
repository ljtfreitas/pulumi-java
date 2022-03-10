// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator.outputs;

import io.pulumi.awsnative.globalaccelerator.enums.AcceleratorIpAddressType;
import io.pulumi.awsnative.globalaccelerator.outputs.AcceleratorTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAcceleratorResult {
    /**
     * The Amazon Resource Name (ARN) of the accelerator.
     * 
     */
    private final @Nullable String acceleratorArn;
    /**
     * The Domain Name System (DNS) name that Global Accelerator creates that points to your accelerator's static IP addresses.
     * 
     */
    private final @Nullable String dnsName;
    /**
     * Indicates whether an accelerator is enabled. The value is true or false.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * IP Address type.
     * 
     */
    private final @Nullable AcceleratorIpAddressType ipAddressType;
    /**
     * The IP addresses from BYOIP Prefix pool.
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * Name of accelerator.
     * 
     */
    private final @Nullable String name;
    private final @Nullable List<AcceleratorTag> tags;

    @OutputCustomType.Constructor
    private GetAcceleratorResult(
        @OutputCustomType.Parameter("acceleratorArn") @Nullable String acceleratorArn,
        @OutputCustomType.Parameter("dnsName") @Nullable String dnsName,
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("ipAddressType") @Nullable AcceleratorIpAddressType ipAddressType,
        @OutputCustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("tags") @Nullable List<AcceleratorTag> tags) {
        this.acceleratorArn = acceleratorArn;
        this.dnsName = dnsName;
        this.enabled = enabled;
        this.ipAddressType = ipAddressType;
        this.ipAddresses = ipAddresses;
        this.name = name;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the accelerator.
     * 
    */
    public Optional<String> getAcceleratorArn() {
        return Optional.ofNullable(this.acceleratorArn);
    }
    /**
     * The Domain Name System (DNS) name that Global Accelerator creates that points to your accelerator's static IP addresses.
     * 
    */
    public Optional<String> getDnsName() {
        return Optional.ofNullable(this.dnsName);
    }
    /**
     * Indicates whether an accelerator is enabled. The value is true or false.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * IP Address type.
     * 
    */
    public Optional<AcceleratorIpAddressType> getIpAddressType() {
        return Optional.ofNullable(this.ipAddressType);
    }
    /**
     * The IP addresses from BYOIP Prefix pool.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * Name of accelerator.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<AcceleratorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAcceleratorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceleratorArn;
        private @Nullable String dnsName;
        private @Nullable Boolean enabled;
        private @Nullable AcceleratorIpAddressType ipAddressType;
        private @Nullable List<String> ipAddresses;
        private @Nullable String name;
        private @Nullable List<AcceleratorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAcceleratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorArn = defaults.acceleratorArn;
    	      this.dnsName = defaults.dnsName;
    	      this.enabled = defaults.enabled;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setAcceleratorArn(@Nullable String acceleratorArn) {
            this.acceleratorArn = acceleratorArn;
            return this;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setIpAddressType(@Nullable AcceleratorIpAddressType ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<AcceleratorTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetAcceleratorResult build() {
            return new GetAcceleratorResult(acceleratorArn, dnsName, enabled, ipAddressType, ipAddresses, name, tags);
        }
    }
}
