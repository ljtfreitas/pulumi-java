// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DocumentParameter {
    private final @Nullable String defaultValue;
    /**
     * The description of the document.
     * 
     */
    private final @Nullable String description;
    /**
     * The name of the document.
     * 
     */
    private final @Nullable String name;
    private final @Nullable String type;

    @CustomType.Constructor
    private DocumentParameter(
        @CustomType.Parameter("defaultValue") @Nullable String defaultValue,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = name;
        this.type = type;
    }

    public Optional<String> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue);
    }
    /**
     * The description of the document.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The name of the document.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultValue;
        private @Nullable String description;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DocumentParameter build() {
            return new DocumentParameter(defaultValue, description, name, type);
        }
    }
}
