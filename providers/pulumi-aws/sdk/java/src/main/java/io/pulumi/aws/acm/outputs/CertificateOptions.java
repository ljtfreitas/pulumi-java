// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateOptions {
    /**
     * Specifies whether certificate details should be added to a certificate transparency log. Valid values are `ENABLED` or `DISABLED`. See https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency for more details.
     * 
     */
    private final @Nullable String certificateTransparencyLoggingPreference;

    @CustomType.Constructor
    private CertificateOptions(@CustomType.Parameter("certificateTransparencyLoggingPreference") @Nullable String certificateTransparencyLoggingPreference) {
        this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
    }

    /**
     * Specifies whether certificate details should be added to a certificate transparency log. Valid values are `ENABLED` or `DISABLED`. See https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency for more details.
     * 
    */
    public Optional<String> getCertificateTransparencyLoggingPreference() {
        return Optional.ofNullable(this.certificateTransparencyLoggingPreference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateTransparencyLoggingPreference;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateTransparencyLoggingPreference = defaults.certificateTransparencyLoggingPreference;
        }

        public Builder certificateTransparencyLoggingPreference(@Nullable String certificateTransparencyLoggingPreference) {
            this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
            return this;
        }
        public CertificateOptions build() {
            return new CertificateOptions(certificateTransparencyLoggingPreference);
        }
    }
}
