// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs Empty = new PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs();

    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    @InputImport(name="allowedSuccessCodes")
        private final @Nullable Input<List<Integer>> allowedSuccessCodes;

    public Input<List<Integer>> getAllowedSuccessCodes() {
        return this.allowedSuccessCodes == null ? Input.empty() : this.allowedSuccessCodes;
    }

    /**
     * A Cloud Storage object containing the executable.
     * Structure is documented below.
     * 
     */
    @InputImport(name="gcsObject")
        private final @Nullable Input<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectGetArgs> gcsObject;

    public Input<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectGetArgs> getGcsObject() {
        return this.gcsObject == null ? Input.empty() : this.gcsObject;
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will
     * be executed directly, which will likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    @InputImport(name="interpreter")
        private final @Nullable Input<String> interpreter;

    public Input<String> getInterpreter() {
        return this.interpreter == null ? Input.empty() : this.interpreter;
    }

    /**
     * An absolute path to the executable on the VM.
     * 
     */
    @InputImport(name="localPath")
        private final @Nullable Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath == null ? Input.empty() : this.localPath;
    }

    public PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs(
        @Nullable Input<List<Integer>> allowedSuccessCodes,
        @Nullable Input<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectGetArgs> gcsObject,
        @Nullable Input<String> interpreter,
        @Nullable Input<String> localPath) {
        this.allowedSuccessCodes = allowedSuccessCodes;
        this.gcsObject = gcsObject;
        this.interpreter = interpreter;
        this.localPath = localPath;
    }

    private PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs() {
        this.allowedSuccessCodes = Input.empty();
        this.gcsObject = Input.empty();
        this.interpreter = Input.empty();
        this.localPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> allowedSuccessCodes;
        private @Nullable Input<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectGetArgs> gcsObject;
        private @Nullable Input<String> interpreter;
        private @Nullable Input<String> localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSuccessCodes = defaults.allowedSuccessCodes;
    	      this.gcsObject = defaults.gcsObject;
    	      this.interpreter = defaults.interpreter;
    	      this.localPath = defaults.localPath;
        }

        public Builder setAllowedSuccessCodes(@Nullable Input<List<Integer>> allowedSuccessCodes) {
            this.allowedSuccessCodes = allowedSuccessCodes;
            return this;
        }

        public Builder setAllowedSuccessCodes(@Nullable List<Integer> allowedSuccessCodes) {
            this.allowedSuccessCodes = Input.ofNullable(allowedSuccessCodes);
            return this;
        }

        public Builder setGcsObject(@Nullable Input<PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectGetArgs> gcsObject) {
            this.gcsObject = gcsObject;
            return this;
        }

        public Builder setGcsObject(@Nullable PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGcsObjectGetArgs gcsObject) {
            this.gcsObject = Input.ofNullable(gcsObject);
            return this;
        }

        public Builder setInterpreter(@Nullable Input<String> interpreter) {
            this.interpreter = interpreter;
            return this;
        }

        public Builder setInterpreter(@Nullable String interpreter) {
            this.interpreter = Input.ofNullable(interpreter);
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
        public PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs build() {
            return new PatchDeploymentPatchConfigPostStepLinuxExecStepConfigGetArgs(allowedSuccessCodes, gcsObject, interpreter, localPath);
        }
    }
}
