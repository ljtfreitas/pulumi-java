// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer.inputs;

import io.pulumi.awsnative.signer.enums.SigningProfileSignatureValidityPeriodType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileSignatureValidityPeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileSignatureValidityPeriodArgs Empty = new SigningProfileSignatureValidityPeriodArgs();

    @Import(name="type")
      private final @Nullable Output<SigningProfileSignatureValidityPeriodType> type;

    public Output<SigningProfileSignatureValidityPeriodType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    @Import(name="value")
      private final @Nullable Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public SigningProfileSignatureValidityPeriodArgs(
        @Nullable Output<SigningProfileSignatureValidityPeriodType> type,
        @Nullable Output<Integer> value) {
        this.type = type;
        this.value = value;
    }

    private SigningProfileSignatureValidityPeriodArgs() {
        this.type = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileSignatureValidityPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SigningProfileSignatureValidityPeriodType> type;
        private @Nullable Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileSignatureValidityPeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(@Nullable Output<SigningProfileSignatureValidityPeriodType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable SigningProfileSignatureValidityPeriodType type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder value(@Nullable Output<Integer> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable Integer value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public SigningProfileSignatureValidityPeriodArgs build() {
            return new SigningProfileSignatureValidityPeriodArgs(type, value);
        }
    }
}
