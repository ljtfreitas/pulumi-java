// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API Definitions
 * 
 */
public final class ApiResourceDefinitionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiResourceDefinitionsResponse Empty = new ApiResourceDefinitionsResponse();

    /**
     * The modified swagger URL
     * 
     */
    @Import(name="modifiedSwaggerUrl")
      private final @Nullable String modifiedSwaggerUrl;

    public Optional<String> getModifiedSwaggerUrl() {
        return this.modifiedSwaggerUrl == null ? Optional.empty() : Optional.ofNullable(this.modifiedSwaggerUrl);
    }

    /**
     * The original swagger URL
     * 
     */
    @Import(name="originalSwaggerUrl")
      private final @Nullable String originalSwaggerUrl;

    public Optional<String> getOriginalSwaggerUrl() {
        return this.originalSwaggerUrl == null ? Optional.empty() : Optional.ofNullable(this.originalSwaggerUrl);
    }

    public ApiResourceDefinitionsResponse(
        @Nullable String modifiedSwaggerUrl,
        @Nullable String originalSwaggerUrl) {
        this.modifiedSwaggerUrl = modifiedSwaggerUrl;
        this.originalSwaggerUrl = originalSwaggerUrl;
    }

    private ApiResourceDefinitionsResponse() {
        this.modifiedSwaggerUrl = null;
        this.originalSwaggerUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceDefinitionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String modifiedSwaggerUrl;
        private @Nullable String originalSwaggerUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceDefinitionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modifiedSwaggerUrl = defaults.modifiedSwaggerUrl;
    	      this.originalSwaggerUrl = defaults.originalSwaggerUrl;
        }

        public Builder modifiedSwaggerUrl(@Nullable String modifiedSwaggerUrl) {
            this.modifiedSwaggerUrl = modifiedSwaggerUrl;
            return this;
        }

        public Builder originalSwaggerUrl(@Nullable String originalSwaggerUrl) {
            this.originalSwaggerUrl = originalSwaggerUrl;
            return this;
        }
        public ApiResourceDefinitionsResponse build() {
            return new ApiResourceDefinitionsResponse(modifiedSwaggerUrl, originalSwaggerUrl);
        }
    }
}
