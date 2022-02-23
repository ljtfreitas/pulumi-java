// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GuestPoliciesRecipeUpdateStepRpmInstallationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepRpmInstallationArgs Empty = new GuestPoliciesRecipeUpdateStepRpmInstallationArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
        private final Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId;
    }

    public GuestPoliciesRecipeUpdateStepRpmInstallationArgs(Input<String> artifactId) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
    }

    private GuestPoliciesRecipeUpdateStepRpmInstallationArgs() {
        this.artifactId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepRpmInstallationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> artifactId;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepRpmInstallationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
        }

        public Builder setArtifactId(Input<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Input.of(Objects.requireNonNull(artifactId));
            return this;
        }
        public GuestPoliciesRecipeUpdateStepRpmInstallationArgs build() {
            return new GuestPoliciesRecipeUpdateStepRpmInstallationArgs(artifactId);
        }
    }
}
