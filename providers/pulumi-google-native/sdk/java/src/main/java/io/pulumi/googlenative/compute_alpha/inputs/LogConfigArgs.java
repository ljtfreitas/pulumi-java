// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.LogConfigCloudAuditOptionsArgs;
import io.pulumi.googlenative.compute_alpha.inputs.LogConfigCounterOptionsArgs;
import io.pulumi.googlenative.compute_alpha.inputs.LogConfigDataAccessOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigArgs Empty = new LogConfigArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="cloudAudit")
      private final @Nullable Output<LogConfigCloudAuditOptionsArgs> cloudAudit;

    public Output<LogConfigCloudAuditOptionsArgs> getCloudAudit() {
        return this.cloudAudit == null ? Output.empty() : this.cloudAudit;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="counter")
      private final @Nullable Output<LogConfigCounterOptionsArgs> counter;

    public Output<LogConfigCounterOptionsArgs> getCounter() {
        return this.counter == null ? Output.empty() : this.counter;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="dataAccess")
      private final @Nullable Output<LogConfigDataAccessOptionsArgs> dataAccess;

    public Output<LogConfigDataAccessOptionsArgs> getDataAccess() {
        return this.dataAccess == null ? Output.empty() : this.dataAccess;
    }

    public LogConfigArgs(
        @Nullable Output<LogConfigCloudAuditOptionsArgs> cloudAudit,
        @Nullable Output<LogConfigCounterOptionsArgs> counter,
        @Nullable Output<LogConfigDataAccessOptionsArgs> dataAccess) {
        this.cloudAudit = cloudAudit;
        this.counter = counter;
        this.dataAccess = dataAccess;
    }

    private LogConfigArgs() {
        this.cloudAudit = Output.empty();
        this.counter = Output.empty();
        this.dataAccess = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LogConfigCloudAuditOptionsArgs> cloudAudit;
        private @Nullable Output<LogConfigCounterOptionsArgs> counter;
        private @Nullable Output<LogConfigDataAccessOptionsArgs> dataAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAudit = defaults.cloudAudit;
    	      this.counter = defaults.counter;
    	      this.dataAccess = defaults.dataAccess;
        }

        public Builder cloudAudit(@Nullable Output<LogConfigCloudAuditOptionsArgs> cloudAudit) {
            this.cloudAudit = cloudAudit;
            return this;
        }

        public Builder cloudAudit(@Nullable LogConfigCloudAuditOptionsArgs cloudAudit) {
            this.cloudAudit = Output.ofNullable(cloudAudit);
            return this;
        }

        public Builder counter(@Nullable Output<LogConfigCounterOptionsArgs> counter) {
            this.counter = counter;
            return this;
        }

        public Builder counter(@Nullable LogConfigCounterOptionsArgs counter) {
            this.counter = Output.ofNullable(counter);
            return this;
        }

        public Builder dataAccess(@Nullable Output<LogConfigDataAccessOptionsArgs> dataAccess) {
            this.dataAccess = dataAccess;
            return this;
        }

        public Builder dataAccess(@Nullable LogConfigDataAccessOptionsArgs dataAccess) {
            this.dataAccess = Output.ofNullable(dataAccess);
            return this;
        }
        public LogConfigArgs build() {
            return new LogConfigArgs(cloudAudit, counter, dataAccess);
        }
    }
}
