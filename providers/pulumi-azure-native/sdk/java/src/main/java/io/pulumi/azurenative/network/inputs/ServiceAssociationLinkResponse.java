// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServiceAssociationLink resource.
 * 
 */
public final class ServiceAssociationLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAssociationLinkResponse Empty = new ServiceAssociationLinkResponse();

    /**
     * If true, the resource can be deleted.
     * 
     */
    @Import(name="allowDelete")
      private final @Nullable Boolean allowDelete;

    public Optional<Boolean> getAllowDelete() {
        return this.allowDelete == null ? Optional.empty() : Optional.ofNullable(this.allowDelete);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Link to the external resource.
     * 
     */
    @Import(name="link")
      private final @Nullable String link;

    public Optional<String> getLink() {
        return this.link == null ? Optional.empty() : Optional.ofNullable(this.link);
    }

    /**
     * Resource type of the linked resource.
     * 
     */
    @Import(name="linkedResourceType")
      private final @Nullable String linkedResourceType;

    public Optional<String> getLinkedResourceType() {
        return this.linkedResourceType == null ? Optional.empty() : Optional.ofNullable(this.linkedResourceType);
    }

    /**
     * A list of locations.
     * 
     */
    @Import(name="locations")
      private final @Nullable List<String> locations;

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }

    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the service association link resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ServiceAssociationLinkResponse(
        @Nullable Boolean allowDelete,
        String etag,
        @Nullable String id,
        @Nullable String link,
        @Nullable String linkedResourceType,
        @Nullable List<String> locations,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.allowDelete = allowDelete;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.link = link;
        this.linkedResourceType = linkedResourceType;
        this.locations = locations;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceAssociationLinkResponse() {
        this.allowDelete = null;
        this.etag = null;
        this.id = null;
        this.link = null;
        this.linkedResourceType = null;
        this.locations = List.of();
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAssociationLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowDelete;
        private String etag;
        private @Nullable String id;
        private @Nullable String link;
        private @Nullable String linkedResourceType;
        private @Nullable List<String> locations;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAssociationLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowDelete = defaults.allowDelete;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.link = defaults.link;
    	      this.linkedResourceType = defaults.linkedResourceType;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder allowDelete(@Nullable Boolean allowDelete) {
            this.allowDelete = allowDelete;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder link(@Nullable String link) {
            this.link = link;
            return this;
        }

        public Builder linkedResourceType(@Nullable String linkedResourceType) {
            this.linkedResourceType = linkedResourceType;
            return this;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ServiceAssociationLinkResponse build() {
            return new ServiceAssociationLinkResponse(allowDelete, etag, id, link, linkedResourceType, locations, name, provisioningState, type);
        }
    }
}
