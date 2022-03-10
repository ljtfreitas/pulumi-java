// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FilterPortRangeFilter {
    private final @Nullable Integer beginInclusive;
    private final @Nullable Integer endInclusive;

    @OutputCustomType.Constructor
    private FilterPortRangeFilter(
        @OutputCustomType.Parameter("beginInclusive") @Nullable Integer beginInclusive,
        @OutputCustomType.Parameter("endInclusive") @Nullable Integer endInclusive) {
        this.beginInclusive = beginInclusive;
        this.endInclusive = endInclusive;
    }

    public Optional<Integer> getBeginInclusive() {
        return Optional.ofNullable(this.beginInclusive);
    }
    public Optional<Integer> getEndInclusive() {
        return Optional.ofNullable(this.endInclusive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterPortRangeFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer beginInclusive;
        private @Nullable Integer endInclusive;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterPortRangeFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beginInclusive = defaults.beginInclusive;
    	      this.endInclusive = defaults.endInclusive;
        }

        public Builder setBeginInclusive(@Nullable Integer beginInclusive) {
            this.beginInclusive = beginInclusive;
            return this;
        }

        public Builder setEndInclusive(@Nullable Integer endInclusive) {
            this.endInclusive = endInclusive;
            return this;
        }
        public FilterPortRangeFilter build() {
            return new FilterPortRangeFilter(beginInclusive, endInclusive);
        }
    }
}
