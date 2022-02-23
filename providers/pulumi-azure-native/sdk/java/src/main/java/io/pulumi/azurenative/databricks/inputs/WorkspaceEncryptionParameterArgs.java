// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.azurenative.databricks.inputs.EncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The object that contains details of encryption used on the workspace.
 * 
 */
public final class WorkspaceEncryptionParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceEncryptionParameterArgs Empty = new WorkspaceEncryptionParameterArgs();

    /**
     * The value which should be used for this field.
     * 
     */
    @InputImport(name="value")
        private final @Nullable Input<EncryptionArgs> value;

    public Input<EncryptionArgs> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public WorkspaceEncryptionParameterArgs(@Nullable Input<EncryptionArgs> value) {
        this.value = value;
    }

    private WorkspaceEncryptionParameterArgs() {
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceEncryptionParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EncryptionArgs> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceEncryptionParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable Input<EncryptionArgs> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable EncryptionArgs value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public WorkspaceEncryptionParameterArgs build() {
            return new WorkspaceEncryptionParameterArgs(value);
        }
    }
}
