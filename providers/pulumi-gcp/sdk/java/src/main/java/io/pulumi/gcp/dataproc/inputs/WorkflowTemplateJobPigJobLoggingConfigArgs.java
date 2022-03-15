// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPigJobLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPigJobLoggingConfigArgs Empty = new WorkflowTemplateJobPigJobLoggingConfigArgs();

    /**
     * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
     * 
     */
    @Import(name="driverLogLevels")
      private final @Nullable Output<Map<String,String>> driverLogLevels;

    public Output<Map<String,String>> getDriverLogLevels() {
        return this.driverLogLevels == null ? Output.empty() : this.driverLogLevels;
    }

    public WorkflowTemplateJobPigJobLoggingConfigArgs(@Nullable Output<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = driverLogLevels;
    }

    private WorkflowTemplateJobPigJobLoggingConfigArgs() {
        this.driverLogLevels = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPigJobLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPigJobLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(@Nullable Output<Map<String,String>> driverLogLevels) {
            this.driverLogLevels = driverLogLevels;
            return this;
        }

        public Builder driverLogLevels(@Nullable Map<String,String> driverLogLevels) {
            this.driverLogLevels = Output.ofNullable(driverLogLevels);
            return this;
        }
        public WorkflowTemplateJobPigJobLoggingConfigArgs build() {
            return new WorkflowTemplateJobPigJobLoggingConfigArgs(driverLogLevels);
        }
    }
}
