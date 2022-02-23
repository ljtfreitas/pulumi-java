// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer.inputs;

import io.pulumi.awsnative.signer.enums.SigningProfileSignatureValidityPeriodType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileSignatureValidityPeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileSignatureValidityPeriodArgs Empty = new SigningProfileSignatureValidityPeriodArgs();

    @InputImport(name="type")
        private final @Nullable Input<SigningProfileSignatureValidityPeriodType> type;

    public Input<SigningProfileSignatureValidityPeriodType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="value")
        private final @Nullable Input<Integer> value;

    public Input<Integer> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public SigningProfileSignatureValidityPeriodArgs(
        @Nullable Input<SigningProfileSignatureValidityPeriodType> type,
        @Nullable Input<Integer> value) {
        this.type = type;
        this.value = value;
    }

    private SigningProfileSignatureValidityPeriodArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileSignatureValidityPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SigningProfileSignatureValidityPeriodType> type;
        private @Nullable Input<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileSignatureValidityPeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(@Nullable Input<SigningProfileSignatureValidityPeriodType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable SigningProfileSignatureValidityPeriodType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValue(@Nullable Input<Integer> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Integer value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public SigningProfileSignatureValidityPeriodArgs build() {
            return new SigningProfileSignatureValidityPeriodArgs(type, value);
        }
    }
}
