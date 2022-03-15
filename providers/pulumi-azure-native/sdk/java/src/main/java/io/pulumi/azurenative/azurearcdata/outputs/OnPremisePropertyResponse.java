// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OnPremisePropertyResponse {
    /**
     * A globally unique ID identifying the associated Kubernetes cluster
     * 
     */
    private final String id;
    /**
     * Certificate that contains the Kubernetes cluster public key used to verify signing
     * 
     */
    private final String publicSigningKey;
    /**
     * Unique thumbprint returned to customer to verify the certificate being uploaded
     * 
     */
    private final @Nullable String signingCertificateThumbprint;

    @CustomType.Constructor
    private OnPremisePropertyResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("publicSigningKey") String publicSigningKey,
        @CustomType.Parameter("signingCertificateThumbprint") @Nullable String signingCertificateThumbprint) {
        this.id = id;
        this.publicSigningKey = publicSigningKey;
        this.signingCertificateThumbprint = signingCertificateThumbprint;
    }

    /**
     * A globally unique ID identifying the associated Kubernetes cluster
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Certificate that contains the Kubernetes cluster public key used to verify signing
     * 
    */
    public String getPublicSigningKey() {
        return this.publicSigningKey;
    }
    /**
     * Unique thumbprint returned to customer to verify the certificate being uploaded
     * 
    */
    public Optional<String> getSigningCertificateThumbprint() {
        return Optional.ofNullable(this.signingCertificateThumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremisePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String publicSigningKey;
        private @Nullable String signingCertificateThumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremisePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.publicSigningKey = defaults.publicSigningKey;
    	      this.signingCertificateThumbprint = defaults.signingCertificateThumbprint;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder publicSigningKey(String publicSigningKey) {
            this.publicSigningKey = Objects.requireNonNull(publicSigningKey);
            return this;
        }

        public Builder signingCertificateThumbprint(@Nullable String signingCertificateThumbprint) {
            this.signingCertificateThumbprint = signingCertificateThumbprint;
            return this;
        }
        public OnPremisePropertyResponse build() {
            return new OnPremisePropertyResponse(id, publicSigningKey, signingCertificateThumbprint);
        }
    }
}
