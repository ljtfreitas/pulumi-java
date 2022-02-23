// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.datacatalog.outputs.TagTemplateFieldTypeEnumType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TagTemplateFieldType {
    /**
     * Represents an enum type.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Structure is documented below.
     * 
     */
    private final @Nullable TagTemplateFieldTypeEnumType enumType;
    /**
     * Represents primitive types - string, bool etc.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Possible values are `DOUBLE`, `STRING`, `BOOL`, and `TIMESTAMP`.
     * 
     */
    private final @Nullable String primitiveType;

    @OutputCustomType.Constructor({"enumType","primitiveType"})
    private TagTemplateFieldType(
        @Nullable TagTemplateFieldTypeEnumType enumType,
        @Nullable String primitiveType) {
        this.enumType = enumType;
        this.primitiveType = primitiveType;
    }

    /**
     * Represents an enum type.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Structure is documented below.
     * 
     */
    public Optional<TagTemplateFieldTypeEnumType> getEnumType() {
        return Optional.ofNullable(this.enumType);
    }
    /**
     * Represents primitive types - string, bool etc.
     * Exactly one of `primitive_type` or `enum_type` must be set
     * Possible values are `DOUBLE`, `STRING`, `BOOL`, and `TIMESTAMP`.
     * 
     */
    public Optional<String> getPrimitiveType() {
        return Optional.ofNullable(this.primitiveType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TagTemplateFieldTypeEnumType enumType;
        private @Nullable String primitiveType;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumType = defaults.enumType;
    	      this.primitiveType = defaults.primitiveType;
        }

        public Builder setEnumType(@Nullable TagTemplateFieldTypeEnumType enumType) {
            this.enumType = enumType;
            return this;
        }

        public Builder setPrimitiveType(@Nullable String primitiveType) {
            this.primitiveType = primitiveType;
            return this;
        }
        public TagTemplateFieldType build() {
            return new TagTemplateFieldType(enumType, primitiveType);
        }
    }
}
