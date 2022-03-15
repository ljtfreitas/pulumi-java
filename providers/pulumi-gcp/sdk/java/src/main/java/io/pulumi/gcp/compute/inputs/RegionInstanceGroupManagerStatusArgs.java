// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusVersionTargetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusArgs Empty = new RegionInstanceGroupManagerStatusArgs();

    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    @Import(name="isStable")
      private final @Nullable Output<Boolean> isStable;

    public Output<Boolean> getIsStable() {
        return this.isStable == null ? Output.empty() : this.isStable;
    }

    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    @Import(name="statefuls")
      private final @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulArgs>> statefuls;

    public Output<List<RegionInstanceGroupManagerStatusStatefulArgs>> getStatefuls() {
        return this.statefuls == null ? Output.empty() : this.statefuls;
    }

    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
     */
    @Import(name="versionTargets")
      private final @Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetArgs>> versionTargets;

    public Output<List<RegionInstanceGroupManagerStatusVersionTargetArgs>> getVersionTargets() {
        return this.versionTargets == null ? Output.empty() : this.versionTargets;
    }

    public RegionInstanceGroupManagerStatusArgs(
        @Nullable Output<Boolean> isStable,
        @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulArgs>> statefuls,
        @Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetArgs>> versionTargets) {
        this.isStable = isStable;
        this.statefuls = statefuls;
        this.versionTargets = versionTargets;
    }

    private RegionInstanceGroupManagerStatusArgs() {
        this.isStable = Output.empty();
        this.statefuls = Output.empty();
        this.versionTargets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isStable;
        private @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulArgs>> statefuls;
        private @Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetArgs>> versionTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isStable = defaults.isStable;
    	      this.statefuls = defaults.statefuls;
    	      this.versionTargets = defaults.versionTargets;
        }

        public Builder isStable(@Nullable Output<Boolean> isStable) {
            this.isStable = isStable;
            return this;
        }

        public Builder isStable(@Nullable Boolean isStable) {
            this.isStable = Output.ofNullable(isStable);
            return this;
        }

        public Builder statefuls(@Nullable Output<List<RegionInstanceGroupManagerStatusStatefulArgs>> statefuls) {
            this.statefuls = statefuls;
            return this;
        }

        public Builder statefuls(@Nullable List<RegionInstanceGroupManagerStatusStatefulArgs> statefuls) {
            this.statefuls = Output.ofNullable(statefuls);
            return this;
        }

        public Builder versionTargets(@Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetArgs>> versionTargets) {
            this.versionTargets = versionTargets;
            return this;
        }

        public Builder versionTargets(@Nullable List<RegionInstanceGroupManagerStatusVersionTargetArgs> versionTargets) {
            this.versionTargets = Output.ofNullable(versionTargets);
            return this;
        }
        public RegionInstanceGroupManagerStatusArgs build() {
            return new RegionInstanceGroupManagerStatusArgs(isStable, statefuls, versionTargets);
        }
    }
}
