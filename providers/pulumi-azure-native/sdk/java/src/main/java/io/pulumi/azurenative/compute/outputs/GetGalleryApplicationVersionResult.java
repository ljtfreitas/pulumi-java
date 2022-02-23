// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.GalleryApplicationVersionPublishingProfileResponse;
import io.pulumi.azurenative.compute.outputs.ReplicationStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGalleryApplicationVersionResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The publishing profile of a gallery image version.
     * 
     */
    private final GalleryApplicationVersionPublishingProfileResponse publishingProfile;
    /**
     * This is the replication status of the gallery image version.
     * 
     */
    private final ReplicationStatusResponse replicationStatus;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","provisioningState","publishingProfile","replicationStatus","tags","type"})
    private GetGalleryApplicationVersionResult(
        String id,
        String location,
        String name,
        String provisioningState,
        GalleryApplicationVersionPublishingProfileResponse publishingProfile,
        ReplicationStatusResponse replicationStatus,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publishingProfile = Objects.requireNonNull(publishingProfile);
        this.replicationStatus = Objects.requireNonNull(replicationStatus);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The publishing profile of a gallery image version.
     * 
     */
    public GalleryApplicationVersionPublishingProfileResponse getPublishingProfile() {
        return this.publishingProfile;
    }
    /**
     * This is the replication status of the gallery image version.
     * 
     */
    public ReplicationStatusResponse getReplicationStatus() {
        return this.replicationStatus;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGalleryApplicationVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private GalleryApplicationVersionPublishingProfileResponse publishingProfile;
        private ReplicationStatusResponse replicationStatus;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGalleryApplicationVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publishingProfile = defaults.publishingProfile;
    	      this.replicationStatus = defaults.replicationStatus;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublishingProfile(GalleryApplicationVersionPublishingProfileResponse publishingProfile) {
            this.publishingProfile = Objects.requireNonNull(publishingProfile);
            return this;
        }

        public Builder setReplicationStatus(ReplicationStatusResponse replicationStatus) {
            this.replicationStatus = Objects.requireNonNull(replicationStatus);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGalleryApplicationVersionResult build() {
            return new GetGalleryApplicationVersionResult(id, location, name, provisioningState, publishingProfile, replicationStatus, tags, type);
        }
    }
}
