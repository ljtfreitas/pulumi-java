// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObject;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PatchDeploymentPatchConfigPostStepWindowsExecStepConfig {
    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    private final @Nullable List<Integer> allowedSuccessCodes;
    /**
     * A Cloud Storage object containing the executable.
     * Structure is documented below.
     * 
     */
    private final @Nullable PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObject gcsObject;
    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will
     * be executed directly, which will likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    private final @Nullable String interpreter;
    /**
     * An absolute path to the executable on the VM.
     * 
     */
    private final @Nullable String localPath;

    @OutputCustomType.Constructor({"allowedSuccessCodes","gcsObject","interpreter","localPath"})
    private PatchDeploymentPatchConfigPostStepWindowsExecStepConfig(
        @Nullable List<Integer> allowedSuccessCodes,
        @Nullable PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObject gcsObject,
        @Nullable String interpreter,
        @Nullable String localPath) {
        this.allowedSuccessCodes = allowedSuccessCodes;
        this.gcsObject = gcsObject;
        this.interpreter = interpreter;
        this.localPath = localPath;
    }

    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    public List<Integer> getAllowedSuccessCodes() {
        return this.allowedSuccessCodes == null ? List.of() : this.allowedSuccessCodes;
    }
    /**
     * A Cloud Storage object containing the executable.
     * Structure is documented below.
     * 
     */
    public Optional<PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObject> getGcsObject() {
        return Optional.ofNullable(this.gcsObject);
    }
    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will
     * be executed directly, which will likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    public Optional<String> getInterpreter() {
        return Optional.ofNullable(this.interpreter);
    }
    /**
     * An absolute path to the executable on the VM.
     * 
     */
    public Optional<String> getLocalPath() {
        return Optional.ofNullable(this.localPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPostStepWindowsExecStepConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> allowedSuccessCodes;
        private @Nullable PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObject gcsObject;
        private @Nullable String interpreter;
        private @Nullable String localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPostStepWindowsExecStepConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSuccessCodes = defaults.allowedSuccessCodes;
    	      this.gcsObject = defaults.gcsObject;
    	      this.interpreter = defaults.interpreter;
    	      this.localPath = defaults.localPath;
        }

        public Builder setAllowedSuccessCodes(@Nullable List<Integer> allowedSuccessCodes) {
            this.allowedSuccessCodes = allowedSuccessCodes;
            return this;
        }

        public Builder setGcsObject(@Nullable PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObject gcsObject) {
            this.gcsObject = gcsObject;
            return this;
        }

        public Builder setInterpreter(@Nullable String interpreter) {
            this.interpreter = interpreter;
            return this;
        }

        public Builder setLocalPath(@Nullable String localPath) {
            this.localPath = localPath;
            return this;
        }
        public PatchDeploymentPatchConfigPostStepWindowsExecStepConfig build() {
            return new PatchDeploymentPatchConfigPostStepWindowsExecStepConfig(allowedSuccessCodes, gcsObject, interpreter, localPath);
        }
    }
}
