// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.inputs;

import io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationReplicationDestinationArgs;
import io.pulumi.awsnative.ecr.inputs.ReplicationConfigurationRepositoryFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An array of objects representing the details of a replication destination.
 * 
 */
public final class ReplicationConfigurationReplicationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationRuleArgs Empty = new ReplicationConfigurationReplicationRuleArgs();

    /**
     * An array of objects representing the details of a replication destination.
     * 
     */
    @Import(name="destinations", required=true)
      private final Output<List<ReplicationConfigurationReplicationDestinationArgs>> destinations;

    public Output<List<ReplicationConfigurationReplicationDestinationArgs>> getDestinations() {
        return this.destinations;
    }

    /**
     * An array of objects representing the details of a repository filter.
     * 
     */
    @Import(name="repositoryFilters")
      private final @Nullable Output<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters;

    public Output<List<ReplicationConfigurationRepositoryFilterArgs>> getRepositoryFilters() {
        return this.repositoryFilters == null ? Output.empty() : this.repositoryFilters;
    }

    public ReplicationConfigurationReplicationRuleArgs(
        Output<List<ReplicationConfigurationReplicationDestinationArgs>> destinations,
        @Nullable Output<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.repositoryFilters = repositoryFilters;
    }

    private ReplicationConfigurationReplicationRuleArgs() {
        this.destinations = Output.empty();
        this.repositoryFilters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ReplicationConfigurationReplicationDestinationArgs>> destinations;
        private @Nullable Output<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.repositoryFilters = defaults.repositoryFilters;
        }

        public Builder destinations(Output<List<ReplicationConfigurationReplicationDestinationArgs>> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder destinations(List<ReplicationConfigurationReplicationDestinationArgs> destinations) {
            this.destinations = Output.of(Objects.requireNonNull(destinations));
            return this;
        }

        public Builder repositoryFilters(@Nullable Output<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters) {
            this.repositoryFilters = repositoryFilters;
            return this;
        }

        public Builder repositoryFilters(@Nullable List<ReplicationConfigurationRepositoryFilterArgs> repositoryFilters) {
            this.repositoryFilters = Output.ofNullable(repositoryFilters);
            return this;
        }
        public ReplicationConfigurationReplicationRuleArgs build() {
            return new ReplicationConfigurationReplicationRuleArgs(destinations, repositoryFilters);
        }
    }
}
