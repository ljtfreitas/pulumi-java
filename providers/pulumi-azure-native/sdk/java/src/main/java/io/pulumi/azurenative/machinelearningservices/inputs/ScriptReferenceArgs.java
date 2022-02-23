// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Script reference
 * 
 */
public final class ScriptReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScriptReferenceArgs Empty = new ScriptReferenceArgs();

    /**
     * Optional command line arguments passed to the script to run.
     * 
     */
    @InputImport(name="scriptArguments")
        private final @Nullable Input<String> scriptArguments;

    public Input<String> getScriptArguments() {
        return this.scriptArguments == null ? Input.empty() : this.scriptArguments;
    }

    /**
     * The location of scripts in the mounted volume.
     * 
     */
    @InputImport(name="scriptData")
        private final @Nullable Input<String> scriptData;

    public Input<String> getScriptData() {
        return this.scriptData == null ? Input.empty() : this.scriptData;
    }

    /**
     * The storage source of the script: inline, workspace.
     * 
     */
    @InputImport(name="scriptSource")
        private final @Nullable Input<String> scriptSource;

    public Input<String> getScriptSource() {
        return this.scriptSource == null ? Input.empty() : this.scriptSource;
    }

    /**
     * Optional time period passed to timeout command.
     * 
     */
    @InputImport(name="timeout")
        private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public ScriptReferenceArgs(
        @Nullable Input<String> scriptArguments,
        @Nullable Input<String> scriptData,
        @Nullable Input<String> scriptSource,
        @Nullable Input<String> timeout) {
        this.scriptArguments = scriptArguments;
        this.scriptData = scriptData;
        this.scriptSource = scriptSource;
        this.timeout = timeout;
    }

    private ScriptReferenceArgs() {
        this.scriptArguments = Input.empty();
        this.scriptData = Input.empty();
        this.scriptSource = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> scriptArguments;
        private @Nullable Input<String> scriptData;
        private @Nullable Input<String> scriptSource;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptArguments = defaults.scriptArguments;
    	      this.scriptData = defaults.scriptData;
    	      this.scriptSource = defaults.scriptSource;
    	      this.timeout = defaults.timeout;
        }

        public Builder setScriptArguments(@Nullable Input<String> scriptArguments) {
            this.scriptArguments = scriptArguments;
            return this;
        }

        public Builder setScriptArguments(@Nullable String scriptArguments) {
            this.scriptArguments = Input.ofNullable(scriptArguments);
            return this;
        }

        public Builder setScriptData(@Nullable Input<String> scriptData) {
            this.scriptData = scriptData;
            return this;
        }

        public Builder setScriptData(@Nullable String scriptData) {
            this.scriptData = Input.ofNullable(scriptData);
            return this;
        }

        public Builder setScriptSource(@Nullable Input<String> scriptSource) {
            this.scriptSource = scriptSource;
            return this;
        }

        public Builder setScriptSource(@Nullable String scriptSource) {
            this.scriptSource = Input.ofNullable(scriptSource);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public ScriptReferenceArgs build() {
            return new ScriptReferenceArgs(scriptArguments, scriptData, scriptSource, timeout);
        }
    }
}
