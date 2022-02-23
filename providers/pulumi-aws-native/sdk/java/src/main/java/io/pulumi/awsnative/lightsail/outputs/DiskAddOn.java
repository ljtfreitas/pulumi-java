// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.awsnative.lightsail.enums.DiskAddOnStatus;
import io.pulumi.awsnative.lightsail.outputs.DiskAutoSnapshotAddOn;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiskAddOn {
    /**
     * The add-on type
     * 
     */
    private final String addOnType;
    private final @Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest;
    /**
     * Status of the Addon
     * 
     */
    private final @Nullable DiskAddOnStatus status;

    @OutputCustomType.Constructor({"addOnType","autoSnapshotAddOnRequest","status"})
    private DiskAddOn(
        String addOnType,
        @Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest,
        @Nullable DiskAddOnStatus status) {
        this.addOnType = Objects.requireNonNull(addOnType);
        this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
        this.status = status;
    }

    /**
     * The add-on type
     * 
     */
    public String getAddOnType() {
        return this.addOnType;
    }
    public Optional<DiskAutoSnapshotAddOn> getAutoSnapshotAddOnRequest() {
        return Optional.ofNullable(this.autoSnapshotAddOnRequest);
    }
    /**
     * Status of the Addon
     * 
     */
    public Optional<DiskAddOnStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskAddOn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addOnType;
        private @Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest;
        private @Nullable DiskAddOnStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskAddOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOnType = defaults.addOnType;
    	      this.autoSnapshotAddOnRequest = defaults.autoSnapshotAddOnRequest;
    	      this.status = defaults.status;
        }

        public Builder setAddOnType(String addOnType) {
            this.addOnType = Objects.requireNonNull(addOnType);
            return this;
        }

        public Builder setAutoSnapshotAddOnRequest(@Nullable DiskAutoSnapshotAddOn autoSnapshotAddOnRequest) {
            this.autoSnapshotAddOnRequest = autoSnapshotAddOnRequest;
            return this;
        }

        public Builder setStatus(@Nullable DiskAddOnStatus status) {
            this.status = status;
            return this;
        }
        public DiskAddOn build() {
            return new DiskAddOn(addOnType, autoSnapshotAddOnRequest, status);
        }
    }
}
