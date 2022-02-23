// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.TaskFilterRuleFilterType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskFilterRule {
    /**
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * 
     */
    private final @Nullable TaskFilterRuleFilterType filterType;
    /**
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|".
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"filterType","value"})
    private TaskFilterRule(
        @Nullable TaskFilterRuleFilterType filterType,
        @Nullable String value) {
        this.filterType = filterType;
        this.value = value;
    }

    /**
     * The type of filter rule to apply. AWS DataSync only supports the SIMPLE_PATTERN rule type.
     * 
     */
    public Optional<TaskFilterRuleFilterType> getFilterType() {
        return Optional.ofNullable(this.filterType);
    }
    /**
     * A single filter string that consists of the patterns to include or exclude. The patterns are delimited by "|".
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskFilterRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskFilterRuleFilterType filterType;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskFilterRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterType = defaults.filterType;
    	      this.value = defaults.value;
        }

        public Builder setFilterType(@Nullable TaskFilterRuleFilterType filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public TaskFilterRule build() {
            return new TaskFilterRule(filterType, value);
        }
    }
}
