// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie.inputs;

import java.util.Objects;


/**
 * Map of filter criteria.
 * 
 */
public final class FindingsFilterCriterion extends io.pulumi.resources.InvokeArgs {

    public static final FindingsFilterCriterion Empty = new FindingsFilterCriterion();

    public FindingsFilterCriterion() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterCriterion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterCriterion defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public FindingsFilterCriterion build() {
            return new FindingsFilterCriterion();
        }
    }
}
