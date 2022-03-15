// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserPoolSchemaStringAttributeConstraints {
    /**
     * Maximum length of an attribute value of the string type.
     * 
     */
    private final @Nullable String maxLength;
    /**
     * Minimum length of an attribute value of the string type.
     * 
     */
    private final @Nullable String minLength;

    @CustomType.Constructor
    private UserPoolSchemaStringAttributeConstraints(
        @CustomType.Parameter("maxLength") @Nullable String maxLength,
        @CustomType.Parameter("minLength") @Nullable String minLength) {
        this.maxLength = maxLength;
        this.minLength = minLength;
    }

    /**
     * Maximum length of an attribute value of the string type.
     * 
    */
    public Optional<String> getMaxLength() {
        return Optional.ofNullable(this.maxLength);
    }
    /**
     * Minimum length of an attribute value of the string type.
     * 
    */
    public Optional<String> getMinLength() {
        return Optional.ofNullable(this.minLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSchemaStringAttributeConstraints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String maxLength;
        private @Nullable String minLength;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolSchemaStringAttributeConstraints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxLength = defaults.maxLength;
    	      this.minLength = defaults.minLength;
        }

        public Builder maxLength(@Nullable String maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public Builder minLength(@Nullable String minLength) {
            this.minLength = minLength;
            return this;
        }
        public UserPoolSchemaStringAttributeConstraints build() {
            return new UserPoolSchemaStringAttributeConstraints(maxLength, minLength);
        }
    }
}
