// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage {
    private final @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds;

    @CustomType.Constructor
    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage(@CustomType.Parameter("obectIds") @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds) {
        this.obectIds = obectIds;
    }

    public List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds() {
        return this.obectIds == null ? List.of() : this.obectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obectIds = defaults.obectIds;
        }

        public Builder obectIds(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId> obectIds) {
            this.obectIds = obectIds;
            return this;
        }
        public Builder obectIds(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId... obectIds) {
            return obectIds(List.of(obectIds));
        }        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsage(obectIds);
        }
    }
}
