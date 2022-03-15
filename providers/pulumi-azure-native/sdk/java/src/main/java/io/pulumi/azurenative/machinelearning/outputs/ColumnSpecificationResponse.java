// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ColumnSpecificationResponse {
    /**
     * If the data type is categorical, this provides the list of accepted categories.
     * 
     */
    private final @Nullable List<Object> $enum;
    /**
     * Additional format information for the data type.
     * 
     */
    private final @Nullable String format;
    /**
     * Data type of the column.
     * 
     */
    private final String type;
    /**
     * Flag indicating if the type supports null values or not.
     * 
     */
    private final @Nullable Boolean xMsIsnullable;
    /**
     * Flag indicating whether the categories are treated as an ordered set or not, if this is a categorical column.
     * 
     */
    private final @Nullable Boolean xMsIsordered;

    @CustomType.Constructor
    private ColumnSpecificationResponse(
        @CustomType.Parameter("enum") @Nullable List<Object> $enum,
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("xMsIsnullable") @Nullable Boolean xMsIsnullable,
        @CustomType.Parameter("xMsIsordered") @Nullable Boolean xMsIsordered) {
        this.$enum = $enum;
        this.format = format;
        this.type = type;
        this.xMsIsnullable = xMsIsnullable;
        this.xMsIsordered = xMsIsordered;
    }

    /**
     * If the data type is categorical, this provides the list of accepted categories.
     * 
    */
    public List<Object> get$enum() {
        return this.$enum == null ? List.of() : this.$enum;
    }
    /**
     * Additional format information for the data type.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Data type of the column.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Flag indicating if the type supports null values or not.
     * 
    */
    public Optional<Boolean> getXMsIsnullable() {
        return Optional.ofNullable(this.xMsIsnullable);
    }
    /**
     * Flag indicating whether the categories are treated as an ordered set or not, if this is a categorical column.
     * 
    */
    public Optional<Boolean> getXMsIsordered() {
        return Optional.ofNullable(this.xMsIsordered);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> $enum;
        private @Nullable String format;
        private String type;
        private @Nullable Boolean xMsIsnullable;
        private @Nullable Boolean xMsIsordered;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$enum = defaults.$enum;
    	      this.format = defaults.format;
    	      this.type = defaults.type;
    	      this.xMsIsnullable = defaults.xMsIsnullable;
    	      this.xMsIsordered = defaults.xMsIsordered;
        }

        public Builder $enum(@Nullable List<Object> $enum) {
            this.$enum = $enum;
            return this;
        }

        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder xMsIsnullable(@Nullable Boolean xMsIsnullable) {
            this.xMsIsnullable = xMsIsnullable;
            return this;
        }

        public Builder xMsIsordered(@Nullable Boolean xMsIsordered) {
            this.xMsIsordered = xMsIsordered;
            return this;
        }
        public ColumnSpecificationResponse build() {
            return new ColumnSpecificationResponse($enum, format, type, xMsIsnullable, xMsIsordered);
        }
    }
}
