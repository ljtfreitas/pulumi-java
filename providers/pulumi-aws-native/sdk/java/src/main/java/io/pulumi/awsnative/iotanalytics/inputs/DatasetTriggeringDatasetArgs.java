// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetTriggeringDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetTriggeringDatasetArgs Empty = new DatasetTriggeringDatasetArgs();

    @Import(name="datasetName", required=true)
      private final Output<String> datasetName;

    public Output<String> getDatasetName() {
        return this.datasetName;
    }

    public DatasetTriggeringDatasetArgs(Output<String> datasetName) {
        this.datasetName = Objects.requireNonNull(datasetName, "expected parameter 'datasetName' to be non-null");
    }

    private DatasetTriggeringDatasetArgs() {
        this.datasetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTriggeringDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTriggeringDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
        }

        public Builder datasetName(Output<String> datasetName) {
            this.datasetName = Objects.requireNonNull(datasetName);
            return this;
        }

        public Builder datasetName(String datasetName) {
            this.datasetName = Output.of(Objects.requireNonNull(datasetName));
            return this;
        }
        public DatasetTriggeringDatasetArgs build() {
            return new DatasetTriggeringDatasetArgs(datasetName);
        }
    }
}
