// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceNavigationLinkResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Link to the external resource.
     * 
     */
    private final @Nullable String link;
    /**
     * Resource type of the linked resource.
     * 
     */
    private final @Nullable String linkedResourceType;
    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the resource navigation link resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","link","linkedResourceType","name","provisioningState","type"})
    private ResourceNavigationLinkResponse(
        String etag,
        String id,
        @Nullable String link,
        @Nullable String linkedResourceType,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.link = link;
        this.linkedResourceType = linkedResourceType;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Link to the external resource.
     * 
     */
    public Optional<String> getLink() {
        return Optional.ofNullable(this.link);
    }
    /**
     * Resource type of the linked resource.
     * 
     */
    public Optional<String> getLinkedResourceType() {
        return Optional.ofNullable(this.linkedResourceType);
    }
    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the resource navigation link resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceNavigationLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private @Nullable String link;
        private @Nullable String linkedResourceType;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceNavigationLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.link = defaults.link;
    	      this.linkedResourceType = defaults.linkedResourceType;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLink(@Nullable String link) {
            this.link = link;
            return this;
        }

        public Builder setLinkedResourceType(@Nullable String linkedResourceType) {
            this.linkedResourceType = linkedResourceType;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceNavigationLinkResponse build() {
            return new ResourceNavigationLinkResponse(etag, id, link, linkedResourceType, name, provisioningState, type);
        }
    }
}
