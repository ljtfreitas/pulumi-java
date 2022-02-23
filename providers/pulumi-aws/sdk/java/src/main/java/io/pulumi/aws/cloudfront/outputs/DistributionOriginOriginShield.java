// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DistributionOriginOriginShield {
    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
     * 
     */
    private final String originShieldRegion;

    @OutputCustomType.Constructor({"enabled","originShieldRegion"})
    private DistributionOriginOriginShield(
        Boolean enabled,
        String originShieldRegion) {
        this.enabled = Objects.requireNonNull(enabled);
        this.originShieldRegion = Objects.requireNonNull(originShieldRegion);
    }

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
     * 
     */
    public String getOriginShieldRegion() {
        return this.originShieldRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginOriginShield defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String originShieldRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginOriginShield defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.originShieldRegion = defaults.originShieldRegion;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setOriginShieldRegion(String originShieldRegion) {
            this.originShieldRegion = Objects.requireNonNull(originShieldRegion);
            return this;
        }
        public DistributionOriginOriginShield build() {
            return new DistributionOriginOriginShield(enabled, originShieldRegion);
        }
    }
}
