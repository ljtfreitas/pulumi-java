// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs Empty = new GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
      private final Output<String> artifactId;

    public Output<String> artifactId() {
        return this.artifactId;
    }

    public GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs(Output<String> artifactId) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
    }

    private GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs() {
        this.artifactId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> artifactId;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
        }

        public Builder artifactId(Output<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public Builder artifactId(String artifactId) {
            this.artifactId = Output.of(Objects.requireNonNull(artifactId));
            return this;
        }        public GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs build() {
            return new GuestPoliciesRecipeInstallStepDpkgInstallationGetArgs(artifactId);
        }
    }
}
