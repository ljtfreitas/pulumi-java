// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AppendVariableActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ControlActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.CopyActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.CustomActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.DeleteActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.FailActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ForEachActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.IfConditionActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.SwitchActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.UntilActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WebActivityResponse;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Switch cases with have a value and corresponding activities.
 * 
 */
public final class SwitchCaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final SwitchCaseResponse Empty = new SwitchCaseResponse();

    /**
     * List of activities to execute for satisfied case condition.
     * 
     */
    @InputImport(name="activities")
        private final @Nullable List<Object> activities;

    public List<Object> getActivities() {
        return this.activities == null ? List.of() : this.activities;
    }

    /**
     * Expected value that satisfies the expression result of the 'on' property.
     * 
     */
    @InputImport(name="value")
        private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public SwitchCaseResponse(
        @Nullable List<Object> activities,
        @Nullable String value) {
        this.activities = activities;
        this.value = value;
    }

    private SwitchCaseResponse() {
        this.activities = List.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchCaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> activities;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SwitchCaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.value = defaults.value;
        }

        public Builder setActivities(@Nullable List<Object> activities) {
            this.activities = activities;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public SwitchCaseResponse build() {
            return new SwitchCaseResponse(activities, value);
        }
    }
}
