// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginOriginShieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginOriginShieldArgs Empty = new DistributionOriginOriginShieldArgs();

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
     * 
     */
    @InputImport(name="originShieldRegion", required=true)
    private final Input<String> originShieldRegion;

    public Input<String> getOriginShieldRegion() {
        return this.originShieldRegion;
    }

    public DistributionOriginOriginShieldArgs(
        Input<Boolean> enabled,
        Input<String> originShieldRegion) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.originShieldRegion = Objects.requireNonNull(originShieldRegion, "expected parameter 'originShieldRegion' to be non-null");
    }

    private DistributionOriginOriginShieldArgs() {
        this.enabled = Input.empty();
        this.originShieldRegion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginOriginShieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabled;
        private Input<String> originShieldRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginOriginShieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.originShieldRegion = defaults.originShieldRegion;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setOriginShieldRegion(Input<String> originShieldRegion) {
            this.originShieldRegion = Objects.requireNonNull(originShieldRegion);
            return this;
        }

        public Builder setOriginShieldRegion(String originShieldRegion) {
            this.originShieldRegion = Input.of(Objects.requireNonNull(originShieldRegion));
            return this;
        }
        public DistributionOriginOriginShieldArgs build() {
            return new DistributionOriginOriginShieldArgs(enabled, originShieldRegion);
        }
    }
}