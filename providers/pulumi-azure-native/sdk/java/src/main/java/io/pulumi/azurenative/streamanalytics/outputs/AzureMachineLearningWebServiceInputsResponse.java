// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.AzureMachineLearningWebServiceInputColumnResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureMachineLearningWebServiceInputsResponse {
    /**
     * A list of input columns for the Azure Machine Learning web service endpoint.
     * 
     */
    private final @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames;
    /**
     * The name of the input. This is the name provided while authoring the endpoint.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"columnNames","name"})
    private AzureMachineLearningWebServiceInputsResponse(
        @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames,
        @Nullable String name) {
        this.columnNames = columnNames;
        this.name = name;
    }

    /**
     * A list of input columns for the Azure Machine Learning web service endpoint.
     * 
     */
    public List<AzureMachineLearningWebServiceInputColumnResponse> getColumnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }
    /**
     * The name of the input. This is the name provided while authoring the endpoint.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceInputsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceInputsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnNames = defaults.columnNames;
    	      this.name = defaults.name;
        }

        public Builder setColumnNames(@Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames) {
            this.columnNames = columnNames;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public AzureMachineLearningWebServiceInputsResponse build() {
            return new AzureMachineLearningWebServiceInputsResponse(columnNames, name);
        }
    }
}
