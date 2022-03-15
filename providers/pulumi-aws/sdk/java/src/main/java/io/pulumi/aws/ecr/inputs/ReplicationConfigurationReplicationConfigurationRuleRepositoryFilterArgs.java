// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs Empty = new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs();

    /**
     * The repository filter details.
     * 
     */
    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> getFilter() {
        return this.filter;
    }

    /**
     * The repository filter type. The only supported value is `PREFIX_MATCH`, which is a repository name prefix specified with the filter parameter.
     * 
     */
    @Import(name="filterType", required=true)
      private final Output<String> filterType;

    public Output<String> getFilterType() {
        return this.filterType;
    }

    public ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs(
        Output<String> filter,
        Output<String> filterType) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.filterType = Objects.requireNonNull(filterType, "expected parameter 'filterType' to be non-null");
    }

    private ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs() {
        this.filter = Output.empty();
        this.filterType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> filter;
        private Output<String> filterType;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.filterType = defaults.filterType;
        }

        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder filterType(Output<String> filterType) {
            this.filterType = Objects.requireNonNull(filterType);
            return this;
        }

        public Builder filterType(String filterType) {
            this.filterType = Output.of(Objects.requireNonNull(filterType));
            return this;
        }
        public ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs build() {
            return new ReplicationConfigurationReplicationConfigurationRuleRepositoryFilterArgs(filter, filterType);
        }
    }
}
