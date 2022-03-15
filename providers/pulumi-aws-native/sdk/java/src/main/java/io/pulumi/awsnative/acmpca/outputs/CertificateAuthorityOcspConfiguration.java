// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateAuthorityOcspConfiguration {
    private final @Nullable Boolean enabled;
    private final @Nullable String ocspCustomCname;

    @CustomType.Constructor
    private CertificateAuthorityOcspConfiguration(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("ocspCustomCname") @Nullable String ocspCustomCname) {
        this.enabled = enabled;
        this.ocspCustomCname = ocspCustomCname;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getOcspCustomCname() {
        return Optional.ofNullable(this.ocspCustomCname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityOcspConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String ocspCustomCname;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityOcspConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ocspCustomCname = defaults.ocspCustomCname;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder ocspCustomCname(@Nullable String ocspCustomCname) {
            this.ocspCustomCname = ocspCustomCname;
            return this;
        }
        public CertificateAuthorityOcspConfiguration build() {
            return new CertificateAuthorityOcspConfiguration(enabled, ocspCustomCname);
        }
    }
}
