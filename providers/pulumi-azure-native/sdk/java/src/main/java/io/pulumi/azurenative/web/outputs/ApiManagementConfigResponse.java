// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiManagementConfigResponse {
    /**
     * APIM-Api Identifier.
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor({"id"})
    private ApiManagementConfigResponse(@Nullable String id) {
        this.id = id;
    }

    /**
     * APIM-Api Identifier.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiManagementConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiManagementConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public ApiManagementConfigResponse build() {
            return new ApiManagementConfigResponse(id);
        }
    }
}
