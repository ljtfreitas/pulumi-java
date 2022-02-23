// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.awsnative.inspectorv2.enums.FilterMapComparison;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterMapFilter extends io.pulumi.resources.InvokeArgs {

    public static final FilterMapFilter Empty = new FilterMapFilter();

    @InputImport(name="comparison", required=true)
        private final FilterMapComparison comparison;

    public FilterMapComparison getComparison() {
        return this.comparison;
    }

    @InputImport(name="key")
        private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    @InputImport(name="value")
        private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public FilterMapFilter(
        FilterMapComparison comparison,
        @Nullable String key,
        @Nullable String value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.key = key;
        this.value = value;
    }

    private FilterMapFilter() {
        this.comparison = null;
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterMapFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterMapComparison comparison;
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterMapFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setComparison(FilterMapComparison comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public FilterMapFilter build() {
            return new FilterMapFilter(comparison, key, value);
        }
    }
}
