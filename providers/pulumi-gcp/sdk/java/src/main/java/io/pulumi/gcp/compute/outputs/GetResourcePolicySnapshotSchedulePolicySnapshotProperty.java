// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetResourcePolicySnapshotSchedulePolicySnapshotProperty {
    private final Boolean guestFlush;
    private final Map<String,String> labels;
    private final List<String> storageLocations;

    @CustomType.Constructor
    private GetResourcePolicySnapshotSchedulePolicySnapshotProperty(
        @CustomType.Parameter("guestFlush") Boolean guestFlush,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("storageLocations") List<String> storageLocations) {
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.storageLocations = storageLocations;
    }

    public Boolean getGuestFlush() {
        return this.guestFlush;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public List<String> getStorageLocations() {
        return this.storageLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicySnapshotProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean guestFlush;
        private Map<String,String> labels;
        private List<String> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicySnapshotProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder guestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder storageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }
        public GetResourcePolicySnapshotSchedulePolicySnapshotProperty build() {
            return new GetResourcePolicySnapshotSchedulePolicySnapshotProperty(guestFlush, labels, storageLocations);
        }
    }
}
