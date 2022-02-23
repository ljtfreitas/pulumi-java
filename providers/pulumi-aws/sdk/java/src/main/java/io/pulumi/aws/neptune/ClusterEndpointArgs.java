// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEndpointArgs Empty = new ClusterEndpointArgs();

    @InputImport(name="clusterEndpointIdentifier", required=true)
    private final Input<String> clusterEndpointIdentifier;

    public Input<String> getClusterEndpointIdentifier() {
        return this.clusterEndpointIdentifier;
    }

    /**
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * 
     */
    @InputImport(name="clusterIdentifier", required=true)
    private final Input<String> clusterIdentifier;

    public Input<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
     * 
     */
    @InputImport(name="endpointType", required=true)
    private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
     * 
     */
    @InputImport(name="excludedMembers")
    private final @Nullable Input<List<String>> excludedMembers;

    public Input<List<String>> getExcludedMembers() {
        return this.excludedMembers == null ? Input.empty() : this.excludedMembers;
    }

    /**
     * List of DB instance identifiers that are part of the custom endpoint group.
     * 
     */
    @InputImport(name="staticMembers")
    private final @Nullable Input<List<String>> staticMembers;

    public Input<List<String>> getStaticMembers() {
        return this.staticMembers == null ? Input.empty() : this.staticMembers;
    }

    /**
     * A map of tags to assign to the Neptune cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ClusterEndpointArgs(
        Input<String> clusterEndpointIdentifier,
        Input<String> clusterIdentifier,
        Input<String> endpointType,
        @Nullable Input<List<String>> excludedMembers,
        @Nullable Input<List<String>> staticMembers,
        @Nullable Input<Map<String,String>> tags) {
        this.clusterEndpointIdentifier = Objects.requireNonNull(clusterEndpointIdentifier, "expected parameter 'clusterEndpointIdentifier' to be non-null");
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.excludedMembers = excludedMembers;
        this.staticMembers = staticMembers;
        this.tags = tags;
    }

    private ClusterEndpointArgs() {
        this.clusterEndpointIdentifier = Input.empty();
        this.clusterIdentifier = Input.empty();
        this.endpointType = Input.empty();
        this.excludedMembers = Input.empty();
        this.staticMembers = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterEndpointIdentifier;
        private Input<String> clusterIdentifier;
        private Input<String> endpointType;
        private @Nullable Input<List<String>> excludedMembers;
        private @Nullable Input<List<String>> staticMembers;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterEndpointIdentifier = defaults.clusterEndpointIdentifier;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.endpointType = defaults.endpointType;
    	      this.excludedMembers = defaults.excludedMembers;
    	      this.staticMembers = defaults.staticMembers;
    	      this.tags = defaults.tags;
        }

        public Builder setClusterEndpointIdentifier(Input<String> clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = Objects.requireNonNull(clusterEndpointIdentifier);
            return this;
        }

        public Builder setClusterEndpointIdentifier(String clusterEndpointIdentifier) {
            this.clusterEndpointIdentifier = Input.of(Objects.requireNonNull(clusterEndpointIdentifier));
            return this;
        }

        public Builder setClusterIdentifier(Input<String> clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Input.of(Objects.requireNonNull(clusterIdentifier));
            return this;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setExcludedMembers(@Nullable Input<List<String>> excludedMembers) {
            this.excludedMembers = excludedMembers;
            return this;
        }

        public Builder setExcludedMembers(@Nullable List<String> excludedMembers) {
            this.excludedMembers = Input.ofNullable(excludedMembers);
            return this;
        }

        public Builder setStaticMembers(@Nullable Input<List<String>> staticMembers) {
            this.staticMembers = staticMembers;
            return this;
        }

        public Builder setStaticMembers(@Nullable List<String> staticMembers) {
            this.staticMembers = Input.ofNullable(staticMembers);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ClusterEndpointArgs build() {
            return new ClusterEndpointArgs(clusterEndpointIdentifier, clusterIdentifier, endpointType, excludedMembers, staticMembers, tags);
        }
    }
}
