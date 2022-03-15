// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @Import(name="fixedDelay")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> getFixedDelay() {
        return this.fixedDelay == null ? Output.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Double> percentage;

    public Output<Double> getPercentage() {
        return this.percentage == null ? Output.empty() : this.percentage;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs(
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay,
        @Nullable Output<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs() {
        this.fixedDelay = Output.empty();
        this.percentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;
        private @Nullable Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }

        public Builder fixedDelay(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs fixedDelay) {
            this.fixedDelay = Output.ofNullable(fixedDelay);
            return this;
        }

        public Builder percentage(@Nullable Output<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Output.ofNullable(percentage);
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs(fixedDelay, percentage);
        }
    }
}
