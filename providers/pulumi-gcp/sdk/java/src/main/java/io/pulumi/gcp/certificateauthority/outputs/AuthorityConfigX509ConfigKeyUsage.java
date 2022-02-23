// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthorityConfigX509ConfigKeyUsage {
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage;
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage;
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

    @OutputCustomType.Constructor({"baseKeyUsage","extendedKeyUsage","unknownExtendedKeyUsages"})
    private AuthorityConfigX509ConfigKeyUsage(
        AuthorityConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage,
        AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage,
        @Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    public AuthorityConfigX509ConfigKeyUsageBaseKeyUsage getBaseKeyUsage() {
        return this.baseKeyUsage;
    }
    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    public AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }
    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    public List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? List.of() : this.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage;
        private AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage;
        private @Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(AuthorityConfigX509ConfigKeyUsageBaseKeyUsage baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }

        public Builder setExtendedKeyUsage(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsage extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public AuthorityConfigX509ConfigKeyUsage build() {
            return new AuthorityConfigX509ConfigKeyUsage(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
