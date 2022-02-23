// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RoutineArgument {
    /**
     * Defaults to FIXED_TYPE.
     * Default value is `FIXED_TYPE`.
     * Possible values are `FIXED_TYPE` and `ANY_TYPE`.
     * 
     */
    private final @Nullable String argumentKind;
    /**
     * A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
     * ~>**NOTE**: Because this field expects a JSON string, any changes to the string
     * will create a diff, even if the JSON itself hasn't changed. If the API returns
     * a different value for the same schema, e.g. it switched the order of values
     * or replaced STRUCT field type with RECORD field type, we currently cannot
     * suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    private final @Nullable String dataType;
    /**
     * Specifies whether the argument is input or output. Can be set for procedures only.
     * Possible values are `IN`, `OUT`, and `INOUT`.
     * 
     */
    private final @Nullable String mode;
    /**
     * The name of this argument. Can be absent for function return argument.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"argumentKind","dataType","mode","name"})
    private RoutineArgument(
        @Nullable String argumentKind,
        @Nullable String dataType,
        @Nullable String mode,
        @Nullable String name) {
        this.argumentKind = argumentKind;
        this.dataType = dataType;
        this.mode = mode;
        this.name = name;
    }

    /**
     * Defaults to FIXED_TYPE.
     * Default value is `FIXED_TYPE`.
     * Possible values are `FIXED_TYPE` and `ANY_TYPE`.
     * 
     */
    public Optional<String> getArgumentKind() {
        return Optional.ofNullable(this.argumentKind);
    }
    /**
     * A JSON schema for the data type. Required unless argumentKind = ANY_TYPE.
     * ~>**NOTE**: Because this field expects a JSON string, any changes to the string
     * will create a diff, even if the JSON itself hasn't changed. If the API returns
     * a different value for the same schema, e.g. it switched the order of values
     * or replaced STRUCT field type with RECORD field type, we currently cannot
     * suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    public Optional<String> getDataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * Specifies whether the argument is input or output. Can be set for procedures only.
     * Possible values are `IN`, `OUT`, and `INOUT`.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The name of this argument. Can be absent for function return argument.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutineArgument defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String argumentKind;
        private @Nullable String dataType;
        private @Nullable String mode;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutineArgument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argumentKind = defaults.argumentKind;
    	      this.dataType = defaults.dataType;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
        }

        public Builder setArgumentKind(@Nullable String argumentKind) {
            this.argumentKind = argumentKind;
            return this;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public RoutineArgument build() {
            return new RoutineArgument(argumentKind, dataType, mode, name);
        }
    }
}
