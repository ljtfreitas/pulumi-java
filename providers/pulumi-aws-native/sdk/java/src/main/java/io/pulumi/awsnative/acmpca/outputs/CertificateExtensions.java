// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.awsnative.acmpca.outputs.CertificateExtendedKeyUsage;
import io.pulumi.awsnative.acmpca.outputs.CertificateGeneralName;
import io.pulumi.awsnative.acmpca.outputs.CertificateKeyUsage;
import io.pulumi.awsnative.acmpca.outputs.CertificatePolicyInformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateExtensions {
    private final @Nullable List<CertificatePolicyInformation> certificatePolicies;
    private final @Nullable List<CertificateExtendedKeyUsage> extendedKeyUsage;
    private final @Nullable CertificateKeyUsage keyUsage;
    private final @Nullable List<CertificateGeneralName> subjectAlternativeNames;

    @OutputCustomType.Constructor({"certificatePolicies","extendedKeyUsage","keyUsage","subjectAlternativeNames"})
    private CertificateExtensions(
        @Nullable List<CertificatePolicyInformation> certificatePolicies,
        @Nullable List<CertificateExtendedKeyUsage> extendedKeyUsage,
        @Nullable CertificateKeyUsage keyUsage,
        @Nullable List<CertificateGeneralName> subjectAlternativeNames) {
        this.certificatePolicies = certificatePolicies;
        this.extendedKeyUsage = extendedKeyUsage;
        this.keyUsage = keyUsage;
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    public List<CertificatePolicyInformation> getCertificatePolicies() {
        return this.certificatePolicies == null ? List.of() : this.certificatePolicies;
    }
    public List<CertificateExtendedKeyUsage> getExtendedKeyUsage() {
        return this.extendedKeyUsage == null ? List.of() : this.extendedKeyUsage;
    }
    public Optional<CertificateKeyUsage> getKeyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }
    public List<CertificateGeneralName> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? List.of() : this.subjectAlternativeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateExtensions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificatePolicyInformation> certificatePolicies;
        private @Nullable List<CertificateExtendedKeyUsage> extendedKeyUsage;
        private @Nullable CertificateKeyUsage keyUsage;
        private @Nullable List<CertificateGeneralName> subjectAlternativeNames;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateExtensions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePolicies = defaults.certificatePolicies;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.keyUsage = defaults.keyUsage;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
        }

        public Builder setCertificatePolicies(@Nullable List<CertificatePolicyInformation> certificatePolicies) {
            this.certificatePolicies = certificatePolicies;
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable List<CertificateExtendedKeyUsage> extendedKeyUsage) {
            this.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        public Builder setKeyUsage(@Nullable CertificateKeyUsage keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable List<CertificateGeneralName> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public CertificateExtensions build() {
            return new CertificateExtensions(certificatePolicies, extendedKeyUsage, keyUsage, subjectAlternativeNames);
        }
    }
}
