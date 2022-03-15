// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DedicatedHostAvailableCapacityResponse;
import io.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The instance view of a dedicated host.
 * 
 */
public final class DedicatedHostInstanceViewResponse extends io.pulumi.resources.InvokeArgs {

    public static final DedicatedHostInstanceViewResponse Empty = new DedicatedHostInstanceViewResponse();

    /**
     * Specifies the unique id of the dedicated physical machine on which the dedicated host resides.
     * 
     */
    @Import(name="assetId", required=true)
      private final String assetId;

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * Unutilized capacity of the dedicated host.
     * 
     */
    @Import(name="availableCapacity")
      private final @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;

    public Optional<DedicatedHostAvailableCapacityResponse> getAvailableCapacity() {
        return this.availableCapacity == null ? Optional.empty() : Optional.ofNullable(this.availableCapacity);
    }

    /**
     * The resource status information.
     * 
     */
    @Import(name="statuses")
      private final @Nullable List<InstanceViewStatusResponse> statuses;

    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    public DedicatedHostInstanceViewResponse(
        String assetId,
        @Nullable DedicatedHostAvailableCapacityResponse availableCapacity,
        @Nullable List<InstanceViewStatusResponse> statuses) {
        this.assetId = Objects.requireNonNull(assetId, "expected parameter 'assetId' to be non-null");
        this.availableCapacity = availableCapacity;
        this.statuses = statuses;
    }

    private DedicatedHostInstanceViewResponse() {
        this.assetId = null;
        this.availableCapacity = null;
        this.statuses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private @Nullable DedicatedHostAvailableCapacityResponse availableCapacity;
        private @Nullable List<InstanceViewStatusResponse> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.availableCapacity = defaults.availableCapacity;
    	      this.statuses = defaults.statuses;
        }

        public Builder assetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }

        public Builder availableCapacity(@Nullable DedicatedHostAvailableCapacityResponse availableCapacity) {
            this.availableCapacity = availableCapacity;
            return this;
        }

        public Builder statuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public DedicatedHostInstanceViewResponse build() {
            return new DedicatedHostInstanceViewResponse(assetId, availableCapacity, statuses);
        }
    }
}
