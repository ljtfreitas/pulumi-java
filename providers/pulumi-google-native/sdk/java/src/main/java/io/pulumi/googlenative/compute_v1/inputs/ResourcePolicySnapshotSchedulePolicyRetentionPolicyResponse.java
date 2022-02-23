// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Policy for retention of scheduled snapshots.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse Empty = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse();

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    @InputImport(name="maxRetentionDays", required=true)
      private final Integer maxRetentionDays;

    public Integer getMaxRetentionDays() {
        return this.maxRetentionDays;
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    @InputImport(name="onSourceDiskDelete", required=true)
      private final String onSourceDiskDelete;

    public String getOnSourceDiskDelete() {
        return this.onSourceDiskDelete;
    }

    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse(
        Integer maxRetentionDays,
        String onSourceDiskDelete) {
        this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays, "expected parameter 'maxRetentionDays' to be non-null");
        this.onSourceDiskDelete = Objects.requireNonNull(onSourceDiskDelete, "expected parameter 'onSourceDiskDelete' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse() {
        this.maxRetentionDays = null;
        this.onSourceDiskDelete = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRetentionDays;
        private String onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        public Builder setMaxRetentionDays(Integer maxRetentionDays) {
            this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays);
            return this;
        }

        public Builder setOnSourceDiskDelete(String onSourceDiskDelete) {
            this.onSourceDiskDelete = Objects.requireNonNull(onSourceDiskDelete);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse(maxRetentionDays, onSourceDiskDelete);
        }
    }
}
