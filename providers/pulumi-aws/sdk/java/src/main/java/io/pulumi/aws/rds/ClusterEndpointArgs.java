// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEndpointArgs Empty = new ClusterEndpointArgs();

    /**
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * 
     */
    @Import(name="clusterEndpointIdentifier", required=true)
      private final Output<String> clusterEndpointIdentifier;

    public Output<String> getClusterEndpointIdentifier() {
        return this.clusterEndpointIdentifier;
    }

    /**
     * The cluster identifier.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
      private final Output<String> clusterIdentifier;

    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The type of the endpoint. One of: READER , ANY .
     * 
     */
    @Import(name="customEndpointType", required=true)
      private final Output<String> customEndpointType;

    public Output<String> getCustomEndpointType() {
        return this.customEndpointType;
    }

    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `static_members`.
     * 
     */
    @Import(name="excludedMembers")
      private final @Nullable Output<List<String>> excludedMembers;

    public Output<List<String>> getExcludedMembers() {
        return this.excludedMembers == null ? Output.empty() : this.excludedMembers;
    }

    /**
     * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excluded_members`.
     * 
     */
    @Import(name="staticMembers")
      private final @Nullable Output<List<String>> staticMembers;

    public Output<List<String>> getStaticMembers() {
        return this.staticMembers == null ? Output.empty() : this.staticMembers;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ClusterEndpointArgs(
        Output<String> clusterEndpointIdentifier,
        Output<String> clusterIdentifier,
        Output<String> customEndpointType,
        @Nullable Output<List<String>> excludedMembers,
        @Nullable Output<List<String>> staticMembers,
        @Nullable Output<Map<String,String>> tags) {
        this.clusterEndpointIdentifier = Objects.requireNonNull(clusterEndpointIdentifier, "expected parameter 'clusterEndpointIdentifier' to be non-null");
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.customEndpointType = Objects.requireNonNull(customEndpointType, "expected parameter 'customEndpointType' to be non-null");
        this.excludedMembers = excludedMembers;
        this.staticMembers = staticMembers;
        this.tags = tags;
    }

    private ClusterEndpointArgs() {
        this.clusterEndpointIdentifier = Output.empty();
        this.clusterIdentifier = Output.empty();
        this.customEndpointType = Output.empty();
        this.excludedMembers = Output.empty();
        this.staticMembers = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterEndpointIdentifier;
        private Output<String> clusterIdentifier;
        private Output<String> customEndpointType;
        private @Nullable Output<List<String>> excludedMembers;
        private @Nullable Output<List<String>> staticMembers;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterEndpointIdentifier = defaults.clusterEndpointIdentifier;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.customEndpointType = defaults.customEndpointType;
    	      this.excludedMembers = defaults.excludedMembers;
    	      this.staticMembers = defaults.staticMembers;
    	      this.tags = defaults.tags;
        }

        public Builder clusterEndpointIdentifier(Output<String> clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = Objects.requireNonNull(clusterEndpointIdentifier);
            return this;
        }

        public Builder clusterEndpointIdentifier(String clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = Output.of(Objects.requireNonNull(clusterEndpointIdentifier));
            return this;
        }

        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Output.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }

        public Builder customEndpointType(Output<String> customEndpointType) {
            this.customEndpointType = Objects.requireNonNull(customEndpointType);
            return this;
        }

        public Builder customEndpointType(String customEndpointType) {
            this.customEndpointType = Output.of(Objects.requireNonNull(customEndpointType));
            return this;
        }

        public Builder excludedMembers(@Nullable Output<List<String>> excludedMembers) {
            this.excludedMembers = excludedMembers;
            return this;
        }

        public Builder excludedMembers(@Nullable List<String> excludedMembers) {
            this.excludedMembers = Output.ofNullable(excludedMembers);
            return this;
        }

        public Builder staticMembers(@Nullable Output<List<String>> staticMembers) {
            this.staticMembers = staticMembers;
            return this;
        }

        public Builder staticMembers(@Nullable List<String> staticMembers) {
            this.staticMembers = Output.ofNullable(staticMembers);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ClusterEndpointArgs build() {
            return new ClusterEndpointArgs(clusterEndpointIdentifier, clusterIdentifier, customEndpointType, excludedMembers, staticMembers, tags);
        }
    }
}
