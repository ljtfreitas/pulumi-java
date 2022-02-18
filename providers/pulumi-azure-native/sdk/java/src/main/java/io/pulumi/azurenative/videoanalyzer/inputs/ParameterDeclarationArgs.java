// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.enums.ParameterType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Single topology parameter declaration. Declared parameters can and must be referenced throughout the topology and can optionally have default values to be used when they are not defined in the pipelines.
 * 
 */
public final class ParameterDeclarationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterDeclarationArgs Empty = new ParameterDeclarationArgs();

    /**
     * The default value for the parameter to be used if the pipeline does not specify a value.
     * 
     */
    @InputImport(name="default")
    private final @Nullable Input<String> $default;

    public Input<String> get$default() {
        return this.$default == null ? Input.empty() : this.$default;
    }

    /**
     * Description of the parameter.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the parameter.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Type of the parameter.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<Either<String,ParameterType>> type;

    public Input<Either<String,ParameterType>> getType() {
        return this.type;
    }

    public ParameterDeclarationArgs(
        @Nullable Input<String> $default,
        @Nullable Input<String> description,
        Input<String> name,
        Input<Either<String,ParameterType>> type) {
        this.$default = $default;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ParameterDeclarationArgs() {
        this.$default = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterDeclarationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> $default;
        private @Nullable Input<String> description;
        private Input<String> name;
        private Input<Either<String,ParameterType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterDeclarationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder set$default(@Nullable Input<String> $default) {
            this.$default = $default;
            return this;
        }

        public Builder set$default(@Nullable String $default) {
            this.$default = Input.ofNullable($default);
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

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(Input<Either<String,ParameterType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,ParameterType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ParameterDeclarationArgs build() {
            return new ParameterDeclarationArgs($default, description, name, type);
        }
    }
}
