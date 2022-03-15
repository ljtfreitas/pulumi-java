// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupForwardedIPConfigurationFallbackBehavior;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupForwardedIPConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupForwardedIPConfigurationArgs Empty = new RuleGroupForwardedIPConfigurationArgs();

    @Import(name="fallbackBehavior", required=true)
      private final Output<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior;

    public Output<RuleGroupForwardedIPConfigurationFallbackBehavior> getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    public RuleGroupForwardedIPConfigurationArgs(
        Output<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior,
        Output<String> headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private RuleGroupForwardedIPConfigurationArgs() {
        this.fallbackBehavior = Output.empty();
        this.headerName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupForwardedIPConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior;
        private Output<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupForwardedIPConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder fallbackBehavior(Output<RuleGroupForwardedIPConfigurationFallbackBehavior> fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder fallbackBehavior(RuleGroupForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Output.of(Objects.requireNonNull(fallbackBehavior));
            return this;
        }

        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }
        public RuleGroupForwardedIPConfigurationArgs build() {
            return new RuleGroupForwardedIPConfigurationArgs(fallbackBehavior, headerName);
        }
    }
}
