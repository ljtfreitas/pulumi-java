// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventConnectionAuthParametersOauthOauthHttpParametersHeader {
    /**
     * Specified whether the value is secret.
     * 
     */
    private final @Nullable Boolean isValueSecret;
    /**
     * Header Name.
     * 
     */
    private final @Nullable String key;
    /**
     * Header Value. Created and stored in AWS Secrets Manager.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private EventConnectionAuthParametersOauthOauthHttpParametersHeader(
        @CustomType.Parameter("isValueSecret") @Nullable Boolean isValueSecret,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("value") @Nullable String value) {
        this.isValueSecret = isValueSecret;
        this.key = key;
        this.value = value;
    }

    /**
     * Specified whether the value is secret.
     * 
    */
    public Optional<Boolean> getIsValueSecret() {
        return Optional.ofNullable(this.isValueSecret);
    }
    /**
     * Header Name.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * Header Value. Created and stored in AWS Secrets Manager.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauthOauthHttpParametersHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isValueSecret;
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauthOauthHttpParametersHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isValueSecret = defaults.isValueSecret;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder isValueSecret(@Nullable Boolean isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EventConnectionAuthParametersOauthOauthHttpParametersHeader build() {
            return new EventConnectionAuthParametersOauthOauthHttpParametersHeader(isValueSecret, key, value);
        }
    }
}
