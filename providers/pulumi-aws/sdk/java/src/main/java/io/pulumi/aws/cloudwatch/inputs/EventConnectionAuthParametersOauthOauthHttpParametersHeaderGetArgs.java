// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs Empty = new EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs();

    /**
     * Specified whether the value is secret.
     * 
     */
    @InputImport(name="isValueSecret")
    private final @Nullable Input<Boolean> isValueSecret;

    public Input<Boolean> getIsValueSecret() {
        return this.isValueSecret == null ? Input.empty() : this.isValueSecret;
    }

    /**
     * Header Name.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs(
        @Nullable Input<Boolean> isValueSecret,
        @Nullable Input<String> key,
        @Nullable Input<String> value) {
        this.isValueSecret = isValueSecret;
        this.key = key;
        this.value = value;
    }

    private EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs() {
        this.isValueSecret = Input.empty();
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isValueSecret;
        private @Nullable Input<String> key;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isValueSecret = defaults.isValueSecret;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setIsValueSecret(@Nullable Input<Boolean> isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }

        public Builder setIsValueSecret(@Nullable Boolean isValueSecret) {
            this.isValueSecret = Input.ofNullable(isValueSecret);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs build() {
            return new EventConnectionAuthParametersOauthOauthHttpParametersHeaderGetArgs(isValueSecret, key, value);
        }
    }
}
