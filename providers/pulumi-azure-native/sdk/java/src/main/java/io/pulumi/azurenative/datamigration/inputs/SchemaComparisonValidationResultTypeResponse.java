// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Description about the errors happen while performing migration validation
 * 
 */
public final class SchemaComparisonValidationResultTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchemaComparisonValidationResultTypeResponse Empty = new SchemaComparisonValidationResultTypeResponse();

    /**
     * Name of the object that has the difference
     * 
     */
    @InputImport(name="objectName", required=true)
        private final String objectName;

    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Type of the object that has the difference. e.g (Table/View/StoredProcedure)
     * 
     */
    @InputImport(name="objectType", required=true)
        private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Update action type with respect to target
     * 
     */
    @InputImport(name="updateAction", required=true)
        private final String updateAction;

    public String getUpdateAction() {
        return this.updateAction;
    }

    public SchemaComparisonValidationResultTypeResponse(
        String objectName,
        String objectType,
        String updateAction) {
        this.objectName = Objects.requireNonNull(objectName, "expected parameter 'objectName' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.updateAction = Objects.requireNonNull(updateAction, "expected parameter 'updateAction' to be non-null");
    }

    private SchemaComparisonValidationResultTypeResponse() {
        this.objectName = null;
        this.objectType = null;
        this.updateAction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaComparisonValidationResultTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectName;
        private String objectType;
        private String updateAction;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaComparisonValidationResultTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectName = defaults.objectName;
    	      this.objectType = defaults.objectType;
    	      this.updateAction = defaults.updateAction;
        }

        public Builder setObjectName(String objectName) {
            this.objectName = Objects.requireNonNull(objectName);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setUpdateAction(String updateAction) {
            this.updateAction = Objects.requireNonNull(updateAction);
            return this;
        }
        public SchemaComparisonValidationResultTypeResponse build() {
            return new SchemaComparisonValidationResultTypeResponse(objectName, objectType, updateAction);
        }
    }
}
