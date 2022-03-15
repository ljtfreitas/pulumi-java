// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.policy_v1beta1.inputs.IDRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
 * 
 */
public final class FSGroupStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FSGroupStrategyOptionsArgs Empty = new FSGroupStrategyOptionsArgs();

    /**
     * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    @Import(name="ranges")
      private final @Nullable Output<List<IDRangeArgs>> ranges;

    public Output<List<IDRangeArgs>> getRanges() {
        return this.ranges == null ? Output.empty() : this.ranges;
    }

    /**
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * 
     */
    @Import(name="rule")
      private final @Nullable Output<String> rule;

    public Output<String> getRule() {
        return this.rule == null ? Output.empty() : this.rule;
    }

    public FSGroupStrategyOptionsArgs(
        @Nullable Output<List<IDRangeArgs>> ranges,
        @Nullable Output<String> rule) {
        this.ranges = ranges;
        this.rule = rule;
    }

    private FSGroupStrategyOptionsArgs() {
        this.ranges = Output.empty();
        this.rule = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FSGroupStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<IDRangeArgs>> ranges;
        private @Nullable Output<String> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(FSGroupStrategyOptionsArgs defaults) {
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

        public Builder rule(@Nullable Output<String> rule) {
            this.rule = rule;
            return this;
        }

        public Builder rule(@Nullable String rule) {
            this.rule = Output.ofNullable(rule);
            return this;
        }
        public FSGroupStrategyOptionsArgs build() {
            return new FSGroupStrategyOptionsArgs(ranges, rule);
        }
    }
}
