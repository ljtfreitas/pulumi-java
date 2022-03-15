// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs Empty = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs();

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    @Import(name="maxRetentionDays", required=true)
      private final Output<Integer> maxRetentionDays;

    public Output<Integer> getMaxRetentionDays() {
        return this.maxRetentionDays;
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when
     * the source disk is deleted.
     * Default value is `KEEP_AUTO_SNAPSHOTS`.
     * Possible values are `KEEP_AUTO_SNAPSHOTS` and `APPLY_RETENTION_POLICY`.
     * 
     */
    @Import(name="onSourceDiskDelete")
      private final @Nullable Output<String> onSourceDiskDelete;

    public Output<String> getOnSourceDiskDelete() {
        return this.onSourceDiskDelete == null ? Output.empty() : this.onSourceDiskDelete;
    }

    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(
        Output<Integer> maxRetentionDays,
        @Nullable Output<String> onSourceDiskDelete) {
        this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays, "expected parameter 'maxRetentionDays' to be non-null");
        this.onSourceDiskDelete = onSourceDiskDelete;
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs() {
        this.maxRetentionDays = Output.empty();
        this.onSourceDiskDelete = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxRetentionDays;
        private @Nullable Output<String> onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        public Builder maxRetentionDays(Output<Integer> maxRetentionDays) {
            this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays);
            return this;
        }

        public Builder maxRetentionDays(Integer maxRetentionDays) {
            this.maxRetentionDays = Output.of(Objects.requireNonNull(maxRetentionDays));
            return this;
        }

        public Builder onSourceDiskDelete(@Nullable Output<String> onSourceDiskDelete) {
            this.onSourceDiskDelete = onSourceDiskDelete;
            return this;
        }

        public Builder onSourceDiskDelete(@Nullable String onSourceDiskDelete) {
            this.onSourceDiskDelete = Output.ofNullable(onSourceDiskDelete);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(maxRetentionDays, onSourceDiskDelete);
        }
    }
}
