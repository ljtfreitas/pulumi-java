// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Client Certificate definition.
 * 
 */
public final class ClientCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertificateArgs Empty = new ClientCertificateArgs();

    /**
     * Certificate Common name.
     * 
     */
    @InputImport(name="commonName")
        private final @Nullable Input<String> commonName;

    public Input<String> getCommonName() {
        return this.commonName == null ? Input.empty() : this.commonName;
    }

    /**
     * Whether the certificate is admin or not.
     * 
     */
    @InputImport(name="isAdmin", required=true)
        private final Input<Boolean> isAdmin;

    public Input<Boolean> getIsAdmin() {
        return this.isAdmin;
    }

    /**
     * Issuer thumbprint for the certificate. Only used together with CommonName.
     * 
     */
    @InputImport(name="issuerThumbprint")
        private final @Nullable Input<String> issuerThumbprint;

    public Input<String> getIssuerThumbprint() {
        return this.issuerThumbprint == null ? Input.empty() : this.issuerThumbprint;
    }

    /**
     * Certificate Thumbprint.
     * 
     */
    @InputImport(name="thumbprint")
        private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    public ClientCertificateArgs(
        @Nullable Input<String> commonName,
        Input<Boolean> isAdmin,
        @Nullable Input<String> issuerThumbprint,
        @Nullable Input<String> thumbprint) {
        this.commonName = commonName;
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
        this.issuerThumbprint = issuerThumbprint;
        this.thumbprint = thumbprint;
    }

    private ClientCertificateArgs() {
        this.commonName = Input.empty();
        this.isAdmin = Input.empty();
        this.issuerThumbprint = Input.empty();
        this.thumbprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commonName;
        private Input<Boolean> isAdmin;
        private @Nullable Input<String> issuerThumbprint;
        private @Nullable Input<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.isAdmin = defaults.isAdmin;
    	      this.issuerThumbprint = defaults.issuerThumbprint;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setCommonName(@Nullable Input<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = Input.ofNullable(commonName);
            return this;
        }

        public Builder setIsAdmin(Input<Boolean> isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }

        public Builder setIsAdmin(Boolean isAdmin) {
            this.isAdmin = Input.of(Objects.requireNonNull(isAdmin));
            return this;
        }

        public Builder setIssuerThumbprint(@Nullable Input<String> issuerThumbprint) {
            this.issuerThumbprint = issuerThumbprint;
            return this;
        }

        public Builder setIssuerThumbprint(@Nullable String issuerThumbprint) {
            this.issuerThumbprint = Input.ofNullable(issuerThumbprint);
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
        public ClientCertificateArgs build() {
            return new ClientCertificateArgs(commonName, isAdmin, issuerThumbprint, thumbprint);
        }
    }
}
