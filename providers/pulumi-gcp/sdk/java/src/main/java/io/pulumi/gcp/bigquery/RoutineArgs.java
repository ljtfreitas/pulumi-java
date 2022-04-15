// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.bigquery.inputs.RoutineArgumentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoutineArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutineArgs Empty = new RoutineArgs();

    /**
     * Input/output argument of a function or a stored procedure.
     * Structure is documented below.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<List<RoutineArgumentArgs>> arguments;

    public Output<List<RoutineArgumentArgs>> arguments() {
        return this.arguments == null ? Codegen.empty() : this.arguments;
    }

    /**
     * The ID of the dataset containing this routine
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The body of the routine. For functions, this is the expression in the AS clause.
     * If language=SQL, it is the substring inside (but excluding) the parentheses.
     * 
     */
    @Import(name="definitionBody", required=true)
      private final Output<String> definitionBody;

    public Output<String> definitionBody() {
        return this.definitionBody;
    }

    /**
     * The description of the routine if defined.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The determinism level of the JavaScript UDF if defined.
     * Possible values are `DETERMINISM_LEVEL_UNSPECIFIED`, `DETERMINISTIC`, and `NOT_DETERMINISTIC`.
     * 
     */
    @Import(name="determinismLevel")
      private final @Nullable Output<String> determinismLevel;

    public Output<String> determinismLevel() {
        return this.determinismLevel == null ? Codegen.empty() : this.determinismLevel;
    }

    /**
     * Optional. If language = "JAVASCRIPT", this field stores the path of the
     * imported JAVASCRIPT libraries.
     * 
     */
    @Import(name="importedLibraries")
      private final @Nullable Output<List<String>> importedLibraries;

    public Output<List<String>> importedLibraries() {
        return this.importedLibraries == null ? Codegen.empty() : this.importedLibraries;
    }

    /**
     * The language of the routine.
     * Possible values are `SQL` and `JAVASCRIPT`.
     * 
     */
    @Import(name="language")
      private final @Nullable Output<String> language;

    public Output<String> language() {
        return this.language == null ? Codegen.empty() : this.language;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. Can be set only if routineType = "TABLE_VALUED_FUNCTION".
     * If absent, the return table type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the columns in the evaluated table result will
     * be cast to match the column types specificed in return table type, at query time.
     * 
     */
    @Import(name="returnTableType")
      private final @Nullable Output<String> returnTableType;

    public Output<String> returnTableType() {
        return this.returnTableType == null ? Codegen.empty() : this.returnTableType;
    }

    /**
     * A JSON schema for the return type. Optional if language = "SQL"; required otherwise.
     * If absent, the return type is inferred from definitionBody at query time in each query
     * that references this routine. If present, then the evaluated result will be cast to
     * the specified returned type at query time. ~>**NOTE**: Because this field expects a JSON
     * string, any changes to the string will create a diff, even if the JSON itself hasn't
     * changed. If the API returns a different value for the same schema, e.g. it switche
     * d the order of values or replaced STRUCT field type with RECORD field type, we currently
     * cannot suppress the recurring diff this causes. As a workaround, we recommend using
     * the schema as returned by the API.
     * 
     */
    @Import(name="returnType")
      private final @Nullable Output<String> returnType;

    public Output<String> returnType() {
        return this.returnType == null ? Codegen.empty() : this.returnType;
    }

    /**
     * The ID of the the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    @Import(name="routineId", required=true)
      private final Output<String> routineId;

    public Output<String> routineId() {
        return this.routineId;
    }

    /**
     * The type of routine.
     * Possible values are `SCALAR_FUNCTION`, `PROCEDURE`, and `TABLE_VALUED_FUNCTION`.
     * 
     */
    @Import(name="routineType")
      private final @Nullable Output<String> routineType;

    public Output<String> routineType() {
        return this.routineType == null ? Codegen.empty() : this.routineType;
    }

    public RoutineArgs(
        @Nullable Output<List<RoutineArgumentArgs>> arguments,
        Output<String> datasetId,
        Output<String> definitionBody,
        @Nullable Output<String> description,
        @Nullable Output<String> determinismLevel,
        @Nullable Output<List<String>> importedLibraries,
        @Nullable Output<String> language,
        @Nullable Output<String> project,
        @Nullable Output<String> returnTableType,
        @Nullable Output<String> returnType,
        Output<String> routineId,
        @Nullable Output<String> routineType) {
        this.arguments = arguments;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.definitionBody = Objects.requireNonNull(definitionBody, "expected parameter 'definitionBody' to be non-null");
        this.description = description;
        this.determinismLevel = determinismLevel;
        this.importedLibraries = importedLibraries;
        this.language = language;
        this.project = project;
        this.returnTableType = returnTableType;
        this.returnType = returnType;
        this.routineId = Objects.requireNonNull(routineId, "expected parameter 'routineId' to be non-null");
        this.routineType = routineType;
    }

    private RoutineArgs() {
        this.arguments = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.definitionBody = Codegen.empty();
        this.description = Codegen.empty();
        this.determinismLevel = Codegen.empty();
        this.importedLibraries = Codegen.empty();
        this.language = Codegen.empty();
        this.project = Codegen.empty();
        this.returnTableType = Codegen.empty();
        this.returnType = Codegen.empty();
        this.routineId = Codegen.empty();
        this.routineType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RoutineArgumentArgs>> arguments;
        private Output<String> datasetId;
        private Output<String> definitionBody;
        private @Nullable Output<String> description;
        private @Nullable Output<String> determinismLevel;
        private @Nullable Output<List<String>> importedLibraries;
        private @Nullable Output<String> language;
        private @Nullable Output<String> project;
        private @Nullable Output<String> returnTableType;
        private @Nullable Output<String> returnType;
        private Output<String> routineId;
        private @Nullable Output<String> routineType;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.datasetId = defaults.datasetId;
    	      this.definitionBody = defaults.definitionBody;
    	      this.description = defaults.description;
    	      this.determinismLevel = defaults.determinismLevel;
    	      this.importedLibraries = defaults.importedLibraries;
    	      this.language = defaults.language;
    	      this.project = defaults.project;
    	      this.returnTableType = defaults.returnTableType;
    	      this.returnType = defaults.returnType;
    	      this.routineId = defaults.routineId;
    	      this.routineType = defaults.routineType;
        }

        public Builder arguments(@Nullable Output<List<RoutineArgumentArgs>> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable List<RoutineArgumentArgs> arguments) {
            this.arguments = Codegen.ofNullable(arguments);
            return this;
        }
        public Builder arguments(RoutineArgumentArgs... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder definitionBody(Output<String> definitionBody) {
            this.definitionBody = Objects.requireNonNull(definitionBody);
            return this;
        }
        public Builder definitionBody(String definitionBody) {
            this.definitionBody = Output.of(Objects.requireNonNull(definitionBody));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder determinismLevel(@Nullable Output<String> determinismLevel) {
            this.determinismLevel = determinismLevel;
            return this;
        }
        public Builder determinismLevel(@Nullable String determinismLevel) {
            this.determinismLevel = Codegen.ofNullable(determinismLevel);
            return this;
        }
        public Builder importedLibraries(@Nullable Output<List<String>> importedLibraries) {
            this.importedLibraries = importedLibraries;
            return this;
        }
        public Builder importedLibraries(@Nullable List<String> importedLibraries) {
            this.importedLibraries = Codegen.ofNullable(importedLibraries);
            return this;
        }
        public Builder importedLibraries(String... importedLibraries) {
            return importedLibraries(List.of(importedLibraries));
        }
        public Builder language(@Nullable Output<String> language) {
            this.language = language;
            return this;
        }
        public Builder language(@Nullable String language) {
            this.language = Codegen.ofNullable(language);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder returnTableType(@Nullable Output<String> returnTableType) {
            this.returnTableType = returnTableType;
            return this;
        }
        public Builder returnTableType(@Nullable String returnTableType) {
            this.returnTableType = Codegen.ofNullable(returnTableType);
            return this;
        }
        public Builder returnType(@Nullable Output<String> returnType) {
            this.returnType = returnType;
            return this;
        }
        public Builder returnType(@Nullable String returnType) {
            this.returnType = Codegen.ofNullable(returnType);
            return this;
        }
        public Builder routineId(Output<String> routineId) {
            this.routineId = Objects.requireNonNull(routineId);
            return this;
        }
        public Builder routineId(String routineId) {
            this.routineId = Output.of(Objects.requireNonNull(routineId));
            return this;
        }
        public Builder routineType(@Nullable Output<String> routineType) {
            this.routineType = routineType;
            return this;
        }
        public Builder routineType(@Nullable String routineType) {
            this.routineType = Codegen.ofNullable(routineType);
            return this;
        }        public RoutineArgs build() {
            return new RoutineArgs(arguments, datasetId, definitionBody, description, determinismLevel, importedLibraries, language, project, returnTableType, returnType, routineId, routineType);
        }
    }
}
