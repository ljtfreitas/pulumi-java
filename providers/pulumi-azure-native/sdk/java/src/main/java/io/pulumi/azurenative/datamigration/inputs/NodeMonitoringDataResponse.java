// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class NodeMonitoringDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeMonitoringDataResponse Empty = new NodeMonitoringDataResponse();

    /**
     *  Unmatched properties from the message are deserialized in this collection.
     * 
     */
    @Import(name="additionalProperties", required=true)
      private final Map<String,Object> additionalProperties;

    public Map<String,Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Available memory (MB) on the integration runtime node.
     * 
     */
    @Import(name="availableMemoryInMB", required=true)
      private final Integer availableMemoryInMB;

    public Integer getAvailableMemoryInMB() {
        return this.availableMemoryInMB;
    }

    /**
     * Maximum concurrent jobs on the integration runtime node.
     * 
     */
    @Import(name="concurrentJobsLimit", required=true)
      private final Integer concurrentJobsLimit;

    public Integer getConcurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }

    /**
     * The number of jobs currently running on the integration runtime node.
     * 
     */
    @Import(name="concurrentJobsRunning", required=true)
      private final Integer concurrentJobsRunning;

    public Integer getConcurrentJobsRunning() {
        return this.concurrentJobsRunning;
    }

    /**
     * CPU percentage on the integration runtime node.
     * 
     */
    @Import(name="cpuUtilization", required=true)
      private final Integer cpuUtilization;

    public Integer getCpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * The maximum concurrent jobs in this integration runtime.
     * 
     */
    @Import(name="maxConcurrentJobs", required=true)
      private final Integer maxConcurrentJobs;

    public Integer getMaxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }

    /**
     * Name of the integration runtime node.
     * 
     */
    @Import(name="nodeName", required=true)
      private final String nodeName;

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * Received bytes on the integration runtime node.
     * 
     */
    @Import(name="receivedBytes", required=true)
      private final Double receivedBytes;

    public Double getReceivedBytes() {
        return this.receivedBytes;
    }

    /**
     * Sent bytes on the integration runtime node.
     * 
     */
    @Import(name="sentBytes", required=true)
      private final Double sentBytes;

    public Double getSentBytes() {
        return this.sentBytes;
    }

    public NodeMonitoringDataResponse(
        Map<String,Object> additionalProperties,
        Integer availableMemoryInMB,
        Integer concurrentJobsLimit,
        Integer concurrentJobsRunning,
        Integer cpuUtilization,
        Integer maxConcurrentJobs,
        String nodeName,
        Double receivedBytes,
        Double sentBytes) {
        this.additionalProperties = Objects.requireNonNull(additionalProperties, "expected parameter 'additionalProperties' to be non-null");
        this.availableMemoryInMB = Objects.requireNonNull(availableMemoryInMB, "expected parameter 'availableMemoryInMB' to be non-null");
        this.concurrentJobsLimit = Objects.requireNonNull(concurrentJobsLimit, "expected parameter 'concurrentJobsLimit' to be non-null");
        this.concurrentJobsRunning = Objects.requireNonNull(concurrentJobsRunning, "expected parameter 'concurrentJobsRunning' to be non-null");
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization, "expected parameter 'cpuUtilization' to be non-null");
        this.maxConcurrentJobs = Objects.requireNonNull(maxConcurrentJobs, "expected parameter 'maxConcurrentJobs' to be non-null");
        this.nodeName = Objects.requireNonNull(nodeName, "expected parameter 'nodeName' to be non-null");
        this.receivedBytes = Objects.requireNonNull(receivedBytes, "expected parameter 'receivedBytes' to be non-null");
        this.sentBytes = Objects.requireNonNull(sentBytes, "expected parameter 'sentBytes' to be non-null");
    }

    private NodeMonitoringDataResponse() {
        this.additionalProperties = Map.of();
        this.availableMemoryInMB = null;
        this.concurrentJobsLimit = null;
        this.concurrentJobsRunning = null;
        this.cpuUtilization = null;
        this.maxConcurrentJobs = null;
        this.nodeName = null;
        this.receivedBytes = null;
        this.sentBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeMonitoringDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> additionalProperties;
        private Integer availableMemoryInMB;
        private Integer concurrentJobsLimit;
        private Integer concurrentJobsRunning;
        private Integer cpuUtilization;
        private Integer maxConcurrentJobs;
        private String nodeName;
        private Double receivedBytes;
        private Double sentBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeMonitoringDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProperties = defaults.additionalProperties;
    	      this.availableMemoryInMB = defaults.availableMemoryInMB;
    	      this.concurrentJobsLimit = defaults.concurrentJobsLimit;
    	      this.concurrentJobsRunning = defaults.concurrentJobsRunning;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.maxConcurrentJobs = defaults.maxConcurrentJobs;
    	      this.nodeName = defaults.nodeName;
    	      this.receivedBytes = defaults.receivedBytes;
    	      this.sentBytes = defaults.sentBytes;
        }

        public Builder additionalProperties(Map<String,Object> additionalProperties) {
            this.additionalProperties = Objects.requireNonNull(additionalProperties);
            return this;
        }

        public Builder availableMemoryInMB(Integer availableMemoryInMB) {
            this.availableMemoryInMB = Objects.requireNonNull(availableMemoryInMB);
            return this;
        }

        public Builder concurrentJobsLimit(Integer concurrentJobsLimit) {
            this.concurrentJobsLimit = Objects.requireNonNull(concurrentJobsLimit);
            return this;
        }

        public Builder concurrentJobsRunning(Integer concurrentJobsRunning) {
            this.concurrentJobsRunning = Objects.requireNonNull(concurrentJobsRunning);
            return this;
        }

        public Builder cpuUtilization(Integer cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder maxConcurrentJobs(Integer maxConcurrentJobs) {
            this.maxConcurrentJobs = Objects.requireNonNull(maxConcurrentJobs);
            return this;
        }

        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }

        public Builder receivedBytes(Double receivedBytes) {
            this.receivedBytes = Objects.requireNonNull(receivedBytes);
            return this;
        }

        public Builder sentBytes(Double sentBytes) {
            this.sentBytes = Objects.requireNonNull(sentBytes);
            return this;
        }
        public NodeMonitoringDataResponse build() {
            return new NodeMonitoringDataResponse(additionalProperties, availableMemoryInMB, concurrentJobsLimit, concurrentJobsRunning, cpuUtilization, maxConcurrentJobs, nodeName, receivedBytes, sentBytes);
        }
    }
}
