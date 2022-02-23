// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.DistributionPolicyZoneConfigurationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DistributionPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final DistributionPolicyResponse Empty = new DistributionPolicyResponse();

    /**
     * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
     * 
     */
    @InputImport(name="targetShape", required=true)
      private final String targetShape;

    public String getTargetShape() {
        return this.targetShape;
    }

    /**
     * Zones where the regional managed instance group will create and manage its instances.
     * 
     */
    @InputImport(name="zones", required=true)
      private final List<DistributionPolicyZoneConfigurationResponse> zones;

    public List<DistributionPolicyZoneConfigurationResponse> getZones() {
        return this.zones;
    }

    public DistributionPolicyResponse(
        String targetShape,
        List<DistributionPolicyZoneConfigurationResponse> zones) {
        this.targetShape = Objects.requireNonNull(targetShape, "expected parameter 'targetShape' to be non-null");
        this.zones = Objects.requireNonNull(zones, "expected parameter 'zones' to be non-null");
    }

    private DistributionPolicyResponse() {
        this.targetShape = null;
        this.zones = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetShape;
        private List<DistributionPolicyZoneConfigurationResponse> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetShape = defaults.targetShape;
    	      this.zones = defaults.zones;
        }

        public Builder setTargetShape(String targetShape) {
            this.targetShape = Objects.requireNonNull(targetShape);
            return this;
        }

        public Builder setZones(List<DistributionPolicyZoneConfigurationResponse> zones) {
            this.zones = Objects.requireNonNull(zones);
            return this;
        }
        public DistributionPolicyResponse build() {
            return new DistributionPolicyResponse(targetShape, zones);
        }
    }
}
