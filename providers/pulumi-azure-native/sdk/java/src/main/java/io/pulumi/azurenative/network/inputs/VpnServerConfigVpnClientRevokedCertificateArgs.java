// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the revoked VPN client certificate of VpnServerConfiguration.
 * 
 */
public final class VpnServerConfigVpnClientRevokedCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigVpnClientRevokedCertificateArgs Empty = new VpnServerConfigVpnClientRevokedCertificateArgs();

    /**
     * The certificate name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The revoked VPN client certificate thumbprint.
     * 
     */
    @InputImport(name="thumbprint")
        private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    public VpnServerConfigVpnClientRevokedCertificateArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> thumbprint) {
        this.name = name;
        this.thumbprint = thumbprint;
    }

    private VpnServerConfigVpnClientRevokedCertificateArgs() {
        this.name = Input.empty();
        this.thumbprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigVpnClientRevokedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigVpnClientRevokedCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setThumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }
        public VpnServerConfigVpnClientRevokedCertificateArgs build() {
            return new VpnServerConfigVpnClientRevokedCertificateArgs(name, thumbprint);
        }
    }
}
