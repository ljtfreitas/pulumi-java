// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.azurenative.operationalinsights.enums.WorkspaceSkuNameEnum;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The SKU (tier) of a workspace.
 * 
 */
public final class WorkspaceSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceSkuArgs Empty = new WorkspaceSkuArgs();

    /**
     * The capacity reservation level for this workspace, when CapacityReservation sku is selected.
     * 
     */
    @Import(name="capacityReservationLevel")
      private final @Nullable Output<Integer> capacityReservationLevel;

    public Output<Integer> getCapacityReservationLevel() {
        return this.capacityReservationLevel == null ? Output.empty() : this.capacityReservationLevel;
    }

    /**
     * The name of the SKU.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,WorkspaceSkuNameEnum>> name;

    public Output<Either<String,WorkspaceSkuNameEnum>> getName() {
        return this.name;
    }

    public WorkspaceSkuArgs(
        @Nullable Output<Integer> capacityReservationLevel,
        Output<Either<String,WorkspaceSkuNameEnum>> name) {
        this.capacityReservationLevel = capacityReservationLevel;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WorkspaceSkuArgs() {
        this.capacityReservationLevel = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacityReservationLevel;
        private Output<Either<String,WorkspaceSkuNameEnum>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationLevel = defaults.capacityReservationLevel;
    	      this.name = defaults.name;
        }

        public Builder capacityReservationLevel(@Nullable Output<Integer> capacityReservationLevel) {
            this.capacityReservationLevel = capacityReservationLevel;
            return this;
        }

        public Builder capacityReservationLevel(@Nullable Integer capacityReservationLevel) {
            this.capacityReservationLevel = Output.ofNullable(capacityReservationLevel);
            return this;
        }

        public Builder name(Output<Either<String,WorkspaceSkuNameEnum>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(Either<String,WorkspaceSkuNameEnum> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public WorkspaceSkuArgs build() {
            return new WorkspaceSkuArgs(capacityReservationLevel, name);
        }
    }
}
