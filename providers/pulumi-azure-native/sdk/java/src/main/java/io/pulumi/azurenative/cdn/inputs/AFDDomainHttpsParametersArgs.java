// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.AfdCertificateType;
import io.pulumi.azurenative.cdn.enums.AfdMinimumTlsVersion;
import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The JSON object that contains the properties to secure a domain.
 * 
 */
public final class AFDDomainHttpsParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AFDDomainHttpsParametersArgs Empty = new AFDDomainHttpsParametersArgs();

    /**
     * Defines the source of the SSL certificate.
     * 
     */
    @InputImport(name="certificateType", required=true)
        private final Input<Either<String,AfdCertificateType>> certificateType;

    public Input<Either<String,AfdCertificateType>> getCertificateType() {
        return this.certificateType;
    }

    /**
     * TLS protocol version that will be used for Https
     * 
     */
    @InputImport(name="minimumTlsVersion")
        private final @Nullable Input<AfdMinimumTlsVersion> minimumTlsVersion;

    public Input<AfdMinimumTlsVersion> getMinimumTlsVersion() {
        return this.minimumTlsVersion == null ? Input.empty() : this.minimumTlsVersion;
    }

    /**
     * Resource reference to the secret. ie. subs/rg/profile/secret
     * 
     */
    @InputImport(name="secret")
        private final @Nullable Input<ResourceReferenceArgs> secret;

    public Input<ResourceReferenceArgs> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    public AFDDomainHttpsParametersArgs(
        Input<Either<String,AfdCertificateType>> certificateType,
        @Nullable Input<AfdMinimumTlsVersion> minimumTlsVersion,
        @Nullable Input<ResourceReferenceArgs> secret) {
        this.certificateType = Objects.requireNonNull(certificateType, "expected parameter 'certificateType' to be non-null");
        this.minimumTlsVersion = minimumTlsVersion;
        this.secret = secret;
    }

    private AFDDomainHttpsParametersArgs() {
        this.certificateType = Input.empty();
        this.minimumTlsVersion = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDDomainHttpsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AfdCertificateType>> certificateType;
        private @Nullable Input<AfdMinimumTlsVersion> minimumTlsVersion;
        private @Nullable Input<ResourceReferenceArgs> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDDomainHttpsParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateType = defaults.certificateType;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.secret = defaults.secret;
        }

        public Builder setCertificateType(Input<Either<String,AfdCertificateType>> certificateType) {
            this.certificateType = Objects.requireNonNull(certificateType);
            return this;
        }

        public Builder setCertificateType(Either<String,AfdCertificateType> certificateType) {
            this.certificateType = Input.of(Objects.requireNonNull(certificateType));
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable Input<AfdMinimumTlsVersion> minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable AfdMinimumTlsVersion minimumTlsVersion) {
            this.minimumTlsVersion = Input.ofNullable(minimumTlsVersion);
            return this;
        }

        public Builder setSecret(@Nullable Input<ResourceReferenceArgs> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable ResourceReferenceArgs secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }
        public AFDDomainHttpsParametersArgs build() {
            return new AFDDomainHttpsParametersArgs(certificateType, minimumTlsVersion, secret);
        }
    }
}
