// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.aws.guardduty.inputs.FilterFindingCriteriaCriterionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class FilterFindingCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterFindingCriteriaGetArgs Empty = new FilterFindingCriteriaGetArgs();

    @InputImport(name="criterions", required=true)
    private final Input<List<FilterFindingCriteriaCriterionGetArgs>> criterions;

    public Input<List<FilterFindingCriteriaCriterionGetArgs>> getCriterions() {
        return this.criterions;
    }

    public FilterFindingCriteriaGetArgs(Input<List<FilterFindingCriteriaCriterionGetArgs>> criterions) {
        this.criterions = Objects.requireNonNull(criterions, "expected parameter 'criterions' to be non-null");
    }

    private FilterFindingCriteriaGetArgs() {
        this.criterions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterFindingCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<FilterFindingCriteriaCriterionGetArgs>> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterFindingCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder setCriterions(Input<List<FilterFindingCriteriaCriterionGetArgs>> criterions) {
            this.criterions = Objects.requireNonNull(criterions);
            return this;
        }

        public Builder setCriterions(List<FilterFindingCriteriaCriterionGetArgs> criterions) {
            this.criterions = Input.of(Objects.requireNonNull(criterions));
            return this;
        }
        public FilterFindingCriteriaGetArgs build() {
            return new FilterFindingCriteriaGetArgs(criterions);
        }
    }
}
