// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Forest Trust Setting
 * 
 */
public final class ForestTrustResponse extends io.pulumi.resources.InvokeArgs {

    public static final ForestTrustResponse Empty = new ForestTrustResponse();

    /**
     * Friendly Name
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Remote Dns ips
     * 
     */
    @InputImport(name="remoteDnsIps")
    private final @Nullable String remoteDnsIps;

    public Optional<String> getRemoteDnsIps() {
        return this.remoteDnsIps == null ? Optional.empty() : Optional.ofNullable(this.remoteDnsIps);
    }

    /**
     * Trust Direction
     * 
     */
    @InputImport(name="trustDirection")
    private final @Nullable String trustDirection;

    public Optional<String> getTrustDirection() {
        return this.trustDirection == null ? Optional.empty() : Optional.ofNullable(this.trustDirection);
    }

    /**
     * Trust Password
     * 
     */
    @InputImport(name="trustPassword")
    private final @Nullable String trustPassword;

    public Optional<String> getTrustPassword() {
        return this.trustPassword == null ? Optional.empty() : Optional.ofNullable(this.trustPassword);
    }

    /**
     * Trusted Domain FQDN
     * 
     */
    @InputImport(name="trustedDomainFqdn")
    private final @Nullable String trustedDomainFqdn;

    public Optional<String> getTrustedDomainFqdn() {
        return this.trustedDomainFqdn == null ? Optional.empty() : Optional.ofNullable(this.trustedDomainFqdn);
    }

    public ForestTrustResponse(
        @Nullable String friendlyName,
        @Nullable String remoteDnsIps,
        @Nullable String trustDirection,
        @Nullable String trustPassword,
        @Nullable String trustedDomainFqdn) {
        this.friendlyName = friendlyName;
        this.remoteDnsIps = remoteDnsIps;
        this.trustDirection = trustDirection;
        this.trustPassword = trustPassword;
        this.trustedDomainFqdn = trustedDomainFqdn;
    }

    private ForestTrustResponse() {
        this.friendlyName = null;
        this.remoteDnsIps = null;
        this.trustDirection = null;
        this.trustPassword = null;
        this.trustedDomainFqdn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForestTrustResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String friendlyName;
        private @Nullable String remoteDnsIps;
        private @Nullable String trustDirection;
        private @Nullable String trustPassword;
        private @Nullable String trustedDomainFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(ForestTrustResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friendlyName = defaults.friendlyName;
    	      this.remoteDnsIps = defaults.remoteDnsIps;
    	      this.trustDirection = defaults.trustDirection;
    	      this.trustPassword = defaults.trustPassword;
    	      this.trustedDomainFqdn = defaults.trustedDomainFqdn;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setRemoteDnsIps(@Nullable String remoteDnsIps) {
            this.remoteDnsIps = remoteDnsIps;
            return this;
        }

        public Builder setTrustDirection(@Nullable String trustDirection) {
            this.trustDirection = trustDirection;
            return this;
        }

        public Builder setTrustPassword(@Nullable String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }

        public Builder setTrustedDomainFqdn(@Nullable String trustedDomainFqdn) {
            this.trustedDomainFqdn = trustedDomainFqdn;
            return this;
        }

        public ForestTrustResponse build() {
            return new ForestTrustResponse(friendlyName, remoteDnsIps, trustDirection, trustPassword, trustedDomainFqdn);
        }
    }
}
