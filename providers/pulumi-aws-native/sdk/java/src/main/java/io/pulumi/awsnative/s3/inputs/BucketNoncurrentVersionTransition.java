// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketNoncurrentVersionTransitionStorageClass;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container for the transition rule that describes when noncurrent objects transition to the STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER_IR, GLACIER, or DEEP_ARCHIVE storage class. If your bucket is versioning-enabled (or versioning is suspended), you can set this action to request that Amazon S3 transition noncurrent object versions to the STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER_IR, GLACIER, or DEEP_ARCHIVE storage class at a specific period in the object's lifetime.
 * 
 */
public final class BucketNoncurrentVersionTransition extends io.pulumi.resources.InvokeArgs {

    public static final BucketNoncurrentVersionTransition Empty = new BucketNoncurrentVersionTransition();

    /**
     * Specified the number of newer noncurrent and current versions that must exists before performing the associated action
     * 
     */
    @Import(name="newerNoncurrentVersions")
      private final @Nullable Integer newerNoncurrentVersions;

    public Optional<Integer> getNewerNoncurrentVersions() {
        return this.newerNoncurrentVersions == null ? Optional.empty() : Optional.ofNullable(this.newerNoncurrentVersions);
    }

    /**
     * The class of storage used to store the object.
     * 
     */
    @Import(name="storageClass", required=true)
      private final BucketNoncurrentVersionTransitionStorageClass storageClass;

    public BucketNoncurrentVersionTransitionStorageClass getStorageClass() {
        return this.storageClass;
    }

    /**
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action.
     * 
     */
    @Import(name="transitionInDays", required=true)
      private final Integer transitionInDays;

    public Integer getTransitionInDays() {
        return this.transitionInDays;
    }

    public BucketNoncurrentVersionTransition(
        @Nullable Integer newerNoncurrentVersions,
        BucketNoncurrentVersionTransitionStorageClass storageClass,
        Integer transitionInDays) {
        this.newerNoncurrentVersions = newerNoncurrentVersions;
        this.storageClass = Objects.requireNonNull(storageClass, "expected parameter 'storageClass' to be non-null");
        this.transitionInDays = Objects.requireNonNull(transitionInDays, "expected parameter 'transitionInDays' to be non-null");
    }

    private BucketNoncurrentVersionTransition() {
        this.newerNoncurrentVersions = null;
        this.storageClass = null;
        this.transitionInDays = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNoncurrentVersionTransition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer newerNoncurrentVersions;
        private BucketNoncurrentVersionTransitionStorageClass storageClass;
        private Integer transitionInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNoncurrentVersionTransition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newerNoncurrentVersions = defaults.newerNoncurrentVersions;
    	      this.storageClass = defaults.storageClass;
    	      this.transitionInDays = defaults.transitionInDays;
        }

        public Builder newerNoncurrentVersions(@Nullable Integer newerNoncurrentVersions) {
            this.newerNoncurrentVersions = newerNoncurrentVersions;
            return this;
        }

        public Builder storageClass(BucketNoncurrentVersionTransitionStorageClass storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }

        public Builder transitionInDays(Integer transitionInDays) {
            this.transitionInDays = Objects.requireNonNull(transitionInDays);
            return this;
        }
        public BucketNoncurrentVersionTransition build() {
            return new BucketNoncurrentVersionTransition(newerNoncurrentVersions, storageClass, transitionInDays);
        }
    }
}
