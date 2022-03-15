// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EdgeCluster contains information specific to Google Edge Clusters.
 * 
 */
public final class EdgeClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeClusterArgs Empty = new EdgeClusterArgs();

    /**
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    @Import(name="resourceLink")
      private final @Nullable Output<String> resourceLink;

    public Output<String> getResourceLink() {
        return this.resourceLink == null ? Output.empty() : this.resourceLink;
    }

    public EdgeClusterArgs(@Nullable Output<String> resourceLink) {
        this.resourceLink = resourceLink;
    }

    private EdgeClusterArgs() {
        this.resourceLink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder resourceLink(@Nullable Output<String> resourceLink) {
            this.resourceLink = resourceLink;
            return this;
        }

        public Builder resourceLink(@Nullable String resourceLink) {
            this.resourceLink = Output.ofNullable(resourceLink);
            return this;
        }
        public EdgeClusterArgs build() {
            return new EdgeClusterArgs(resourceLink);
        }
    }
}
