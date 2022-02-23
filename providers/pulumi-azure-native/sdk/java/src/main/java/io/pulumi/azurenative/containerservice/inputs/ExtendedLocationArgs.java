// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.enums.ExtendedLocationTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The complex type of the extended location.
 * 
 */
public final class ExtendedLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtendedLocationArgs Empty = new ExtendedLocationArgs();

    /**
     * The name of the extended location.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The type of the extended location.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<Either<String,ExtendedLocationTypes>> type;

    public Input<Either<String,ExtendedLocationTypes>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ExtendedLocationArgs(
        @Nullable Input<String> name,
        @Nullable Input<Either<String,ExtendedLocationTypes>> type) {
        this.name = name;
        this.type = type;
    }

    private ExtendedLocationArgs() {
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Either<String,ExtendedLocationTypes>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,ExtendedLocationTypes>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ExtendedLocationTypes> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ExtendedLocationArgs build() {
            return new ExtendedLocationArgs(name, type);
        }
    }
}
