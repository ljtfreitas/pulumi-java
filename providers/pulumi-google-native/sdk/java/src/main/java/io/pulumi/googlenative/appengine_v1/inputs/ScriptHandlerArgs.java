// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="scriptPath")
      private final @Nullable Output<String> scriptPath;

    public Output<String> getScriptPath() {
        return this.scriptPath == null ? Output.empty() : this.scriptPath;
    }

    public ScriptHandlerArgs(@Nullable Output<String> scriptPath) {
        this.scriptPath = scriptPath;
    }

    private ScriptHandlerArgs() {
        this.scriptPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> scriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptPath = defaults.scriptPath;
        }

        public Builder scriptPath(@Nullable Output<String> scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }

        public Builder scriptPath(@Nullable String scriptPath) {
            this.scriptPath = Output.ofNullable(scriptPath);
            return this;
        }
        public ScriptHandlerArgs build() {
            return new ScriptHandlerArgs(scriptPath);
        }
    }
}
