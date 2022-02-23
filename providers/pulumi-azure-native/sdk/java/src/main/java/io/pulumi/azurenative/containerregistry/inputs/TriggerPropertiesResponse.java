// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.BaseImageTriggerResponse;
import io.pulumi.azurenative.containerregistry.inputs.SourceTriggerResponse;
import io.pulumi.azurenative.containerregistry.inputs.TimerTriggerResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a trigger.
 * 
 */
public final class TriggerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TriggerPropertiesResponse Empty = new TriggerPropertiesResponse();

    /**
     * The trigger based on base image dependencies.
     * 
     */
    @InputImport(name="baseImageTrigger")
        private final @Nullable BaseImageTriggerResponse baseImageTrigger;

    public Optional<BaseImageTriggerResponse> getBaseImageTrigger() {
        return this.baseImageTrigger == null ? Optional.empty() : Optional.ofNullable(this.baseImageTrigger);
    }

    /**
     * The collection of triggers based on source code repository.
     * 
     */
    @InputImport(name="sourceTriggers")
        private final @Nullable List<SourceTriggerResponse> sourceTriggers;

    public List<SourceTriggerResponse> getSourceTriggers() {
        return this.sourceTriggers == null ? List.of() : this.sourceTriggers;
    }

    /**
     * The collection of timer triggers.
     * 
     */
    @InputImport(name="timerTriggers")
        private final @Nullable List<TimerTriggerResponse> timerTriggers;

    public List<TimerTriggerResponse> getTimerTriggers() {
        return this.timerTriggers == null ? List.of() : this.timerTriggers;
    }

    public TriggerPropertiesResponse(
        @Nullable BaseImageTriggerResponse baseImageTrigger,
        @Nullable List<SourceTriggerResponse> sourceTriggers,
        @Nullable List<TimerTriggerResponse> timerTriggers) {
        this.baseImageTrigger = baseImageTrigger;
        this.sourceTriggers = sourceTriggers;
        this.timerTriggers = timerTriggers;
    }

    private TriggerPropertiesResponse() {
        this.baseImageTrigger = null;
        this.sourceTriggers = List.of();
        this.timerTriggers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BaseImageTriggerResponse baseImageTrigger;
        private @Nullable List<SourceTriggerResponse> sourceTriggers;
        private @Nullable List<TimerTriggerResponse> timerTriggers;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageTrigger = defaults.baseImageTrigger;
    	      this.sourceTriggers = defaults.sourceTriggers;
    	      this.timerTriggers = defaults.timerTriggers;
        }

        public Builder setBaseImageTrigger(@Nullable BaseImageTriggerResponse baseImageTrigger) {
            this.baseImageTrigger = baseImageTrigger;
            return this;
        }

        public Builder setSourceTriggers(@Nullable List<SourceTriggerResponse> sourceTriggers) {
            this.sourceTriggers = sourceTriggers;
            return this;
        }

        public Builder setTimerTriggers(@Nullable List<TimerTriggerResponse> timerTriggers) {
            this.timerTriggers = timerTriggers;
            return this;
        }
        public TriggerPropertiesResponse build() {
            return new TriggerPropertiesResponse(baseImageTrigger, sourceTriggers, timerTriggers);
        }
    }
}
