// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Executes an artifact or local file.
 * 
 */
public final class SoftwareRecipeStepExecFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepExecFileArgs Empty = new SoftwareRecipeStepExecFileArgs();

    /**
     * Defaults to [0]. A list of possible return values that the program can return to indicate a success.
     * 
     */
    @Import(name="allowedExitCodes")
      private final @Nullable Output<List<Integer>> allowedExitCodes;

    public Output<List<Integer>> getAllowedExitCodes() {
        return this.allowedExitCodes == null ? Output.empty() : this.allowedExitCodes;
    }

    /**
     * Arguments to be passed to the provided executable.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId")
      private final @Nullable Output<String> artifactId;

    public Output<String> getArtifactId() {
        return this.artifactId == null ? Output.empty() : this.artifactId;
    }

    /**
     * The absolute path of the file on the local filesystem.
     * 
     */
    @Import(name="localPath")
      private final @Nullable Output<String> localPath;

    public Output<String> getLocalPath() {
        return this.localPath == null ? Output.empty() : this.localPath;
    }

    public SoftwareRecipeStepExecFileArgs(
        @Nullable Output<List<Integer>> allowedExitCodes,
        @Nullable Output<List<String>> args,
        @Nullable Output<String> artifactId,
        @Nullable Output<String> localPath) {
        this.allowedExitCodes = allowedExitCodes;
        this.args = args;
        this.artifactId = artifactId;
        this.localPath = localPath;
    }

    private SoftwareRecipeStepExecFileArgs() {
        this.allowedExitCodes = Output.empty();
        this.args = Output.empty();
        this.artifactId = Output.empty();
        this.localPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepExecFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> allowedExitCodes;
        private @Nullable Output<List<String>> args;
        private @Nullable Output<String> artifactId;
        private @Nullable Output<String> localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepExecFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.args = defaults.args;
    	      this.artifactId = defaults.artifactId;
    	      this.localPath = defaults.localPath;
        }

        public Builder allowedExitCodes(@Nullable Output<List<Integer>> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }

        public Builder allowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Output.ofNullable(allowedExitCodes);
            return this;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }

        public Builder artifactId(@Nullable Output<String> artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        public Builder artifactId(@Nullable String artifactId) {
            this.artifactId = Output.ofNullable(artifactId);
            return this;
        }

        public Builder localPath(@Nullable Output<String> localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder localPath(@Nullable String localPath) {
            this.localPath = Output.ofNullable(localPath);
            return this;
        }
        public SoftwareRecipeStepExecFileArgs build() {
            return new SoftwareRecipeStepExecFileArgs(allowedExitCodes, args, artifactId, localPath);
        }
    }
}
