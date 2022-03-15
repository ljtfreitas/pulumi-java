// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.inputs;

import io.pulumi.aws.mwaa.inputs.EnvironmentLastUpdatedErrorGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentLastUpdatedGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentLastUpdatedGetArgs Empty = new EnvironmentLastUpdatedGetArgs();

    /**
     * The Created At date of the MWAA Environment
     * * `logging_configuration[0].<LOG_CONFIGURATION_TYPE>[0].cloud_watch_log_group_arn` - Provides the ARN for the CloudWatch group where the logs will be published
     * 
     */
    @Import(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt == null ? Output.empty() : this.createdAt;
    }

    @Import(name="errors")
      private final @Nullable Output<List<EnvironmentLastUpdatedErrorGetArgs>> errors;

    public Output<List<EnvironmentLastUpdatedErrorGetArgs>> getErrors() {
        return this.errors == null ? Output.empty() : this.errors;
    }

    /**
     * The status of the Amazon MWAA Environment
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public EnvironmentLastUpdatedGetArgs(
        @Nullable Output<String> createdAt,
        @Nullable Output<List<EnvironmentLastUpdatedErrorGetArgs>> errors,
        @Nullable Output<String> status) {
        this.createdAt = createdAt;
        this.errors = errors;
        this.status = status;
    }

    private EnvironmentLastUpdatedGetArgs() {
        this.createdAt = Output.empty();
        this.errors = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLastUpdatedGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createdAt;
        private @Nullable Output<List<EnvironmentLastUpdatedErrorGetArgs>> errors;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLastUpdatedGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.errors = defaults.errors;
    	      this.status = defaults.status;
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Output.ofNullable(createdAt);
            return this;
        }

        public Builder errors(@Nullable Output<List<EnvironmentLastUpdatedErrorGetArgs>> errors) {
            this.errors = errors;
            return this;
        }

        public Builder errors(@Nullable List<EnvironmentLastUpdatedErrorGetArgs> errors) {
            this.errors = Output.ofNullable(errors);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public EnvironmentLastUpdatedGetArgs build() {
            return new EnvironmentLastUpdatedGetArgs(createdAt, errors, status);
        }
    }
}
