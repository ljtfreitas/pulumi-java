// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeInstallStepFileExecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepFileExecGetArgs Empty = new GuestPoliciesRecipeInstallStepFileExecGetArgs();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @InputImport(name="allowedExitCodes")
        private final @Nullable Input<String> allowedExitCodes;

    public Input<String> getAllowedExitCodes() {
        return this.allowedExitCodes == null ? Input.empty() : this.allowedExitCodes;
    }

    /**
     * Arguments to be passed to the provided executable.
     * 
     */
    @InputImport(name="args")
        private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId")
        private final @Nullable Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId == null ? Input.empty() : this.artifactId;
    }

    /**
     * The absolute path of the file on the local filesystem.
     * 
     */
    @InputImport(name="localPath")
        private final @Nullable Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath == null ? Input.empty() : this.localPath;
    }

    public GuestPoliciesRecipeInstallStepFileExecGetArgs(
        @Nullable Input<String> allowedExitCodes,
        @Nullable Input<List<String>> args,
        @Nullable Input<String> artifactId,
        @Nullable Input<String> localPath) {
        this.allowedExitCodes = allowedExitCodes;
        this.args = args;
        this.artifactId = artifactId;
        this.localPath = localPath;
    }

    private GuestPoliciesRecipeInstallStepFileExecGetArgs() {
        this.allowedExitCodes = Input.empty();
        this.args = Input.empty();
        this.artifactId = Input.empty();
        this.localPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepFileExecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allowedExitCodes;
        private @Nullable Input<List<String>> args;
        private @Nullable Input<String> artifactId;
        private @Nullable Input<String> localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepFileExecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.args = defaults.args;
    	      this.artifactId = defaults.artifactId;
    	      this.localPath = defaults.localPath;
        }

        public Builder setAllowedExitCodes(@Nullable Input<String> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }

        public Builder setAllowedExitCodes(@Nullable String allowedExitCodes) {
            this.allowedExitCodes = Input.ofNullable(allowedExitCodes);
            return this;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setArtifactId(@Nullable Input<String> artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        public Builder setArtifactId(@Nullable String artifactId) {
            this.artifactId = Input.ofNullable(artifactId);
            return this;
        }

        public Builder setLocalPath(@Nullable Input<String> localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder setLocalPath(@Nullable String localPath) {
            this.localPath = Input.ofNullable(localPath);
            return this;
        }
        public GuestPoliciesRecipeInstallStepFileExecGetArgs build() {
            return new GuestPoliciesRecipeInstallStepFileExecGetArgs(allowedExitCodes, args, artifactId, localPath);
        }
    }
}
