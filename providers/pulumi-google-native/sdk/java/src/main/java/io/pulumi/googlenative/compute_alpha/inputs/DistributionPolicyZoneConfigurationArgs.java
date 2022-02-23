// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionPolicyZoneConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionPolicyZoneConfigurationArgs Empty = new DistributionPolicyZoneConfigurationArgs();

    /**
     * The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public DistributionPolicyZoneConfigurationArgs(@Nullable Input<String> zone) {
        this.zone = zone;
    }

    private DistributionPolicyZoneConfigurationArgs() {
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyZoneConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyZoneConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zone = defaults.zone;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public DistributionPolicyZoneConfigurationArgs build() {
            return new DistributionPolicyZoneConfigurationArgs(zone);
        }
    }
}
