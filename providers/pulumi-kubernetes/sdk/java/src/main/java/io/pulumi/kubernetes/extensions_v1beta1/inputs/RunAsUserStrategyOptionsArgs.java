// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.IDRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use RunAsUserStrategyOptions from policy API Group instead.
 * 
 */
public final class RunAsUserStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RunAsUserStrategyOptionsArgs Empty = new RunAsUserStrategyOptionsArgs();

    /**
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    @Import(name="ranges")
      private final @Nullable Output<List<IDRangeArgs>> ranges;

    public Output<List<IDRangeArgs>> getRanges() {
        return this.ranges == null ? Output.empty() : this.ranges;
    }

    /**
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * 
     */
    @Import(name="rule", required=true)
      private final Output<String> rule;

    public Output<String> getRule() {
        return this.rule;
    }

    public RunAsUserStrategyOptionsArgs(
        @Nullable Output<List<IDRangeArgs>> ranges,
        Output<String> rule) {
        this.ranges = ranges;
        this.rule = Objects.requireNonNull(rule, "expected parameter 'rule' to be non-null");
    }

    private RunAsUserStrategyOptionsArgs() {
        this.ranges = Output.empty();
        this.rule = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsUserStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<IDRangeArgs>> ranges;
        private Output<String> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsUserStrategyOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder ranges(@Nullable Output<List<IDRangeArgs>> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder ranges(@Nullable List<IDRangeArgs> ranges) {
            this.ranges = Output.ofNullable(ranges);
            return this;
        }

        public Builder rule(Output<String> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder rule(String rule) {
            this.rule = Output.of(Objects.requireNonNull(rule));
            return this;
        }
        public RunAsUserStrategyOptionsArgs build() {
            return new RunAsUserStrategyOptionsArgs(ranges, rule);
        }
    }
}
