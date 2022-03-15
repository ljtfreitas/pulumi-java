// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains FQDN of the DNS record associated with the public IP address.
 * 
 */
public final class PublicIPAddressDnsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPAddressDnsSettingsArgs Empty = new PublicIPAddressDnsSettingsArgs();

    /**
     * The domain name label. The concatenation of the domain name label and the regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     * 
     */
    @Import(name="domainNameLabel")
      private final @Nullable Output<String> domainNameLabel;

    public Output<String> getDomainNameLabel() {
        return this.domainNameLabel == null ? Output.empty() : this.domainNameLabel;
    }

    /**
     * The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is the concatenation of the domainNameLabel and the regionalized DNS zone.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> getFqdn() {
        return this.fqdn == null ? Output.empty() : this.fqdn;
    }

    /**
     * The reverse FQDN. A user-visible, fully qualified domain name that resolves to this public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa domain to the reverse FQDN.
     * 
     */
    @Import(name="reverseFqdn")
      private final @Nullable Output<String> reverseFqdn;

    public Output<String> getReverseFqdn() {
        return this.reverseFqdn == null ? Output.empty() : this.reverseFqdn;
    }

    public PublicIPAddressDnsSettingsArgs(
        @Nullable Output<String> domainNameLabel,
        @Nullable Output<String> fqdn,
        @Nullable Output<String> reverseFqdn) {
        this.domainNameLabel = domainNameLabel;
        this.fqdn = fqdn;
        this.reverseFqdn = reverseFqdn;
    }

    private PublicIPAddressDnsSettingsArgs() {
        this.domainNameLabel = Output.empty();
        this.fqdn = Output.empty();
        this.reverseFqdn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressDnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> domainNameLabel;
        private @Nullable Output<String> fqdn;
        private @Nullable Output<String> reverseFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressDnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
    	      this.fqdn = defaults.fqdn;
    	      this.reverseFqdn = defaults.reverseFqdn;
        }

        public Builder domainNameLabel(@Nullable Output<String> domainNameLabel) {
            this.domainNameLabel = domainNameLabel;
            return this;
        }

        public Builder domainNameLabel(@Nullable String domainNameLabel) {
            this.domainNameLabel = Output.ofNullable(domainNameLabel);
            return this;
        }

        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Output.ofNullable(fqdn);
            return this;
        }

        public Builder reverseFqdn(@Nullable Output<String> reverseFqdn) {
            this.reverseFqdn = reverseFqdn;
            return this;
        }

        public Builder reverseFqdn(@Nullable String reverseFqdn) {
            this.reverseFqdn = Output.ofNullable(reverseFqdn);
            return this;
        }
        public PublicIPAddressDnsSettingsArgs build() {
            return new PublicIPAddressDnsSettingsArgs(domainNameLabel, fqdn, reverseFqdn);
        }
    }
}
