// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEndpointState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEndpointState Empty = new ClusterEndpointState();

    /**
     * Amazon Resource Name (ARN) of cluster
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
     * 
     */
    @Import(name="clusterEndpointIdentifier")
      private final @Nullable Output<String> clusterEndpointIdentifier;

    public Output<String> getClusterEndpointIdentifier() {
        return this.clusterEndpointIdentifier == null ? Output.empty() : this.clusterEndpointIdentifier;
    }

    /**
     * The cluster identifier.
     * 
     */
    @Import(name="clusterIdentifier")
      private final @Nullable Output<String> clusterIdentifier;

    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier == null ? Output.empty() : this.clusterIdentifier;
    }

    /**
     * The type of the endpoint. One of: READER , ANY .
     * 
     */
    @Import(name="customEndpointType")
      private final @Nullable Output<String> customEndpointType;

    public Output<String> getCustomEndpointType() {
        return this.customEndpointType == null ? Output.empty() : this.customEndpointType;
    }

    /**
     * A custom endpoint for the Aurora cluster
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
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

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ClusterEndpointState(
        @Nullable Output<String> arn,
        @Nullable Output<String> clusterEndpointIdentifier,
        @Nullable Output<String> clusterIdentifier,
        @Nullable Output<String> customEndpointType,
        @Nullable Output<String> endpoint,
        @Nullable Output<List<String>> excludedMembers,
        @Nullable Output<List<String>> staticMembers,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.clusterEndpointIdentifier = clusterEndpointIdentifier;
        this.clusterIdentifier = clusterIdentifier;
        this.customEndpointType = customEndpointType;
        this.endpoint = endpoint;
        this.excludedMembers = excludedMembers;
        this.staticMembers = staticMembers;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ClusterEndpointState() {
        this.arn = Output.empty();
        this.clusterEndpointIdentifier = Output.empty();
        this.clusterIdentifier = Output.empty();
        this.customEndpointType = Output.empty();
        this.endpoint = Output.empty();
        this.excludedMembers = Output.empty();
        this.staticMembers = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> clusterEndpointIdentifier;
        private @Nullable Output<String> clusterIdentifier;
        private @Nullable Output<String> customEndpointType;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<List<String>> excludedMembers;
        private @Nullable Output<List<String>> staticMembers;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterEndpointIdentifier = defaults.clusterEndpointIdentifier;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.customEndpointType = defaults.customEndpointType;
    	      this.endpoint = defaults.endpoint;
    	      this.excludedMembers = defaults.excludedMembers;
    	      this.staticMembers = defaults.staticMembers;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder clusterEndpointIdentifier(@Nullable Output<String> clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = clusterEndpointIdentifier;
            return this;
        }

        public Builder clusterEndpointIdentifier(@Nullable String clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = Output.ofNullable(clusterEndpointIdentifier);
            return this;
        }

        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public Builder clusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = Output.ofNullable(clusterIdentifier);
            return this;
        }

        public Builder customEndpointType(@Nullable Output<String> customEndpointType) {
            this.customEndpointType = customEndpointType;
            return this;
        }

        public Builder customEndpointType(@Nullable String customEndpointType) {
            this.customEndpointType = Output.ofNullable(customEndpointType);
            return this;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
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

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public ClusterEndpointState build() {
            return new ClusterEndpointState(arn, clusterEndpointIdentifier, clusterIdentifier, customEndpointType, endpoint, excludedMembers, staticMembers, tags, tagsAll);
        }
    }
}
