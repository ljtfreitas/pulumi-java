// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="domainNameLabel")
        private final @Nullable Input<String> domainNameLabel;

    public Input<String> getDomainNameLabel() {
        return this.domainNameLabel == null ? Input.empty() : this.domainNameLabel;
    }

    /**
     * The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is the concatenation of the domainNameLabel and the regionalized DNS zone.
     * 
     */
    @InputImport(name="fqdn")
        private final @Nullable Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn == null ? Input.empty() : this.fqdn;
    }

    /**
     * The reverse FQDN. A user-visible, fully qualified domain name that resolves to this public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa domain to the reverse FQDN.
     * 
     */
    @InputImport(name="reverseFqdn")
        private final @Nullable Input<String> reverseFqdn;

    public Input<String> getReverseFqdn() {
        return this.reverseFqdn == null ? Input.empty() : this.reverseFqdn;
    }

    public PublicIPAddressDnsSettingsArgs(
        @Nullable Input<String> domainNameLabel,
        @Nullable Input<String> fqdn,
        @Nullable Input<String> reverseFqdn) {
        this.domainNameLabel = domainNameLabel;
        this.fqdn = fqdn;
        this.reverseFqdn = reverseFqdn;
    }

    private PublicIPAddressDnsSettingsArgs() {
        this.domainNameLabel = Input.empty();
        this.fqdn = Input.empty();
        this.reverseFqdn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressDnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainNameLabel;
        private @Nullable Input<String> fqdn;
        private @Nullable Input<String> reverseFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressDnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
    	      this.fqdn = defaults.fqdn;
    	      this.reverseFqdn = defaults.reverseFqdn;
        }

        public Builder setDomainNameLabel(@Nullable Input<String> domainNameLabel) {
            this.domainNameLabel = domainNameLabel;
            return this;
        }

        public Builder setDomainNameLabel(@Nullable String domainNameLabel) {
            this.domainNameLabel = Input.ofNullable(domainNameLabel);
            return this;
        }

        public Builder setFqdn(@Nullable Input<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = Input.ofNullable(fqdn);
            return this;
        }

        public Builder setReverseFqdn(@Nullable Input<String> reverseFqdn) {
            this.reverseFqdn = reverseFqdn;
            return this;
        }

        public Builder setReverseFqdn(@Nullable String reverseFqdn) {
            this.reverseFqdn = Input.ofNullable(reverseFqdn);
            return this;
        }
        public PublicIPAddressDnsSettingsArgs build() {
            return new PublicIPAddressDnsSettingsArgs(domainNameLabel, fqdn, reverseFqdn);
        }
    }
}
