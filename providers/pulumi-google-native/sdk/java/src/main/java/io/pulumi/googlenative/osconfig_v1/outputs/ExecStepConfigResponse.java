// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.GcsObjectResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ExecStepConfigResponse {
    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    private final List<Integer> allowedSuccessCodes;
    /**
     * A Cloud Storage object containing the executable.
     * 
     */
    private final GcsObjectResponse gcsObject;
    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
     * 
     */
    private final String interpreter;
    /**
     * An absolute path to the executable on the VM.
     * 
     */
    private final String localPath;

    @CustomType.Constructor
    private ExecStepConfigResponse(
        @CustomType.Parameter("allowedSuccessCodes") List<Integer> allowedSuccessCodes,
        @CustomType.Parameter("gcsObject") GcsObjectResponse gcsObject,
        @CustomType.Parameter("interpreter") String interpreter,
        @CustomType.Parameter("localPath") String localPath) {
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
        return this.allowedSuccessCodes;
    }
    /**
     * A Cloud Storage object containing the executable.
     * 
    */
    public GcsObjectResponse getGcsObject() {
        return this.gcsObject;
    }
    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
     * 
    */
    public String getInterpreter() {
        return this.interpreter;
    }
    /**
     * An absolute path to the executable on the VM.
     * 
    */
    public String getLocalPath() {
        return this.localPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecStepConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> allowedSuccessCodes;
        private GcsObjectResponse gcsObject;
        private String interpreter;
        private String localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecStepConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSuccessCodes = defaults.allowedSuccessCodes;
    	      this.gcsObject = defaults.gcsObject;
    	      this.interpreter = defaults.interpreter;
    	      this.localPath = defaults.localPath;
        }

        public Builder allowedSuccessCodes(List<Integer> allowedSuccessCodes) {
            this.allowedSuccessCodes = Objects.requireNonNull(allowedSuccessCodes);
            return this;
        }

        public Builder gcsObject(GcsObjectResponse gcsObject) {
            this.gcsObject = Objects.requireNonNull(gcsObject);
            return this;
        }

        public Builder interpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder localPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public ExecStepConfigResponse build() {
            return new ExecStepConfigResponse(allowedSuccessCodes, gcsObject, interpreter, localPath);
        }
    }
}
