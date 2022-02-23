// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SigningProfileSignatureValidityPeriodGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileSignatureValidityPeriodGetArgs Empty = new SigningProfileSignatureValidityPeriodGetArgs();

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="value", required=true)
    private final Input<Integer> value;

    public Input<Integer> getValue() {
        return this.value;
    }

    public SigningProfileSignatureValidityPeriodGetArgs(
        Input<String> type,
        Input<Integer> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SigningProfileSignatureValidityPeriodGetArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileSignatureValidityPeriodGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;
        private Input<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileSignatureValidityPeriodGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setValue(Input<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Integer value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public SigningProfileSignatureValidityPeriodGetArgs build() {
            return new SigningProfileSignatureValidityPeriodGetArgs(type, value);
        }
    }
}
