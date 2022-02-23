// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hub Item.
 * 
 */
public final class HubResponse extends io.pulumi.resources.InvokeArgs {

    public static final HubResponse Empty = new HubResponse();

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * Resource Type.
     * 
     */
    @InputImport(name="resourceType")
        private final @Nullable String resourceType;

    public Optional<String> getPropResourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    public HubResponse(
        @Nullable String resourceId,
        @Nullable String resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    private HubResponse() {
        this.resourceId = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(HubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public HubResponse build() {
            return new HubResponse(resourceId, resourceType);
        }
    }
}
