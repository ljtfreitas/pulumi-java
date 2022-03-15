// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionAuthorityKeyIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionAuthorityKeyIdArgs Empty = new CertificateCertificateDescriptionAuthorityKeyIdArgs();

    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> getKeyId() {
        return this.keyId == null ? Output.empty() : this.keyId;
    }

    public CertificateCertificateDescriptionAuthorityKeyIdArgs(@Nullable Output<String> keyId) {
        this.keyId = keyId;
    }

    private CertificateCertificateDescriptionAuthorityKeyIdArgs() {
        this.keyId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionAuthorityKeyIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionAuthorityKeyIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder keyId(@Nullable String keyId) {
            this.keyId = Output.ofNullable(keyId);
            return this;
        }
        public CertificateCertificateDescriptionAuthorityKeyIdArgs build() {
            return new CertificateCertificateDescriptionAuthorityKeyIdArgs(keyId);
        }
    }
}
