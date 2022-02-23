// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains custom Dns resolution configuration from customer.
 * 
 */
public final class CustomDnsConfigPropertiesFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomDnsConfigPropertiesFormatResponse Empty = new CustomDnsConfigPropertiesFormatResponse();

    /**
     * Fqdn that resolves to private endpoint ip address.
     * 
     */
    @InputImport(name="fqdn")
        private final @Nullable String fqdn;

    public Optional<String> getFqdn() {
        return this.fqdn == null ? Optional.empty() : Optional.ofNullable(this.fqdn);
    }

    /**
     * A list of private ip addresses of the private endpoint.
     * 
     */
    @InputImport(name="ipAddresses")
        private final @Nullable List<String> ipAddresses;

    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    public CustomDnsConfigPropertiesFormatResponse(
        @Nullable String fqdn,
        @Nullable List<String> ipAddresses) {
        this.fqdn = fqdn;
        this.ipAddresses = ipAddresses;
    }

    private CustomDnsConfigPropertiesFormatResponse() {
        this.fqdn = null;
        this.ipAddresses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDnsConfigPropertiesFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable List<String> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDnsConfigPropertiesFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public CustomDnsConfigPropertiesFormatResponse build() {
            return new CustomDnsConfigPropertiesFormatResponse(fqdn, ipAddresses);
        }
    }
}
