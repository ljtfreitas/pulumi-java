// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Installs an rpm file via the rpm utility.
 * 
 */
public final class SoftwareRecipeStepInstallRpmResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeStepInstallRpmResponse Empty = new SoftwareRecipeStepInstallRpmResponse();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
      private final String artifactId;

    public String getArtifactId() {
        return this.artifactId;
    }

    public SoftwareRecipeStepInstallRpmResponse(String artifactId) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
    }

    private SoftwareRecipeStepInstallRpmResponse() {
        this.artifactId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepInstallRpmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactId;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepInstallRpmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public SoftwareRecipeStepInstallRpmResponse build() {
            return new SoftwareRecipeStepInstallRpmResponse(artifactId);
        }
    }
}
