// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Executes a script to handle the request that matches the URL pattern.
 * 
 */
public final class ScriptHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScriptHandlerArgs Empty = new ScriptHandlerArgs();

    /**
     * Path to the script from the application root directory.
     * 
     */
    @InputImport(name="scriptPath")
      private final @Nullable Input<String> scriptPath;

    public Input<String> getScriptPath() {
        return this.scriptPath == null ? Input.empty() : this.scriptPath;
    }

    public ScriptHandlerArgs(@Nullable Input<String> scriptPath) {
        this.scriptPath = scriptPath;
    }

    private ScriptHandlerArgs() {
        this.scriptPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> scriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptPath = defaults.scriptPath;
        }

        public Builder setScriptPath(@Nullable Input<String> scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }

        public Builder setScriptPath(@Nullable String scriptPath) {
            this.scriptPath = Input.ofNullable(scriptPath);
            return this;
        }
        public ScriptHandlerArgs build() {
            return new ScriptHandlerArgs(scriptPath);
        }
    }
}
