// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCapacityReservationGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCapacityReservationGroupArgs Empty = new GetCapacityReservationGroupArgs();

    /**
     * The name of the capacity reservation group.
     * 
     */
    @Import(name="capacityReservationGroupName", required=true)
      private final String capacityReservationGroupName;

    public String getCapacityReservationGroupName() {
        return this.capacityReservationGroupName;
    }

    /**
     * The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance views of the capacity reservations under the capacity reservation group which is a snapshot of the runtime properties of a capacity reservation that is managed by the platform and can change outside of control plane operations.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCapacityReservationGroupArgs(
        String capacityReservationGroupName,
        @Nullable String expand,
        String resourceGroupName) {
        this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName, "expected parameter 'capacityReservationGroupName' to be non-null");
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCapacityReservationGroupArgs() {
        this.capacityReservationGroupName = null;
        this.expand = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityReservationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacityReservationGroupName;
        private @Nullable String expand;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityReservationGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationGroupName = defaults.capacityReservationGroupName;
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder capacityReservationGroupName(String capacityReservationGroupName) {
            this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName);
            return this;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetCapacityReservationGroupArgs build() {
            return new GetCapacityReservationGroupArgs(capacityReservationGroupName, expand, resourceGroupName);
        }
    }
}
