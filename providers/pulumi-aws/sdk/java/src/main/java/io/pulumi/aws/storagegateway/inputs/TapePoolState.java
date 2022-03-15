// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TapePoolState extends io.pulumi.resources.ResourceArgs {

    public static final TapePoolState Empty = new TapePoolState();

    /**
     * Volume Amazon Resource Name (ARN), e.g. `aws_storagegateway_tape_pool.example arn:aws:storagegateway:us-east-1:123456789012:tapepool/pool-12345678`.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of the new custom tape pool.
     * 
     */
    @Import(name="poolName")
      private final @Nullable Output<String> poolName;

    public Output<String> getPoolName() {
        return this.poolName == null ? Output.empty() : this.poolName;
    }

    /**
     * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
     * 
     */
    @Import(name="retentionLockTimeInDays")
      private final @Nullable Output<Integer> retentionLockTimeInDays;

    public Output<Integer> getRetentionLockTimeInDays() {
        return this.retentionLockTimeInDays == null ? Output.empty() : this.retentionLockTimeInDays;
    }

    /**
     * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
     * 
     */
    @Import(name="retentionLockType")
      private final @Nullable Output<String> retentionLockType;

    public Output<String> getRetentionLockType() {
        return this.retentionLockType == null ? Output.empty() : this.retentionLockType;
    }

    /**
     * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
     * 
     */
    @Import(name="storageClass")
      private final @Nullable Output<String> storageClass;

    public Output<String> getStorageClass() {
        return this.storageClass == null ? Output.empty() : this.storageClass;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public TapePoolState(
        @Nullable Output<String> arn,
        @Nullable Output<String> poolName,
        @Nullable Output<Integer> retentionLockTimeInDays,
        @Nullable Output<String> retentionLockType,
        @Nullable Output<String> storageClass,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.poolName = poolName;
        this.retentionLockTimeInDays = retentionLockTimeInDays;
        this.retentionLockType = retentionLockType;
        this.storageClass = storageClass;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private TapePoolState() {
        this.arn = Output.empty();
        this.poolName = Output.empty();
        this.retentionLockTimeInDays = Output.empty();
        this.retentionLockType = Output.empty();
        this.storageClass = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TapePoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> poolName;
        private @Nullable Output<Integer> retentionLockTimeInDays;
        private @Nullable Output<String> retentionLockType;
        private @Nullable Output<String> storageClass;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(TapePoolState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.poolName = defaults.poolName;
    	      this.retentionLockTimeInDays = defaults.retentionLockTimeInDays;
    	      this.retentionLockType = defaults.retentionLockType;
    	      this.storageClass = defaults.storageClass;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder poolName(@Nullable Output<String> poolName) {
            this.poolName = poolName;
            return this;
        }

        public Builder poolName(@Nullable String poolName) {
            this.poolName = Output.ofNullable(poolName);
            return this;
        }

        public Builder retentionLockTimeInDays(@Nullable Output<Integer> retentionLockTimeInDays) {
            this.retentionLockTimeInDays = retentionLockTimeInDays;
            return this;
        }

        public Builder retentionLockTimeInDays(@Nullable Integer retentionLockTimeInDays) {
            this.retentionLockTimeInDays = Output.ofNullable(retentionLockTimeInDays);
            return this;
        }

        public Builder retentionLockType(@Nullable Output<String> retentionLockType) {
            this.retentionLockType = retentionLockType;
            return this;
        }

        public Builder retentionLockType(@Nullable String retentionLockType) {
            this.retentionLockType = Output.ofNullable(retentionLockType);
            return this;
        }

        public Builder storageClass(@Nullable Output<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = Output.ofNullable(storageClass);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public TapePoolState build() {
            return new TapePoolState(arn, poolName, retentionLockTimeInDays, retentionLockType, storageClass, tags, tagsAll);
        }
    }
}
