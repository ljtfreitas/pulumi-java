// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Represents an intent parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3IntentParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3IntentParameterResponse Empty = new GoogleCloudDialogflowCxV3IntentParameterResponse();

    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    @Import(name="entityType", required=true)
      private final String entityType;

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    @Import(name="isList", required=true)
      private final Boolean isList;

    public Boolean getIsList() {
        return this.isList;
    }

    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    @Import(name="redact", required=true)
      private final Boolean redact;

    public Boolean getRedact() {
        return this.redact;
    }

    public GoogleCloudDialogflowCxV3IntentParameterResponse(
        String entityType,
        Boolean isList,
        Boolean redact) {
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.isList = Objects.requireNonNull(isList, "expected parameter 'isList' to be non-null");
        this.redact = Objects.requireNonNull(redact, "expected parameter 'redact' to be non-null");
    }

    private GoogleCloudDialogflowCxV3IntentParameterResponse() {
        this.entityType = null;
        this.isList = null;
        this.redact = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityType;
        private Boolean isList;
        private Boolean redact;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
        }

        public Builder entityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder isList(Boolean isList) {
            this.isList = Objects.requireNonNull(isList);
            return this;
        }

        public Builder redact(Boolean redact) {
            this.redact = Objects.requireNonNull(redact);
            return this;
        }
        public GoogleCloudDialogflowCxV3IntentParameterResponse build() {
            return new GoogleCloudDialogflowCxV3IntentParameterResponse(entityType, isList, redact);
        }
    }
}
