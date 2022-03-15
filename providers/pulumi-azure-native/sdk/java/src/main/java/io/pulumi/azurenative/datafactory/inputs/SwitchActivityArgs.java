// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.AppendVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ControlActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CopyActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CustomActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DeleteActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExpressionArgs;
import io.pulumi.azurenative.datafactory.inputs.FailActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ForEachActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.IfConditionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SwitchCaseArgs;
import io.pulumi.azurenative.datafactory.inputs.UntilActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This activity evaluates an expression and executes activities under the cases property that correspond to the expression evaluation expected in the equals property.
 * 
 */
public final class SwitchActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final SwitchActivityArgs Empty = new SwitchActivityArgs();

    /**
     * List of cases that correspond to expected values of the 'on' property. This is an optional property and if not provided, the activity will execute activities provided in defaultActivities.
     * 
     */
    @Import(name="cases")
      private final @Nullable Output<List<SwitchCaseArgs>> cases;

    public Output<List<SwitchCaseArgs>> getCases() {
        return this.cases == null ? Output.empty() : this.cases;
    }

    /**
     * List of activities to execute if no case condition is satisfied. This is an optional property and if not provided, the activity will exit without any action.
     * 
     */
    @Import(name="defaultActivities")
      private final @Nullable Output<List<Object>> defaultActivities;

    public Output<List<Object>> getDefaultActivities() {
        return this.defaultActivities == null ? Output.empty() : this.defaultActivities;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Output.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * An expression that would evaluate to a string or integer. This is used to determine the block of activities in cases that will be executed.
     * 
     */
    @Import(name="on", required=true)
      private final Output<ExpressionArgs> on;

    public Output<ExpressionArgs> getOn() {
        return this.on;
    }

    /**
     * Type of activity.
     * Expected value is 'Switch'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Output.empty() : this.userProperties;
    }

    public SwitchActivityArgs(
        @Nullable Output<List<SwitchCaseArgs>> cases,
        @Nullable Output<List<Object>> defaultActivities,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        Output<String> name,
        Output<ExpressionArgs> on,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
        this.cases = cases;
        this.defaultActivities = defaultActivities;
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.on = Objects.requireNonNull(on, "expected parameter 'on' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private SwitchActivityArgs() {
        this.cases = Output.empty();
        this.defaultActivities = Output.empty();
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.on = Output.empty();
        this.type = Output.empty();
        this.userProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SwitchCaseArgs>> cases;
        private @Nullable Output<List<Object>> defaultActivities;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private Output<String> name;
        private Output<ExpressionArgs> on;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(SwitchActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
    	      this.defaultActivities = defaults.defaultActivities;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.on = defaults.on;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder cases(@Nullable Output<List<SwitchCaseArgs>> cases) {
            this.cases = cases;
            return this;
        }

        public Builder cases(@Nullable List<SwitchCaseArgs> cases) {
            this.cases = Output.ofNullable(cases);
            return this;
        }

        public Builder defaultActivities(@Nullable Output<List<Object>> defaultActivities) {
            this.defaultActivities = defaultActivities;
            return this;
        }

        public Builder defaultActivities(@Nullable List<Object> defaultActivities) {
            this.defaultActivities = Output.ofNullable(defaultActivities);
            return this;
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Output.ofNullable(dependsOn);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder on(Output<ExpressionArgs> on) {
            this.on = Objects.requireNonNull(on);
            return this;
        }

        public Builder on(ExpressionArgs on) {
            this.on = Output.of(Objects.requireNonNull(on));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Output.ofNullable(userProperties);
            return this;
        }
        public SwitchActivityArgs build() {
            return new SwitchActivityArgs(cases, defaultActivities, dependsOn, description, name, on, type, userProperties);
        }
    }
}
