// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipArgs Empty = new FeatureMembershipArgs();

    /**
     * Config Management-specific spec. Structure is documented below.
     * 
     */
    @Import(name="configmanagement", required=true)
      private final Output<FeatureMembershipConfigmanagementArgs> configmanagement;

    public Output<FeatureMembershipConfigmanagementArgs> getConfigmanagement() {
        return this.configmanagement;
    }

    /**
     * The name of the feature
     * 
     */
    @Import(name="feature", required=true)
      private final Output<String> feature;

    public Output<String> getFeature() {
        return this.feature;
    }

    /**
     * The location of the feature
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * The name of the membership
     * 
     */
    @Import(name="membership", required=true)
      private final Output<String> membership;

    public Output<String> getMembership() {
        return this.membership;
    }

    /**
     * The project of the feature
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public FeatureMembershipArgs(
        Output<FeatureMembershipConfigmanagementArgs> configmanagement,
        Output<String> feature,
        Output<String> location,
        Output<String> membership,
        @Nullable Output<String> project) {
        this.configmanagement = Objects.requireNonNull(configmanagement, "expected parameter 'configmanagement' to be non-null");
        this.feature = Objects.requireNonNull(feature, "expected parameter 'feature' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.membership = Objects.requireNonNull(membership, "expected parameter 'membership' to be non-null");
        this.project = project;
    }

    private FeatureMembershipArgs() {
        this.configmanagement = Output.empty();
        this.feature = Output.empty();
        this.location = Output.empty();
        this.membership = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FeatureMembershipConfigmanagementArgs> configmanagement;
        private Output<String> feature;
        private Output<String> location;
        private Output<String> membership;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configmanagement = defaults.configmanagement;
    	      this.feature = defaults.feature;
    	      this.location = defaults.location;
    	      this.membership = defaults.membership;
    	      this.project = defaults.project;
        }

        public Builder configmanagement(Output<FeatureMembershipConfigmanagementArgs> configmanagement) {
            this.configmanagement = Objects.requireNonNull(configmanagement);
            return this;
        }

        public Builder configmanagement(FeatureMembershipConfigmanagementArgs configmanagement) {
            this.configmanagement = Output.of(Objects.requireNonNull(configmanagement));
            return this;
        }

        public Builder feature(Output<String> feature) {
            this.feature = Objects.requireNonNull(feature);
            return this;
        }

        public Builder feature(String feature) {
            this.feature = Output.of(Objects.requireNonNull(feature));
            return this;
        }

        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder membership(Output<String> membership) {
            this.membership = Objects.requireNonNull(membership);
            return this;
        }

        public Builder membership(String membership) {
            this.membership = Output.of(Objects.requireNonNull(membership));
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
        public FeatureMembershipArgs build() {
            return new FeatureMembershipArgs(configmanagement, feature, location, membership, project);
        }
    }
}
