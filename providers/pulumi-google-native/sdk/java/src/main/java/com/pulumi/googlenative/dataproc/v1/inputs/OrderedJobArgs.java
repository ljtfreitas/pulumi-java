// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc.v1.inputs.HadoopJobArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.HiveJobArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.JobSchedulingArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.PigJobArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.PrestoJobArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.PySparkJobArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.SparkJobArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.SparkRJobArgs;
import com.pulumi.googlenative.dataproc.v1.inputs.SparkSqlJobArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A job executed by the workflow.
 * 
 */
public final class OrderedJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrderedJobArgs Empty = new OrderedJobArgs();

    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    @Import(name="hadoopJob")
    private @Nullable Output<HadoopJobArgs> hadoopJob;

    /**
     * @return Optional. Job is a Hadoop job.
     * 
     */
    public Optional<Output<HadoopJobArgs>> hadoopJob() {
        return Optional.ofNullable(this.hadoopJob);
    }

    /**
     * Optional. Job is a Hive job.
     * 
     */
    @Import(name="hiveJob")
    private @Nullable Output<HiveJobArgs> hiveJob;

    /**
     * @return Optional. Job is a Hive job.
     * 
     */
    public Optional<Output<HiveJobArgs>> hiveJob() {
        return Optional.ofNullable(this.hiveJob);
    }

    /**
     * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Optional. Job is a Pig job.
     * 
     */
    @Import(name="pigJob")
    private @Nullable Output<PigJobArgs> pigJob;

    /**
     * @return Optional. Job is a Pig job.
     * 
     */
    public Optional<Output<PigJobArgs>> pigJob() {
        return Optional.ofNullable(this.pigJob);
    }

    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    @Import(name="prerequisiteStepIds")
    private @Nullable Output<List<String>> prerequisiteStepIds;

    /**
     * @return Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    public Optional<Output<List<String>>> prerequisiteStepIds() {
        return Optional.ofNullable(this.prerequisiteStepIds);
    }

    /**
     * Optional. Job is a Presto job.
     * 
     */
    @Import(name="prestoJob")
    private @Nullable Output<PrestoJobArgs> prestoJob;

    /**
     * @return Optional. Job is a Presto job.
     * 
     */
    public Optional<Output<PrestoJobArgs>> prestoJob() {
        return Optional.ofNullable(this.prestoJob);
    }

    /**
     * Optional. Job is a PySpark job.
     * 
     */
    @Import(name="pysparkJob")
    private @Nullable Output<PySparkJobArgs> pysparkJob;

    /**
     * @return Optional. Job is a PySpark job.
     * 
     */
    public Optional<Output<PySparkJobArgs>> pysparkJob() {
        return Optional.ofNullable(this.pysparkJob);
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @Import(name="scheduling")
    private @Nullable Output<JobSchedulingArgs> scheduling;

    /**
     * @return Optional. Job scheduling configuration.
     * 
     */
    public Optional<Output<JobSchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    /**
     * Optional. Job is a Spark job.
     * 
     */
    @Import(name="sparkJob")
    private @Nullable Output<SparkJobArgs> sparkJob;

    /**
     * @return Optional. Job is a Spark job.
     * 
     */
    public Optional<Output<SparkJobArgs>> sparkJob() {
        return Optional.ofNullable(this.sparkJob);
    }

    /**
     * Optional. Job is a SparkR job.
     * 
     */
    @Import(name="sparkRJob")
    private @Nullable Output<SparkRJobArgs> sparkRJob;

    /**
     * @return Optional. Job is a SparkR job.
     * 
     */
    public Optional<Output<SparkRJobArgs>> sparkRJob() {
        return Optional.ofNullable(this.sparkRJob);
    }

    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    @Import(name="sparkSqlJob")
    private @Nullable Output<SparkSqlJobArgs> sparkSqlJob;

    /**
     * @return Optional. Job is a SparkSql job.
     * 
     */
    public Optional<Output<SparkSqlJobArgs>> sparkSqlJob() {
        return Optional.ofNullable(this.sparkSqlJob);
    }

    /**
     * The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    @Import(name="stepId", required=true)
    private Output<String> stepId;

    /**
     * @return The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    public Output<String> stepId() {
        return this.stepId;
    }

    private OrderedJobArgs() {}

    private OrderedJobArgs(OrderedJobArgs $) {
        this.hadoopJob = $.hadoopJob;
        this.hiveJob = $.hiveJob;
        this.labels = $.labels;
        this.pigJob = $.pigJob;
        this.prerequisiteStepIds = $.prerequisiteStepIds;
        this.prestoJob = $.prestoJob;
        this.pysparkJob = $.pysparkJob;
        this.scheduling = $.scheduling;
        this.sparkJob = $.sparkJob;
        this.sparkRJob = $.sparkRJob;
        this.sparkSqlJob = $.sparkSqlJob;
        this.stepId = $.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrderedJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrderedJobArgs $;

        public Builder() {
            $ = new OrderedJobArgs();
        }

        public Builder(OrderedJobArgs defaults) {
            $ = new OrderedJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hadoopJob Optional. Job is a Hadoop job.
         * 
         * @return builder
         * 
         */
        public Builder hadoopJob(@Nullable Output<HadoopJobArgs> hadoopJob) {
            $.hadoopJob = hadoopJob;
            return this;
        }

        /**
         * @param hadoopJob Optional. Job is a Hadoop job.
         * 
         * @return builder
         * 
         */
        public Builder hadoopJob(HadoopJobArgs hadoopJob) {
            return hadoopJob(Output.of(hadoopJob));
        }

        /**
         * @param hiveJob Optional. Job is a Hive job.
         * 
         * @return builder
         * 
         */
        public Builder hiveJob(@Nullable Output<HiveJobArgs> hiveJob) {
            $.hiveJob = hiveJob;
            return this;
        }

        /**
         * @param hiveJob Optional. Job is a Hive job.
         * 
         * @return builder
         * 
         */
        public Builder hiveJob(HiveJobArgs hiveJob) {
            return hiveJob(Output.of(hiveJob));
        }

        /**
         * @param labels Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param pigJob Optional. Job is a Pig job.
         * 
         * @return builder
         * 
         */
        public Builder pigJob(@Nullable Output<PigJobArgs> pigJob) {
            $.pigJob = pigJob;
            return this;
        }

        /**
         * @param pigJob Optional. Job is a Pig job.
         * 
         * @return builder
         * 
         */
        public Builder pigJob(PigJobArgs pigJob) {
            return pigJob(Output.of(pigJob));
        }

        /**
         * @param prerequisiteStepIds Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
         * 
         * @return builder
         * 
         */
        public Builder prerequisiteStepIds(@Nullable Output<List<String>> prerequisiteStepIds) {
            $.prerequisiteStepIds = prerequisiteStepIds;
            return this;
        }

        /**
         * @param prerequisiteStepIds Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
         * 
         * @return builder
         * 
         */
        public Builder prerequisiteStepIds(List<String> prerequisiteStepIds) {
            return prerequisiteStepIds(Output.of(prerequisiteStepIds));
        }

        /**
         * @param prerequisiteStepIds Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
         * 
         * @return builder
         * 
         */
        public Builder prerequisiteStepIds(String... prerequisiteStepIds) {
            return prerequisiteStepIds(List.of(prerequisiteStepIds));
        }

        /**
         * @param prestoJob Optional. Job is a Presto job.
         * 
         * @return builder
         * 
         */
        public Builder prestoJob(@Nullable Output<PrestoJobArgs> prestoJob) {
            $.prestoJob = prestoJob;
            return this;
        }

        /**
         * @param prestoJob Optional. Job is a Presto job.
         * 
         * @return builder
         * 
         */
        public Builder prestoJob(PrestoJobArgs prestoJob) {
            return prestoJob(Output.of(prestoJob));
        }

        /**
         * @param pysparkJob Optional. Job is a PySpark job.
         * 
         * @return builder
         * 
         */
        public Builder pysparkJob(@Nullable Output<PySparkJobArgs> pysparkJob) {
            $.pysparkJob = pysparkJob;
            return this;
        }

        /**
         * @param pysparkJob Optional. Job is a PySpark job.
         * 
         * @return builder
         * 
         */
        public Builder pysparkJob(PySparkJobArgs pysparkJob) {
            return pysparkJob(Output.of(pysparkJob));
        }

        /**
         * @param scheduling Optional. Job scheduling configuration.
         * 
         * @return builder
         * 
         */
        public Builder scheduling(@Nullable Output<JobSchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        /**
         * @param scheduling Optional. Job scheduling configuration.
         * 
         * @return builder
         * 
         */
        public Builder scheduling(JobSchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        /**
         * @param sparkJob Optional. Job is a Spark job.
         * 
         * @return builder
         * 
         */
        public Builder sparkJob(@Nullable Output<SparkJobArgs> sparkJob) {
            $.sparkJob = sparkJob;
            return this;
        }

        /**
         * @param sparkJob Optional. Job is a Spark job.
         * 
         * @return builder
         * 
         */
        public Builder sparkJob(SparkJobArgs sparkJob) {
            return sparkJob(Output.of(sparkJob));
        }

        /**
         * @param sparkRJob Optional. Job is a SparkR job.
         * 
         * @return builder
         * 
         */
        public Builder sparkRJob(@Nullable Output<SparkRJobArgs> sparkRJob) {
            $.sparkRJob = sparkRJob;
            return this;
        }

        /**
         * @param sparkRJob Optional. Job is a SparkR job.
         * 
         * @return builder
         * 
         */
        public Builder sparkRJob(SparkRJobArgs sparkRJob) {
            return sparkRJob(Output.of(sparkRJob));
        }

        /**
         * @param sparkSqlJob Optional. Job is a SparkSql job.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlJob(@Nullable Output<SparkSqlJobArgs> sparkSqlJob) {
            $.sparkSqlJob = sparkSqlJob;
            return this;
        }

        /**
         * @param sparkSqlJob Optional. Job is a SparkSql job.
         * 
         * @return builder
         * 
         */
        public Builder sparkSqlJob(SparkSqlJobArgs sparkSqlJob) {
            return sparkSqlJob(Output.of(sparkSqlJob));
        }

        /**
         * @param stepId The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
         * 
         * @return builder
         * 
         */
        public Builder stepId(Output<String> stepId) {
            $.stepId = stepId;
            return this;
        }

        /**
         * @param stepId The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
         * 
         * @return builder
         * 
         */
        public Builder stepId(String stepId) {
            return stepId(Output.of(stepId));
        }

        public OrderedJobArgs build() {
            $.stepId = Objects.requireNonNull($.stepId, "expected parameter 'stepId' to be non-null");
            return $;
        }
    }

}
