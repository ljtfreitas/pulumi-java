// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SchemaComparisonValidationResultTypeResponse;
import io.pulumi.azurenative.datamigration.inputs.ValidationErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Results for schema comparison between the source and target
 * 
 */
public final class SchemaComparisonValidationResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchemaComparisonValidationResultResponse Empty = new SchemaComparisonValidationResultResponse();

    /**
     * List of schema differences between the source and target databases
     * 
     */
    @InputImport(name="schemaDifferences", required=true)
        private final SchemaComparisonValidationResultTypeResponse schemaDifferences;

    public SchemaComparisonValidationResultTypeResponse getSchemaDifferences() {
        return this.schemaDifferences;
    }

    /**
     * Count of source database objects
     * 
     */
    @InputImport(name="sourceDatabaseObjectCount")
        private final @Nullable Map<String,Double> sourceDatabaseObjectCount;

    public Map<String,Double> getSourceDatabaseObjectCount() {
        return this.sourceDatabaseObjectCount == null ? Map.of() : this.sourceDatabaseObjectCount;
    }

    /**
     * Count of target database objects
     * 
     */
    @InputImport(name="targetDatabaseObjectCount")
        private final @Nullable Map<String,Double> targetDatabaseObjectCount;

    public Map<String,Double> getTargetDatabaseObjectCount() {
        return this.targetDatabaseObjectCount == null ? Map.of() : this.targetDatabaseObjectCount;
    }

    /**
     * List of errors that happened while performing schema compare validation
     * 
     */
    @InputImport(name="validationErrors", required=true)
        private final ValidationErrorResponse validationErrors;

    public ValidationErrorResponse getValidationErrors() {
        return this.validationErrors;
    }

    public SchemaComparisonValidationResultResponse(
        SchemaComparisonValidationResultTypeResponse schemaDifferences,
        @Nullable Map<String,Double> sourceDatabaseObjectCount,
        @Nullable Map<String,Double> targetDatabaseObjectCount,
        ValidationErrorResponse validationErrors) {
        this.schemaDifferences = Objects.requireNonNull(schemaDifferences, "expected parameter 'schemaDifferences' to be non-null");
        this.sourceDatabaseObjectCount = sourceDatabaseObjectCount;
        this.targetDatabaseObjectCount = targetDatabaseObjectCount;
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private SchemaComparisonValidationResultResponse() {
        this.schemaDifferences = null;
        this.sourceDatabaseObjectCount = Map.of();
        this.targetDatabaseObjectCount = Map.of();
        this.validationErrors = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaComparisonValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaComparisonValidationResultTypeResponse schemaDifferences;
        private @Nullable Map<String,Double> sourceDatabaseObjectCount;
        private @Nullable Map<String,Double> targetDatabaseObjectCount;
        private ValidationErrorResponse validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaComparisonValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaDifferences = defaults.schemaDifferences;
    	      this.sourceDatabaseObjectCount = defaults.sourceDatabaseObjectCount;
    	      this.targetDatabaseObjectCount = defaults.targetDatabaseObjectCount;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setSchemaDifferences(SchemaComparisonValidationResultTypeResponse schemaDifferences) {
            this.schemaDifferences = Objects.requireNonNull(schemaDifferences);
            return this;
        }

        public Builder setSourceDatabaseObjectCount(@Nullable Map<String,Double> sourceDatabaseObjectCount) {
            this.sourceDatabaseObjectCount = sourceDatabaseObjectCount;
            return this;
        }

        public Builder setTargetDatabaseObjectCount(@Nullable Map<String,Double> targetDatabaseObjectCount) {
            this.targetDatabaseObjectCount = targetDatabaseObjectCount;
            return this;
        }

        public Builder setValidationErrors(ValidationErrorResponse validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public SchemaComparisonValidationResultResponse build() {
            return new SchemaComparisonValidationResultResponse(schemaDifferences, sourceDatabaseObjectCount, targetDatabaseObjectCount, validationErrors);
        }
    }
}
