// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.StorageAccountType;
import io.pulumi.azurenative.compute.inputs.TargetRegionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The publishing profile of a gallery image Version.
 * 
 */
public final class GalleryImageVersionPublishingProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryImageVersionPublishingProfileArgs Empty = new GalleryImageVersionPublishingProfileArgs();

    /**
     * The end of life date of the gallery image version. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    @InputImport(name="endOfLifeDate")
        private final @Nullable Input<String> endOfLifeDate;

    public Input<String> getEndOfLifeDate() {
        return this.endOfLifeDate == null ? Input.empty() : this.endOfLifeDate;
    }

    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     * 
     */
    @InputImport(name="excludeFromLatest")
        private final @Nullable Input<Boolean> excludeFromLatest;

    public Input<Boolean> getExcludeFromLatest() {
        return this.excludeFromLatest == null ? Input.empty() : this.excludeFromLatest;
    }

    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     */
    @InputImport(name="replicaCount")
        private final @Nullable Input<Integer> replicaCount;

    public Input<Integer> getReplicaCount() {
        return this.replicaCount == null ? Input.empty() : this.replicaCount;
    }

    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    @InputImport(name="storageAccountType")
        private final @Nullable Input<Either<String,StorageAccountType>> storageAccountType;

    public Input<Either<String,StorageAccountType>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
     */
    @InputImport(name="targetRegions")
        private final @Nullable Input<List<TargetRegionArgs>> targetRegions;

    public Input<List<TargetRegionArgs>> getTargetRegions() {
        return this.targetRegions == null ? Input.empty() : this.targetRegions;
    }

    public GalleryImageVersionPublishingProfileArgs(
        @Nullable Input<String> endOfLifeDate,
        @Nullable Input<Boolean> excludeFromLatest,
        @Nullable Input<Integer> replicaCount,
        @Nullable Input<Either<String,StorageAccountType>> storageAccountType,
        @Nullable Input<List<TargetRegionArgs>> targetRegions) {
        this.endOfLifeDate = endOfLifeDate;
        this.excludeFromLatest = excludeFromLatest;
        this.replicaCount = replicaCount;
        this.storageAccountType = storageAccountType;
        this.targetRegions = targetRegions;
    }

    private GalleryImageVersionPublishingProfileArgs() {
        this.endOfLifeDate = Input.empty();
        this.excludeFromLatest = Input.empty();
        this.replicaCount = Input.empty();
        this.storageAccountType = Input.empty();
        this.targetRegions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageVersionPublishingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endOfLifeDate;
        private @Nullable Input<Boolean> excludeFromLatest;
        private @Nullable Input<Integer> replicaCount;
        private @Nullable Input<Either<String,StorageAccountType>> storageAccountType;
        private @Nullable Input<List<TargetRegionArgs>> targetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageVersionPublishingProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.replicaCount = defaults.replicaCount;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.targetRegions = defaults.targetRegions;
        }

        public Builder setEndOfLifeDate(@Nullable Input<String> endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder setEndOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = Input.ofNullable(endOfLifeDate);
            return this;
        }

        public Builder setExcludeFromLatest(@Nullable Input<Boolean> excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder setExcludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = Input.ofNullable(excludeFromLatest);
            return this;
        }

        public Builder setReplicaCount(@Nullable Input<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Input.ofNullable(replicaCount);
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<Either<String,StorageAccountType>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable Either<String,StorageAccountType> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }

        public Builder setTargetRegions(@Nullable Input<List<TargetRegionArgs>> targetRegions) {
            this.targetRegions = targetRegions;
            return this;
        }

        public Builder setTargetRegions(@Nullable List<TargetRegionArgs> targetRegions) {
            this.targetRegions = Input.ofNullable(targetRegions);
            return this;
        }
        public GalleryImageVersionPublishingProfileArgs build() {
            return new GalleryImageVersionPublishingProfileArgs(endOfLifeDate, excludeFromLatest, replicaCount, storageAccountType, targetRegions);
        }
    }
}
