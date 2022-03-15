// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectDefaultNetworkTierState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectDefaultNetworkTierState Empty = new ProjectDefaultNetworkTierState();

    /**
     * The default network tier to be configured for the project.
     * This field can take the following values: `PREMIUM` or `STANDARD`.
     * 
     */
    @Import(name="networkTier")
      private final @Nullable Output<String> networkTier;

    public Output<String> getNetworkTier() {
        return this.networkTier == null ? Output.empty() : this.networkTier;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ProjectDefaultNetworkTierState(
        @Nullable Output<String> networkTier,
        @Nullable Output<String> project) {
        this.networkTier = networkTier;
        this.project = project;
    }

    private ProjectDefaultNetworkTierState() {
        this.networkTier = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectDefaultNetworkTierState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> networkTier;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectDefaultNetworkTierState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkTier = defaults.networkTier;
    	      this.project = defaults.project;
        }

        public Builder networkTier(@Nullable Output<String> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(@Nullable String networkTier) {
            this.networkTier = Output.ofNullable(networkTier);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public ProjectDefaultNetworkTierState build() {
            return new ProjectDefaultNetworkTierState(networkTier, project);
        }
    }
}
