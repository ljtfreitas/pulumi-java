// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.TargetRegionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The publishing profile of a gallery image Version.
 * 
 */
public final class GalleryImageVersionPublishingProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final GalleryImageVersionPublishingProfileResponse Empty = new GalleryImageVersionPublishingProfileResponse();

    /**
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    @Import(name="endOfLifeDate")
      private final @Nullable String endOfLifeDate;

    public Optional<String> getEndOfLifeDate() {
        return this.endOfLifeDate == null ? Optional.empty() : Optional.ofNullable(this.endOfLifeDate);
    }

    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     * 
     */
    @Import(name="excludeFromLatest")
      private final @Nullable Boolean excludeFromLatest;

    public Optional<Boolean> getExcludeFromLatest() {
        return this.excludeFromLatest == null ? Optional.empty() : Optional.ofNullable(this.excludeFromLatest);
    }

    /**
     * The timestamp for when the gallery image version is published.
     * 
     */
    @Import(name="publishedDate", required=true)
      private final String publishedDate;

    public String getPublishedDate() {
        return this.publishedDate;
    }

    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     */
    @Import(name="replicaCount")
      private final @Nullable Integer replicaCount;

    public Optional<Integer> getReplicaCount() {
        return this.replicaCount == null ? Optional.empty() : Optional.ofNullable(this.replicaCount);
    }

    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    @Import(name="storageAccountType")
      private final @Nullable String storageAccountType;

    public Optional<String> getStorageAccountType() {
        return this.storageAccountType == null ? Optional.empty() : Optional.ofNullable(this.storageAccountType);
    }

    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
     */
    @Import(name="targetRegions")
      private final @Nullable List<TargetRegionResponse> targetRegions;

    public List<TargetRegionResponse> getTargetRegions() {
        return this.targetRegions == null ? List.of() : this.targetRegions;
    }

    public GalleryImageVersionPublishingProfileResponse(
        @Nullable String endOfLifeDate,
        @Nullable Boolean excludeFromLatest,
        String publishedDate,
        @Nullable Integer replicaCount,
        @Nullable String storageAccountType,
        @Nullable List<TargetRegionResponse> targetRegions) {
        this.endOfLifeDate = endOfLifeDate;
        this.excludeFromLatest = excludeFromLatest;
        this.publishedDate = Objects.requireNonNull(publishedDate, "expected parameter 'publishedDate' to be non-null");
        this.replicaCount = replicaCount;
        this.storageAccountType = storageAccountType;
        this.targetRegions = targetRegions;
    }

    private GalleryImageVersionPublishingProfileResponse() {
        this.endOfLifeDate = null;
        this.excludeFromLatest = null;
        this.publishedDate = null;
        this.replicaCount = null;
        this.storageAccountType = null;
        this.targetRegions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageVersionPublishingProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endOfLifeDate;
        private @Nullable Boolean excludeFromLatest;
        private String publishedDate;
        private @Nullable Integer replicaCount;
        private @Nullable String storageAccountType;
        private @Nullable List<TargetRegionResponse> targetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageVersionPublishingProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.publishedDate = defaults.publishedDate;
    	      this.replicaCount = defaults.replicaCount;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.targetRegions = defaults.targetRegions;
        }

        public Builder endOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder excludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder publishedDate(String publishedDate) {
            this.publishedDate = Objects.requireNonNull(publishedDate);
            return this;
        }

        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder targetRegions(@Nullable List<TargetRegionResponse> targetRegions) {
            this.targetRegions = targetRegions;
            return this;
        }
        public GalleryImageVersionPublishingProfileResponse build() {
            return new GalleryImageVersionPublishingProfileResponse(endOfLifeDate, excludeFromLatest, publishedDate, replicaCount, storageAccountType, targetRegions);
        }
    }
}
