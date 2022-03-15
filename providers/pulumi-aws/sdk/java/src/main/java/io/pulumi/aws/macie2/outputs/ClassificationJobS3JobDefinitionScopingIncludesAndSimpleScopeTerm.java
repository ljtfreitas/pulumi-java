// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm {
    /**
     * The operator to use in a condition. Valid values are: `EQ`, `GT`, `GTE`, `LT`, `LTE`, `NE`, `CONTAINS`, `STARTS_WITH`
     * 
     */
    private final @Nullable String comparator;
    /**
     * The object property to use in the condition.
     * 
     */
    private final @Nullable String key;
    /**
     * An array that lists the values to use in the condition.
     * 
     */
    private final @Nullable List<String> values;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm(
        @CustomType.Parameter("comparator") @Nullable String comparator,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("values") @Nullable List<String> values) {
        this.comparator = comparator;
        this.key = key;
        this.values = values;
    }

    /**
     * The operator to use in a condition. Valid values are: `EQ`, `GT`, `GTE`, `LT`, `LTE`, `NE`, `CONTAINS`, `STARTS_WITH`
     * 
    */
    public Optional<String> getComparator() {
        return Optional.ofNullable(this.comparator);
    }
    /**
     * The object property to use in the condition.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * An array that lists the values to use in the condition.
     * 
    */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comparator;
        private @Nullable String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparator = defaults.comparator;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder comparator(@Nullable String comparator) {
            this.comparator = comparator;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm build() {
            return new ClassificationJobS3JobDefinitionScopingIncludesAndSimpleScopeTerm(comparator, key, values);
        }
    }
}
