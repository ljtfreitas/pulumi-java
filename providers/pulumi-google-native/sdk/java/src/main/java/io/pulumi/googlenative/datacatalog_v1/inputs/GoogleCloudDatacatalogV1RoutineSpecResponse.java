// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1RoutineSpecArgumentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specification that applies to a routine. Valid only for entries with the `ROUTINE` type.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecResponse Empty = new GoogleCloudDatacatalogV1RoutineSpecResponse();

    /**
     * Fields specific for BigQuery routines.
     * 
     */
    @InputImport(name="bigqueryRoutineSpec", required=true)
      private final GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec;

    public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse getBigqueryRoutineSpec() {
        return this.bigqueryRoutineSpec;
    }

    /**
     * The body of the routine.
     * 
     */
    @InputImport(name="definitionBody", required=true)
      private final String definitionBody;

    public String getDefinitionBody() {
        return this.definitionBody;
    }

    /**
     * The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
     * 
     */
    @InputImport(name="language", required=true)
      private final String language;

    public String getLanguage() {
        return this.language;
    }

    /**
     * Return type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @InputImport(name="returnType", required=true)
      private final String returnType;

    public String getReturnType() {
        return this.returnType;
    }

    /**
     * Arguments of the routine.
     * 
     */
    @InputImport(name="routineArguments", required=true)
      private final List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments;

    public List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> getRoutineArguments() {
        return this.routineArguments;
    }

    /**
     * The type of the routine.
     * 
     */
    @InputImport(name="routineType", required=true)
      private final String routineType;

    public String getRoutineType() {
        return this.routineType;
    }

    public GoogleCloudDatacatalogV1RoutineSpecResponse(
        GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec,
        String definitionBody,
        String language,
        String returnType,
        List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments,
        String routineType) {
        this.bigqueryRoutineSpec = Objects.requireNonNull(bigqueryRoutineSpec, "expected parameter 'bigqueryRoutineSpec' to be non-null");
        this.definitionBody = Objects.requireNonNull(definitionBody, "expected parameter 'definitionBody' to be non-null");
        this.language = Objects.requireNonNull(language, "expected parameter 'language' to be non-null");
        this.returnType = Objects.requireNonNull(returnType, "expected parameter 'returnType' to be non-null");
        this.routineArguments = Objects.requireNonNull(routineArguments, "expected parameter 'routineArguments' to be non-null");
        this.routineType = Objects.requireNonNull(routineType, "expected parameter 'routineType' to be non-null");
    }

    private GoogleCloudDatacatalogV1RoutineSpecResponse() {
        this.bigqueryRoutineSpec = null;
        this.definitionBody = null;
        this.language = null;
        this.returnType = null;
        this.routineArguments = List.of();
        this.routineType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec;
        private String definitionBody;
        private String language;
        private String returnType;
        private List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments;
        private String routineType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryRoutineSpec = defaults.bigqueryRoutineSpec;
    	      this.definitionBody = defaults.definitionBody;
    	      this.language = defaults.language;
    	      this.returnType = defaults.returnType;
    	      this.routineArguments = defaults.routineArguments;
    	      this.routineType = defaults.routineType;
        }

        public Builder setBigqueryRoutineSpec(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec) {
            this.bigqueryRoutineSpec = Objects.requireNonNull(bigqueryRoutineSpec);
            return this;
        }

        public Builder setDefinitionBody(String definitionBody) {
            this.definitionBody = Objects.requireNonNull(definitionBody);
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = Objects.requireNonNull(language);
            return this;
        }

        public Builder setReturnType(String returnType) {
            this.returnType = Objects.requireNonNull(returnType);
            return this;
        }

        public Builder setRoutineArguments(List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments) {
            this.routineArguments = Objects.requireNonNull(routineArguments);
            return this;
        }

        public Builder setRoutineType(String routineType) {
            this.routineType = Objects.requireNonNull(routineType);
            return this;
        }
        public GoogleCloudDatacatalogV1RoutineSpecResponse build() {
            return new GoogleCloudDatacatalogV1RoutineSpecResponse(bigqueryRoutineSpec, definitionBody, language, returnType, routineArguments, routineType);
        }
    }
}
