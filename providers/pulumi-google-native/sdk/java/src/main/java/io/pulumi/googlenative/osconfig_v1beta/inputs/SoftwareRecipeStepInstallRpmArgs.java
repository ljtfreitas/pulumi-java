// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Installs an rpm file via the rpm utility.
 * 
 */
public final class SoftwareRecipeStepInstallRpmArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepInstallRpmArgs Empty = new SoftwareRecipeStepInstallRpmArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
      private final Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId;
    }

    public SoftwareRecipeStepInstallRpmArgs(Input<String> artifactId) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
    }

    private SoftwareRecipeStepInstallRpmArgs() {
        this.artifactId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepInstallRpmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> artifactId;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepInstallRpmArgs defaults) {
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
        public SoftwareRecipeStepInstallRpmArgs build() {
            return new SoftwareRecipeStepInstallRpmArgs(artifactId);
        }
    }
}
