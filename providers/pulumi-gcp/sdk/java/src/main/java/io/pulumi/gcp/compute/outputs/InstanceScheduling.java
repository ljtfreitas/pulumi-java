// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.InstanceSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceScheduling {
    /**
     * Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * Defaults to true.
     * 
     */
    private final @Nullable Boolean automaticRestart;
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    private final @Nullable Integer minNodeCpus;
    /**
     * Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    private final @Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities;
    /**
     * Describes maintenance behavior for the
     * instance. Can be MIGRATE or TERMINATE, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options).
     * 
     */
    private final @Nullable String onHostMaintenance;
    /**
     * Specifies if the instance is preemptible.
     * If this field is set to true, then `automatic_restart` must be
     * set to false.  Defaults to false.
     * 
     */
    private final @Nullable Boolean preemptible;

    @CustomType.Constructor
    private InstanceScheduling(
        @CustomType.Parameter("automaticRestart") @Nullable Boolean automaticRestart,
        @CustomType.Parameter("minNodeCpus") @Nullable Integer minNodeCpus,
        @CustomType.Parameter("nodeAffinities") @Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities,
        @CustomType.Parameter("onHostMaintenance") @Nullable String onHostMaintenance,
        @CustomType.Parameter("preemptible") @Nullable Boolean preemptible) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
    }

    /**
     * Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * Defaults to true.
     * 
    */
    public Optional<Boolean> getAutomaticRestart() {
        return Optional.ofNullable(this.automaticRestart);
    }
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
    */
    public Optional<Integer> getMinNodeCpus() {
        return Optional.ofNullable(this.minNodeCpus);
    }
    /**
     * Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
    */
    public List<InstanceSchedulingNodeAffinity> getNodeAffinities() {
        return this.nodeAffinities == null ? List.of() : this.nodeAffinities;
    }
    /**
     * Describes maintenance behavior for the
     * instance. Can be MIGRATE or TERMINATE, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options).
     * 
    */
    public Optional<String> getOnHostMaintenance() {
        return Optional.ofNullable(this.onHostMaintenance);
    }
    /**
     * Specifies if the instance is preemptible.
     * If this field is set to true, then `automatic_restart` must be
     * set to false.  Defaults to false.
     * 
    */
    public Optional<Boolean> getPreemptible() {
        return Optional.ofNullable(this.preemptible);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceScheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean automaticRestart;
        private @Nullable Integer minNodeCpus;
        private @Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities;
        private @Nullable String onHostMaintenance;
        private @Nullable Boolean preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }

        public Builder minNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder nodeAffinities(@Nullable List<InstanceSchedulingNodeAffinity> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder onHostMaintenance(@Nullable String onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public InstanceScheduling build() {
            return new InstanceScheduling(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
