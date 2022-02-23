// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentParameterGetArgs Empty = new DocumentParameterGetArgs();

    @InputImport(name="defaultValue")
    private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    /**
     * The description of the document.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the document.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DocumentParameterGetArgs(
        @Nullable Input<String> defaultValue,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> type) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = name;
        this.type = type;
    }

    private DocumentParameterGetArgs() {
        this.defaultValue = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultValue;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setDefaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public DocumentParameterGetArgs build() {
            return new DocumentParameterGetArgs(defaultValue, description, name, type);
        }
    }
}
