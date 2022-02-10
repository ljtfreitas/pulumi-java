// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.SecretObjectType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretObjectArgs Empty = new SecretObjectArgs();

    @InputImport(name="type")
    private final @Nullable Input<Either<String,SecretObjectType>> type;

    public Input<Either<String,SecretObjectType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public SecretObjectArgs(
        @Nullable Input<Either<String,SecretObjectType>> type,
        @Nullable Input<String> value) {
        this.type = type;
        this.value = value;
    }

    private SecretObjectArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,SecretObjectType>> type;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(@Nullable Input<Either<String,SecretObjectType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,SecretObjectType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public SecretObjectArgs build() {
            return new SecretObjectArgs(type, value);
        }
    }
}