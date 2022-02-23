// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SigningProfileRevocationRecord {
    private final @Nullable String revocationEffectiveFrom;
    private final @Nullable String revokedAt;
    private final @Nullable String revokedBy;

    @OutputCustomType.Constructor({"revocationEffectiveFrom","revokedAt","revokedBy"})
    private SigningProfileRevocationRecord(
        @Nullable String revocationEffectiveFrom,
        @Nullable String revokedAt,
        @Nullable String revokedBy) {
        this.revocationEffectiveFrom = revocationEffectiveFrom;
        this.revokedAt = revokedAt;
        this.revokedBy = revokedBy;
    }

    public Optional<String> getRevocationEffectiveFrom() {
        return Optional.ofNullable(this.revocationEffectiveFrom);
    }
    public Optional<String> getRevokedAt() {
        return Optional.ofNullable(this.revokedAt);
    }
    public Optional<String> getRevokedBy() {
        return Optional.ofNullable(this.revokedBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileRevocationRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String revocationEffectiveFrom;
        private @Nullable String revokedAt;
        private @Nullable String revokedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileRevocationRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revocationEffectiveFrom = defaults.revocationEffectiveFrom;
    	      this.revokedAt = defaults.revokedAt;
    	      this.revokedBy = defaults.revokedBy;
        }

        public Builder setRevocationEffectiveFrom(@Nullable String revocationEffectiveFrom) {
            this.revocationEffectiveFrom = revocationEffectiveFrom;
            return this;
        }

        public Builder setRevokedAt(@Nullable String revokedAt) {
            this.revokedAt = revokedAt;
            return this;
        }

        public Builder setRevokedBy(@Nullable String revokedBy) {
            this.revokedBy = revokedBy;
            return this;
        }
        public SigningProfileRevocationRecord build() {
            return new SigningProfileRevocationRecord(revocationEffectiveFrom, revokedAt, revokedBy);
        }
    }
}
