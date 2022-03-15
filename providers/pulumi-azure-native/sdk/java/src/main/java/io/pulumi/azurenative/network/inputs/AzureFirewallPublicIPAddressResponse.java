// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Public IP Address associated with azure firewall.
 * 
 */
public final class AzureFirewallPublicIPAddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallPublicIPAddressResponse Empty = new AzureFirewallPublicIPAddressResponse();

    /**
     * Public IP Address value.
     * 
     */
    @Import(name="address")
      private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    public AzureFirewallPublicIPAddressResponse(@Nullable String address) {
        this.address = address;
    }

    private AzureFirewallPublicIPAddressResponse() {
        this.address = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallPublicIPAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallPublicIPAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public AzureFirewallPublicIPAddressResponse build() {
            return new AzureFirewallPublicIPAddressResponse(address);
        }
    }
}
