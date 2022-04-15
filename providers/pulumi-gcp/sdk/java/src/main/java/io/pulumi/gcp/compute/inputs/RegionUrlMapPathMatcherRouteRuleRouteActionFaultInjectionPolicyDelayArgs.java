// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @Import(name="fixedDelay")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;

    public Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay() {
        return this.fixedDelay == null ? Codegen.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Double> percentage;

    public Output<Double> percentage() {
        return this.percentage == null ? Codegen.empty() : this.percentage;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs(
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay,
        @Nullable Output<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs() {
        this.fixedDelay = Codegen.empty();
        this.percentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;
        private @Nullable Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder fixedDelay(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }
        public Builder fixedDelay(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs fixedDelay) {
            this.fixedDelay = Codegen.ofNullable(fixedDelay);
            return this;
        }
        public Builder percentage(@Nullable Output<Double> percentage) {
            this.percentage = percentage;
            return this;
        }
        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Codegen.ofNullable(percentage);
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs(fixedDelay, percentage);
        }
    }
}
