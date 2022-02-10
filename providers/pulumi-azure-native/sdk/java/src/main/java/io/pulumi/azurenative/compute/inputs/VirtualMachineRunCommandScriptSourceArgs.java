// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineRunCommandScriptSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineRunCommandScriptSourceArgs Empty = new VirtualMachineRunCommandScriptSourceArgs();

    @InputImport(name="commandId")
    private final @Nullable Input<String> commandId;

    public Input<String> getCommandId() {
        return this.commandId == null ? Input.empty() : this.commandId;
    }

    @InputImport(name="script")
    private final @Nullable Input<String> script;

    public Input<String> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    @InputImport(name="scriptUri")
    private final @Nullable Input<String> scriptUri;

    public Input<String> getScriptUri() {
        return this.scriptUri == null ? Input.empty() : this.scriptUri;
    }

    public VirtualMachineRunCommandScriptSourceArgs(
        @Nullable Input<String> commandId,
        @Nullable Input<String> script,
        @Nullable Input<String> scriptUri) {
        this.commandId = commandId;
        this.script = script;
        this.scriptUri = scriptUri;
    }

    private VirtualMachineRunCommandScriptSourceArgs() {
        this.commandId = Input.empty();
        this.script = Input.empty();
        this.scriptUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineRunCommandScriptSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commandId;
        private @Nullable Input<String> script;
        private @Nullable Input<String> scriptUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineRunCommandScriptSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandId = defaults.commandId;
    	      this.script = defaults.script;
    	      this.scriptUri = defaults.scriptUri;
        }

        public Builder setCommandId(@Nullable Input<String> commandId) {
            this.commandId = commandId;
            return this;
        }

        public Builder setCommandId(@Nullable String commandId) {
            this.commandId = Input.ofNullable(commandId);
            return this;
        }

        public Builder setScript(@Nullable Input<String> script) {
            this.script = script;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = Input.ofNullable(script);
            return this;
        }

        public Builder setScriptUri(@Nullable Input<String> scriptUri) {
            this.scriptUri = scriptUri;
            return this;
        }

        public Builder setScriptUri(@Nullable String scriptUri) {
            this.scriptUri = Input.ofNullable(scriptUri);
            return this;
        }

        public VirtualMachineRunCommandScriptSourceArgs build() {
            return new VirtualMachineRunCommandScriptSourceArgs(commandId, script, scriptUri);
        }
    }
}