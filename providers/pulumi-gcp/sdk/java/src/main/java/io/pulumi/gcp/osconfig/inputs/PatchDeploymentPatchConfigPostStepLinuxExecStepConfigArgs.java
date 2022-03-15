// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs Empty = new PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs();

    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    @Import(name="allowedSuccessCodes")
      private final @Nullable Output<List<Integer>> allowedSuccessCodes;

    public Output<List<Integer>> getAllowedSuccessCodes() {
        return this.allowedSuccessCodes == null ? Output.empty() : this.allowedSuccessCodes;
    }

    /**
     * A Cloud Storage object containing the executable.
     * Structure is documented below.
     * 
     */
    @Import(name="gcsObject")
      private final @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs> gcsObject;

    public Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs> getGcsObject() {
        return this.gcsObject == null ? Output.empty() : this.gcsObject;
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will
     * be executed directly, which will likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    @Import(name="interpreter")
      private final @Nullable Output<String> interpreter;

    public Output<String> getInterpreter() {
        return this.interpreter == null ? Output.empty() : this.interpreter;
    }

    /**
     * An absolute path to the executable on the VM.
     * 
     */
    @Import(name="localPath")
      private final @Nullable Output<String> localPath;

    public Output<String> getLocalPath() {
        return this.localPath == null ? Output.empty() : this.localPath;
    }

    public PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs(
        @Nullable Output<List<Integer>> allowedSuccessCodes,
        @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs> gcsObject,
        @Nullable Output<String> interpreter,
        @Nullable Output<String> localPath) {
        this.allowedSuccessCodes = allowedSuccessCodes;
        this.gcsObject = gcsObject;
        this.interpreter = interpreter;
        this.localPath = localPath;
    }

    private PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs() {
        this.allowedSuccessCodes = Output.empty();
        this.gcsObject = Output.empty();
        this.interpreter = Output.empty();
        this.localPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> allowedSuccessCodes;
        private @Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs> gcsObject;
        private @Nullable Output<String> interpreter;
        private @Nullable Output<String> localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSuccessCodes = defaults.allowedSuccessCodes;
    	      this.gcsObject = defaults.gcsObject;
    	      this.interpreter = defaults.interpreter;
    	      this.localPath = defaults.localPath;
        }

        public Builder allowedSuccessCodes(@Nullable Output<List<Integer>> allowedSuccessCodes) {
            this.allowedSuccessCodes = allowedSuccessCodes;
            return this;
        }

        public Builder allowedSuccessCodes(@Nullable List<Integer> allowedSuccessCodes) {
            this.allowedSuccessCodes = Output.ofNullable(allowedSuccessCodes);
            return this;
        }

        public Builder gcsObject(@Nullable Output<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs> gcsObject) {
            this.gcsObject = gcsObject;
            return this;
        }

        public Builder gcsObject(@Nullable PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectArgs gcsObject) {
            this.gcsObject = Output.ofNullable(gcsObject);
            return this;
        }

        public Builder interpreter(@Nullable Output<String> interpreter) {
            this.interpreter = interpreter;
            return this;
        }

        public Builder interpreter(@Nullable String interpreter) {
            this.interpreter = Output.ofNullable(interpreter);
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
        public PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs build() {
            return new PatchDeploymentPatchConfigPostStepLinuxExecStepConfigArgs(allowedSuccessCodes, gcsObject, interpreter, localPath);
        }
    }
}
