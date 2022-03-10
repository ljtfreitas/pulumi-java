// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateExtendedKeyUsage {
    private final @Nullable String extendedKeyUsageObjectIdentifier;
    private final @Nullable String extendedKeyUsageType;

    @OutputCustomType.Constructor
    private CertificateExtendedKeyUsage(
        @OutputCustomType.Parameter("extendedKeyUsageObjectIdentifier") @Nullable String extendedKeyUsageObjectIdentifier,
        @OutputCustomType.Parameter("extendedKeyUsageType") @Nullable String extendedKeyUsageType) {
        this.extendedKeyUsageObjectIdentifier = extendedKeyUsageObjectIdentifier;
        this.extendedKeyUsageType = extendedKeyUsageType;
    }

    public Optional<String> getExtendedKeyUsageObjectIdentifier() {
        return Optional.ofNullable(this.extendedKeyUsageObjectIdentifier);
    }
    public Optional<String> getExtendedKeyUsageType() {
        return Optional.ofNullable(this.extendedKeyUsageType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateExtendedKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String extendedKeyUsageObjectIdentifier;
        private @Nullable String extendedKeyUsageType;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateExtendedKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedKeyUsageObjectIdentifier = defaults.extendedKeyUsageObjectIdentifier;
    	      this.extendedKeyUsageType = defaults.extendedKeyUsageType;
        }

        public Builder setExtendedKeyUsageObjectIdentifier(@Nullable String extendedKeyUsageObjectIdentifier) {
            this.extendedKeyUsageObjectIdentifier = extendedKeyUsageObjectIdentifier;
            return this;
        }

        public Builder setExtendedKeyUsageType(@Nullable String extendedKeyUsageType) {
            this.extendedKeyUsageType = extendedKeyUsageType;
            return this;
        }
        public CertificateExtendedKeyUsage build() {
            return new CertificateExtendedKeyUsage(extendedKeyUsageObjectIdentifier, extendedKeyUsageType);
        }
    }
}
