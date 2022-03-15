// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterDateFilter extends io.pulumi.resources.InvokeArgs {

    public static final FilterDateFilter Empty = new FilterDateFilter();

    @Import(name="endInclusive")
      private final @Nullable Integer endInclusive;

    public Optional<Integer> getEndInclusive() {
        return this.endInclusive == null ? Optional.empty() : Optional.ofNullable(this.endInclusive);
    }

    @Import(name="startInclusive")
      private final @Nullable Integer startInclusive;

    public Optional<Integer> getStartInclusive() {
        return this.startInclusive == null ? Optional.empty() : Optional.ofNullable(this.startInclusive);
    }

    public FilterDateFilter(
        @Nullable Integer endInclusive,
        @Nullable Integer startInclusive) {
        this.endInclusive = endInclusive;
        this.startInclusive = startInclusive;
    }

    private FilterDateFilter() {
        this.endInclusive = null;
        this.startInclusive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterDateFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer endInclusive;
        private @Nullable Integer startInclusive;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterDateFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endInclusive = defaults.endInclusive;
    	      this.startInclusive = defaults.startInclusive;
        }

        public Builder endInclusive(@Nullable Integer endInclusive) {
            this.endInclusive = endInclusive;
            return this;
        }

        public Builder startInclusive(@Nullable Integer startInclusive) {
            this.startInclusive = startInclusive;
            return this;
        }
        public FilterDateFilter build() {
            return new FilterDateFilter(endInclusive, startInclusive);
        }
    }
}
