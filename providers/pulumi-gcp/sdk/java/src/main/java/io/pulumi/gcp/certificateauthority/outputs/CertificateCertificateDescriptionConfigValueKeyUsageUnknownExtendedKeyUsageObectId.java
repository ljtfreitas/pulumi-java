// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId {
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    private final @Nullable List<Integer> objectIdPaths;

    @OutputCustomType.Constructor({"objectIdPaths"})
    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId(@Nullable List<Integer> objectIdPaths) {
        this.objectIdPaths = objectIdPaths;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    public List<Integer> getObjectIdPaths() {
        return this.objectIdPaths == null ? List.of() : this.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder setObjectIdPaths(@Nullable List<Integer> objectIdPaths) {
            this.objectIdPaths = objectIdPaths;
            return this;
        }
        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectId(objectIdPaths);
        }
    }
}
