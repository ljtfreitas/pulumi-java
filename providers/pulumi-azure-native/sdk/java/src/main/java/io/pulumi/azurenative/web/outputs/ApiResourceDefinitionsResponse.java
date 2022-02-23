// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiResourceDefinitionsResponse {
    /**
     * The modified swagger URL
     * 
     */
    private final @Nullable String modifiedSwaggerUrl;
    /**
     * The original swagger URL
     * 
     */
    private final @Nullable String originalSwaggerUrl;

    @OutputCustomType.Constructor({"modifiedSwaggerUrl","originalSwaggerUrl"})
    private ApiResourceDefinitionsResponse(
        @Nullable String modifiedSwaggerUrl,
        @Nullable String originalSwaggerUrl) {
        this.modifiedSwaggerUrl = modifiedSwaggerUrl;
        this.originalSwaggerUrl = originalSwaggerUrl;
    }

    /**
     * The modified swagger URL
     * 
     */
    public Optional<String> getModifiedSwaggerUrl() {
        return Optional.ofNullable(this.modifiedSwaggerUrl);
    }
    /**
     * The original swagger URL
     * 
     */
    public Optional<String> getOriginalSwaggerUrl() {
        return Optional.ofNullable(this.originalSwaggerUrl);
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

        public Builder setModifiedSwaggerUrl(@Nullable String modifiedSwaggerUrl) {
            this.modifiedSwaggerUrl = modifiedSwaggerUrl;
            return this;
        }

        public Builder setOriginalSwaggerUrl(@Nullable String originalSwaggerUrl) {
            this.originalSwaggerUrl = originalSwaggerUrl;
            return this;
        }
        public ApiResourceDefinitionsResponse build() {
            return new ApiResourceDefinitionsResponse(modifiedSwaggerUrl, originalSwaggerUrl);
        }
    }
}
