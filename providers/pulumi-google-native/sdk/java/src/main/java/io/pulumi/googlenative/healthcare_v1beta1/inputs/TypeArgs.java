// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1beta1.enums.TypePrimitive;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.FieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A type definition for some HL7v2 type (incl. Segments and Datatypes).
 * 
 */
public final class TypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypeArgs Empty = new TypeArgs();

    /**
     * The (sub) fields this type has (if not primitive).
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<FieldArgs>> fields;

    public Output<List<FieldArgs>> getFields() {
        return this.fields == null ? Output.empty() : this.fields;
    }

    /**
     * The name of this type. This would be the segment or datatype name. For example, "PID" or "XPN".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * If this is a primitive type then this field is the type of the primitive For example, STRING. Leave unspecified for composite types.
     * 
     */
    @Import(name="primitive")
      private final @Nullable Output<TypePrimitive> primitive;

    public Output<TypePrimitive> getPrimitive() {
        return this.primitive == null ? Output.empty() : this.primitive;
    }

    public TypeArgs(
        @Nullable Output<List<FieldArgs>> fields,
        @Nullable Output<String> name,
        @Nullable Output<TypePrimitive> primitive) {
        this.fields = fields;
        this.name = name;
        this.primitive = primitive;
    }

    private TypeArgs() {
        this.fields = Output.empty();
        this.name = Output.empty();
        this.primitive = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FieldArgs>> fields;
        private @Nullable Output<String> name;
        private @Nullable Output<TypePrimitive> primitive;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.primitive = defaults.primitive;
        }

        public Builder fields(@Nullable Output<List<FieldArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(@Nullable List<FieldArgs> fields) {
            this.fields = Output.ofNullable(fields);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder primitive(@Nullable Output<TypePrimitive> primitive) {
            this.primitive = primitive;
            return this;
        }

        public Builder primitive(@Nullable TypePrimitive primitive) {
            this.primitive = Output.ofNullable(primitive);
            return this;
        }
        public TypeArgs build() {
            return new TypeArgs(fields, name, primitive);
        }
    }
}
