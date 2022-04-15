// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceSchedulingNodeAffinityGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceSchedulingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceSchedulingGetArgs Empty = new InstanceSchedulingGetArgs();

    /**
     * Specifies if the instance should be
     * restarted if it was terminated by Compute Engine (not a user).
     * Defaults to true.
     * 
     */
    @Import(name="automaticRestart")
      private final @Nullable Output<Boolean> automaticRestart;

    public Output<Boolean> automaticRestart() {
        return this.automaticRestart == null ? Codegen.empty() : this.automaticRestart;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    @Import(name="minNodeCpus")
      private final @Nullable Output<Integer> minNodeCpus;

    public Output<Integer> minNodeCpus() {
        return this.minNodeCpus == null ? Codegen.empty() : this.minNodeCpus;
    }

    /**
     * Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    @Import(name="nodeAffinities")
      private final @Nullable Output<List<InstanceSchedulingNodeAffinityGetArgs>> nodeAffinities;

    public Output<List<InstanceSchedulingNodeAffinityGetArgs>> nodeAffinities() {
        return this.nodeAffinities == null ? Codegen.empty() : this.nodeAffinities;
    }

    /**
     * Describes maintenance behavior for the
     * instance. Can be MIGRATE or TERMINATE, for more info, read
     * [here](https://cloud.google.com/compute/docs/instances/setting-instance-scheduling-options).
     * 
     */
    @Import(name="onHostMaintenance")
      private final @Nullable Output<String> onHostMaintenance;

    public Output<String> onHostMaintenance() {
        return this.onHostMaintenance == null ? Codegen.empty() : this.onHostMaintenance;
    }

    /**
     * Specifies if the instance is preemptible.
     * If this field is set to true, then `automatic_restart` must be
     * set to false.  Defaults to false.
     * 
     */
    @Import(name="preemptible")
      private final @Nullable Output<Boolean> preemptible;

    public Output<Boolean> preemptible() {
        return this.preemptible == null ? Codegen.empty() : this.preemptible;
    }

    public InstanceSchedulingGetArgs(
        @Nullable Output<Boolean> automaticRestart,
        @Nullable Output<Integer> minNodeCpus,
        @Nullable Output<List<InstanceSchedulingNodeAffinityGetArgs>> nodeAffinities,
        @Nullable Output<String> onHostMaintenance,
        @Nullable Output<Boolean> preemptible) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
    }

    private InstanceSchedulingGetArgs() {
        this.automaticRestart = Codegen.empty();
        this.minNodeCpus = Codegen.empty();
        this.nodeAffinities = Codegen.empty();
        this.onHostMaintenance = Codegen.empty();
        this.preemptible = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceSchedulingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> automaticRestart;
        private @Nullable Output<Integer> minNodeCpus;
        private @Nullable Output<List<InstanceSchedulingNodeAffinityGetArgs>> nodeAffinities;
        private @Nullable Output<String> onHostMaintenance;
        private @Nullable Output<Boolean> preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceSchedulingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder automaticRestart(@Nullable Output<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }
        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Codegen.ofNullable(automaticRestart);
            return this;
        }
        public Builder minNodeCpus(@Nullable Output<Integer> minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }
        public Builder minNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = Codegen.ofNullable(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(@Nullable Output<List<InstanceSchedulingNodeAffinityGetArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }
        public Builder nodeAffinities(@Nullable List<InstanceSchedulingNodeAffinityGetArgs> nodeAffinities) {
            this.nodeAffinities = Codegen.ofNullable(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(InstanceSchedulingNodeAffinityGetArgs... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(@Nullable Output<String> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }
        public Builder onHostMaintenance(@Nullable String onHostMaintenance) {
            this.onHostMaintenance = Codegen.ofNullable(onHostMaintenance);
            return this;
        }
        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Codegen.ofNullable(preemptible);
            return this;
        }        public InstanceSchedulingGetArgs build() {
            return new InstanceSchedulingGetArgs(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
