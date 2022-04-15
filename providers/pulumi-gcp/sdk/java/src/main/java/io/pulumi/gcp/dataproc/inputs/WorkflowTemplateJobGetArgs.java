// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHadoopJobGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobHiveJobGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPigJobGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPysparkJobGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSchedulingGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkJobGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkSqlJobGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobGetArgs Empty = new WorkflowTemplateJobGetArgs();

    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    @Import(name="hadoopJob")
      private final @Nullable Output<WorkflowTemplateJobHadoopJobGetArgs> hadoopJob;

    public Output<WorkflowTemplateJobHadoopJobGetArgs> hadoopJob() {
        return this.hadoopJob == null ? Codegen.empty() : this.hadoopJob;
    }

    /**
     * Optional. Job is a Hive job.
     * 
     */
    @Import(name="hiveJob")
      private final @Nullable Output<WorkflowTemplateJobHiveJobGetArgs> hiveJob;

    public Output<WorkflowTemplateJobHiveJobGetArgs> hiveJob() {
        return this.hiveJob == null ? Codegen.empty() : this.hiveJob;
    }

    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Optional. Job is a Pig job.
     * 
     */
    @Import(name="pigJob")
      private final @Nullable Output<WorkflowTemplateJobPigJobGetArgs> pigJob;

    public Output<WorkflowTemplateJobPigJobGetArgs> pigJob() {
        return this.pigJob == null ? Codegen.empty() : this.pigJob;
    }

    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    @Import(name="prerequisiteStepIds")
      private final @Nullable Output<List<String>> prerequisiteStepIds;

    public Output<List<String>> prerequisiteStepIds() {
        return this.prerequisiteStepIds == null ? Codegen.empty() : this.prerequisiteStepIds;
    }

    /**
     * Optional. Job is a Presto job.
     * 
     */
    @Import(name="prestoJob")
      private final @Nullable Output<WorkflowTemplateJobPrestoJobGetArgs> prestoJob;

    public Output<WorkflowTemplateJobPrestoJobGetArgs> prestoJob() {
        return this.prestoJob == null ? Codegen.empty() : this.prestoJob;
    }

    /**
     * Optional. Job is a PySpark job.
     * 
     */
    @Import(name="pysparkJob")
      private final @Nullable Output<WorkflowTemplateJobPysparkJobGetArgs> pysparkJob;

    public Output<WorkflowTemplateJobPysparkJobGetArgs> pysparkJob() {
        return this.pysparkJob == null ? Codegen.empty() : this.pysparkJob;
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<WorkflowTemplateJobSchedulingGetArgs> scheduling;

    public Output<WorkflowTemplateJobSchedulingGetArgs> scheduling() {
        return this.scheduling == null ? Codegen.empty() : this.scheduling;
    }

    /**
     * Optional. Job is a Spark job.
     * 
     */
    @Import(name="sparkJob")
      private final @Nullable Output<WorkflowTemplateJobSparkJobGetArgs> sparkJob;

    public Output<WorkflowTemplateJobSparkJobGetArgs> sparkJob() {
        return this.sparkJob == null ? Codegen.empty() : this.sparkJob;
    }

    /**
     * Optional. Job is a SparkR job.
     * 
     */
    @Import(name="sparkRJob")
      private final @Nullable Output<WorkflowTemplateJobSparkRJobGetArgs> sparkRJob;

    public Output<WorkflowTemplateJobSparkRJobGetArgs> sparkRJob() {
        return this.sparkRJob == null ? Codegen.empty() : this.sparkRJob;
    }

    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    @Import(name="sparkSqlJob")
      private final @Nullable Output<WorkflowTemplateJobSparkSqlJobGetArgs> sparkSqlJob;

    public Output<WorkflowTemplateJobSparkSqlJobGetArgs> sparkSqlJob() {
        return this.sparkSqlJob == null ? Codegen.empty() : this.sparkSqlJob;
    }

    /**
     * Required. The step id. The id must be unique among all jobs within the template. The step id is used as prefix for job id, as job `goog-dataproc-workflow-step-id` label, and in field from other steps. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    @Import(name="stepId", required=true)
      private final Output<String> stepId;

    public Output<String> stepId() {
        return this.stepId;
    }

    public WorkflowTemplateJobGetArgs(
        @Nullable Output<WorkflowTemplateJobHadoopJobGetArgs> hadoopJob,
        @Nullable Output<WorkflowTemplateJobHiveJobGetArgs> hiveJob,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<WorkflowTemplateJobPigJobGetArgs> pigJob,
        @Nullable Output<List<String>> prerequisiteStepIds,
        @Nullable Output<WorkflowTemplateJobPrestoJobGetArgs> prestoJob,
        @Nullable Output<WorkflowTemplateJobPysparkJobGetArgs> pysparkJob,
        @Nullable Output<WorkflowTemplateJobSchedulingGetArgs> scheduling,
        @Nullable Output<WorkflowTemplateJobSparkJobGetArgs> sparkJob,
        @Nullable Output<WorkflowTemplateJobSparkRJobGetArgs> sparkRJob,
        @Nullable Output<WorkflowTemplateJobSparkSqlJobGetArgs> sparkSqlJob,
        Output<String> stepId) {
        this.hadoopJob = hadoopJob;
        this.hiveJob = hiveJob;
        this.labels = labels;
        this.pigJob = pigJob;
        this.prerequisiteStepIds = prerequisiteStepIds;
        this.prestoJob = prestoJob;
        this.pysparkJob = pysparkJob;
        this.scheduling = scheduling;
        this.sparkJob = sparkJob;
        this.sparkRJob = sparkRJob;
        this.sparkSqlJob = sparkSqlJob;
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private WorkflowTemplateJobGetArgs() {
        this.hadoopJob = Codegen.empty();
        this.hiveJob = Codegen.empty();
        this.labels = Codegen.empty();
        this.pigJob = Codegen.empty();
        this.prerequisiteStepIds = Codegen.empty();
        this.prestoJob = Codegen.empty();
        this.pysparkJob = Codegen.empty();
        this.scheduling = Codegen.empty();
        this.sparkJob = Codegen.empty();
        this.sparkRJob = Codegen.empty();
        this.sparkSqlJob = Codegen.empty();
        this.stepId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkflowTemplateJobHadoopJobGetArgs> hadoopJob;
        private @Nullable Output<WorkflowTemplateJobHiveJobGetArgs> hiveJob;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<WorkflowTemplateJobPigJobGetArgs> pigJob;
        private @Nullable Output<List<String>> prerequisiteStepIds;
        private @Nullable Output<WorkflowTemplateJobPrestoJobGetArgs> prestoJob;
        private @Nullable Output<WorkflowTemplateJobPysparkJobGetArgs> pysparkJob;
        private @Nullable Output<WorkflowTemplateJobSchedulingGetArgs> scheduling;
        private @Nullable Output<WorkflowTemplateJobSparkJobGetArgs> sparkJob;
        private @Nullable Output<WorkflowTemplateJobSparkRJobGetArgs> sparkRJob;
        private @Nullable Output<WorkflowTemplateJobSparkSqlJobGetArgs> sparkSqlJob;
        private Output<String> stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.prerequisiteStepIds = defaults.prerequisiteStepIds;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.stepId = defaults.stepId;
        }

        public Builder hadoopJob(@Nullable Output<WorkflowTemplateJobHadoopJobGetArgs> hadoopJob) {
            this.hadoopJob = hadoopJob;
            return this;
        }
        public Builder hadoopJob(@Nullable WorkflowTemplateJobHadoopJobGetArgs hadoopJob) {
            this.hadoopJob = Codegen.ofNullable(hadoopJob);
            return this;
        }
        public Builder hiveJob(@Nullable Output<WorkflowTemplateJobHiveJobGetArgs> hiveJob) {
            this.hiveJob = hiveJob;
            return this;
        }
        public Builder hiveJob(@Nullable WorkflowTemplateJobHiveJobGetArgs hiveJob) {
            this.hiveJob = Codegen.ofNullable(hiveJob);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder pigJob(@Nullable Output<WorkflowTemplateJobPigJobGetArgs> pigJob) {
            this.pigJob = pigJob;
            return this;
        }
        public Builder pigJob(@Nullable WorkflowTemplateJobPigJobGetArgs pigJob) {
            this.pigJob = Codegen.ofNullable(pigJob);
            return this;
        }
        public Builder prerequisiteStepIds(@Nullable Output<List<String>> prerequisiteStepIds) {
            this.prerequisiteStepIds = prerequisiteStepIds;
            return this;
        }
        public Builder prerequisiteStepIds(@Nullable List<String> prerequisiteStepIds) {
            this.prerequisiteStepIds = Codegen.ofNullable(prerequisiteStepIds);
            return this;
        }
        public Builder prerequisiteStepIds(String... prerequisiteStepIds) {
            return prerequisiteStepIds(List.of(prerequisiteStepIds));
        }
        public Builder prestoJob(@Nullable Output<WorkflowTemplateJobPrestoJobGetArgs> prestoJob) {
            this.prestoJob = prestoJob;
            return this;
        }
        public Builder prestoJob(@Nullable WorkflowTemplateJobPrestoJobGetArgs prestoJob) {
            this.prestoJob = Codegen.ofNullable(prestoJob);
            return this;
        }
        public Builder pysparkJob(@Nullable Output<WorkflowTemplateJobPysparkJobGetArgs> pysparkJob) {
            this.pysparkJob = pysparkJob;
            return this;
        }
        public Builder pysparkJob(@Nullable WorkflowTemplateJobPysparkJobGetArgs pysparkJob) {
            this.pysparkJob = Codegen.ofNullable(pysparkJob);
            return this;
        }
        public Builder scheduling(@Nullable Output<WorkflowTemplateJobSchedulingGetArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder scheduling(@Nullable WorkflowTemplateJobSchedulingGetArgs scheduling) {
            this.scheduling = Codegen.ofNullable(scheduling);
            return this;
        }
        public Builder sparkJob(@Nullable Output<WorkflowTemplateJobSparkJobGetArgs> sparkJob) {
            this.sparkJob = sparkJob;
            return this;
        }
        public Builder sparkJob(@Nullable WorkflowTemplateJobSparkJobGetArgs sparkJob) {
            this.sparkJob = Codegen.ofNullable(sparkJob);
            return this;
        }
        public Builder sparkRJob(@Nullable Output<WorkflowTemplateJobSparkRJobGetArgs> sparkRJob) {
            this.sparkRJob = sparkRJob;
            return this;
        }
        public Builder sparkRJob(@Nullable WorkflowTemplateJobSparkRJobGetArgs sparkRJob) {
            this.sparkRJob = Codegen.ofNullable(sparkRJob);
            return this;
        }
        public Builder sparkSqlJob(@Nullable Output<WorkflowTemplateJobSparkSqlJobGetArgs> sparkSqlJob) {
            this.sparkSqlJob = sparkSqlJob;
            return this;
        }
        public Builder sparkSqlJob(@Nullable WorkflowTemplateJobSparkSqlJobGetArgs sparkSqlJob) {
            this.sparkSqlJob = Codegen.ofNullable(sparkSqlJob);
            return this;
        }
        public Builder stepId(Output<String> stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }
        public Builder stepId(String stepId) {
            this.stepId = Output.of(Objects.requireNonNull(stepId));
            return this;
        }        public WorkflowTemplateJobGetArgs build() {
            return new WorkflowTemplateJobGetArgs(hadoopJob, hiveJob, labels, pigJob, prerequisiteStepIds, prestoJob, pysparkJob, scheduling, sparkJob, sparkRJob, sparkSqlJob, stepId);
        }
    }
}
