// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CaPoolIssuancePolicyAllowedKeyTypeRsa {
    /**
     * The maximum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    private final @Nullable String maxModulusSize;
    /**
     * The minimum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service-level min RSA modulus size will continue to apply.
     * 
     */
    private final @Nullable String minModulusSize;

    @OutputCustomType.Constructor({"maxModulusSize","minModulusSize"})
    private CaPoolIssuancePolicyAllowedKeyTypeRsa(
        @Nullable String maxModulusSize,
        @Nullable String minModulusSize) {
        this.maxModulusSize = maxModulusSize;
        this.minModulusSize = minModulusSize;
    }

    /**
     * The maximum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    public Optional<String> getMaxModulusSize() {
        return Optional.ofNullable(this.maxModulusSize);
    }
    /**
     * The minimum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service-level min RSA modulus size will continue to apply.
     * 
     */
    public Optional<String> getMinModulusSize() {
        return Optional.ofNullable(this.minModulusSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedKeyTypeRsa defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String maxModulusSize;
        private @Nullable String minModulusSize;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyAllowedKeyTypeRsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxModulusSize = defaults.maxModulusSize;
    	      this.minModulusSize = defaults.minModulusSize;
        }

        public Builder setMaxModulusSize(@Nullable String maxModulusSize) {
            this.maxModulusSize = maxModulusSize;
            return this;
        }

        public Builder setMinModulusSize(@Nullable String minModulusSize) {
            this.minModulusSize = minModulusSize;
            return this;
        }
        public CaPoolIssuancePolicyAllowedKeyTypeRsa build() {
            return new CaPoolIssuancePolicyAllowedKeyTypeRsa(maxModulusSize, minModulusSize);
        }
    }
}
