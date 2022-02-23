// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiKeyState extends io.pulumi.resources.ResourceArgs {

    public static final ApiKeyState Empty = new ApiKeyState();

    /**
     * The ID of the associated AppSync API
     * 
     */
    @InputImport(name="apiId")
    private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The API key description. Defaults to "Managed by Pulumi".
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
     * 
     */
    @InputImport(name="expires")
    private final @Nullable Input<String> expires;

    public Input<String> getExpires() {
        return this.expires == null ? Input.empty() : this.expires;
    }

    /**
     * The API key
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public ApiKeyState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> description,
        @Nullable Input<String> expires,
        @Nullable Input<String> key) {
        this.apiId = apiId;
        this.description = description == null ? Input.ofNullable("Managed by Pulumi") : description;
        this.expires = expires;
        this.key = key;
    }

    private ApiKeyState() {
        this.apiId = Input.empty();
        this.description = Input.empty();
        this.expires = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> expires;
        private @Nullable Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.description = defaults.description;
    	      this.expires = defaults.expires;
    	      this.key = defaults.key;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpires(@Nullable Input<String> expires) {
            this.expires = expires;
            return this;
        }

        public Builder setExpires(@Nullable String expires) {
            this.expires = Input.ofNullable(expires);
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
        public ApiKeyState build() {
            return new ApiKeyState(apiId, description, expires, key);
        }
    }
}
