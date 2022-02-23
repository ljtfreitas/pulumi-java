// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.run_v1alpha1.outputs.ExecActionResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.HTTPGetActionResponse;
import io.pulumi.googlenative.run_v1alpha1.outputs.TCPSocketActionResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ProbeResponse {
    /**
     * (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
     * 
     */
    private final ExecActionResponse exec;
    /**
     * (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    private final Integer failureThreshold;
    /**
     * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
     * 
     */
    private final HTTPGetActionResponse httpGet;
    /**
     * (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final Integer initialDelaySeconds;
    /**
     * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    private final Integer periodSeconds;
    /**
     * (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     * 
     */
    private final Integer successThreshold;
    /**
     * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
     * 
     */
    private final TCPSocketActionResponse tcpSocket;
    /**
     * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    private final Integer timeoutSeconds;

    @OutputCustomType.Constructor({"exec","failureThreshold","httpGet","initialDelaySeconds","periodSeconds","successThreshold","tcpSocket","timeoutSeconds"})
    private ProbeResponse(
        ExecActionResponse exec,
        Integer failureThreshold,
        HTTPGetActionResponse httpGet,
        Integer initialDelaySeconds,
        Integer periodSeconds,
        Integer successThreshold,
        TCPSocketActionResponse tcpSocket,
        Integer timeoutSeconds) {
        this.exec = Objects.requireNonNull(exec);
        this.failureThreshold = Objects.requireNonNull(failureThreshold);
        this.httpGet = Objects.requireNonNull(httpGet);
        this.initialDelaySeconds = Objects.requireNonNull(initialDelaySeconds);
        this.periodSeconds = Objects.requireNonNull(periodSeconds);
        this.successThreshold = Objects.requireNonNull(successThreshold);
        this.tcpSocket = Objects.requireNonNull(tcpSocket);
        this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds);
    }

    /**
     * (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
     * 
     */
    public ExecActionResponse getExec() {
        return this.exec;
    }
    /**
     * (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }
    /**
     * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
     * 
     */
    public HTTPGetActionResponse getHttpGet() {
        return this.httpGet;
    }
    /**
     * (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }
    /**
     * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }
    /**
     * (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     * 
     */
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }
    /**
     * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
     * 
     */
    public TCPSocketActionResponse getTcpSocket() {
        return this.tcpSocket;
    }
    /**
     * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecActionResponse exec;
        private Integer failureThreshold;
        private HTTPGetActionResponse httpGet;
        private Integer initialDelaySeconds;
        private Integer periodSeconds;
        private Integer successThreshold;
        private TCPSocketActionResponse tcpSocket;
        private Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ProbeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.httpGet = defaults.httpGet;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.tcpSocket = defaults.tcpSocket;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setExec(ExecActionResponse exec) {
            this.exec = Objects.requireNonNull(exec);
            return this;
        }

        public Builder setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = Objects.requireNonNull(failureThreshold);
            return this;
        }

        public Builder setHttpGet(HTTPGetActionResponse httpGet) {
            this.httpGet = Objects.requireNonNull(httpGet);
            return this;
        }

        public Builder setInitialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = Objects.requireNonNull(initialDelaySeconds);
            return this;
        }

        public Builder setPeriodSeconds(Integer periodSeconds) {
            this.periodSeconds = Objects.requireNonNull(periodSeconds);
            return this;
        }

        public Builder setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = Objects.requireNonNull(successThreshold);
            return this;
        }

        public Builder setTcpSocket(TCPSocketActionResponse tcpSocket) {
            this.tcpSocket = Objects.requireNonNull(tcpSocket);
            return this;
        }

        public Builder setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds);
            return this;
        }
        public ProbeResponse build() {
            return new ProbeResponse(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
        }
    }
}
