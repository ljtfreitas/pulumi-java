// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipState Empty = new FeatureMembershipState();

    /**
     * Config Management-specific spec. Structure is documented below.
     * 
     */
    @InputImport(name="configmanagement")
        private final @Nullable Input<FeatureMembershipConfigmanagementGetArgs> configmanagement;

    public Input<FeatureMembershipConfigmanagementGetArgs> getConfigmanagement() {
        return this.configmanagement == null ? Input.empty() : this.configmanagement;
    }

    /**
     * The name of the feature
     * 
     */
    @InputImport(name="feature")
        private final @Nullable Input<String> feature;

    public Input<String> getFeature() {
        return this.feature == null ? Input.empty() : this.feature;
    }

    /**
     * The location of the feature
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the membership
     * 
     */
    @InputImport(name="membership")
        private final @Nullable Input<String> membership;

    public Input<String> getMembership() {
        return this.membership == null ? Input.empty() : this.membership;
    }

    /**
     * The project of the feature
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public FeatureMembershipState(
        @Nullable Input<FeatureMembershipConfigmanagementGetArgs> configmanagement,
        @Nullable Input<String> feature,
        @Nullable Input<String> location,
        @Nullable Input<String> membership,
        @Nullable Input<String> project) {
        this.configmanagement = configmanagement;
        this.feature = feature;
        this.location = location;
        this.membership = membership;
        this.project = project;
    }

    private FeatureMembershipState() {
        this.configmanagement = Input.empty();
        this.feature = Input.empty();
        this.location = Input.empty();
        this.membership = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FeatureMembershipConfigmanagementGetArgs> configmanagement;
        private @Nullable Input<String> feature;
        private @Nullable Input<String> location;
        private @Nullable Input<String> membership;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configmanagement = defaults.configmanagement;
    	      this.feature = defaults.feature;
    	      this.location = defaults.location;
    	      this.membership = defaults.membership;
    	      this.project = defaults.project;
        }

        public Builder setConfigmanagement(@Nullable Input<FeatureMembershipConfigmanagementGetArgs> configmanagement) {
            this.configmanagement = configmanagement;
            return this;
        }

        public Builder setConfigmanagement(@Nullable FeatureMembershipConfigmanagementGetArgs configmanagement) {
            this.configmanagement = Input.ofNullable(configmanagement);
            return this;
        }

        public Builder setFeature(@Nullable Input<String> feature) {
            this.feature = feature;
            return this;
        }

        public Builder setFeature(@Nullable String feature) {
            this.feature = Input.ofNullable(feature);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMembership(@Nullable Input<String> membership) {
            this.membership = membership;
            return this;
        }

        public Builder setMembership(@Nullable String membership) {
            this.membership = Input.ofNullable(membership);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public FeatureMembershipState build() {
            return new FeatureMembershipState(configmanagement, feature, location, membership, project);
        }
    }
}
