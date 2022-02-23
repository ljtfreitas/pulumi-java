// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMappingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceColumnConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceColumnConfigurationArgs Empty = new DataSourceColumnConfigurationArgs();

    @InputImport(name="changeDetectingColumns", required=true)
        private final Input<List<String>> changeDetectingColumns;

    public Input<List<String>> getChangeDetectingColumns() {
        return this.changeDetectingColumns;
    }

    @InputImport(name="documentDataColumnName", required=true)
        private final Input<String> documentDataColumnName;

    public Input<String> getDocumentDataColumnName() {
        return this.documentDataColumnName;
    }

    @InputImport(name="documentIdColumnName", required=true)
        private final Input<String> documentIdColumnName;

    public Input<String> getDocumentIdColumnName() {
        return this.documentIdColumnName;
    }

    @InputImport(name="documentTitleColumnName")
        private final @Nullable Input<String> documentTitleColumnName;

    public Input<String> getDocumentTitleColumnName() {
        return this.documentTitleColumnName == null ? Input.empty() : this.documentTitleColumnName;
    }

    @InputImport(name="fieldMappings")
        private final @Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

    public Input<List<DataSourceToIndexFieldMappingArgs>> getFieldMappings() {
        return this.fieldMappings == null ? Input.empty() : this.fieldMappings;
    }

    public DataSourceColumnConfigurationArgs(
        Input<List<String>> changeDetectingColumns,
        Input<String> documentDataColumnName,
        Input<String> documentIdColumnName,
        @Nullable Input<String> documentTitleColumnName,
        @Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings) {
        this.changeDetectingColumns = Objects.requireNonNull(changeDetectingColumns, "expected parameter 'changeDetectingColumns' to be non-null");
        this.documentDataColumnName = Objects.requireNonNull(documentDataColumnName, "expected parameter 'documentDataColumnName' to be non-null");
        this.documentIdColumnName = Objects.requireNonNull(documentIdColumnName, "expected parameter 'documentIdColumnName' to be non-null");
        this.documentTitleColumnName = documentTitleColumnName;
        this.fieldMappings = fieldMappings;
    }

    private DataSourceColumnConfigurationArgs() {
        this.changeDetectingColumns = Input.empty();
        this.documentDataColumnName = Input.empty();
        this.documentIdColumnName = Input.empty();
        this.documentTitleColumnName = Input.empty();
        this.fieldMappings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceColumnConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> changeDetectingColumns;
        private Input<String> documentDataColumnName;
        private Input<String> documentIdColumnName;
        private @Nullable Input<String> documentTitleColumnName;
        private @Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceColumnConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeDetectingColumns = defaults.changeDetectingColumns;
    	      this.documentDataColumnName = defaults.documentDataColumnName;
    	      this.documentIdColumnName = defaults.documentIdColumnName;
    	      this.documentTitleColumnName = defaults.documentTitleColumnName;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder setChangeDetectingColumns(Input<List<String>> changeDetectingColumns) {
            this.changeDetectingColumns = Objects.requireNonNull(changeDetectingColumns);
            return this;
        }

        public Builder setChangeDetectingColumns(List<String> changeDetectingColumns) {
            this.changeDetectingColumns = Input.of(Objects.requireNonNull(changeDetectingColumns));
            return this;
        }

        public Builder setDocumentDataColumnName(Input<String> documentDataColumnName) {
            this.documentDataColumnName = Objects.requireNonNull(documentDataColumnName);
            return this;
        }

        public Builder setDocumentDataColumnName(String documentDataColumnName) {
            this.documentDataColumnName = Input.of(Objects.requireNonNull(documentDataColumnName));
            return this;
        }

        public Builder setDocumentIdColumnName(Input<String> documentIdColumnName) {
            this.documentIdColumnName = Objects.requireNonNull(documentIdColumnName);
            return this;
        }

        public Builder setDocumentIdColumnName(String documentIdColumnName) {
            this.documentIdColumnName = Input.of(Objects.requireNonNull(documentIdColumnName));
            return this;
        }

        public Builder setDocumentTitleColumnName(@Nullable Input<String> documentTitleColumnName) {
            this.documentTitleColumnName = documentTitleColumnName;
            return this;
        }

        public Builder setDocumentTitleColumnName(@Nullable String documentTitleColumnName) {
            this.documentTitleColumnName = Input.ofNullable(documentTitleColumnName);
            return this;
        }

        public Builder setFieldMappings(@Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMappingArgs> fieldMappings) {
            this.fieldMappings = Input.ofNullable(fieldMappings);
            return this;
        }
        public DataSourceColumnConfigurationArgs build() {
            return new DataSourceColumnConfigurationArgs(changeDetectingColumns, documentDataColumnName, documentIdColumnName, documentTitleColumnName, fieldMappings);
        }
    }
}
