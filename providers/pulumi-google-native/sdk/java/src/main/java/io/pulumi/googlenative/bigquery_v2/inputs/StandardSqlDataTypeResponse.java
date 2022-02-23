// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.StandardSqlStructTypeResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The data type of a variable such as a function argument. Examples include: * INT64: `{"typeKind": "INT64"}` * ARRAY: { "typeKind": "ARRAY", "arrayElementType": {"typeKind": "STRING"} } * STRUCT>: { "typeKind": "STRUCT", "structType": { "fields": [ { "name": "x", "type": {"typeKind: "STRING"} }, { "name": "y", "type": { "typeKind": "ARRAY", "arrayElementType": {"typekind": "DATE"} } } ] } }
 * 
 */
public final class StandardSqlDataTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final StandardSqlDataTypeResponse Empty = new StandardSqlDataTypeResponse();

    /**
     * The type of the array's elements, if type_kind = "ARRAY".
     * 
     */
    @InputImport(name="arrayElementType", required=true)
      private final StandardSqlDataTypeResponse arrayElementType;

    public StandardSqlDataTypeResponse getArrayElementType() {
        return this.arrayElementType;
    }

    /**
     * The fields of this struct, in order, if type_kind = "STRUCT".
     * 
     */
    @InputImport(name="structType", required=true)
      private final StandardSqlStructTypeResponse structType;

    public StandardSqlStructTypeResponse getStructType() {
        return this.structType;
    }

    /**
     * The top level type of this field. Can be any standard SQL data type (e.g., "INT64", "DATE", "ARRAY").
     * 
     */
    @InputImport(name="typeKind", required=true)
      private final String typeKind;

    public String getTypeKind() {
        return this.typeKind;
    }

    public StandardSqlDataTypeResponse(
        StandardSqlDataTypeResponse arrayElementType,
        StandardSqlStructTypeResponse structType,
        String typeKind) {
        this.arrayElementType = Objects.requireNonNull(arrayElementType, "expected parameter 'arrayElementType' to be non-null");
        this.structType = Objects.requireNonNull(structType, "expected parameter 'structType' to be non-null");
        this.typeKind = Objects.requireNonNull(typeKind, "expected parameter 'typeKind' to be non-null");
    }

    private StandardSqlDataTypeResponse() {
        this.arrayElementType = null;
        this.structType = null;
        this.typeKind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlDataTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardSqlDataTypeResponse arrayElementType;
        private StandardSqlStructTypeResponse structType;
        private String typeKind;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlDataTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayElementType = defaults.arrayElementType;
    	      this.structType = defaults.structType;
    	      this.typeKind = defaults.typeKind;
        }

        public Builder setArrayElementType(StandardSqlDataTypeResponse arrayElementType) {
            this.arrayElementType = Objects.requireNonNull(arrayElementType);
            return this;
        }

        public Builder setStructType(StandardSqlStructTypeResponse structType) {
            this.structType = Objects.requireNonNull(structType);
            return this;
        }

        public Builder setTypeKind(String typeKind) {
            this.typeKind = Objects.requireNonNull(typeKind);
            return this;
        }
        public StandardSqlDataTypeResponse build() {
            return new StandardSqlDataTypeResponse(arrayElementType, structType, typeKind);
        }
    }
}
