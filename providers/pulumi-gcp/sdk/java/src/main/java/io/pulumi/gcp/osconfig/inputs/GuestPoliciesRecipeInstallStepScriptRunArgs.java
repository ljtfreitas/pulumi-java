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


public final class GuestPoliciesRecipeInstallStepScriptRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepScriptRunArgs Empty = new GuestPoliciesRecipeInstallStepScriptRunArgs();

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
     * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly,
     * which likely only succeed for scripts with shebang lines.
     * Possible values are `SHELL` and `POWERSHELL`.
     * 
     */
    @InputImport(name="interpreter")
        private final @Nullable Input<String> interpreter;

    public Input<String> getInterpreter() {
        return this.interpreter == null ? Input.empty() : this.interpreter;
    }

    /**
     * The shell script to be executed.
     * 
     */
    @InputImport(name="script", required=true)
        private final Input<String> script;

    public Input<String> getScript() {
        return this.script;
    }

    public GuestPoliciesRecipeInstallStepScriptRunArgs(
        @Nullable Input<List<Integer>> allowedExitCodes,
        @Nullable Input<String> interpreter,
        Input<String> script) {
        this.allowedExitCodes = allowedExitCodes;
        this.interpreter = interpreter;
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
    }

    private GuestPoliciesRecipeInstallStepScriptRunArgs() {
        this.allowedExitCodes = Input.empty();
        this.interpreter = Input.empty();
        this.script = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepScriptRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> allowedExitCodes;
        private @Nullable Input<String> interpreter;
        private Input<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepScriptRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.interpreter = defaults.interpreter;
    	      this.script = defaults.script;
        }

        public Builder setAllowedExitCodes(@Nullable Input<List<Integer>> allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }

        public Builder setAllowedExitCodes(@Nullable List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Input.ofNullable(allowedExitCodes);
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

        public Builder setScript(Input<String> script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setScript(String script) {
            this.script = Input.of(Objects.requireNonNull(script));
            return this;
        }
        public GuestPoliciesRecipeInstallStepScriptRunArgs build() {
            return new GuestPoliciesRecipeInstallStepScriptRunArgs(allowedExitCodes, interpreter, script);
        }
    }
}
