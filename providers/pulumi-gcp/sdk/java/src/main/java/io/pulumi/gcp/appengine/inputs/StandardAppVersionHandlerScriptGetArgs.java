// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class StandardAppVersionHandlerScriptGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionHandlerScriptGetArgs Empty = new StandardAppVersionHandlerScriptGetArgs();

    /**
     * Path to the script from the application root directory.
     * 
     */
    @InputImport(name="scriptPath", required=true)
        private final Input<String> scriptPath;

    public Input<String> getScriptPath() {
        return this.scriptPath;
    }

    public StandardAppVersionHandlerScriptGetArgs(Input<String> scriptPath) {
        this.scriptPath = Objects.requireNonNull(scriptPath, "expected parameter 'scriptPath' to be non-null");
    }

    private StandardAppVersionHandlerScriptGetArgs() {
        this.scriptPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionHandlerScriptGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> scriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionHandlerScriptGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptPath = defaults.scriptPath;
        }

        public Builder setScriptPath(Input<String> scriptPath) {
            this.scriptPath = Objects.requireNonNull(scriptPath);
            return this;
        }

        public Builder setScriptPath(String scriptPath) {
            this.scriptPath = Input.of(Objects.requireNonNull(scriptPath));
            return this;
        }
        public StandardAppVersionHandlerScriptGetArgs build() {
            return new StandardAppVersionHandlerScriptGetArgs(scriptPath);
        }
    }
}
