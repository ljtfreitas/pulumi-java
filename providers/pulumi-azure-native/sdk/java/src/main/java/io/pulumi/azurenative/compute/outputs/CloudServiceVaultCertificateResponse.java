// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceVaultCertificateResponse {
    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret.
     * 
     */
    private final @Nullable String certificateUrl;

    @OutputCustomType.Constructor({"certificateUrl"})
    private CloudServiceVaultCertificateResponse(@Nullable String certificateUrl) {
        this.certificateUrl = certificateUrl;
    }

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret.
     * 
     */
    public Optional<String> getCertificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
        }

        public Builder setCertificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }

        public CloudServiceVaultCertificateResponse build() {
            return new CloudServiceVaultCertificateResponse(certificateUrl);
        }
    }
}
