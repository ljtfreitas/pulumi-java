// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BigtableColumnResponse {
    /**
     * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level. However, the setting at this level takes precedence if 'encoding' is set at both levels.
     * 
     */
    private final String encoding;
    /**
     * [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
     * 
     */
    private final String fieldName;
    /**
     * [Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level. However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.
     * 
     */
    private final Boolean onlyReadLatest;
    /**
     * [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.
     * 
     */
    private final String qualifierEncoded;
    private final String qualifierString;
    /**
     * [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private BigtableColumnResponse(
        @CustomType.Parameter("encoding") String encoding,
        @CustomType.Parameter("fieldName") String fieldName,
        @CustomType.Parameter("onlyReadLatest") Boolean onlyReadLatest,
        @CustomType.Parameter("qualifierEncoded") String qualifierEncoded,
        @CustomType.Parameter("qualifierString") String qualifierString,
        @CustomType.Parameter("type") String type) {
        this.encoding = encoding;
        this.fieldName = fieldName;
        this.onlyReadLatest = onlyReadLatest;
        this.qualifierEncoded = qualifierEncoded;
        this.qualifierString = qualifierString;
        this.type = type;
    }

    /**
     * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level. However, the setting at this level takes precedence if 'encoding' is set at both levels.
     * 
    */
    public String getEncoding() {
        return this.encoding;
    }
    /**
     * [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
     * 
    */
    public String getFieldName() {
        return this.fieldName;
    }
    /**
     * [Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level. However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.
     * 
    */
    public Boolean getOnlyReadLatest() {
        return this.onlyReadLatest;
    }
    /**
     * [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.
     * 
    */
    public String getQualifierEncoded() {
        return this.qualifierEncoded;
    }
    public String getQualifierString() {
        return this.qualifierString;
    }
    /**
     * [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigtableColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String encoding;
        private String fieldName;
        private Boolean onlyReadLatest;
        private String qualifierEncoded;
        private String qualifierString;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BigtableColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fieldName = defaults.fieldName;
    	      this.onlyReadLatest = defaults.onlyReadLatest;
    	      this.qualifierEncoded = defaults.qualifierEncoded;
    	      this.qualifierString = defaults.qualifierString;
    	      this.type = defaults.type;
        }

        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }

        public Builder onlyReadLatest(Boolean onlyReadLatest) {
            this.onlyReadLatest = Objects.requireNonNull(onlyReadLatest);
            return this;
        }

        public Builder qualifierEncoded(String qualifierEncoded) {
            this.qualifierEncoded = Objects.requireNonNull(qualifierEncoded);
            return this;
        }

        public Builder qualifierString(String qualifierString) {
            this.qualifierString = Objects.requireNonNull(qualifierString);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BigtableColumnResponse build() {
            return new BigtableColumnResponse(encoding, fieldName, onlyReadLatest, qualifierEncoded, qualifierString, type);
        }
    }
}
