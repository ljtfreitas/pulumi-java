// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.TableFieldSchemaCategoriesArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableFieldSchemaPolicyTagsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableFieldSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableFieldSchemaArgs Empty = new TableFieldSchemaArgs();

    /**
     * [Optional] The categories attached to this field, used for field-level access control.
     * 
     */
    @Import(name="categories")
      private final @Nullable Output<TableFieldSchemaCategoriesArgs> categories;

    public Output<TableFieldSchemaCategoriesArgs> getCategories() {
        return this.categories == null ? Output.empty() : this.categories;
    }

    /**
     * Optional. Collation specification of the field. It only can be set on string type field.
     * 
     */
    @Import(name="collationSpec")
      private final @Nullable Output<String> collationSpec;

    public Output<String> getCollationSpec() {
        return this.collationSpec == null ? Output.empty() : this.collationSpec;
    }

    /**
     * [Optional] The field description. The maximum length is 1,024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * [Optional] Describes the nested schema fields if the type property is set to RECORD.
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<TableFieldSchemaArgs>> fields;

    public Output<List<TableFieldSchemaArgs>> getFields() {
        return this.fields == null ? Output.empty() : this.fields;
    }

    /**
     * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not specified, no maximum length constraint is imposed on this field. If type = "STRING", then max_length represents the maximum UTF-8 length of strings in this field. If type = "BYTES", then max_length represents the maximum number of bytes in this field. It is invalid to set this field if type ≠ "STRING" and ≠ "BYTES".
     * 
     */
    @Import(name="maxLength")
      private final @Nullable Output<String> maxLength;

    public Output<String> getMaxLength() {
        return this.maxLength == null ? Output.empty() : this.maxLength;
    }

    /**
     * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 300 characters.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="policyTags")
      private final @Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags;

    public Output<TableFieldSchemaPolicyTagsArgs> getPolicyTags() {
        return this.policyTags == null ? Output.empty() : this.policyTags;
    }

    /**
     * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of digits in the fractional part in base 10) constraints for values of this field for NUMERIC or BIGNUMERIC. It is invalid to set precision or scale if type ≠ "NUMERIC" and ≠ "BIGNUMERIC". If precision and scale are not specified, no value range constraint is imposed on this field insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S] - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero): [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type = "NUMERIC": 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = "BIGNUMERIC": 1 ≤ precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is specified but not scale (and thus scale is interpreted to be equal to zero): - If type = "NUMERIC": 1 ≤ precision ≤ 29. - If type = "BIGNUMERIC": 1 ≤ precision ≤ 38. If scale is specified but not precision, then it is invalid.
     * 
     */
    @Import(name="precision")
      private final @Nullable Output<String> precision;

    public Output<String> getPrecision() {
        return this.precision == null ? Output.empty() : this.precision;
    }

    /**
     * [Optional] See documentation for precision.
     * 
     */
    @Import(name="scale")
      private final @Nullable Output<String> scale;

    public Output<String> getScale() {
        return this.scale == null ? Output.empty() : this.scale;
    }

    /**
     * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public TableFieldSchemaArgs(
        @Nullable Output<TableFieldSchemaCategoriesArgs> categories,
        @Nullable Output<String> collationSpec,
        @Nullable Output<String> description,
        @Nullable Output<List<TableFieldSchemaArgs>> fields,
        @Nullable Output<String> maxLength,
        @Nullable Output<String> mode,
        @Nullable Output<String> name,
        @Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags,
        @Nullable Output<String> precision,
        @Nullable Output<String> scale,
        @Nullable Output<String> type) {
        this.categories = categories;
        this.collationSpec = collationSpec;
        this.description = description;
        this.fields = fields;
        this.maxLength = maxLength;
        this.mode = mode;
        this.name = name;
        this.policyTags = policyTags;
        this.precision = precision;
        this.scale = scale;
        this.type = type;
    }

    private TableFieldSchemaArgs() {
        this.categories = Output.empty();
        this.collationSpec = Output.empty();
        this.description = Output.empty();
        this.fields = Output.empty();
        this.maxLength = Output.empty();
        this.mode = Output.empty();
        this.name = Output.empty();
        this.policyTags = Output.empty();
        this.precision = Output.empty();
        this.scale = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TableFieldSchemaCategoriesArgs> categories;
        private @Nullable Output<String> collationSpec;
        private @Nullable Output<String> description;
        private @Nullable Output<List<TableFieldSchemaArgs>> fields;
        private @Nullable Output<String> maxLength;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> name;
        private @Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags;
        private @Nullable Output<String> precision;
        private @Nullable Output<String> scale;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.collationSpec = defaults.collationSpec;
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.maxLength = defaults.maxLength;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.policyTags = defaults.policyTags;
    	      this.precision = defaults.precision;
    	      this.scale = defaults.scale;
    	      this.type = defaults.type;
        }

        public Builder categories(@Nullable Output<TableFieldSchemaCategoriesArgs> categories) {
            this.categories = categories;
            return this;
        }

        public Builder categories(@Nullable TableFieldSchemaCategoriesArgs categories) {
            this.categories = Output.ofNullable(categories);
            return this;
        }

        public Builder collationSpec(@Nullable Output<String> collationSpec) {
            this.collationSpec = collationSpec;
            return this;
        }

        public Builder collationSpec(@Nullable String collationSpec) {
            this.collationSpec = Output.ofNullable(collationSpec);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder fields(@Nullable Output<List<TableFieldSchemaArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(@Nullable List<TableFieldSchemaArgs> fields) {
            this.fields = Output.ofNullable(fields);
            return this;
        }

        public Builder maxLength(@Nullable Output<String> maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        public Builder maxLength(@Nullable String maxLength) {
            this.maxLength = Output.ofNullable(maxLength);
            return this;
        }

        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
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

        public Builder policyTags(@Nullable Output<TableFieldSchemaPolicyTagsArgs> policyTags) {
            this.policyTags = policyTags;
            return this;
        }

        public Builder policyTags(@Nullable TableFieldSchemaPolicyTagsArgs policyTags) {
            this.policyTags = Output.ofNullable(policyTags);
            return this;
        }

        public Builder precision(@Nullable Output<String> precision) {
            this.precision = precision;
            return this;
        }

        public Builder precision(@Nullable String precision) {
            this.precision = Output.ofNullable(precision);
            return this;
        }

        public Builder scale(@Nullable Output<String> scale) {
            this.scale = scale;
            return this;
        }

        public Builder scale(@Nullable String scale) {
            this.scale = Output.ofNullable(scale);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public TableFieldSchemaArgs build() {
            return new TableFieldSchemaArgs(categories, collationSpec, description, fields, maxLength, mode, name, policyTags, precision, scale, type);
        }
    }
}
