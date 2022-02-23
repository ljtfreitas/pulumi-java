// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SoftwareRecipeStepInstallRpmResponse {
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;

    @OutputCustomType.Constructor({"artifactId"})
    private SoftwareRecipeStepInstallRpmResponse(String artifactId) {
        this.artifactId = Objects.requireNonNull(artifactId);
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    public String getArtifactId() {
        return this.artifactId;
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
