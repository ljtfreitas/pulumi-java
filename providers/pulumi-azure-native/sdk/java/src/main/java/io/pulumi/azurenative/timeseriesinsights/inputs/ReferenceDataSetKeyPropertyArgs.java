// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.azurenative.timeseriesinsights.enums.ReferenceDataKeyPropertyType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A key property for the reference data set. A reference data set can have multiple key properties.
 * 
 */
public final class ReferenceDataSetKeyPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReferenceDataSetKeyPropertyArgs Empty = new ReferenceDataSetKeyPropertyArgs();

    /**
     * The name of the key property.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The type of the key property.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<Either<String,ReferenceDataKeyPropertyType>> type;

    public Input<Either<String,ReferenceDataKeyPropertyType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ReferenceDataSetKeyPropertyArgs(
        @Nullable Input<String> name,
        @Nullable Input<Either<String,ReferenceDataKeyPropertyType>> type) {
        this.name = name;
        this.type = type;
    }

    private ReferenceDataSetKeyPropertyArgs() {
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceDataSetKeyPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Either<String,ReferenceDataKeyPropertyType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceDataSetKeyPropertyArgs defaults) {
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

        public Builder setType(@Nullable Input<Either<String,ReferenceDataKeyPropertyType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ReferenceDataKeyPropertyType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ReferenceDataSetKeyPropertyArgs build() {
            return new ReferenceDataSetKeyPropertyArgs(name, type);
        }
    }
}
