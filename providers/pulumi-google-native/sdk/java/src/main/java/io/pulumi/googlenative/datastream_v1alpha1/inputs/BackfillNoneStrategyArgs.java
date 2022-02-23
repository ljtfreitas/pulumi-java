// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import java.util.Objects;


/**
 * Backfill strategy to disable automatic backfill for the Stream's objects.
 * 
 */
public final class BackfillNoneStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackfillNoneStrategyArgs Empty = new BackfillNoneStrategyArgs();

    public BackfillNoneStrategyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackfillNoneStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(BackfillNoneStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public BackfillNoneStrategyArgs build() {
            return new BackfillNoneStrategyArgs();
        }
    }
}
