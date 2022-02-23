// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeUpdateStepMsiInstallationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepMsiInstallationArgs Empty = new GuestPoliciesRecipeUpdateStepMsiInstallationArgs();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @InputImport(name="allowedExitCodes")
        private final @Nullable Input<List<Integer>> allowedExitCodes;

    public Input<List<Integer>> getAllowedExitCodes() {
        return this.allowedExitCodes == null ? Input.empty() : this.allowedExitCodes;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
        private final Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId;
    }

    /**
     * The flags to use when installing the MSI. Defaults to the install flag.
     * 
     */
    @InputImport(name="flags")
        private final @Nullable Input<List<String>> flags;

    public Input<List<String>> getFlags() {
        return this.flags == null ? Input.empty() : this.flags;
    }

    public GuestPoliciesRecipeUpdateStepMsiInstallationArgs(
        @Nullable Input<List<Integer>> allowedExitCodes,
        Input<String> artifactId,
        @Nullable Input<List<String>> flags) {
        this.allowedExitCodes = allowedExitCodes;
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
        this.flags = flags;
    }

    private GuestPoliciesRecipeUpdateStepMsiInstallationArgs() {
        this.allowedExitCodes = Input.empty();
        this.artifactId = Input.empty();
        this.flags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepMsiInstallationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> allowedExitCodes;
        private Input<String> artifactId;
        private @Nullable Input<List<String>> flags;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepMsiInstallationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.artifactId = defaults.artifactId;
    	      this.flags = defaults.flags;
        }

        public Builder setAllowedExitCodes(@Nullable Input<List<Integer>> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }

        public Builder setAllowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Input.ofNullable(allowedExitCodes);
            return this;
        }

        public Builder setArtifactId(Input<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Input.of(Objects.requireNonNull(artifactId));
            return this;
        }

        public Builder setFlags(@Nullable Input<List<String>> flags) {
            this.flags = flags;
            return this;
        }

        public Builder setFlags(@Nullable List<String> flags) {
            this.flags = Input.ofNullable(flags);
            return this;
        }
        public GuestPoliciesRecipeUpdateStepMsiInstallationArgs build() {
            return new GuestPoliciesRecipeUpdateStepMsiInstallationArgs(allowedExitCodes, artifactId, flags);
        }
    }
}
