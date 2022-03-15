// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie.outputs;

import io.pulumi.awsnative.macie.outputs.FindingsFilterCriterion;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FindingsFilterFindingCriteria {
    private final @Nullable FindingsFilterCriterion criterion;

    @CustomType.Constructor
    private FindingsFilterFindingCriteria(@CustomType.Parameter("criterion") @Nullable FindingsFilterCriterion criterion) {
        this.criterion = criterion;
    }

    public Optional<FindingsFilterCriterion> getCriterion() {
        return Optional.ofNullable(this.criterion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterFindingCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FindingsFilterCriterion criterion;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterFindingCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterion = defaults.criterion;
        }

        public Builder criterion(@Nullable FindingsFilterCriterion criterion) {
            this.criterion = criterion;
            return this;
        }
        public FindingsFilterFindingCriteria build() {
            return new FindingsFilterFindingCriteria(criterion);
        }
    }
}
