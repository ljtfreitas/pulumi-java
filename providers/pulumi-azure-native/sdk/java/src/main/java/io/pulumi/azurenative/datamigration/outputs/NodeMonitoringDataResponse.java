// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class NodeMonitoringDataResponse {
    /**
     *  Unmatched properties from the message are deserialized in this collection.
     * 
     */
    private final Map<String,Object> additionalProperties;
    /**
     * Available memory (MB) on the integration runtime node.
     * 
     */
    private final Integer availableMemoryInMB;
    /**
     * Maximum concurrent jobs on the integration runtime node.
     * 
     */
    private final Integer concurrentJobsLimit;
    /**
     * The number of jobs currently running on the integration runtime node.
     * 
     */
    private final Integer concurrentJobsRunning;
    /**
     * CPU percentage on the integration runtime node.
     * 
     */
    private final Integer cpuUtilization;
    /**
     * The maximum concurrent jobs in this integration runtime.
     * 
     */
    private final Integer maxConcurrentJobs;
    /**
     * Name of the integration runtime node.
     * 
     */
    private final String nodeName;
    /**
     * Received bytes on the integration runtime node.
     * 
     */
    private final Double receivedBytes;
    /**
     * Sent bytes on the integration runtime node.
     * 
     */
    private final Double sentBytes;

    @OutputCustomType.Constructor({"additionalProperties","availableMemoryInMB","concurrentJobsLimit","concurrentJobsRunning","cpuUtilization","maxConcurrentJobs","nodeName","receivedBytes","sentBytes"})
    private NodeMonitoringDataResponse(
        Map<String,Object> additionalProperties,
        Integer availableMemoryInMB,
        Integer concurrentJobsLimit,
        Integer concurrentJobsRunning,
        Integer cpuUtilization,
        Integer maxConcurrentJobs,
        String nodeName,
        Double receivedBytes,
        Double sentBytes) {
        this.additionalProperties = Objects.requireNonNull(additionalProperties);
        this.availableMemoryInMB = Objects.requireNonNull(availableMemoryInMB);
        this.concurrentJobsLimit = Objects.requireNonNull(concurrentJobsLimit);
        this.concurrentJobsRunning = Objects.requireNonNull(concurrentJobsRunning);
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
        this.maxConcurrentJobs = Objects.requireNonNull(maxConcurrentJobs);
        this.nodeName = Objects.requireNonNull(nodeName);
        this.receivedBytes = Objects.requireNonNull(receivedBytes);
        this.sentBytes = Objects.requireNonNull(sentBytes);
    }

    /**
     *  Unmatched properties from the message are deserialized in this collection.
     * 
     */
    public Map<String,Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    /**
     * Available memory (MB) on the integration runtime node.
     * 
     */
    public Integer getAvailableMemoryInMB() {
        return this.availableMemoryInMB;
    }
    /**
     * Maximum concurrent jobs on the integration runtime node.
     * 
     */
    public Integer getConcurrentJobsLimit() {
        return this.concurrentJobsLimit;
    }
    /**
     * The number of jobs currently running on the integration runtime node.
     * 
     */
    public Integer getConcurrentJobsRunning() {
        return this.concurrentJobsRunning;
    }
    /**
     * CPU percentage on the integration runtime node.
     * 
     */
    public Integer getCpuUtilization() {
        return this.cpuUtilization;
    }
    /**
     * The maximum concurrent jobs in this integration runtime.
     * 
     */
    public Integer getMaxConcurrentJobs() {
        return this.maxConcurrentJobs;
    }
    /**
     * Name of the integration runtime node.
     * 
     */
    public String getNodeName() {
        return this.nodeName;
    }
    /**
     * Received bytes on the integration runtime node.
     * 
     */
    public Double getReceivedBytes() {
        return this.receivedBytes;
    }
    /**
     * Sent bytes on the integration runtime node.
     * 
     */
    public Double getSentBytes() {
        return this.sentBytes;
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

        public Builder setAdditionalProperties(Map<String,Object> additionalProperties) {
            this.additionalProperties = Objects.requireNonNull(additionalProperties);
            return this;
        }

        public Builder setAvailableMemoryInMB(Integer availableMemoryInMB) {
            this.availableMemoryInMB = Objects.requireNonNull(availableMemoryInMB);
            return this;
        }

        public Builder setConcurrentJobsLimit(Integer concurrentJobsLimit) {
            this.concurrentJobsLimit = Objects.requireNonNull(concurrentJobsLimit);
            return this;
        }

        public Builder setConcurrentJobsRunning(Integer concurrentJobsRunning) {
            this.concurrentJobsRunning = Objects.requireNonNull(concurrentJobsRunning);
            return this;
        }

        public Builder setCpuUtilization(Integer cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder setMaxConcurrentJobs(Integer maxConcurrentJobs) {
            this.maxConcurrentJobs = Objects.requireNonNull(maxConcurrentJobs);
            return this;
        }

        public Builder setNodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }

        public Builder setReceivedBytes(Double receivedBytes) {
            this.receivedBytes = Objects.requireNonNull(receivedBytes);
            return this;
        }

        public Builder setSentBytes(Double sentBytes) {
            this.sentBytes = Objects.requireNonNull(sentBytes);
            return this;
        }

        public NodeMonitoringDataResponse build() {
            return new NodeMonitoringDataResponse(additionalProperties, availableMemoryInMB, concurrentJobsLimit, concurrentJobsRunning, cpuUtilization, maxConcurrentJobs, nodeName, receivedBytes, sentBytes);
        }
    }
}
