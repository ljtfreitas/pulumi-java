// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of the connection fields.
 * 
 */
public final class FieldDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldDefinitionArgs Empty = new FieldDefinitionArgs();

    /**
     * Gets or sets the isEncrypted flag of the connection field definition.
     * 
     */
    @Import(name="isEncrypted")
      private final @Nullable Output<Boolean> isEncrypted;

    public Output<Boolean> getIsEncrypted() {
        return this.isEncrypted == null ? Output.empty() : this.isEncrypted;
    }

    /**
     * Gets or sets the isOptional flag of the connection field definition.
     * 
     */
    @Import(name="isOptional")
      private final @Nullable Output<Boolean> isOptional;

    public Output<Boolean> getIsOptional() {
        return this.isOptional == null ? Output.empty() : this.isOptional;
    }

    /**
     * Gets or sets the type of the connection field definition.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FieldDefinitionArgs(
        @Nullable Output<Boolean> isEncrypted,
        @Nullable Output<Boolean> isOptional,
        Output<String> type) {
        this.isEncrypted = isEncrypted;
        this.isOptional = isOptional;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FieldDefinitionArgs() {
        this.isEncrypted = Output.empty();
        this.isOptional = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isEncrypted;
        private @Nullable Output<Boolean> isOptional;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.isOptional = defaults.isOptional;
    	      this.type = defaults.type;
        }

        public Builder isEncrypted(@Nullable Output<Boolean> isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }

        public Builder isEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = Output.ofNullable(isEncrypted);
            return this;
        }

        public Builder isOptional(@Nullable Output<Boolean> isOptional) {
            this.isOptional = isOptional;
            return this;
        }

        public Builder isOptional(@Nullable Boolean isOptional) {
            this.isOptional = Output.ofNullable(isOptional);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public FieldDefinitionArgs build() {
            return new FieldDefinitionArgs(isEncrypted, isOptional, type);
        }
    }
}
