// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.enums.FieldCardinality;
import io.pulumi.googlenative.servicemanagement_v1.enums.FieldKind;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single field of a message type.
 * 
 */
public final class FieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldArgs Empty = new FieldArgs();

    /**
     * The field cardinality.
     * 
     */
    @Import(name="cardinality")
      private final @Nullable Output<FieldCardinality> cardinality;

    public Output<FieldCardinality> getCardinality() {
        return this.cardinality == null ? Output.empty() : this.cardinality;
    }

    /**
     * The string value of the default value of this field. Proto2 syntax only.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue == null ? Output.empty() : this.defaultValue;
    }

    /**
     * The field JSON name.
     * 
     */
    @Import(name="jsonName")
      private final @Nullable Output<String> jsonName;

    public Output<String> getJsonName() {
        return this.jsonName == null ? Output.empty() : this.jsonName;
    }

    /**
     * The field type.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<FieldKind> kind;

    public Output<FieldKind> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The field name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The field number.
     * 
     */
    @Import(name="number")
      private final @Nullable Output<Integer> number;

    public Output<Integer> getNumber() {
        return this.number == null ? Output.empty() : this.number;
    }

    /**
     * The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
     */
    @Import(name="oneofIndex")
      private final @Nullable Output<Integer> oneofIndex;

    public Output<Integer> getOneofIndex() {
        return this.oneofIndex == null ? Output.empty() : this.oneofIndex;
    }

    /**
     * The protocol buffer options.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<List<OptionArgs>> options;

    public Output<List<OptionArgs>> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * Whether to use alternative packed wire representation.
     * 
     */
    @Import(name="packed")
      private final @Nullable Output<Boolean> packed;

    public Output<Boolean> getPacked() {
        return this.packed == null ? Output.empty() : this.packed;
    }

    /**
     * The field type URL, without the scheme, for message or enumeration types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
     * 
     */
    @Import(name="typeUrl")
      private final @Nullable Output<String> typeUrl;

    public Output<String> getTypeUrl() {
        return this.typeUrl == null ? Output.empty() : this.typeUrl;
    }

    public FieldArgs(
        @Nullable Output<FieldCardinality> cardinality,
        @Nullable Output<String> defaultValue,
        @Nullable Output<String> jsonName,
        @Nullable Output<FieldKind> kind,
        @Nullable Output<String> name,
        @Nullable Output<Integer> number,
        @Nullable Output<Integer> oneofIndex,
        @Nullable Output<List<OptionArgs>> options,
        @Nullable Output<Boolean> packed,
        @Nullable Output<String> typeUrl) {
        this.cardinality = cardinality;
        this.defaultValue = defaultValue;
        this.jsonName = jsonName;
        this.kind = kind;
        this.name = name;
        this.number = number;
        this.oneofIndex = oneofIndex;
        this.options = options;
        this.packed = packed;
        this.typeUrl = typeUrl;
    }

    private FieldArgs() {
        this.cardinality = Output.empty();
        this.defaultValue = Output.empty();
        this.jsonName = Output.empty();
        this.kind = Output.empty();
        this.name = Output.empty();
        this.number = Output.empty();
        this.oneofIndex = Output.empty();
        this.options = Output.empty();
        this.packed = Output.empty();
        this.typeUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FieldCardinality> cardinality;
        private @Nullable Output<String> defaultValue;
        private @Nullable Output<String> jsonName;
        private @Nullable Output<FieldKind> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> number;
        private @Nullable Output<Integer> oneofIndex;
        private @Nullable Output<List<OptionArgs>> options;
        private @Nullable Output<Boolean> packed;
        private @Nullable Output<String> typeUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
    	      this.defaultValue = defaults.defaultValue;
    	      this.jsonName = defaults.jsonName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.oneofIndex = defaults.oneofIndex;
    	      this.options = defaults.options;
    	      this.packed = defaults.packed;
    	      this.typeUrl = defaults.typeUrl;
        }

        public Builder cardinality(@Nullable Output<FieldCardinality> cardinality) {
            this.cardinality = cardinality;
            return this;
        }

        public Builder cardinality(@Nullable FieldCardinality cardinality) {
            this.cardinality = Output.ofNullable(cardinality);
            return this;
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Output.ofNullable(defaultValue);
            return this;
        }

        public Builder jsonName(@Nullable Output<String> jsonName) {
            this.jsonName = jsonName;
            return this;
        }

        public Builder jsonName(@Nullable String jsonName) {
            this.jsonName = Output.ofNullable(jsonName);
            return this;
        }

        public Builder kind(@Nullable Output<FieldKind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable FieldKind kind) {
            this.kind = Output.ofNullable(kind);
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

        public Builder number(@Nullable Output<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder number(@Nullable Integer number) {
            this.number = Output.ofNullable(number);
            return this;
        }

        public Builder oneofIndex(@Nullable Output<Integer> oneofIndex) {
            this.oneofIndex = oneofIndex;
            return this;
        }

        public Builder oneofIndex(@Nullable Integer oneofIndex) {
            this.oneofIndex = Output.ofNullable(oneofIndex);
            return this;
        }

        public Builder options(@Nullable Output<List<OptionArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable List<OptionArgs> options) {
            this.options = Output.ofNullable(options);
            return this;
        }

        public Builder packed(@Nullable Output<Boolean> packed) {
            this.packed = packed;
            return this;
        }

        public Builder packed(@Nullable Boolean packed) {
            this.packed = Output.ofNullable(packed);
            return this;
        }

        public Builder typeUrl(@Nullable Output<String> typeUrl) {
            this.typeUrl = typeUrl;
            return this;
        }

        public Builder typeUrl(@Nullable String typeUrl) {
            this.typeUrl = Output.ofNullable(typeUrl);
            return this;
        }
        public FieldArgs build() {
            return new FieldArgs(cardinality, defaultValue, jsonName, kind, name, number, oneofIndex, options, packed, typeUrl);
        }
    }
}
