// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.StorageAccountType;
import io.pulumi.azurenative.compute.inputs.TargetRegionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="endOfLifeDate")
      private final @Nullable Output<String> endOfLifeDate;

    public Output<String> getEndOfLifeDate() {
        return this.endOfLifeDate == null ? Output.empty() : this.endOfLifeDate;
    }

    /**
     * If set to true, Virtual Machines deployed from the latest version of the Image Definition won't use this Image Version.
     * 
     */
    @Import(name="excludeFromLatest")
      private final @Nullable Output<Boolean> excludeFromLatest;

    public Output<Boolean> getExcludeFromLatest() {
        return this.excludeFromLatest == null ? Output.empty() : this.excludeFromLatest;
    }

    /**
     * The number of replicas of the Image Version to be created per region. This property would take effect for a region when regionalReplicaCount is not specified. This property is updatable.
     * 
     */
    @Import(name="replicaCount")
      private final @Nullable Output<Integer> replicaCount;

    public Output<Integer> getReplicaCount() {
        return this.replicaCount == null ? Output.empty() : this.replicaCount;
    }

    /**
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     * 
     */
    @Import(name="storageAccountType")
      private final @Nullable Output<Either<String,StorageAccountType>> storageAccountType;

    public Output<Either<String,StorageAccountType>> getStorageAccountType() {
        return this.storageAccountType == null ? Output.empty() : this.storageAccountType;
    }

    /**
     * The target regions where the Image Version is going to be replicated to. This property is updatable.
     * 
     */
    @Import(name="targetRegions")
      private final @Nullable Output<List<TargetRegionArgs>> targetRegions;

    public Output<List<TargetRegionArgs>> getTargetRegions() {
        return this.targetRegions == null ? Output.empty() : this.targetRegions;
    }

    public GalleryImageVersionPublishingProfileArgs(
        @Nullable Output<String> endOfLifeDate,
        @Nullable Output<Boolean> excludeFromLatest,
        @Nullable Output<Integer> replicaCount,
        @Nullable Output<Either<String,StorageAccountType>> storageAccountType,
        @Nullable Output<List<TargetRegionArgs>> targetRegions) {
        this.endOfLifeDate = endOfLifeDate;
        this.excludeFromLatest = excludeFromLatest;
        this.replicaCount = replicaCount;
        this.storageAccountType = storageAccountType;
        this.targetRegions = targetRegions;
    }

    private GalleryImageVersionPublishingProfileArgs() {
        this.endOfLifeDate = Output.empty();
        this.excludeFromLatest = Output.empty();
        this.replicaCount = Output.empty();
        this.storageAccountType = Output.empty();
        this.targetRegions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageVersionPublishingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endOfLifeDate;
        private @Nullable Output<Boolean> excludeFromLatest;
        private @Nullable Output<Integer> replicaCount;
        private @Nullable Output<Either<String,StorageAccountType>> storageAccountType;
        private @Nullable Output<List<TargetRegionArgs>> targetRegions;

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

        public Builder endOfLifeDate(@Nullable Output<String> endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder endOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = Output.ofNullable(endOfLifeDate);
            return this;
        }

        public Builder excludeFromLatest(@Nullable Output<Boolean> excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder excludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = Output.ofNullable(excludeFromLatest);
            return this;
        }

        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Output.ofNullable(replicaCount);
            return this;
        }

        public Builder storageAccountType(@Nullable Output<Either<String,StorageAccountType>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder storageAccountType(@Nullable Either<String,StorageAccountType> storageAccountType) {
            this.storageAccountType = Output.ofNullable(storageAccountType);
            return this;
        }

        public Builder targetRegions(@Nullable Output<List<TargetRegionArgs>> targetRegions) {
            this.targetRegions = targetRegions;
            return this;
        }

        public Builder targetRegions(@Nullable List<TargetRegionArgs> targetRegions) {
            this.targetRegions = Output.ofNullable(targetRegions);
            return this;
        }
        public GalleryImageVersionPublishingProfileArgs build() {
            return new GalleryImageVersionPublishingProfileArgs(endOfLifeDate, excludeFromLatest, replicaCount, storageAccountType, targetRegions);
        }
    }
}
