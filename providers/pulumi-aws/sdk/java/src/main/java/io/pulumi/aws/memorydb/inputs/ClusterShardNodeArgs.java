// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.aws.memorydb.inputs.ClusterShardNodeEndpointArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterShardNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterShardNodeArgs Empty = new ClusterShardNodeArgs();

    /**
     * The Availability Zone in which the node resides.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    /**
     * The date and time when the node was created. Example: `2022-01-01T21:00:00Z`.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    @Import(name="endpoints")
      private final @Nullable Output<List<ClusterShardNodeEndpointArgs>> endpoints;

    public Output<List<ClusterShardNodeEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Output.empty() : this.endpoints;
    }

    /**
     * Name of this node.
     * * `endpoint`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ClusterShardNodeArgs(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> createTime,
        @Nullable Output<List<ClusterShardNodeEndpointArgs>> endpoints,
        @Nullable Output<String> name) {
        this.availabilityZone = availabilityZone;
        this.createTime = createTime;
        this.endpoints = endpoints;
        this.name = name;
    }

    private ClusterShardNodeArgs() {
        this.availabilityZone = Output.empty();
        this.createTime = Output.empty();
        this.endpoints = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterShardNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> createTime;
        private @Nullable Output<List<ClusterShardNodeEndpointArgs>> endpoints;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterShardNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.createTime = defaults.createTime;
    	      this.endpoints = defaults.endpoints;
    	      this.name = defaults.name;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
            return this;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }

        public Builder endpoints(@Nullable Output<List<ClusterShardNodeEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(@Nullable List<ClusterShardNodeEndpointArgs> endpoints) {
            this.endpoints = Output.ofNullable(endpoints);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public ClusterShardNodeArgs build() {
            return new ClusterShardNodeArgs(availabilityZone, createTime, endpoints, name);
        }
    }
}
