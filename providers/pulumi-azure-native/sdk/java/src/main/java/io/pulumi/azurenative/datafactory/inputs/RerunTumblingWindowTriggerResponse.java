// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RerunTumblingWindowTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final RerunTumblingWindowTriggerResponse Empty = new RerunTumblingWindowTriggerResponse();

    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="parentTrigger", required=true)
    private final Object parentTrigger;

    public Object getParentTrigger() {
        return this.parentTrigger;
    }

    @InputImport(name="requestedEndTime", required=true)
    private final String requestedEndTime;

    public String getRequestedEndTime() {
        return this.requestedEndTime;
    }

    @InputImport(name="requestedStartTime", required=true)
    private final String requestedStartTime;

    public String getRequestedStartTime() {
        return this.requestedStartTime;
    }

    @InputImport(name="rerunConcurrency", required=true)
    private final Integer rerunConcurrency;

    public Integer getRerunConcurrency() {
        return this.rerunConcurrency;
    }

    @InputImport(name="runtimeState", required=true)
    private final String runtimeState;

    public String getRuntimeState() {
        return this.runtimeState;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public RerunTumblingWindowTriggerResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        Object parentTrigger,
        String requestedEndTime,
        String requestedStartTime,
        Integer rerunConcurrency,
        String runtimeState,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.parentTrigger = Objects.requireNonNull(parentTrigger, "expected parameter 'parentTrigger' to be non-null");
        this.requestedEndTime = Objects.requireNonNull(requestedEndTime, "expected parameter 'requestedEndTime' to be non-null");
        this.requestedStartTime = Objects.requireNonNull(requestedStartTime, "expected parameter 'requestedStartTime' to be non-null");
        this.rerunConcurrency = Objects.requireNonNull(rerunConcurrency, "expected parameter 'rerunConcurrency' to be non-null");
        this.runtimeState = Objects.requireNonNull(runtimeState, "expected parameter 'runtimeState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RerunTumblingWindowTriggerResponse() {
        this.annotations = List.of();
        this.description = null;
        this.parentTrigger = null;
        this.requestedEndTime = null;
        this.requestedStartTime = null;
        this.rerunConcurrency = null;
        this.runtimeState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RerunTumblingWindowTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private Object parentTrigger;
        private String requestedEndTime;
        private String requestedStartTime;
        private Integer rerunConcurrency;
        private String runtimeState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RerunTumblingWindowTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.parentTrigger = defaults.parentTrigger;
    	      this.requestedEndTime = defaults.requestedEndTime;
    	      this.requestedStartTime = defaults.requestedStartTime;
    	      this.rerunConcurrency = defaults.rerunConcurrency;
    	      this.runtimeState = defaults.runtimeState;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setParentTrigger(Object parentTrigger) {
            this.parentTrigger = Objects.requireNonNull(parentTrigger);
            return this;
        }

        public Builder setRequestedEndTime(String requestedEndTime) {
            this.requestedEndTime = Objects.requireNonNull(requestedEndTime);
            return this;
        }

        public Builder setRequestedStartTime(String requestedStartTime) {
            this.requestedStartTime = Objects.requireNonNull(requestedStartTime);
            return this;
        }

        public Builder setRerunConcurrency(Integer rerunConcurrency) {
            this.rerunConcurrency = Objects.requireNonNull(rerunConcurrency);
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RerunTumblingWindowTriggerResponse build() {
            return new RerunTumblingWindowTriggerResponse(annotations, description, parentTrigger, requestedEndTime, requestedStartTime, rerunConcurrency, runtimeState, type);
        }
    }
}