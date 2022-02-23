// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.inputs;

import io.pulumi.aws.ebs.inputs.GetVolumeFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVolumeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVolumeArgs Empty = new GetVolumeArgs();

    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference][1].
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetVolumeFilter> filters;

    public List<GetVolumeFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * If more than one result is returned, use the most
     * recent Volume.
     * 
     */
    @InputImport(name="mostRecent")
    private final @Nullable Boolean mostRecent;

    public Optional<Boolean> getMostRecent() {
        return this.mostRecent == null ? Optional.empty() : Optional.ofNullable(this.mostRecent);
    }

    /**
     * A map of tags for the resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetVolumeArgs(
        @Nullable List<GetVolumeFilter> filters,
        @Nullable Boolean mostRecent,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.mostRecent = mostRecent;
        this.tags = tags;
    }

    private GetVolumeArgs() {
        this.filters = List.of();
        this.mostRecent = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetVolumeFilter> filters;
        private @Nullable Boolean mostRecent;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.mostRecent = defaults.mostRecent;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetVolumeFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setMostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetVolumeArgs build() {
            return new GetVolumeArgs(filters, mostRecent, tags);
        }
    }
}
