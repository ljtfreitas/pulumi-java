// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs;
import java.lang.Double;
import java.util.Objects;


public final class RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @Import(name="fixedDelay", required=true)
      private final Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay() {
        return this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    @Import(name="percentage", required=true)
      private final Output<Double> percentage;

    public Output<Double> percentage() {
        return this.percentage;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs(
        Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay,
        Output<Double> percentage) {
        this.fixedDelay = Objects.requireNonNull(fixedDelay, "expected parameter 'fixedDelay' to be non-null");
        this.percentage = Objects.requireNonNull(percentage, "expected parameter 'percentage' to be non-null");
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs() {
        this.fixedDelay = Codegen.empty();
        this.percentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;
        private Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay) {
            this.fixedDelay = Objects.requireNonNull(fixedDelay);
            return this;
        }
        public Builder fixedDelay(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs fixedDelay) {
            this.fixedDelay = Output.of(Objects.requireNonNull(fixedDelay));
            return this;
        }
        public Builder percentage(Output<Double> percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public Builder percentage(Double percentage) {
            this.percentage = Output.of(Objects.requireNonNull(percentage));
            return this;
        }        public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs(fixedDelay, percentage);
        }
    }
}
