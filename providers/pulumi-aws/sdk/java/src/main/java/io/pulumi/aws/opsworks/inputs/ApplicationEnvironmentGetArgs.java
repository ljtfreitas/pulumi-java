// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationEnvironmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationEnvironmentGetArgs Empty = new ApplicationEnvironmentGetArgs();

    /**
     * Variable name.
     * 
     */
    @InputImport(name="key", required=true)
    private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Set visibility of the variable value to `true` or `false`.
     * 
     */
    @InputImport(name="secure")
    private final @Nullable Input<Boolean> secure;

    public Input<Boolean> getSecure() {
        return this.secure == null ? Input.empty() : this.secure;
    }

    /**
     * Variable value.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ApplicationEnvironmentGetArgs(
        Input<String> key,
        @Nullable Input<Boolean> secure,
        Input<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.secure = secure;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ApplicationEnvironmentGetArgs() {
        this.key = Input.empty();
        this.secure = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationEnvironmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private @Nullable Input<Boolean> secure;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationEnvironmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.secure = defaults.secure;
    	      this.value = defaults.value;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setSecure(@Nullable Input<Boolean> secure) {
            this.secure = secure;
            return this;
        }

        public Builder setSecure(@Nullable Boolean secure) {
            this.secure = Input.ofNullable(secure);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ApplicationEnvironmentGetArgs build() {
            return new ApplicationEnvironmentGetArgs(key, secure, value);
        }
    }
}
