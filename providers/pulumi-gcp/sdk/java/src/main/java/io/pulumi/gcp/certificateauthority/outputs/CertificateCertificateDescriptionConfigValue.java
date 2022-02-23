// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescriptionConfigValue {
    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages;

    @OutputCustomType.Constructor({"keyUsages"})
    private CertificateCertificateDescriptionConfigValue(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages) {
        this.keyUsages = keyUsages;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionConfigValueKeyUsage> getKeyUsages() {
        return this.keyUsages == null ? List.of() : this.keyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUsages = defaults.keyUsages;
        }

        public Builder setKeyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsage> keyUsages) {
            this.keyUsages = keyUsages;
            return this;
        }
        public CertificateCertificateDescriptionConfigValue build() {
            return new CertificateCertificateDescriptionConfigValue(keyUsages);
        }
    }
}
