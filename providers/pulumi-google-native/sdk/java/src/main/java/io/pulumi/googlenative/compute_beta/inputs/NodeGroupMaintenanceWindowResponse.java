// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.DurationResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Time window specified for daily maintenance operations. GCE's internal maintenance will be performed within this window.
 * 
 */
public final class NodeGroupMaintenanceWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeGroupMaintenanceWindowResponse Empty = new NodeGroupMaintenanceWindowResponse();

    /**
     * [Output only] A predetermined duration for the window, automatically chosen to be the smallest possible in the given scenario.
     * 
     */
    @InputImport(name="maintenanceDuration", required=true)
      private final DurationResponse maintenanceDuration;

    public DurationResponse getMaintenanceDuration() {
        return this.maintenanceDuration;
    }

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public NodeGroupMaintenanceWindowResponse(
        DurationResponse maintenanceDuration,
        String startTime) {
        this.maintenanceDuration = Objects.requireNonNull(maintenanceDuration, "expected parameter 'maintenanceDuration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private NodeGroupMaintenanceWindowResponse() {
        this.maintenanceDuration = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse maintenanceDuration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maintenanceDuration = defaults.maintenanceDuration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setMaintenanceDuration(DurationResponse maintenanceDuration) {
            this.maintenanceDuration = Objects.requireNonNull(maintenanceDuration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public NodeGroupMaintenanceWindowResponse build() {
            return new NodeGroupMaintenanceWindowResponse(maintenanceDuration, startTime);
        }
    }
}
