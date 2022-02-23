// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.azurenative.blueprint.outputs.SecretValueReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ParameterValueResponse {
    /**
     * Parameter value as reference type.
     * 
     */
    private final @Nullable SecretValueReferenceResponse reference;
    /**
     * Parameter value. Any valid JSON value is allowed including objects, arrays, strings, numbers and booleans.
     * 
     */
    private final @Nullable Object value;

    @OutputCustomType.Constructor({"reference","value"})
    private ParameterValueResponse(
        @Nullable SecretValueReferenceResponse reference,
        @Nullable Object value) {
        this.reference = reference;
        this.value = value;
    }

    /**
     * Parameter value as reference type.
     * 
     */
    public Optional<SecretValueReferenceResponse> getReference() {
        return Optional.ofNullable(this.reference);
    }
    /**
     * Parameter value. Any valid JSON value is allowed including objects, arrays, strings, numbers and booleans.
     * 
     */
    public Optional<Object> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecretValueReferenceResponse reference;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reference = defaults.reference;
    	      this.value = defaults.value;
        }

        public Builder setReference(@Nullable SecretValueReferenceResponse reference) {
            this.reference = reference;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }
        public ParameterValueResponse build() {
            return new ParameterValueResponse(reference, value);
        }
    }
}
