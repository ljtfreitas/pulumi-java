// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Scheduling information for VM on maintenance/restart behaviour and node allocation in sole tenant nodes.
 * 
 */
public final class ComputeSchedulingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeSchedulingResponse Empty = new ComputeSchedulingResponse();

    @Import(name="automaticRestart", required=true)
      private final Boolean automaticRestart;

    public Boolean getAutomaticRestart() {
        return this.automaticRestart;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. Ignored if no node_affinites are configured.
     * 
     */
    @Import(name="minNodeCpus", required=true)
      private final Integer minNodeCpus;

    public Integer getMinNodeCpus() {
        return this.minNodeCpus;
    }

    /**
     * A set of node affinity and anti-affinity configurations for sole tenant nodes.
     * 
     */
    @Import(name="nodeAffinities", required=true)
      private final List<SchedulingNodeAffinityResponse> nodeAffinities;

    public List<SchedulingNodeAffinityResponse> getNodeAffinities() {
        return this.nodeAffinities;
    }

    /**
     * How the instance should behave when the host machine undergoes maintenance that may temporarily impact instance performance.
     * 
     */
    @Import(name="onHostMaintenance", required=true)
      private final String onHostMaintenance;

    public String getOnHostMaintenance() {
        return this.onHostMaintenance;
    }

    /**
     * Whether the Instance should be automatically restarted whenever it is terminated by Compute Engine (not terminated by user). This configuration is identical to `automaticRestart` field in Compute Engine create instance under scheduling. It was changed to an enum (instead of a boolean) to match the default value in Compute Engine which is automatic restart.
     * 
     */
    @Import(name="restartType", required=true)
      private final String restartType;

    public String getRestartType() {
        return this.restartType;
    }

    public ComputeSchedulingResponse(
        Boolean automaticRestart,
        Integer minNodeCpus,
        List<SchedulingNodeAffinityResponse> nodeAffinities,
        String onHostMaintenance,
        String restartType) {
        this.automaticRestart = Objects.requireNonNull(automaticRestart, "expected parameter 'automaticRestart' to be non-null");
        this.minNodeCpus = Objects.requireNonNull(minNodeCpus, "expected parameter 'minNodeCpus' to be non-null");
        this.nodeAffinities = Objects.requireNonNull(nodeAffinities, "expected parameter 'nodeAffinities' to be non-null");
        this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance, "expected parameter 'onHostMaintenance' to be non-null");
        this.restartType = Objects.requireNonNull(restartType, "expected parameter 'restartType' to be non-null");
    }

    private ComputeSchedulingResponse() {
        this.automaticRestart = null;
        this.minNodeCpus = null;
        this.nodeAffinities = List.of();
        this.onHostMaintenance = null;
        this.restartType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeSchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private String restartType;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeSchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.restartType = defaults.restartType;
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }

        public Builder minNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }

        public Builder nodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }

        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }

        public Builder restartType(String restartType) {
            this.restartType = Objects.requireNonNull(restartType);
            return this;
        }
        public ComputeSchedulingResponse build() {
            return new ComputeSchedulingResponse(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, restartType);
        }
    }
}
