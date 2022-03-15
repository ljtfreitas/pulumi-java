// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SoftwareRecipeStepExecFileResponse {
    /**
     * Defaults to [0]. A list of possible return values that the program can return to indicate a success.
     * 
     */
    private final List<Integer> allowedExitCodes;
    /**
     * Arguments to be passed to the provided executable.
     * 
     */
    private final List<String> args;
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;
    /**
     * The absolute path of the file on the local filesystem.
     * 
     */
    private final String localPath;

    @CustomType.Constructor
    private SoftwareRecipeStepExecFileResponse(
        @CustomType.Parameter("allowedExitCodes") List<Integer> allowedExitCodes,
        @CustomType.Parameter("args") List<String> args,
        @CustomType.Parameter("artifactId") String artifactId,
        @CustomType.Parameter("localPath") String localPath) {
        this.allowedExitCodes = allowedExitCodes;
        this.args = args;
        this.artifactId = artifactId;
        this.localPath = localPath;
    }

    /**
     * Defaults to [0]. A list of possible return values that the program can return to indicate a success.
     * 
    */
    public List<Integer> getAllowedExitCodes() {
        return this.allowedExitCodes;
    }
    /**
     * Arguments to be passed to the provided executable.
     * 
    */
    public List<String> getArgs() {
        return this.args;
    }
    /**
     * The id of the relevant artifact in the recipe.
     * 
    */
    public String getArtifactId() {
        return this.artifactId;
    }
    /**
     * The absolute path of the file on the local filesystem.
     * 
    */
    public String getLocalPath() {
        return this.localPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepExecFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> allowedExitCodes;
        private List<String> args;
        private String artifactId;
        private String localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepExecFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.args = defaults.args;
    	      this.artifactId = defaults.artifactId;
    	      this.localPath = defaults.localPath;
        }

        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
            return this;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder localPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public SoftwareRecipeStepExecFileResponse build() {
            return new SoftwareRecipeStepExecFileResponse(allowedExitCodes, args, artifactId, localPath);
        }
    }
}
