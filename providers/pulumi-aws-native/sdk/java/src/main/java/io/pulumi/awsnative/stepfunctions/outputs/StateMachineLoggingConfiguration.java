// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.outputs;

import io.pulumi.awsnative.stepfunctions.enums.StateMachineLoggingConfigurationLevel;
import io.pulumi.awsnative.stepfunctions.outputs.StateMachineLogDestination;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StateMachineLoggingConfiguration {
    private final @Nullable List<StateMachineLogDestination> destinations;
    private final @Nullable Boolean includeExecutionData;
    private final @Nullable StateMachineLoggingConfigurationLevel level;

    @CustomType.Constructor
    private StateMachineLoggingConfiguration(
        @CustomType.Parameter("destinations") @Nullable List<StateMachineLogDestination> destinations,
        @CustomType.Parameter("includeExecutionData") @Nullable Boolean includeExecutionData,
        @CustomType.Parameter("level") @Nullable StateMachineLoggingConfigurationLevel level) {
        this.destinations = destinations;
        this.includeExecutionData = includeExecutionData;
        this.level = level;
    }

    public List<StateMachineLogDestination> getDestinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    public Optional<Boolean> getIncludeExecutionData() {
        return Optional.ofNullable(this.includeExecutionData);
    }
    public Optional<StateMachineLoggingConfigurationLevel> getLevel() {
        return Optional.ofNullable(this.level);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StateMachineLogDestination> destinations;
        private @Nullable Boolean includeExecutionData;
        private @Nullable StateMachineLoggingConfigurationLevel level;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.includeExecutionData = defaults.includeExecutionData;
    	      this.level = defaults.level;
        }

        public Builder destinations(@Nullable List<StateMachineLogDestination> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder includeExecutionData(@Nullable Boolean includeExecutionData) {
            this.includeExecutionData = includeExecutionData;
            return this;
        }

        public Builder level(@Nullable StateMachineLoggingConfigurationLevel level) {
            this.level = level;
            return this;
        }
        public StateMachineLoggingConfiguration build() {
            return new StateMachineLoggingConfiguration(destinations, includeExecutionData, level);
        }
    }
}
