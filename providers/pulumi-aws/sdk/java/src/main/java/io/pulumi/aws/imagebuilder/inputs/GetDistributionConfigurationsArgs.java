// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsFilter;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDistributionConfigurationsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationsArgs Empty = new GetDistributionConfigurationsArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetDistributionConfigurationsFilter> filters;

    public List<GetDistributionConfigurationsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public GetDistributionConfigurationsArgs(@Nullable List<GetDistributionConfigurationsFilter> filters) {
        this.filters = filters;
    }

    private GetDistributionConfigurationsArgs() {
        this.filters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetDistributionConfigurationsFilter> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder filters(@Nullable List<GetDistributionConfigurationsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public GetDistributionConfigurationsArgs build() {
            return new GetDistributionConfigurationsArgs(filters);
        }
    }
}
