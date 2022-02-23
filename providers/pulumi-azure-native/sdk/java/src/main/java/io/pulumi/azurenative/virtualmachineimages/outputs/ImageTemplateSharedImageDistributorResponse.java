// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplateSharedImageDistributorResponse {
    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    private final @Nullable Map<String,String> artifactTags;
    /**
     * Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
     * 
     */
    private final @Nullable Boolean excludeFromLatest;
    /**
     * Resource Id of the Shared Image Gallery image
     * 
     */
    private final String galleryImageId;
    /**
     * A list of regions that the image will be replicated to
     * 
     */
    private final List<String> replicationRegions;
    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    private final String runOutputName;
    /**
     * Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
     * 
     */
    private final @Nullable String storageAccountType;
    /**
     * Type of distribution.
     * Expected value is 'SharedImage'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"artifactTags","excludeFromLatest","galleryImageId","replicationRegions","runOutputName","storageAccountType","type"})
    private ImageTemplateSharedImageDistributorResponse(
        @Nullable Map<String,String> artifactTags,
        @Nullable Boolean excludeFromLatest,
        String galleryImageId,
        List<String> replicationRegions,
        String runOutputName,
        @Nullable String storageAccountType,
        String type) {
        this.artifactTags = artifactTags;
        this.excludeFromLatest = excludeFromLatest;
        this.galleryImageId = Objects.requireNonNull(galleryImageId);
        this.replicationRegions = Objects.requireNonNull(replicationRegions);
        this.runOutputName = Objects.requireNonNull(runOutputName);
        this.storageAccountType = storageAccountType;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    public Map<String,String> getArtifactTags() {
        return this.artifactTags == null ? Map.of() : this.artifactTags;
    }
    /**
     * Flag that indicates whether created image version should be excluded from latest. Omit to use the default (false).
     * 
     */
    public Optional<Boolean> getExcludeFromLatest() {
        return Optional.ofNullable(this.excludeFromLatest);
    }
    /**
     * Resource Id of the Shared Image Gallery image
     * 
     */
    public String getGalleryImageId() {
        return this.galleryImageId;
    }
    /**
     * A list of regions that the image will be replicated to
     * 
     */
    public List<String> getReplicationRegions() {
        return this.replicationRegions;
    }
    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    public String getRunOutputName() {
        return this.runOutputName;
    }
    /**
     * Storage account type to be used to store the shared image. Omit to use the default (Standard_LRS).
     * 
     */
    public Optional<String> getStorageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }
    /**
     * Type of distribution.
     * Expected value is 'SharedImage'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateSharedImageDistributorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> artifactTags;
        private @Nullable Boolean excludeFromLatest;
        private String galleryImageId;
        private List<String> replicationRegions;
        private String runOutputName;
        private @Nullable String storageAccountType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateSharedImageDistributorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactTags = defaults.artifactTags;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.galleryImageId = defaults.galleryImageId;
    	      this.replicationRegions = defaults.replicationRegions;
    	      this.runOutputName = defaults.runOutputName;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.type = defaults.type;
        }

        public Builder setArtifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }

        public Builder setExcludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder setGalleryImageId(String galleryImageId) {
            this.galleryImageId = Objects.requireNonNull(galleryImageId);
            return this;
        }

        public Builder setReplicationRegions(List<String> replicationRegions) {
            this.replicationRegions = Objects.requireNonNull(replicationRegions);
            return this;
        }

        public Builder setRunOutputName(String runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }

        public Builder setStorageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ImageTemplateSharedImageDistributorResponse build() {
            return new ImageTemplateSharedImageDistributorResponse(artifactTags, excludeFromLatest, galleryImageId, replicationRegions, runOutputName, storageAccountType, type);
        }
    }
}
