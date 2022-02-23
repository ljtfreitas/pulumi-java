// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.JobCommandGetArgs;
import io.pulumi.aws.glue.inputs.JobExecutionPropertyGetArgs;
import io.pulumi.aws.glue.inputs.JobNotificationPropertyGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobState extends io.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * Amazon Resource Name (ARN) of Glue Job
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The command of the job. Defined below.
     * 
     */
    @InputImport(name="command")
    private final @Nullable Input<JobCommandGetArgs> command;

    public Input<JobCommandGetArgs> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    /**
     * The list of connections used for this job.
     * 
     */
    @InputImport(name="connections")
    private final @Nullable Input<List<String>> connections;

    public Input<List<String>> getConnections() {
        return this.connections == null ? Input.empty() : this.connections;
    }

    /**
     * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
     * 
     */
    @InputImport(name="defaultArguments")
    private final @Nullable Input<Map<String,String>> defaultArguments;

    public Input<Map<String,String>> getDefaultArguments() {
        return this.defaultArguments == null ? Input.empty() : this.defaultArguments;
    }

    /**
     * Description of the job.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Execution property of the job. Defined below.
     * 
     */
    @InputImport(name="executionProperty")
    private final @Nullable Input<JobExecutionPropertyGetArgs> executionProperty;

    public Input<JobExecutionPropertyGetArgs> getExecutionProperty() {
        return this.executionProperty == null ? Input.empty() : this.executionProperty;
    }

    /**
     * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
     * 
     */
    @InputImport(name="glueVersion")
    private final @Nullable Input<String> glueVersion;

    public Input<String> getGlueVersion() {
        return this.glueVersion == null ? Input.empty() : this.glueVersion;
    }

    /**
     * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `number_of_workers` and `worker_type` arguments instead with `glue_version` `2.0` and above.
     * 
     */
    @InputImport(name="maxCapacity")
    private final @Nullable Input<Double> maxCapacity;

    public Input<Double> getMaxCapacity() {
        return this.maxCapacity == null ? Input.empty() : this.maxCapacity;
    }

    /**
     * The maximum number of times to retry this job if it fails.
     * 
     */
    @InputImport(name="maxRetries")
    private final @Nullable Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries == null ? Input.empty() : this.maxRetries;
    }

    /**
     * The name you assign to this job. It must be unique in your account.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Non-overridable arguments for this job, specified as name-value pairs.
     * 
     */
    @InputImport(name="nonOverridableArguments")
    private final @Nullable Input<Map<String,String>> nonOverridableArguments;

    public Input<Map<String,String>> getNonOverridableArguments() {
        return this.nonOverridableArguments == null ? Input.empty() : this.nonOverridableArguments;
    }

    /**
     * Notification property of the job. Defined below.
     * 
     */
    @InputImport(name="notificationProperty")
    private final @Nullable Input<JobNotificationPropertyGetArgs> notificationProperty;

    public Input<JobNotificationPropertyGetArgs> getNotificationProperty() {
        return this.notificationProperty == null ? Input.empty() : this.notificationProperty;
    }

    /**
     * The number of workers of a defined workerType that are allocated when a job runs.
     * 
     */
    @InputImport(name="numberOfWorkers")
    private final @Nullable Input<Integer> numberOfWorkers;

    public Input<Integer> getNumberOfWorkers() {
        return this.numberOfWorkers == null ? Input.empty() : this.numberOfWorkers;
    }

    /**
     * The ARN of the IAM role associated with this job.
     * 
     */
    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * The name of the Security Configuration to be associated with the job.
     * 
     */
    @InputImport(name="securityConfiguration")
    private final @Nullable Input<String> securityConfiguration;

    public Input<String> getSecurityConfiguration() {
        return this.securityConfiguration == null ? Input.empty() : this.securityConfiguration;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The job timeout in minutes. The default is 2880 minutes (48 hours).
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
     * 
     */
    @InputImport(name="workerType")
    private final @Nullable Input<String> workerType;

    public Input<String> getWorkerType() {
        return this.workerType == null ? Input.empty() : this.workerType;
    }

    public JobState(
        @Nullable Input<String> arn,
        @Nullable Input<JobCommandGetArgs> command,
        @Nullable Input<List<String>> connections,
        @Nullable Input<Map<String,String>> defaultArguments,
        @Nullable Input<String> description,
        @Nullable Input<JobExecutionPropertyGetArgs> executionProperty,
        @Nullable Input<String> glueVersion,
        @Nullable Input<Double> maxCapacity,
        @Nullable Input<Integer> maxRetries,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> nonOverridableArguments,
        @Nullable Input<JobNotificationPropertyGetArgs> notificationProperty,
        @Nullable Input<Integer> numberOfWorkers,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> securityConfiguration,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Integer> timeout,
        @Nullable Input<String> workerType) {
        this.arn = arn;
        this.command = command;
        this.connections = connections;
        this.defaultArguments = defaultArguments;
        this.description = description;
        this.executionProperty = executionProperty;
        this.glueVersion = glueVersion;
        this.maxCapacity = maxCapacity;
        this.maxRetries = maxRetries;
        this.name = name;
        this.nonOverridableArguments = nonOverridableArguments;
        this.notificationProperty = notificationProperty;
        this.numberOfWorkers = numberOfWorkers;
        this.roleArn = roleArn;
        this.securityConfiguration = securityConfiguration;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.timeout = timeout;
        this.workerType = workerType;
    }

    private JobState() {
        this.arn = Input.empty();
        this.command = Input.empty();
        this.connections = Input.empty();
        this.defaultArguments = Input.empty();
        this.description = Input.empty();
        this.executionProperty = Input.empty();
        this.glueVersion = Input.empty();
        this.maxCapacity = Input.empty();
        this.maxRetries = Input.empty();
        this.name = Input.empty();
        this.nonOverridableArguments = Input.empty();
        this.notificationProperty = Input.empty();
        this.numberOfWorkers = Input.empty();
        this.roleArn = Input.empty();
        this.securityConfiguration = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.timeout = Input.empty();
        this.workerType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<JobCommandGetArgs> command;
        private @Nullable Input<List<String>> connections;
        private @Nullable Input<Map<String,String>> defaultArguments;
        private @Nullable Input<String> description;
        private @Nullable Input<JobExecutionPropertyGetArgs> executionProperty;
        private @Nullable Input<String> glueVersion;
        private @Nullable Input<Double> maxCapacity;
        private @Nullable Input<Integer> maxRetries;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> nonOverridableArguments;
        private @Nullable Input<JobNotificationPropertyGetArgs> notificationProperty;
        private @Nullable Input<Integer> numberOfWorkers;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> securityConfiguration;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<String> workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(JobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.command = defaults.command;
    	      this.connections = defaults.connections;
    	      this.defaultArguments = defaults.defaultArguments;
    	      this.description = defaults.description;
    	      this.executionProperty = defaults.executionProperty;
    	      this.glueVersion = defaults.glueVersion;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.maxRetries = defaults.maxRetries;
    	      this.name = defaults.name;
    	      this.nonOverridableArguments = defaults.nonOverridableArguments;
    	      this.notificationProperty = defaults.notificationProperty;
    	      this.numberOfWorkers = defaults.numberOfWorkers;
    	      this.roleArn = defaults.roleArn;
    	      this.securityConfiguration = defaults.securityConfiguration;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.timeout = defaults.timeout;
    	      this.workerType = defaults.workerType;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCommand(@Nullable Input<JobCommandGetArgs> command) {
            this.command = command;
            return this;
        }

        public Builder setCommand(@Nullable JobCommandGetArgs command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public Builder setConnections(@Nullable Input<List<String>> connections) {
            this.connections = connections;
            return this;
        }

        public Builder setConnections(@Nullable List<String> connections) {
            this.connections = Input.ofNullable(connections);
            return this;
        }

        public Builder setDefaultArguments(@Nullable Input<Map<String,String>> defaultArguments) {
            this.defaultArguments = defaultArguments;
            return this;
        }

        public Builder setDefaultArguments(@Nullable Map<String,String> defaultArguments) {
            this.defaultArguments = Input.ofNullable(defaultArguments);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExecutionProperty(@Nullable Input<JobExecutionPropertyGetArgs> executionProperty) {
            this.executionProperty = executionProperty;
            return this;
        }

        public Builder setExecutionProperty(@Nullable JobExecutionPropertyGetArgs executionProperty) {
            this.executionProperty = Input.ofNullable(executionProperty);
            return this;
        }

        public Builder setGlueVersion(@Nullable Input<String> glueVersion) {
            this.glueVersion = glueVersion;
            return this;
        }

        public Builder setGlueVersion(@Nullable String glueVersion) {
            this.glueVersion = Input.ofNullable(glueVersion);
            return this;
        }

        public Builder setMaxCapacity(@Nullable Input<Double> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMaxCapacity(@Nullable Double maxCapacity) {
            this.maxCapacity = Input.ofNullable(maxCapacity);
            return this;
        }

        public Builder setMaxRetries(@Nullable Input<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder setMaxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Input.ofNullable(maxRetries);
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

        public Builder setNonOverridableArguments(@Nullable Input<Map<String,String>> nonOverridableArguments) {
            this.nonOverridableArguments = nonOverridableArguments;
            return this;
        }

        public Builder setNonOverridableArguments(@Nullable Map<String,String> nonOverridableArguments) {
            this.nonOverridableArguments = Input.ofNullable(nonOverridableArguments);
            return this;
        }

        public Builder setNotificationProperty(@Nullable Input<JobNotificationPropertyGetArgs> notificationProperty) {
            this.notificationProperty = notificationProperty;
            return this;
        }

        public Builder setNotificationProperty(@Nullable JobNotificationPropertyGetArgs notificationProperty) {
            this.notificationProperty = Input.ofNullable(notificationProperty);
            return this;
        }

        public Builder setNumberOfWorkers(@Nullable Input<Integer> numberOfWorkers) {
            this.numberOfWorkers = numberOfWorkers;
            return this;
        }

        public Builder setNumberOfWorkers(@Nullable Integer numberOfWorkers) {
            this.numberOfWorkers = Input.ofNullable(numberOfWorkers);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setSecurityConfiguration(@Nullable Input<String> securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        public Builder setSecurityConfiguration(@Nullable String securityConfiguration) {
            this.securityConfiguration = Input.ofNullable(securityConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setWorkerType(@Nullable Input<String> workerType) {
            this.workerType = workerType;
            return this;
        }

        public Builder setWorkerType(@Nullable String workerType) {
            this.workerType = Input.ofNullable(workerType);
            return this;
        }
        public JobState build() {
            return new JobState(arn, command, connections, defaultArguments, description, executionProperty, glueVersion, maxCapacity, maxRetries, name, nonOverridableArguments, notificationProperty, numberOfWorkers, roleArn, securityConfiguration, tags, tagsAll, timeout, workerType);
        }
    }
}