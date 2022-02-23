// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ContainerExecResponse;
import io.pulumi.azurenative.containerinstance.inputs.ContainerHttpGetResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container probe, for liveness or readiness
 * 
 */
public final class ContainerProbeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerProbeResponse Empty = new ContainerProbeResponse();

    /**
     * The execution command to probe
     * 
     */
    @InputImport(name="exec")
        private final @Nullable ContainerExecResponse exec;

    public Optional<ContainerExecResponse> getExec() {
        return this.exec == null ? Optional.empty() : Optional.ofNullable(this.exec);
    }

    /**
     * The failure threshold.
     * 
     */
    @InputImport(name="failureThreshold")
        private final @Nullable Integer failureThreshold;

    public Optional<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Optional.empty() : Optional.ofNullable(this.failureThreshold);
    }

    /**
     * The Http Get settings to probe
     * 
     */
    @InputImport(name="httpGet")
        private final @Nullable ContainerHttpGetResponse httpGet;

    public Optional<ContainerHttpGetResponse> getHttpGet() {
        return this.httpGet == null ? Optional.empty() : Optional.ofNullable(this.httpGet);
    }

    /**
     * The initial delay seconds.
     * 
     */
    @InputImport(name="initialDelaySeconds")
        private final @Nullable Integer initialDelaySeconds;

    public Optional<Integer> getInitialDelaySeconds() {
        return this.initialDelaySeconds == null ? Optional.empty() : Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * The period seconds.
     * 
     */
    @InputImport(name="periodSeconds")
        private final @Nullable Integer periodSeconds;

    public Optional<Integer> getPeriodSeconds() {
        return this.periodSeconds == null ? Optional.empty() : Optional.ofNullable(this.periodSeconds);
    }

    /**
     * The success threshold.
     * 
     */
    @InputImport(name="successThreshold")
        private final @Nullable Integer successThreshold;

    public Optional<Integer> getSuccessThreshold() {
        return this.successThreshold == null ? Optional.empty() : Optional.ofNullable(this.successThreshold);
    }

    /**
     * The timeout seconds.
     * 
     */
    @InputImport(name="timeoutSeconds")
        private final @Nullable Integer timeoutSeconds;

    public Optional<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.timeoutSeconds);
    }

    public ContainerProbeResponse(
        @Nullable ContainerExecResponse exec,
        @Nullable Integer failureThreshold,
        @Nullable ContainerHttpGetResponse httpGet,
        @Nullable Integer initialDelaySeconds,
        @Nullable Integer periodSeconds,
        @Nullable Integer successThreshold,
        @Nullable Integer timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    private ContainerProbeResponse() {
        this.exec = null;
        this.failureThreshold = null;
        this.httpGet = null;
        this.initialDelaySeconds = null;
        this.periodSeconds = null;
        this.successThreshold = null;
        this.timeoutSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerExecResponse exec;
        private @Nullable Integer failureThreshold;
        private @Nullable ContainerHttpGetResponse httpGet;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerProbeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setExec(@Nullable ContainerExecResponse exec) {
            this.exec = exec;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setHttpGet(@Nullable ContainerHttpGetResponse httpGet) {
            this.httpGet = httpGet;
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public ContainerProbeResponse build() {
            return new ContainerProbeResponse(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
