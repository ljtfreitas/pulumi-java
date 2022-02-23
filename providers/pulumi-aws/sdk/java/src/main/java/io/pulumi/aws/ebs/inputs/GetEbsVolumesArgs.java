// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.aws.ebs.inputs.GetEbsVolumesFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEbsVolumesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEbsVolumesArgs Empty = new GetEbsVolumesArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetEbsVolumesFilter> filters;

    public List<GetEbsVolumesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired volumes.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetEbsVolumesArgs(
        @Nullable List<GetEbsVolumesFilter> filters,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.tags = tags;
    }

    private GetEbsVolumesArgs() {
        this.filters = List.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEbsVolumesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetEbsVolumesFilter> filters;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEbsVolumesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetEbsVolumesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetEbsVolumesArgs build() {
            return new GetEbsVolumesArgs(filters, tags);
        }
    }
}
