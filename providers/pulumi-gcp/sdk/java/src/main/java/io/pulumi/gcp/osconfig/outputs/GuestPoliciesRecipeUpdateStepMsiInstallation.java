// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesRecipeUpdateStepMsiInstallation {
    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    private final @Nullable List<Integer> allowedExitCodes;
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;
    /**
     * The flags to use when installing the MSI. Defaults to the install flag.
     * 
     */
    private final @Nullable List<String> flags;

    @OutputCustomType.Constructor({"allowedExitCodes","artifactId","flags"})
    private GuestPoliciesRecipeUpdateStepMsiInstallation(
        @Nullable List<Integer> allowedExitCodes,
        String artifactId,
        @Nullable List<String> flags) {
        this.allowedExitCodes = allowedExitCodes;
        this.artifactId = Objects.requireNonNull(artifactId);
        this.flags = flags;
    }

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public List<Integer> getAllowedExitCodes() {
        return this.allowedExitCodes == null ? List.of() : this.allowedExitCodes;
    }
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    public String getArtifactId() {
        return this.artifactId;
    }
    /**
     * The flags to use when installing the MSI. Defaults to the install flag.
     * 
     */
    public List<String> getFlags() {
        return this.flags == null ? List.of() : this.flags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepMsiInstallation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> allowedExitCodes;
        private String artifactId;
        private @Nullable List<String> flags;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepMsiInstallation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.artifactId = defaults.artifactId;
    	      this.flags = defaults.flags;
        }

        public Builder setAllowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder setFlags(@Nullable List<String> flags) {
            this.flags = flags;
            return this;
        }
        public GuestPoliciesRecipeUpdateStepMsiInstallation build() {
            return new GuestPoliciesRecipeUpdateStepMsiInstallation(allowedExitCodes, artifactId, flags);
        }
    }
}
