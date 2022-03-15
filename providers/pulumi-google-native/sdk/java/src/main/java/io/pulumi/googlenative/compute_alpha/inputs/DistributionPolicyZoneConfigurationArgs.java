// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionPolicyZoneConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionPolicyZoneConfigurationArgs Empty = new DistributionPolicyZoneConfigurationArgs();

    /**
     * The URL of the zone. The zone must exist in the region where the managed instance group is located.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public DistributionPolicyZoneConfigurationArgs(@Nullable Output<String> zone) {
        this.zone = zone;
    }

    private DistributionPolicyZoneConfigurationArgs() {
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionPolicyZoneConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionPolicyZoneConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.zone = defaults.zone;
        }

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public DistributionPolicyZoneConfigurationArgs build() {
            return new DistributionPolicyZoneConfigurationArgs(zone);
        }
    }
}
