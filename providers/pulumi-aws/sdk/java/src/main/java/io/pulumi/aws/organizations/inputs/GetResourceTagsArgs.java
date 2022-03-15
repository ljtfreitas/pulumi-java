// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourceTagsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceTagsArgs Empty = new GetResourceTagsArgs();

    /**
     * The ID of the resource with the tags to list. See details below.
     * 
     */
    @Import(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Map of key=value pairs for each tag set on the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetResourceTagsArgs(
        String resourceId,
        @Nullable Map<String,String> tags) {
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.tags = tags;
    }

    private GetResourceTagsArgs() {
        this.resourceId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.tags = defaults.tags;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetResourceTagsArgs build() {
            return new GetResourceTagsArgs(resourceId, tags);
        }
    }
}
