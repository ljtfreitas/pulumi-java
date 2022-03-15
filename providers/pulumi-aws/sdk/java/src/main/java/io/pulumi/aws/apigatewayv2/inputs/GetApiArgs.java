// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiArgs Empty = new GetApiArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
      private final String apiId;

    public String getApiId() {
        return this.apiId;
    }

    /**
     * A map of resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetApiArgs(
        String apiId,
        @Nullable Map<String,String> tags) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.tags = tags;
    }

    private GetApiArgs() {
        this.apiId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.tags = defaults.tags;
        }

        public Builder apiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetApiArgs build() {
            return new GetApiArgs(apiId, tags);
        }
    }
}
