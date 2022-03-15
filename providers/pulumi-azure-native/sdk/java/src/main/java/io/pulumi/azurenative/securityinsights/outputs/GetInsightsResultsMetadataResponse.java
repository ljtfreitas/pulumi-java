// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.GetInsightsErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetInsightsResultsMetadataResponse {
    /**
     * information about the failed queries
     * 
     */
    private final @Nullable List<GetInsightsErrorResponse> errors;
    /**
     * the total items found for the insights request
     * 
     */
    private final Integer totalCount;

    @CustomType.Constructor
    private GetInsightsResultsMetadataResponse(
        @CustomType.Parameter("errors") @Nullable List<GetInsightsErrorResponse> errors,
        @CustomType.Parameter("totalCount") Integer totalCount) {
        this.errors = errors;
        this.totalCount = totalCount;
    }

    /**
     * information about the failed queries
     * 
    */
    public List<GetInsightsErrorResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * the total items found for the insights request
     * 
    */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInsightsResultsMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInsightsErrorResponse> errors;
        private Integer totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInsightsResultsMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder errors(@Nullable List<GetInsightsErrorResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder totalCount(Integer totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }
        public GetInsightsResultsMetadataResponse build() {
            return new GetInsightsResultsMetadataResponse(errors, totalCount);
        }
    }
}
