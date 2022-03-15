// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.ResourceSpecificLoggingLogLevel;
import io.pulumi.awsnative.iot.enums.ResourceSpecificLoggingTargetType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourceSpecificLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSpecificLoggingArgs Empty = new ResourceSpecificLoggingArgs();

    /**
     * The log level for a specific target. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    @Import(name="logLevel", required=true)
      private final Output<ResourceSpecificLoggingLogLevel> logLevel;

    public Output<ResourceSpecificLoggingLogLevel> getLogLevel() {
        return this.logLevel;
    }

    /**
     * The target name.
     * 
     */
    @Import(name="targetName", required=true)
      private final Output<String> targetName;

    public Output<String> getTargetName() {
        return this.targetName;
    }

    /**
     * The target type. Value must be THING_GROUP.
     * 
     */
    @Import(name="targetType", required=true)
      private final Output<ResourceSpecificLoggingTargetType> targetType;

    public Output<ResourceSpecificLoggingTargetType> getTargetType() {
        return this.targetType;
    }

    public ResourceSpecificLoggingArgs(
        Output<ResourceSpecificLoggingLogLevel> logLevel,
        Output<String> targetName,
        Output<ResourceSpecificLoggingTargetType> targetType) {
        this.logLevel = Objects.requireNonNull(logLevel, "expected parameter 'logLevel' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
        this.targetType = Objects.requireNonNull(targetType, "expected parameter 'targetType' to be non-null");
    }

    private ResourceSpecificLoggingArgs() {
        this.logLevel = Output.empty();
        this.targetName = Output.empty();
        this.targetType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSpecificLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ResourceSpecificLoggingLogLevel> logLevel;
        private Output<String> targetName;
        private Output<ResourceSpecificLoggingTargetType> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSpecificLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logLevel = defaults.logLevel;
    	      this.targetName = defaults.targetName;
    	      this.targetType = defaults.targetType;
        }

        public Builder logLevel(Output<ResourceSpecificLoggingLogLevel> logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }

        public Builder logLevel(ResourceSpecificLoggingLogLevel logLevel) {
            this.logLevel = Output.of(Objects.requireNonNull(logLevel));
            return this;
        }

        public Builder targetName(Output<String> targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }

        public Builder targetName(String targetName) {
            this.targetName = Output.of(Objects.requireNonNull(targetName));
            return this;
        }

        public Builder targetType(Output<ResourceSpecificLoggingTargetType> targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }

        public Builder targetType(ResourceSpecificLoggingTargetType targetType) {
            this.targetType = Output.of(Objects.requireNonNull(targetType));
            return this;
        }
        public ResourceSpecificLoggingArgs build() {
            return new ResourceSpecificLoggingArgs(logLevel, targetName, targetType);
        }
    }
}
