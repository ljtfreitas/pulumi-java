// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.InstanceTemplateSpecResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobSpecResponse {
    /**
     * Optional. Not supported. Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it. If set to zero, the system will never attempt to terminate the job based on time. Otherwise, the value must be positive integer. +optional
     * 
     */
    private final String activeDeadlineSeconds;
    /**
     * Optional. Specifies the number of retries per instance, before marking this job failed. If set to zero, instances will never retry on failure. +optional
     * 
     */
    private final Integer backoffLimit;
    /**
     * Optional. Specifies the desired number of successfully finished instances the job should be run with. Setting to 1 means that parallelism is limited to 1 and the success of that instance signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    private final Integer completions;
    /**
     * Optional. Specifies the maximum desired number of instances the job should run at any given time. Must be <= completions. The actual number of instances running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    private final Integer parallelism;
    /**
     * Optional. Describes the instance that will be created when executing a job.
     * 
     */
    private final InstanceTemplateSpecResponse template;
    /**
     * Optional. Not supported. ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is set to zero, the Job won't be automatically deleted. +optional
     * 
     */
    private final Integer ttlSecondsAfterFinished;

    @OutputCustomType.Constructor({"activeDeadlineSeconds","backoffLimit","completions","parallelism","template","ttlSecondsAfterFinished"})
    private JobSpecResponse(
        String activeDeadlineSeconds,
        Integer backoffLimit,
        Integer completions,
        Integer parallelism,
        InstanceTemplateSpecResponse template,
        Integer ttlSecondsAfterFinished) {
        this.activeDeadlineSeconds = Objects.requireNonNull(activeDeadlineSeconds);
        this.backoffLimit = Objects.requireNonNull(backoffLimit);
        this.completions = Objects.requireNonNull(completions);
        this.parallelism = Objects.requireNonNull(parallelism);
        this.template = Objects.requireNonNull(template);
        this.ttlSecondsAfterFinished = Objects.requireNonNull(ttlSecondsAfterFinished);
    }

    /**
     * Optional. Not supported. Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it. If set to zero, the system will never attempt to terminate the job based on time. Otherwise, the value must be positive integer. +optional
     * 
     */
    public String getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }
    /**
     * Optional. Specifies the number of retries per instance, before marking this job failed. If set to zero, instances will never retry on failure. +optional
     * 
     */
    public Integer getBackoffLimit() {
        return this.backoffLimit;
    }
    /**
     * Optional. Specifies the desired number of successfully finished instances the job should be run with. Setting to 1 means that parallelism is limited to 1 and the success of that instance signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    public Integer getCompletions() {
        return this.completions;
    }
    /**
     * Optional. Specifies the maximum desired number of instances the job should run at any given time. Must be <= completions. The actual number of instances running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    public Integer getParallelism() {
        return this.parallelism;
    }
    /**
     * Optional. Describes the instance that will be created when executing a job.
     * 
     */
    public InstanceTemplateSpecResponse getTemplate() {
        return this.template;
    }
    /**
     * Optional. Not supported. ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is set to zero, the Job won't be automatically deleted. +optional
     * 
     */
    public Integer getTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activeDeadlineSeconds;
        private Integer backoffLimit;
        private Integer completions;
        private Integer parallelism;
        private InstanceTemplateSpecResponse template;
        private Integer ttlSecondsAfterFinished;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.backoffLimit = defaults.backoffLimit;
    	      this.completions = defaults.completions;
    	      this.parallelism = defaults.parallelism;
    	      this.template = defaults.template;
    	      this.ttlSecondsAfterFinished = defaults.ttlSecondsAfterFinished;
        }

        public Builder setActiveDeadlineSeconds(String activeDeadlineSeconds) {
            this.activeDeadlineSeconds = Objects.requireNonNull(activeDeadlineSeconds);
            return this;
        }

        public Builder setBackoffLimit(Integer backoffLimit) {
            this.backoffLimit = Objects.requireNonNull(backoffLimit);
            return this;
        }

        public Builder setCompletions(Integer completions) {
            this.completions = Objects.requireNonNull(completions);
            return this;
        }

        public Builder setParallelism(Integer parallelism) {
            this.parallelism = Objects.requireNonNull(parallelism);
            return this;
        }

        public Builder setTemplate(InstanceTemplateSpecResponse template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
            this.ttlSecondsAfterFinished = Objects.requireNonNull(ttlSecondsAfterFinished);
            return this;
        }
        public JobSpecResponse build() {
            return new JobSpecResponse(activeDeadlineSeconds, backoffLimit, completions, parallelism, template, ttlSecondsAfterFinished);
        }
    }
}
