// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.outputs;

import io.pulumi.awsnative.stepfunctions.enums.StateMachineType;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineLoggingConfiguration;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineTagsEntry;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineTracingConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStateMachineResult {
    private final @Nullable String arn;
    private final @Nullable String definitionString;
    private final @Nullable StateMachineLoggingConfiguration loggingConfiguration;
    private final @Nullable String name;
    private final @Nullable String roleArn;
    private final @Nullable StateMachineType stateMachineType;
    private final @Nullable List<StateMachineTagsEntry> tags;
    private final @Nullable StateMachineTracingConfiguration tracingConfiguration;

    @OutputCustomType.Constructor({"arn","definitionString","loggingConfiguration","name","roleArn","stateMachineType","tags","tracingConfiguration"})
    private GetStateMachineResult(
        @Nullable String arn,
        @Nullable String definitionString,
        @Nullable StateMachineLoggingConfiguration loggingConfiguration,
        @Nullable String name,
        @Nullable String roleArn,
        @Nullable StateMachineType stateMachineType,
        @Nullable List<StateMachineTagsEntry> tags,
        @Nullable StateMachineTracingConfiguration tracingConfiguration) {
        this.arn = arn;
        this.definitionString = definitionString;
        this.loggingConfiguration = loggingConfiguration;
        this.name = name;
        this.roleArn = roleArn;
        this.stateMachineType = stateMachineType;
        this.tags = tags;
        this.tracingConfiguration = tracingConfiguration;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDefinitionString() {
        return Optional.ofNullable(this.definitionString);
    }
    public Optional<StateMachineLoggingConfiguration> getLoggingConfiguration() {
        return Optional.ofNullable(this.loggingConfiguration);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<StateMachineType> getStateMachineType() {
        return Optional.ofNullable(this.stateMachineType);
    }
    public List<StateMachineTagsEntry> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<StateMachineTracingConfiguration> getTracingConfiguration() {
        return Optional.ofNullable(this.tracingConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStateMachineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String definitionString;
        private @Nullable StateMachineLoggingConfiguration loggingConfiguration;
        private @Nullable String name;
        private @Nullable String roleArn;
        private @Nullable StateMachineType stateMachineType;
        private @Nullable List<StateMachineTagsEntry> tags;
        private @Nullable StateMachineTracingConfiguration tracingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStateMachineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.definitionString = defaults.definitionString;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.stateMachineType = defaults.stateMachineType;
    	      this.tags = defaults.tags;
    	      this.tracingConfiguration = defaults.tracingConfiguration;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDefinitionString(@Nullable String definitionString) {
            this.definitionString = definitionString;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable StateMachineLoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setStateMachineType(@Nullable StateMachineType stateMachineType) {
            this.stateMachineType = stateMachineType;
            return this;
        }

        public Builder setTags(@Nullable List<StateMachineTagsEntry> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTracingConfiguration(@Nullable StateMachineTracingConfiguration tracingConfiguration) {
            this.tracingConfiguration = tracingConfiguration;
            return this;
        }

        public GetStateMachineResult build() {
            return new GetStateMachineResult(arn, definitionString, loggingConfiguration, name, roleArn, stateMachineType, tags, tracingConfiguration);
        }
    }
}