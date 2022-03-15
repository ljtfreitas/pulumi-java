// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1RoutineSpecArgumentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1RoutineSpecResponse {
    /**
     * Fields specific for BigQuery routines.
     * 
     */
    private final GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec;
    /**
     * The body of the routine.
     * 
     */
    private final String definitionBody;
    /**
     * The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
     * 
     */
    private final String language;
    /**
     * Return type of the argument. The exact value depends on the source system and the language.
     * 
     */
    private final String returnType;
    /**
     * Arguments of the routine.
     * 
     */
    private final List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments;
    /**
     * The type of the routine.
     * 
     */
    private final String routineType;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1RoutineSpecResponse(
        @CustomType.Parameter("bigqueryRoutineSpec") GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec,
        @CustomType.Parameter("definitionBody") String definitionBody,
        @CustomType.Parameter("language") String language,
        @CustomType.Parameter("returnType") String returnType,
        @CustomType.Parameter("routineArguments") List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments,
        @CustomType.Parameter("routineType") String routineType) {
        this.bigqueryRoutineSpec = bigqueryRoutineSpec;
        this.definitionBody = definitionBody;
        this.language = language;
        this.returnType = returnType;
        this.routineArguments = routineArguments;
        this.routineType = routineType;
    }

    /**
     * Fields specific for BigQuery routines.
     * 
    */
    public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse getBigqueryRoutineSpec() {
        return this.bigqueryRoutineSpec;
    }
    /**
     * The body of the routine.
     * 
    */
    public String getDefinitionBody() {
        return this.definitionBody;
    }
    /**
     * The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
     * 
    */
    public String getLanguage() {
        return this.language;
    }
    /**
     * Return type of the argument. The exact value depends on the source system and the language.
     * 
    */
    public String getReturnType() {
        return this.returnType;
    }
    /**
     * Arguments of the routine.
     * 
    */
    public List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> getRoutineArguments() {
        return this.routineArguments;
    }
    /**
     * The type of the routine.
     * 
    */
    public String getRoutineType() {
        return this.routineType;
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

        public Builder bigqueryRoutineSpec(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse bigqueryRoutineSpec) {
            this.bigqueryRoutineSpec = Objects.requireNonNull(bigqueryRoutineSpec);
            return this;
        }

        public Builder definitionBody(String definitionBody) {
            this.definitionBody = Objects.requireNonNull(definitionBody);
            return this;
        }

        public Builder language(String language) {
            this.language = Objects.requireNonNull(language);
            return this;
        }

        public Builder returnType(String returnType) {
            this.returnType = Objects.requireNonNull(returnType);
            return this;
        }

        public Builder routineArguments(List<GoogleCloudDatacatalogV1RoutineSpecArgumentResponse> routineArguments) {
            this.routineArguments = Objects.requireNonNull(routineArguments);
            return this;
        }

        public Builder routineType(String routineType) {
            this.routineType = Objects.requireNonNull(routineType);
            return this;
        }
        public GoogleCloudDatacatalogV1RoutineSpecResponse build() {
            return new GoogleCloudDatacatalogV1RoutineSpecResponse(bigqueryRoutineSpec, definitionBody, language, returnType, routineArguments, routineType);
        }
    }
}
