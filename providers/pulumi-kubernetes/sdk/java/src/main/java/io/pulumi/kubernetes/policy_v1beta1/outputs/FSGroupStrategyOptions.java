// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.policy_v1beta1.outputs.IDRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FSGroupStrategyOptions {
    /**
     * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    private final @Nullable List<IDRange> ranges;
    /**
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * 
     */
    private final @Nullable String rule;

    @OutputCustomType.Constructor({"ranges","rule"})
    private FSGroupStrategyOptions(
        @Nullable List<IDRange> ranges,
        @Nullable String rule) {
        this.ranges = ranges;
        this.rule = rule;
    }

    /**
     * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    public List<IDRange> getRanges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    /**
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * 
     */
    public Optional<String> getRule() {
        return Optional.ofNullable(this.rule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FSGroupStrategyOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IDRange> ranges;
        private @Nullable String rule;

        public Builder() {
    	      // Empty
        }

        public Builder(FSGroupStrategyOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder setRanges(@Nullable List<IDRange> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder setRule(@Nullable String rule) {
            this.rule = rule;
            return this;
        }
        public FSGroupStrategyOptions build() {
            return new FSGroupStrategyOptions(ranges, rule);
        }
    }
}
