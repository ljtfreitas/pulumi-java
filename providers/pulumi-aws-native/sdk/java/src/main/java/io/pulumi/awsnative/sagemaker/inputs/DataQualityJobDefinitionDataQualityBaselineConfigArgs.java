// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionConstraintsResourceArgs;
import io.pulumi.awsnative.sagemaker.inputs.DataQualityJobDefinitionStatisticsResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Baseline configuration used to validate that the data conforms to the specified constraints and statistics.
 * 
 */
public final class DataQualityJobDefinitionDataQualityBaselineConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionDataQualityBaselineConfigArgs Empty = new DataQualityJobDefinitionDataQualityBaselineConfigArgs();

    @Import(name="baseliningJobName")
      private final @Nullable Output<String> baseliningJobName;

    public Output<String> getBaseliningJobName() {
        return this.baseliningJobName == null ? Output.empty() : this.baseliningJobName;
    }

    @Import(name="constraintsResource")
      private final @Nullable Output<DataQualityJobDefinitionConstraintsResourceArgs> constraintsResource;

    public Output<DataQualityJobDefinitionConstraintsResourceArgs> getConstraintsResource() {
        return this.constraintsResource == null ? Output.empty() : this.constraintsResource;
    }

    @Import(name="statisticsResource")
      private final @Nullable Output<DataQualityJobDefinitionStatisticsResourceArgs> statisticsResource;

    public Output<DataQualityJobDefinitionStatisticsResourceArgs> getStatisticsResource() {
        return this.statisticsResource == null ? Output.empty() : this.statisticsResource;
    }

    public DataQualityJobDefinitionDataQualityBaselineConfigArgs(
        @Nullable Output<String> baseliningJobName,
        @Nullable Output<DataQualityJobDefinitionConstraintsResourceArgs> constraintsResource,
        @Nullable Output<DataQualityJobDefinitionStatisticsResourceArgs> statisticsResource) {
        this.baseliningJobName = baseliningJobName;
        this.constraintsResource = constraintsResource;
        this.statisticsResource = statisticsResource;
    }

    private DataQualityJobDefinitionDataQualityBaselineConfigArgs() {
        this.baseliningJobName = Output.empty();
        this.constraintsResource = Output.empty();
        this.statisticsResource = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionDataQualityBaselineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> baseliningJobName;
        private @Nullable Output<DataQualityJobDefinitionConstraintsResourceArgs> constraintsResource;
        private @Nullable Output<DataQualityJobDefinitionStatisticsResourceArgs> statisticsResource;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionDataQualityBaselineConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseliningJobName = defaults.baseliningJobName;
    	      this.constraintsResource = defaults.constraintsResource;
    	      this.statisticsResource = defaults.statisticsResource;
        }

        public Builder baseliningJobName(@Nullable Output<String> baseliningJobName) {
            this.baseliningJobName = baseliningJobName;
            return this;
        }

        public Builder baseliningJobName(@Nullable String baseliningJobName) {
            this.baseliningJobName = Output.ofNullable(baseliningJobName);
            return this;
        }

        public Builder constraintsResource(@Nullable Output<DataQualityJobDefinitionConstraintsResourceArgs> constraintsResource) {
            this.constraintsResource = constraintsResource;
            return this;
        }

        public Builder constraintsResource(@Nullable DataQualityJobDefinitionConstraintsResourceArgs constraintsResource) {
            this.constraintsResource = Output.ofNullable(constraintsResource);
            return this;
        }

        public Builder statisticsResource(@Nullable Output<DataQualityJobDefinitionStatisticsResourceArgs> statisticsResource) {
            this.statisticsResource = statisticsResource;
            return this;
        }

        public Builder statisticsResource(@Nullable DataQualityJobDefinitionStatisticsResourceArgs statisticsResource) {
            this.statisticsResource = Output.ofNullable(statisticsResource);
            return this;
        }
        public DataQualityJobDefinitionDataQualityBaselineConfigArgs build() {
            return new DataQualityJobDefinitionDataQualityBaselineConfigArgs(baseliningJobName, constraintsResource, statisticsResource);
        }
    }
}
