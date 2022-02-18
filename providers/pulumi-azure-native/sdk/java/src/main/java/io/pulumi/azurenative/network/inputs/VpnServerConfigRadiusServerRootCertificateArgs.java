// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of Radius Server root certificate of VpnServerConfiguration.
 * 
 */
public final class VpnServerConfigRadiusServerRootCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigRadiusServerRootCertificateArgs Empty = new VpnServerConfigRadiusServerRootCertificateArgs();

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
     * The certificate public data.
     * 
     */
    @InputImport(name="publicCertData")
    private final @Nullable Input<String> publicCertData;

    public Input<String> getPublicCertData() {
        return this.publicCertData == null ? Input.empty() : this.publicCertData;
    }

    public VpnServerConfigRadiusServerRootCertificateArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> publicCertData) {
        this.name = name;
        this.publicCertData = publicCertData;
    }

    private VpnServerConfigRadiusServerRootCertificateArgs() {
        this.name = Input.empty();
        this.publicCertData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnServerConfigRadiusServerRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> publicCertData;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnServerConfigRadiusServerRootCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.publicCertData = defaults.publicCertData;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPublicCertData(@Nullable Input<String> publicCertData) {
            this.publicCertData = publicCertData;
            return this;
        }

        public Builder setPublicCertData(@Nullable String publicCertData) {
            this.publicCertData = Input.ofNullable(publicCertData);
            return this;
        }

        public VpnServerConfigRadiusServerRootCertificateArgs build() {
            return new VpnServerConfigRadiusServerRootCertificateArgs(name, publicCertData);
        }
    }
}
