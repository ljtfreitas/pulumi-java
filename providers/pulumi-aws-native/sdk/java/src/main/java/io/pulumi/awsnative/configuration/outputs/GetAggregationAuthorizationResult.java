// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.outputs;

import io.pulumi.awsnative.configuration.outputs.AggregationAuthorizationTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAggregationAuthorizationResult {
    /**
     * The ARN of the AggregationAuthorization.
     * 
     */
    private final @Nullable String aggregationAuthorizationArn;
    /**
     * The tags for the AggregationAuthorization.
     * 
     */
    private final @Nullable List<AggregationAuthorizationTag> tags;

    @CustomType.Constructor
    private GetAggregationAuthorizationResult(
        @CustomType.Parameter("aggregationAuthorizationArn") @Nullable String aggregationAuthorizationArn,
        @CustomType.Parameter("tags") @Nullable List<AggregationAuthorizationTag> tags) {
        this.aggregationAuthorizationArn = aggregationAuthorizationArn;
        this.tags = tags;
    }

    /**
     * The ARN of the AggregationAuthorization.
     * 
    */
    public Optional<String> getAggregationAuthorizationArn() {
        return Optional.ofNullable(this.aggregationAuthorizationArn);
    }
    /**
     * The tags for the AggregationAuthorization.
     * 
    */
    public List<AggregationAuthorizationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAggregationAuthorizationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aggregationAuthorizationArn;
        private @Nullable List<AggregationAuthorizationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAggregationAuthorizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationAuthorizationArn = defaults.aggregationAuthorizationArn;
    	      this.tags = defaults.tags;
        }

        public Builder aggregationAuthorizationArn(@Nullable String aggregationAuthorizationArn) {
            this.aggregationAuthorizationArn = aggregationAuthorizationArn;
            return this;
        }

        public Builder tags(@Nullable List<AggregationAuthorizationTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetAggregationAuthorizationResult build() {
            return new GetAggregationAuthorizationResult(aggregationAuthorizationArn, tags);
        }
    }
}
