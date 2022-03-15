// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dataflow_v1b3.outputs.DisplayDataResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TransformSummaryResponse {
    /**
     * Transform-specific display data.
     * 
     */
    private final List<DisplayDataResponse> displayData;
    /**
     * User names for all collection inputs to this transform.
     * 
     */
    private final List<String> inputCollectionName;
    /**
     * Type of transform.
     * 
     */
    private final String kind;
    /**
     * User provided name for this transform instance.
     * 
     */
    private final String name;
    /**
     * User names for all collection outputs to this transform.
     * 
     */
    private final List<String> outputCollectionName;

    @CustomType.Constructor
    private TransformSummaryResponse(
        @CustomType.Parameter("displayData") List<DisplayDataResponse> displayData,
        @CustomType.Parameter("inputCollectionName") List<String> inputCollectionName,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outputCollectionName") List<String> outputCollectionName) {
        this.displayData = displayData;
        this.inputCollectionName = inputCollectionName;
        this.kind = kind;
        this.name = name;
        this.outputCollectionName = outputCollectionName;
    }

    /**
     * Transform-specific display data.
     * 
    */
    public List<DisplayDataResponse> getDisplayData() {
        return this.displayData;
    }
    /**
     * User names for all collection inputs to this transform.
     * 
    */
    public List<String> getInputCollectionName() {
        return this.inputCollectionName;
    }
    /**
     * Type of transform.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * User provided name for this transform instance.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * User names for all collection outputs to this transform.
     * 
    */
    public List<String> getOutputCollectionName() {
        return this.outputCollectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DisplayDataResponse> displayData;
        private List<String> inputCollectionName;
        private String kind;
        private String name;
        private List<String> outputCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayData = defaults.displayData;
    	      this.inputCollectionName = defaults.inputCollectionName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputCollectionName = defaults.outputCollectionName;
        }

        public Builder displayData(List<DisplayDataResponse> displayData) {
            this.displayData = Objects.requireNonNull(displayData);
            return this;
        }

        public Builder inputCollectionName(List<String> inputCollectionName) {
            this.inputCollectionName = Objects.requireNonNull(inputCollectionName);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder outputCollectionName(List<String> outputCollectionName) {
            this.outputCollectionName = Objects.requireNonNull(outputCollectionName);
            return this;
        }
        public TransformSummaryResponse build() {
            return new TransformSummaryResponse(displayData, inputCollectionName, kind, name, outputCollectionName);
        }
    }
}
