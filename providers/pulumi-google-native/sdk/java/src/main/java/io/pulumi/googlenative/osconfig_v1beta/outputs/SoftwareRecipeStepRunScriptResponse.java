// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SoftwareRecipeStepRunScriptResponse {
    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    private final List<Integer> allowedExitCodes;
    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly, which likely only succeed for scripts with [shebang lines](<https://en.wikipedia.org/wiki/Shebang_\(Unix\)>).
     * 
     */
    private final String interpreter;
    /**
     * The shell script to be executed.
     * 
     */
    private final String script;

    @OutputCustomType.Constructor({"allowedExitCodes","interpreter","script"})
    private SoftwareRecipeStepRunScriptResponse(
        List<Integer> allowedExitCodes,
        String interpreter,
        String script) {
        this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
        this.interpreter = Objects.requireNonNull(interpreter);
        this.script = Objects.requireNonNull(script);
    }

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    public List<Integer> getAllowedExitCodes() {
        return this.allowedExitCodes;
    }
    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly, which likely only succeed for scripts with [shebang lines](<https://en.wikipedia.org/wiki/Shebang_\(Unix\)>).
     * 
     */
    public String getInterpreter() {
        return this.interpreter;
    }
    /**
     * The shell script to be executed.
     * 
     */
    public String getScript() {
        return this.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepRunScriptResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> allowedExitCodes;
        private String interpreter;
        private String script;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepRunScriptResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.interpreter = defaults.interpreter;
    	      this.script = defaults.script;
        }

        public Builder setAllowedExitCodes(List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
            return this;
        }

        public Builder setInterpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder setScript(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        public SoftwareRecipeStepRunScriptResponse build() {
            return new SoftwareRecipeStepRunScriptResponse(allowedExitCodes, interpreter, script);
        }
    }
}
