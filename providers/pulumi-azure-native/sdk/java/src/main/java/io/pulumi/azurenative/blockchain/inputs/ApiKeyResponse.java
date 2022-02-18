// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API key payload which is exposed in the request/response of the resource provider.
 * 
 */
public final class ApiKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiKeyResponse Empty = new ApiKeyResponse();

    /**
     * Gets or sets the API key name.
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable String keyName;

    public Optional<String> getKeyName() {
        return this.keyName == null ? Optional.empty() : Optional.ofNullable(this.keyName);
    }

    /**
     * Gets or sets the API key value.
     * 
     */
    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ApiKeyResponse(
        @Nullable String keyName,
        @Nullable String value) {
        this.keyName = keyName;
        this.value = value;
    }

    private ApiKeyResponse() {
        this.keyName = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.value = defaults.value;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public ApiKeyResponse build() {
            return new ApiKeyResponse(keyName, value);
        }
    }
}
