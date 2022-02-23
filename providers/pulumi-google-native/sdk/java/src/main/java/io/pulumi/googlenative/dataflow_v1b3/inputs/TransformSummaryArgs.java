// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.enums.TransformSummaryKind;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DisplayDataArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of the type, names/ids, and input/outputs for a transform.
 * 
 */
public final class TransformSummaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransformSummaryArgs Empty = new TransformSummaryArgs();

    /**
     * Transform-specific display data.
     * 
     */
    @InputImport(name="displayData")
      private final @Nullable Input<List<DisplayDataArgs>> displayData;

    public Input<List<DisplayDataArgs>> getDisplayData() {
        return this.displayData == null ? Input.empty() : this.displayData;
    }

    /**
     * SDK generated id of this transform instance.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * User names for all collection inputs to this transform.
     * 
     */
    @InputImport(name="inputCollectionName")
      private final @Nullable Input<List<String>> inputCollectionName;

    public Input<List<String>> getInputCollectionName() {
        return this.inputCollectionName == null ? Input.empty() : this.inputCollectionName;
    }

    /**
     * Type of transform.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<TransformSummaryKind> kind;

    public Input<TransformSummaryKind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * User provided name for this transform instance.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * User names for all collection outputs to this transform.
     * 
     */
    @InputImport(name="outputCollectionName")
      private final @Nullable Input<List<String>> outputCollectionName;

    public Input<List<String>> getOutputCollectionName() {
        return this.outputCollectionName == null ? Input.empty() : this.outputCollectionName;
    }

    public TransformSummaryArgs(
        @Nullable Input<List<DisplayDataArgs>> displayData,
        @Nullable Input<String> id,
        @Nullable Input<List<String>> inputCollectionName,
        @Nullable Input<TransformSummaryKind> kind,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> outputCollectionName) {
        this.displayData = displayData;
        this.id = id;
        this.inputCollectionName = inputCollectionName;
        this.kind = kind;
        this.name = name;
        this.outputCollectionName = outputCollectionName;
    }

    private TransformSummaryArgs() {
        this.displayData = Input.empty();
        this.id = Input.empty();
        this.inputCollectionName = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.outputCollectionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformSummaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DisplayDataArgs>> displayData;
        private @Nullable Input<String> id;
        private @Nullable Input<List<String>> inputCollectionName;
        private @Nullable Input<TransformSummaryKind> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> outputCollectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformSummaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayData = defaults.displayData;
    	      this.id = defaults.id;
    	      this.inputCollectionName = defaults.inputCollectionName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputCollectionName = defaults.outputCollectionName;
        }

        public Builder setDisplayData(@Nullable Input<List<DisplayDataArgs>> displayData) {
            this.displayData = displayData;
            return this;
        }

        public Builder setDisplayData(@Nullable List<DisplayDataArgs> displayData) {
            this.displayData = Input.ofNullable(displayData);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setInputCollectionName(@Nullable Input<List<String>> inputCollectionName) {
            this.inputCollectionName = inputCollectionName;
            return this;
        }

        public Builder setInputCollectionName(@Nullable List<String> inputCollectionName) {
            this.inputCollectionName = Input.ofNullable(inputCollectionName);
            return this;
        }

        public Builder setKind(@Nullable Input<TransformSummaryKind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable TransformSummaryKind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOutputCollectionName(@Nullable Input<List<String>> outputCollectionName) {
            this.outputCollectionName = outputCollectionName;
            return this;
        }

        public Builder setOutputCollectionName(@Nullable List<String> outputCollectionName) {
            this.outputCollectionName = Input.ofNullable(outputCollectionName);
            return this;
        }
        public TransformSummaryArgs build() {
            return new TransformSummaryArgs(displayData, id, inputCollectionName, kind, name, outputCollectionName);
        }
    }
}
