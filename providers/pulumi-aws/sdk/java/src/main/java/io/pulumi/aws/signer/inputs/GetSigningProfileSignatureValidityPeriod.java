// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetSigningProfileSignatureValidityPeriod extends io.pulumi.resources.InvokeArgs {

    public static final GetSigningProfileSignatureValidityPeriod Empty = new GetSigningProfileSignatureValidityPeriod();

    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    @Import(name="value", required=true)
      private final Integer value;

    public Integer getValue() {
        return this.value;
    }

    public GetSigningProfileSignatureValidityPeriod(
        String type,
        Integer value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GetSigningProfileSignatureValidityPeriod() {
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningProfileSignatureValidityPeriod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningProfileSignatureValidityPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetSigningProfileSignatureValidityPeriod build() {
            return new GetSigningProfileSignatureValidityPeriod(type, value);
        }
    }
}
