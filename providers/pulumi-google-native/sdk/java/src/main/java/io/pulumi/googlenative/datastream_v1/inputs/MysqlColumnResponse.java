// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * MySQL Column.
 * 
 */
public final class MysqlColumnResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlColumnResponse Empty = new MysqlColumnResponse();

    /**
     * Column collation.
     * 
     */
    @Import(name="collation", required=true)
      private final String collation;

    public String getCollation() {
        return this.collation;
    }

    /**
     * Column name.
     * 
     */
    @Import(name="column", required=true)
      private final String column;

    public String getColumn() {
        return this.column;
    }

    /**
     * The MySQL data type. Full data types list can be found here: https://dev.mysql.com/doc/refman/8.0/en/data-types.html
     * 
     */
    @Import(name="dataType", required=true)
      private final String dataType;

    public String getDataType() {
        return this.dataType;
    }

    /**
     * Column length.
     * 
     */
    @Import(name="length", required=true)
      private final Integer length;

    public Integer getLength() {
        return this.length;
    }

    /**
     * Whether or not the column can accept a null value.
     * 
     */
    @Import(name="nullable", required=true)
      private final Boolean nullable;

    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * The ordinal position of the column in the table.
     * 
     */
    @Import(name="ordinalPosition", required=true)
      private final Integer ordinalPosition;

    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Whether or not the column represents a primary key.
     * 
     */
    @Import(name="primaryKey", required=true)
      private final Boolean primaryKey;

    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    public MysqlColumnResponse(
        String collation,
        String column,
        String dataType,
        Integer length,
        Boolean nullable,
        Integer ordinalPosition,
        Boolean primaryKey) {
        this.collation = Objects.requireNonNull(collation, "expected parameter 'collation' to be non-null");
        this.column = Objects.requireNonNull(column, "expected parameter 'column' to be non-null");
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.length = Objects.requireNonNull(length, "expected parameter 'length' to be non-null");
        this.nullable = Objects.requireNonNull(nullable, "expected parameter 'nullable' to be non-null");
        this.ordinalPosition = Objects.requireNonNull(ordinalPosition, "expected parameter 'ordinalPosition' to be non-null");
        this.primaryKey = Objects.requireNonNull(primaryKey, "expected parameter 'primaryKey' to be non-null");
    }

    private MysqlColumnResponse() {
        this.collation = null;
        this.column = null;
        this.dataType = null;
        this.length = null;
        this.nullable = null;
        this.ordinalPosition = null;
        this.primaryKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collation;
        private String column;
        private String dataType;
        private Integer length;
        private Boolean nullable;
        private Integer ordinalPosition;
        private Boolean primaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.column = defaults.column;
    	      this.dataType = defaults.dataType;
    	      this.length = defaults.length;
    	      this.nullable = defaults.nullable;
    	      this.ordinalPosition = defaults.ordinalPosition;
    	      this.primaryKey = defaults.primaryKey;
        }

        public Builder collation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }

        public Builder column(String column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder dataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder length(Integer length) {
            this.length = Objects.requireNonNull(length);
            return this;
        }

        public Builder nullable(Boolean nullable) {
            this.nullable = Objects.requireNonNull(nullable);
            return this;
        }

        public Builder ordinalPosition(Integer ordinalPosition) {
            this.ordinalPosition = Objects.requireNonNull(ordinalPosition);
            return this;
        }

        public Builder primaryKey(Boolean primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public MysqlColumnResponse build() {
            return new MysqlColumnResponse(collation, column, dataType, length, nullable, ordinalPosition, primaryKey);
        }
    }
}
