// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specified snapshot properties for scheduled snapshots created by this policy.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs Empty = new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs();

    /**
     * Chain name that the snapshot is created in.
     * 
     */
    @Import(name="chainName")
      private final @Nullable Output<String> chainName;

    public Output<String> getChainName() {
        return this.chainName == null ? Output.empty() : this.chainName;
    }

    /**
     * Indication to perform a 'guest aware' snapshot.
     * 
     */
    @Import(name="guestFlush")
      private final @Nullable Output<Boolean> guestFlush;

    public Output<Boolean> getGuestFlush() {
        return this.guestFlush == null ? Output.empty() : this.guestFlush;
    }

    /**
     * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    @Import(name="storageLocations")
      private final @Nullable Output<List<String>> storageLocations;

    public Output<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Output.empty() : this.storageLocations;
    }

    public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs(
        @Nullable Output<String> chainName,
        @Nullable Output<Boolean> guestFlush,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<String>> storageLocations) {
        this.chainName = chainName;
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.storageLocations = storageLocations;
    }

    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs() {
        this.chainName = Output.empty();
        this.guestFlush = Output.empty();
        this.labels = Output.empty();
        this.storageLocations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> chainName;
        private @Nullable Output<Boolean> guestFlush;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<String>> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainName = defaults.chainName;
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder chainName(@Nullable Output<String> chainName) {
            this.chainName = chainName;
            return this;
        }

        public Builder chainName(@Nullable String chainName) {
            this.chainName = Output.ofNullable(chainName);
            return this;
        }

        public Builder guestFlush(@Nullable Output<Boolean> guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }

        public Builder guestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = Output.ofNullable(guestFlush);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder storageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Output.ofNullable(storageLocations);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs build() {
            return new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs(chainName, guestFlush, labels, storageLocations);
        }
    }
}
