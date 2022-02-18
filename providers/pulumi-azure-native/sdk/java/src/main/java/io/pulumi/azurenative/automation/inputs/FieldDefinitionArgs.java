// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="isEncrypted")
    private final @Nullable Input<Boolean> isEncrypted;

    public Input<Boolean> getIsEncrypted() {
        return this.isEncrypted == null ? Input.empty() : this.isEncrypted;
    }

    /**
     * Gets or sets the isOptional flag of the connection field definition.
     * 
     */
    @InputImport(name="isOptional")
    private final @Nullable Input<Boolean> isOptional;

    public Input<Boolean> getIsOptional() {
        return this.isOptional == null ? Input.empty() : this.isOptional;
    }

    /**
     * Gets or sets the type of the connection field definition.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public FieldDefinitionArgs(
        @Nullable Input<Boolean> isEncrypted,
        @Nullable Input<Boolean> isOptional,
        Input<String> type) {
        this.isEncrypted = isEncrypted;
        this.isOptional = isOptional;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FieldDefinitionArgs() {
        this.isEncrypted = Input.empty();
        this.isOptional = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isEncrypted;
        private @Nullable Input<Boolean> isOptional;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEncrypted = defaults.isEncrypted;
    	      this.isOptional = defaults.isOptional;
    	      this.type = defaults.type;
        }

        public Builder setIsEncrypted(@Nullable Input<Boolean> isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }

        public Builder setIsEncrypted(@Nullable Boolean isEncrypted) {
            this.isEncrypted = Input.ofNullable(isEncrypted);
            return this;
        }

        public Builder setIsOptional(@Nullable Input<Boolean> isOptional) {
            this.isOptional = isOptional;
            return this;
        }

        public Builder setIsOptional(@Nullable Boolean isOptional) {
            this.isOptional = Input.ofNullable(isOptional);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public FieldDefinitionArgs build() {
            return new FieldDefinitionArgs(isEncrypted, isOptional, type);
        }
    }
}
