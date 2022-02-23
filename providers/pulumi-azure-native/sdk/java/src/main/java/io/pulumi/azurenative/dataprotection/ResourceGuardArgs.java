// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.azurenative.dataprotection.inputs.DppIdentityDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceGuardArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceGuardArgs Empty = new ResourceGuardArgs();

    /**
     * Optional ETag.
     * 
     */
    @InputImport(name="eTag")
        private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Input Managed Identity Details
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<DppIdentityDetailsArgs> identity;

    public Input<DppIdentityDetailsArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group where the backup vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of ResourceGuard
     * 
     */
    @InputImport(name="resourceGuardsName")
        private final @Nullable Input<String> resourceGuardsName;

    public Input<String> getResourceGuardsName() {
        return this.resourceGuardsName == null ? Input.empty() : this.resourceGuardsName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ResourceGuardArgs(
        @Nullable Input<String> eTag,
        @Nullable Input<DppIdentityDetailsArgs> identity,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceGuardsName,
        @Nullable Input<Map<String,String>> tags) {
        this.eTag = eTag;
        this.identity = identity;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceGuardsName = resourceGuardsName;
        this.tags = tags;
    }

    private ResourceGuardArgs() {
        this.eTag = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceGuardsName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eTag;
        private @Nullable Input<DppIdentityDetailsArgs> identity;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceGuardsName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceGuardsName = defaults.resourceGuardsName;
    	      this.tags = defaults.tags;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setIdentity(@Nullable Input<DppIdentityDetailsArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable DppIdentityDetailsArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceGuardsName(@Nullable Input<String> resourceGuardsName) {
            this.resourceGuardsName = resourceGuardsName;
            return this;
        }

        public Builder setResourceGuardsName(@Nullable String resourceGuardsName) {
            this.resourceGuardsName = Input.ofNullable(resourceGuardsName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ResourceGuardArgs build() {
            return new ResourceGuardArgs(eTag, identity, location, resourceGroupName, resourceGuardsName, tags);
        }
    }
}
