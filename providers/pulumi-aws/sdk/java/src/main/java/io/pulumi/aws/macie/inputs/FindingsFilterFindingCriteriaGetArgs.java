// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.inputs;

import io.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaCriterionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingsFilterFindingCriteriaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FindingsFilterFindingCriteriaGetArgs Empty = new FindingsFilterFindingCriteriaGetArgs();

    /**
     * A condition that specifies the property, operator, and one or more values to use to filter the results.  (documented below)
     * 
     */
    @InputImport(name="criterions")
    private final @Nullable Input<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions;

    public Input<List<FindingsFilterFindingCriteriaCriterionGetArgs>> getCriterions() {
        return this.criterions == null ? Input.empty() : this.criterions;
    }

    public FindingsFilterFindingCriteriaGetArgs(@Nullable Input<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions) {
        this.criterions = criterions;
    }

    private FindingsFilterFindingCriteriaGetArgs() {
        this.criterions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteriaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteriaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterions = defaults.criterions;
        }

        public Builder setCriterions(@Nullable Input<List<FindingsFilterFindingCriteriaCriterionGetArgs>> criterions) {
            this.criterions = criterions;
            return this;
        }

        public Builder setCriterions(@Nullable List<FindingsFilterFindingCriteriaCriterionGetArgs> criterions) {
            this.criterions = Input.ofNullable(criterions);
            return this;
        }
        public FindingsFilterFindingCriteriaGetArgs build() {
            return new FindingsFilterFindingCriteriaGetArgs(criterions);
        }
    }
}
