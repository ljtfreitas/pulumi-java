// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetInstancesFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstancesArgs Empty = new GetInstancesArgs();

    /**
     * One or more name/value pairs to use as filters. There are
     * several valid keys, for a full reference, check out
     * [describe-instances in the AWS CLI reference][1].
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetInstancesFilter> filters;

    public List<GetInstancesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
     * 
     */
    @InputImport(name="instanceStateNames")
    private final @Nullable List<String> instanceStateNames;

    public List<String> getInstanceStateNames() {
        return this.instanceStateNames == null ? List.of() : this.instanceStateNames;
    }

    /**
     * A map of tags, each pair of which must
     * exactly match a pair on desired instances.
     * 
     */
    @InputImport(name="instanceTags")
    private final @Nullable Map<String,String> instanceTags;

    public Map<String,String> getInstanceTags() {
        return this.instanceTags == null ? Map.of() : this.instanceTags;
    }

    public GetInstancesArgs(
        @Nullable List<GetInstancesFilter> filters,
        @Nullable List<String> instanceStateNames,
        @Nullable Map<String,String> instanceTags) {
        this.filters = filters;
        this.instanceStateNames = instanceStateNames;
        this.instanceTags = instanceTags;
    }

    private GetInstancesArgs() {
        this.filters = List.of();
        this.instanceStateNames = List.of();
        this.instanceTags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInstancesFilter> filters;
        private @Nullable List<String> instanceStateNames;
        private @Nullable Map<String,String> instanceTags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.instanceStateNames = defaults.instanceStateNames;
    	      this.instanceTags = defaults.instanceTags;
        }

        public Builder setFilters(@Nullable List<GetInstancesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setInstanceStateNames(@Nullable List<String> instanceStateNames) {
            this.instanceStateNames = instanceStateNames;
            return this;
        }

        public Builder setInstanceTags(@Nullable Map<String,String> instanceTags) {
            this.instanceTags = instanceTags;
            return this;
        }
        public GetInstancesArgs build() {
            return new GetInstancesArgs(filters, instanceStateNames, instanceTags);
        }
    }
}
