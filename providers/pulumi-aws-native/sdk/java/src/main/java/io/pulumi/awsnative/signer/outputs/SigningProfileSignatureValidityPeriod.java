// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer.outputs;

import io.pulumi.awsnative.signer.enums.SigningProfileSignatureValidityPeriodType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SigningProfileSignatureValidityPeriod {
    private final @Nullable SigningProfileSignatureValidityPeriodType type;
    private final @Nullable Integer value;

    @OutputCustomType.Constructor({"type","value"})
    private SigningProfileSignatureValidityPeriod(
        @Nullable SigningProfileSignatureValidityPeriodType type,
        @Nullable Integer value) {
        this.type = type;
        this.value = value;
    }

    public Optional<SigningProfileSignatureValidityPeriodType> getType() {
        return Optional.ofNullable(this.type);
    }
    public Optional<Integer> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileSignatureValidityPeriod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SigningProfileSignatureValidityPeriodType type;
        private @Nullable Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileSignatureValidityPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(@Nullable SigningProfileSignatureValidityPeriodType type) {
            this.type = type;
            return this;
        }

        public Builder setValue(@Nullable Integer value) {
            this.value = value;
            return this;
        }

        public SigningProfileSignatureValidityPeriod build() {
            return new SigningProfileSignatureValidityPeriod(type, value);
        }
    }
}