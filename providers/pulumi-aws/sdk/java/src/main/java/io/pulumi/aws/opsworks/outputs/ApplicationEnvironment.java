// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationEnvironment {
    /**
     * Variable name.
     * 
     */
    private final String key;
    /**
     * Set visibility of the variable value to `true` or `false`.
     * 
     */
    private final @Nullable Boolean secure;
    /**
     * Variable value.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private ApplicationEnvironment(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("secure") @Nullable Boolean secure,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.secure = secure;
        this.value = value;
    }

    /**
     * Variable name.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Set visibility of the variable value to `true` or `false`.
     * 
    */
    public Optional<Boolean> getSecure() {
        return Optional.ofNullable(this.secure);
    }
    /**
     * Variable value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable Boolean secure;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.secure = defaults.secure;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder secure(@Nullable Boolean secure) {
            this.secure = secure;
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ApplicationEnvironment build() {
            return new ApplicationEnvironment(key, secure, value);
        }
    }
}
